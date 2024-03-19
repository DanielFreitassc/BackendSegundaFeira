package com.example.exercicio3.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class AtorEntity {
    private String nome;
    private String nacionalidade;
    
    public String getAtor() {
        return "Ator indicado ao oscar:"+ nome +" de, nacionalidade: " + nacionalidade;
    }

}
