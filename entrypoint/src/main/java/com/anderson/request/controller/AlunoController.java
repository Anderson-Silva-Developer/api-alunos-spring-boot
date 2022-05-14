package com.anderson.request.controller;

import com.anderson.aluno.usecase.RegistroAluno;
import com.anderson.request.AlunoRequest;
import com.anderson.request.converter.AlunoRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    @Autowired
    private RegistroAluno registroAluno;
    @Autowired
    private AlunoRequestConverter alunoRequestConverter;

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
