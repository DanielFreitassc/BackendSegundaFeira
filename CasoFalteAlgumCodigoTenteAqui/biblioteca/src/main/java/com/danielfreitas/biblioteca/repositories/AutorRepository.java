package com.danielfreitas.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielfreitas.biblioteca.models.AutorEntity;

public interface AutorRepository extends JpaRepository<AutorEntity,Long>{
    
}
