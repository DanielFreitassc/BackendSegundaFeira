package com.danielfreitassc.exercicio03.components;

import org.springframework.stereotype.Component;

@Component
public interface Indicavel {
    Boolean isElegivel();
    void setElegivel(boolean elegivel);
    Short getNumeroDeIndicacoes();
    void setNumeroDeIndicacoes(Short numeroDeIndicacoes);
}
