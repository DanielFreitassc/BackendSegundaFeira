package com.danielfreitas.exercicio07.dtos;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record ClienteRecordDTO(
    @NotBlank(message = "Nome não pode estar em branco")@Size(min = 3, max = 100) String nome,
    @NotNull(message = "Nome não pode ser nulo") @Min(0) Double saldo,
    @NotBlank(message = "senha não pode estar vazia")  @Length(min = 6, max = 100, message = "A senha deve conter entre (6) e (100) caracteres") 
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z]).*$", message = "A senha precisa ter pelo menos um caractere maiúsculo e um caractere minúsculo.")
    String senha
) {
    
}
