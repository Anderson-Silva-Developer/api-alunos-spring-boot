package com.anderson.request.converter;

import com.anderson.aluno.entity.Aluno;
import com.anderson.request.AlunoRequest;
import org.springframework.stereotype.Component;

@Component
public class AlunoRequestConverter {
    public Aluno toAluno(AlunoRequest request){
        return Aluno.from(request.getName());

    }
}
