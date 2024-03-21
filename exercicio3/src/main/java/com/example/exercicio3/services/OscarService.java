package com.example.exercicio3.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.exercicio3.models.AtorEntity;
import com.example.exercicio3.models.FilmeEntity;
import com.example.exercicio3.models.IndicacaoEntity;
import com.example.exercicio3.models.IndicavelEntity;


@Service
public class OscarService {

    ArrayList<IndicacaoEntity> indacacoes = new ArrayList<IndicacaoEntity>();


    public void adicionarIndicacao(IndicacaoEntity indicacaoEntity) {
        AtorEntity atorEntity = new AtorEntity();
        atorEntity.setNome("Bradley Cooper");
        atorEntity.setNacionalidade("EUA");
        
        FilmeEntity filmeEntity = new FilmeEntity();
        filmeEntity.setNome("Maestro");
        filmeEntity.setGenero("Drama");
        
        IndicavelEntity indicavelEntity = new IndicavelEntity();
        indicavelEntity.valido
        indicavelEntity.indicar();
        
        
        
        indacacoes.add(indicacaoEntity);
        
    }

    public List<IndicacaoEntity> mostrarListaIndicados() {
        List<IndicacaoEntity> indicacoesList = new ArrayList<>();
        for (IndicacaoEntity indicacao : indicacoesList) {
            indicacoesList.add(indicacao);
        }
        return indicacoesList;
    }
}