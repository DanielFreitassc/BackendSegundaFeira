package com.danielfreitassc.exercicio03.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielfreitassc.exercicio03.components.Indicacao;
import com.danielfreitassc.exercicio03.components.Indicavel;
import com.danielfreitassc.exercicio03.repositories.ArmazenamentoRepositorio;

@Service
public class OscarService {
    @Autowired
    ArmazenamentoRepositorio armazenamentoRepositorio;

    private ArrayList<Indicacao> indicacoes = new ArrayList<>();

    public void adicionarIndicacao(Indicavel indicavel, String categoria, boolean elegivel) {
        if (elegivel) {
            Indicacao indicacao = new Indicacao(indicavel, categoria);
            indicacao.setElegivel(elegivel);
            indicacao.incrementarIndicacoes();
            indicacoes.add(indicacao);
            String textoIndicacao = "Indicação: " + indicavel.toString() + ", Categoria: " + categoria + ", Elegível: Sim "  + ", Número de Indicações: " + indicacao.getNumeroDeIndicacoes();
            armazenamentoRepositorio.armazenar(textoIndicacao);
        } else {
            System.out.println("Erro: O filme ou ator não pode ser indicado pois não é elegível.");
        }
    }
    
    public void mostrarListaIndicados() {
        for (Indicacao indicacao : indicacoes) {
            System.out.println("Indicação: " + indicacao.getIndicavel().toString() + ", Categoria: " + indicacao.getCategoria() + ", Elegível: " + "Sim" + ", Número de Indicações: " + indicacao.getNumeroDeIndicacoes());
        }
    }
    
}
