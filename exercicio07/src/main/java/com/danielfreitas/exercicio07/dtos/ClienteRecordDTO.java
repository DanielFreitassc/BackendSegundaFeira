package com.danielfreitas.exercicio07.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClienteRecordDTO(
    @NotBlank(message = "Nome não pode estar em branco") String nome,
    @NotNull(message = "Nome não pode ser nulo") Double saldo,
    @NotBlank(message = "senha não pode estar vazia") String senha
) {
    
}
