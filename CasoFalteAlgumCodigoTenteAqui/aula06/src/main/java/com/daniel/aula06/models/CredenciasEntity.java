package com.daniel.aula06.models;

import lombok.Data;

@Data
public class CredenciasEntity {
    private String nome;
    private String senha;  

    public CredenciasEntity(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
}
