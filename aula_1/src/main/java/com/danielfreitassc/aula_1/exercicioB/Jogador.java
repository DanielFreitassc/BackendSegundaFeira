package com.danielfreitassc.aula_1.exercicioB;

import lombok.Data;

@Data
public class Jogador {
    private String nome;
    private String sobrenome;
    private String posicao;
    private int idade;
    private String clube;

    public Jogador(String nome, String sobrenome, String posicao, int idade, String clube) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.idade = idade;
        this.clube = clube;
    }

    public String getDescricao() {
        return nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".";
    }
    
}
