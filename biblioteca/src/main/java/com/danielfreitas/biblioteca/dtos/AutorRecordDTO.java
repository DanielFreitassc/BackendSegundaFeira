package com.danielfreitas.biblioteca.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;

public record AutorRecordDTO(
    @NotBlank(message = "Nome precisa estar preenchido") String nome,
    @NotBlank(message = "Nacionalidade precisa estar preenchido")String nacionalidade,
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dataNascimento
) {
    
}
