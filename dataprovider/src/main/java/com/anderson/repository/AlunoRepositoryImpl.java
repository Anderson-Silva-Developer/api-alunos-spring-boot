package com.anderson.repository;

import com.anderson.aluno.contract.AlunoRepository;
import com.anderson.aluno.entity.Aluno;
import com.anderson.repository.entity.AlunoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {
    @Autowired
    AlunoDao alunoDao;
    @Override
    public void save(Aluno aluno) {
        alunoDao.save(AlunoEntity.from(aluno));

    }
}
