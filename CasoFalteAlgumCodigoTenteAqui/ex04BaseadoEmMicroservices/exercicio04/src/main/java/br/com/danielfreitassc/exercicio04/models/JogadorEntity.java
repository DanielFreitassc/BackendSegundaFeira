package br.com.danielfreitassc.exercicio04.models;

import lombok.Data;

@Data
public class JogadorEntity {
    private String nome;
    private String sobrenome;
    private String posicao;
    private int idade;
    private String clube;

    public JogadorEntity(String nome, String sobrenome, String posicao, int idade, String clube) {
        this.nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();;
        this.sobrenome = sobrenome.substring(0, 1).toUpperCase() + sobrenome.substring(1).toLowerCase();;
        this.posicao = posicao.replace("\"", "").replace(",", "");
        this.idade = idade;
        this.clube = clube;
    }

    public String getDescricao() {
        return nome + " " + sobrenome + " é um futebolista brasileiro de " +idade+ " anos que atua como " + posicao + ". Atualmente defende o " + clube +".";
    }
}
