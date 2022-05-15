package com.anderson.request.controller;

import com.anderson.aluno.contract.RegistroAlunoBorda;
import com.anderson.request.AlunoRequest;
import com.anderson.request.converter.AlunoRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    private final RegistroAlunoBorda registroAluno;
    @Autowired
    private AlunoRequestConverter alunoRequestConverter;

    public AlunoController(RegistroAlunoBorda registroAluno, AlunoRequestConverter alunoRequestConverter) {
        this.registroAluno = registroAluno;
        this.alunoRequestConverter = alunoRequestConverter;
    }

    @GetMapping
    public String hello(){
        return "Hello";
    }
    @PostMapping
    public void save(@RequestBody AlunoRequest request){
        var aluno=alunoRequestConverter.toAluno(request);
        this.registroAluno.save(aluno);

    }

}
