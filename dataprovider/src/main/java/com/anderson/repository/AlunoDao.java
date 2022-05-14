package com.anderson.repository;

import com.anderson.repository.entity.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoDao extends JpaRepository<AlunoEntity,Long> {
}
