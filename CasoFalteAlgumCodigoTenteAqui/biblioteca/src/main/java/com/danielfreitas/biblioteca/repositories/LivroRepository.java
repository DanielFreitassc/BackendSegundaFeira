package com.danielfreitas.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielfreitas.biblioteca.models.LivroEntity;

public interface LivroRepository extends JpaRepository<LivroEntity,Long>{
    
}
