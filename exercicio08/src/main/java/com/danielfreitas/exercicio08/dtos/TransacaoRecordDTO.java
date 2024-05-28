package com.danielfreitas.exercicio08.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TransacaoRecordDTO(
    @NotBlank(message = "Recebedor não pode estar em branco") String recebedor,
    @NotBlank(message = "pagador não pode estar vazio") String pagador,
    @NotNull(message = "quantidade não pode estar vazia") @Min(0) Double quantidade

) {
    
}
