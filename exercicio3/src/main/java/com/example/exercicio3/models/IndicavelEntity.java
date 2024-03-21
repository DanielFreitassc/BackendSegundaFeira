package com.example.exercicio3.models;

public interface IndicavelEntity {
    void indicar(Short numeroDeIndicacoes);
    void valido(boolean elegivel);
    void naoValido(boolean elegivel);
}