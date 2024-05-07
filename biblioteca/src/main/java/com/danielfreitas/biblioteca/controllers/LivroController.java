package com.danielfreitas.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielfreitas.biblioteca.dtos.LivroRecordDTO;
import com.danielfreitas.biblioteca.models.LivroEntity;
import com.danielfreitas.biblioteca.services.LivroService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @PostMapping
    public ResponseEntity<LivroEntity> saveLivro(@RequestBody @Valid LivroRecordDTO livroRecordDTO) {
        return livroService.saveLivro(livroRecordDTO);
    }

    @GetMapping
    public ResponseEntity<List<LivroEntity>> getLivros() {
        return livroService.getLivros();
    }
    
}
