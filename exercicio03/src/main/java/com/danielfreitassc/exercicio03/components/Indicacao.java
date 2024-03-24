package com.danielfreitassc.exercicio03.components;

import lombok.Data;

@Data
public class Indicacao implements Indicavel {
    private Indicavel indicavel;
    private String categoria;
    private boolean elegivel;
    private short numeroDeIndicacoes = 0;

    public Indicacao(Indicavel indicavel, String categoria) {
        this.indicavel = indicavel;
        this.categoria = categoria;
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

    public void incrementarIndicacoes() {
        this.numeroDeIndicacoes++;
    }

    @Override
    public String toString() {
        return indicavel.toString() + " - " + categoria;
    }
}
