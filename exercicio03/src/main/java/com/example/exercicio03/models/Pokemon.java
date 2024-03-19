package com.example.exercicio03.models;



import lombok.Data;

@Data
public class Pokemon {
    private String nome ="poke";
    private int nivel;

    public Pokemon(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    
}
