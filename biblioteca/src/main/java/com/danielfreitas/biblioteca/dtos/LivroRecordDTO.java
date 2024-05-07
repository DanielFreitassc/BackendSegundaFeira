package com.danielfreitas.biblioteca.dtos;

import com.danielfreitas.biblioteca.models.AutorEntity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LivroRecordDTO(
   @NotBlank(message = "Titulo precisa estar preenchido") String titulo,
    @NotBlank(message = "Genero precisa estar preenchido")  String genero,
    @NotNull Integer paginas,
    AutorEntity autor
) {
    
}
