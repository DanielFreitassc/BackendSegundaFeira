package com.example.minecraft.models;

import lombok.Data;

@Data
public class JogarEntity {
    private String nome ="Jogador 1";
    private int posicaoX = 0;
    private int posicaoY = 0;
    
    public void mover(int x,int y) {
         posicaoX = x;
         posicaoY = y;
    }

    public String getPosicao() {
        return posicaoX + " / " + posicaoY;
    }

    public int getPosicaox() {
        return posicaoX + posicaoX + posicaoX + posicaoX;
    }
}   
