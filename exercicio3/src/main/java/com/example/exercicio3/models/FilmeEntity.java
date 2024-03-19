package com.example.exercicio3.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class FilmeEntity {
    private String nome;
    private String genero;


    public String getAtor() {
        return "O filme:"+ nome +" de, genero: " + genero;
    }
}
