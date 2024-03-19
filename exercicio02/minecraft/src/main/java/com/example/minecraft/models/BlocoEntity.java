package com.example.minecraft.models;

import lombok.Data;

@Data
public class BlocoEntity {

    private String nome = "stev";
    private String textura = "padrao.png";
    private String cor = "Azul";

    public ItemEntity destruir() {
        return null;
    }
    
}

