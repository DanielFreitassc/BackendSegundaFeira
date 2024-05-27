package com.danielfreitas.exercicio09.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielfreitas.exercicio09.models.ProductsEntity;

public interface ProductsRepository extends JpaRepository<ProductsEntity,Long>{

    Optional<ProductsEntity> findByName(String name);
    
}
