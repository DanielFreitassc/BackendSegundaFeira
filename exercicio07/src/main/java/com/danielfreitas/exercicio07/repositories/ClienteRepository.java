package com.danielfreitas.exercicio07.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.danielfreitas.exercicio07.models.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, UUID> {
    Optional<ClienteEntity> findByNome(String nome);
}
