package com.anderson.repository;

import com.anderson.aluno.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<Aluno,Long> {
}
