package com.danielfreitas.exercicio07.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielfreitas.exercicio07.models.TransacaoEntity;

public interface TransacaoRepository  extends JpaRepository<TransacaoEntity, UUID>{
    
}
