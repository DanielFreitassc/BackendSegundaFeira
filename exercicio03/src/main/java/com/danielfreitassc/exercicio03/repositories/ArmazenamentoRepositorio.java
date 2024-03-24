package com.danielfreitassc.exercicio03.repositories;

public interface ArmazenamentoRepositorio {
    void armazenar(String texto);
    String recuperar();
    
}