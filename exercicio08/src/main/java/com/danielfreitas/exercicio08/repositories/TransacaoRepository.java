package com.danielfreitas.exercicio08.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielfreitas.exercicio08.models.TransacaoEntity;

public interface TransacaoRepository  extends JpaRepository<TransacaoEntity, UUID>{
    
}
