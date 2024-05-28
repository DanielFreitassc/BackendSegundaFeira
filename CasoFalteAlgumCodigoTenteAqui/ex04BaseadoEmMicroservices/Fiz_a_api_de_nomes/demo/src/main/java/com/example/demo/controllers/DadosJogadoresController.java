package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("jogador")
public class DadosJogadoresController {
    private static final String BASE_PATH = "src/main/resources/static/";

    @GetMapping("/{fileName}")
    public List<String> listarConteudoArquivo(@PathVariable String fileName) {
        return lerArquivo(fileName);
    }

    private List<String> lerArquivo(String fileName) {
        List<String> content = new ArrayList<>();
        try {
            content.addAll(Files.readAllLines(Paths.get(BASE_PATH + fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao ler o arquivo " + fileName + ": " + e.getMessage());
        }
        return content;
    }

}
