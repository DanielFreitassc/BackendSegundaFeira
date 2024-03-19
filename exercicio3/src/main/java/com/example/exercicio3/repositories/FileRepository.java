package com.example.exercicio3.repositories;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.springframework.stereotype.Repository;

@Repository
public class FileRepository implements StorageRepository{

    @Override
    public void indicar(String texto) {
       try {
        FileOutputStream file = new FileOutputStream("Indicados.txt",true);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.append(texto);
        printWriter.close();
       } catch(Exception e) {
        System.out.println("Falha ao salvar");
       }
    }

    @Override
    public String bucar() {
        return "lista";
    }
    
}
