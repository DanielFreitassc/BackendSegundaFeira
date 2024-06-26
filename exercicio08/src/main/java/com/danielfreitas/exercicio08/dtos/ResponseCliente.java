package com.danielfreitas.exercicio08.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
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
