package com.anderson.aluno.usecase;

import com.anderson.aluno.contract.AlunoRepository;
import com.anderson.aluno.contract.RegistroAlunoBorda;
import com.anderson.aluno.entity.Aluno;

import java.util.UUID;


public class RegistroAluno implements RegistroAlunoBorda {
    AlunoRepository alunoRepository;

    public RegistroAluno(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void save(Aluno aluno) {
        aluno.setRegistrationNumber(UUID.randomUUID());
        this.alunoRepository.save(aluno);
    }

}
