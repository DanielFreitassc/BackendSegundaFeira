package com.example.exercicio3.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class IndicavelEntity {
    Boolean elegivel;
    Short numeroDeIndicacoes;
}
