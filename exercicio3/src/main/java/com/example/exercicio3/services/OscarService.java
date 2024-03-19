package com.example.exercicio3.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exercicio3.models.AtorEntity;
import com.example.exercicio3.models.FilmeEntity;
import com.example.exercicio3.models.IndicacaoEntity;
import com.example.exercicio3.models.IndicavelEntity;
import com.example.exercicio3.repositories.StorageRepository;
// Adicionar filmes e atores a uma lista indicacao e retornar lista com os indicados e sua categorias
@Service
public class OscarService {
    @Autowired
    private StorageRepository storageRepository;

    ArrayList<IndicacaoEntity> indicacao = new ArrayList<>();

    public void adicionarIndicacao(IndicacaoEntity indicacaoEntity) {
        AtorEntity atorEntity = new AtorEntity();
        FilmeEntity filmeEntity = new FilmeEntity();
        IndicavelEntity indicavelEntity = new IndicavelEntity();

        indicavelEntity.setElegivel(true);


        System.out.println();

    }

    public void mostrarListaIndicados() {

    }
    
}
