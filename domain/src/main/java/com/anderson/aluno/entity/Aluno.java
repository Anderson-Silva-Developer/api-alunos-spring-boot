package com.anderson.aluno.entity;

import java.util.UUID;

public class Aluno {
    private  UUID registrationNumber;
    private  String name;

    public static Aluno from(String name) {
        Aluno aluno=new Aluno();
        aluno.name=name;
        return aluno;
    }

    public UUID getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setRegistrationNumber(UUID registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
}
