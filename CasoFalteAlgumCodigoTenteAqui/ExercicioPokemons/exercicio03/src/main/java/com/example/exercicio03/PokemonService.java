package com.example.exercicio03;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {
    @Autowired
    ArmazenamentoRepositorio armazenamentoRepositorio;

    ArrayList<Pokemon> equipe = new ArrayList<>();

    public void capturar(Pokemon pokemon) {
    System.out.println("O pokemon: " + pokemon.getNome() + "Foi capturado"); 
    if(equipe.size() >= 0) {
        armazenamentoRepositorio.armazenar(pokemon.getNome());
    } else {
        equipe.add(pokemon);
    }  
    }
    
}
