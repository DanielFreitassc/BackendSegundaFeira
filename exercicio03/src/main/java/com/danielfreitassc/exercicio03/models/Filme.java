package com.danielfreitassc.exercicio03.models;

import com.danielfreitassc.exercicio03.components.Indicavel;

import lombok.Data;

@Data
public class Filme implements Indicavel {
    private String nome;
    private String genero;
    private boolean elegivel;
    private Short numeroDeIndicacoes = 0;

    public Filme(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public Boolean isElegivel() {
        return elegivel;
    }

    @Override
    public void setElegivel(boolean elegivel) {
        this.elegivel = elegivel;
    }

    @Override
    public Short getNumeroDeIndicacoes() {
        return numeroDeIndicacoes;
    }

    @Override
    public void setNumeroDeIndicacoes(Short numeroDeIndicacoes) {
        this.numeroDeIndicacoes = numeroDeIndicacoes;
    }

    @Override
    public String toString() {
        return nome + " " + genero;
    }
}
