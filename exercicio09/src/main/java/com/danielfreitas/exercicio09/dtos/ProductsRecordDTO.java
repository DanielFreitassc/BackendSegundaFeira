package com.danielfreitas.exercicio09.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductsRecordDTO(
    @NotBlank(message = "Codigo de barras não pode estar vazio") String barcode,
    @NotBlank( message = "Mensagem não pode estar vazio") String name,
    @NotBlank(message = "Descrição não pode estar vazia") String description,
    @NotNull(message = "Preço não pode ser um campo nulo") Double price
) {
    
}
