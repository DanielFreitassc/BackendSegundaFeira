package com.danielfreitas.exercicio07.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ResponseCliente {
    @NotBlank(message = "Nome não pode estar em branco")
    private String nome;
    
    @NotNull(message = "Nome não pode ser nulo")
    private Double saldo;

    public ResponseCliente() {
    }

    public ResponseCliente(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
