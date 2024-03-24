package com.danielfreitassc.exercicio03.services;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.springframework.stereotype.Repository;

import com.danielfreitassc.exercicio03.repositories.ArmazenamentoRepositorio;

@Repository
public class ArquivoArmazenamentoRepositorio implements ArmazenamentoRepositorio{
    @Override
    public void armazenar(String texto) {
        try {
            FileOutputStream arquivo = new FileOutputStream("pc.txt", true);
            PrintWriter printWriter = new PrintWriter(arquivo);
            printWriter.append(texto);
            printWriter.close();
        } catch (Exception e) {
            System.out.println("zé da manga aii");
        }
    }

    @Override
    public String recuperar() {
        return "Falto orçamento pra recuperar";
    }
    
}
