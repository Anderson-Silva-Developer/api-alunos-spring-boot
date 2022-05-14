package com.anderson.aluno.usecase;

import com.anderson.aluno.contract.AlunoRepository;
import com.anderson.aluno.entity.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroAluno {

    @Autowired
    AlunoRepository alunoRepository;

    public void save(Aluno aluno){

        this.alunoRepository.save(aluno);

    }

}
