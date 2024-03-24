package com.danielfreitassc.exercicio03.models;

import com.danielfreitassc.exercicio03.components.Indicavel;

public class Ator implements Indicavel {
    private String nome;
    private String nacionalidade;
    private boolean elegivel;
    private Short numeroDeIndicacoes = 0;

    public Ator(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
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
        return nome + " - " + nacionalidade;
    }
}
       
