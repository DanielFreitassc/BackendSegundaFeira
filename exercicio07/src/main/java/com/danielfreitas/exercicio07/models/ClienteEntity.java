package com.danielfreitas.exercicio07.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "tb_cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private Double saldo;
    private String senha;

    public ClienteEntity() {
    }
    
    public ClienteEntity(String nome, Double saldo, String senha) {
        this.nome = nome;
        this.saldo = saldo;
        this.senha = senha;
    }
    
}
