package com.danielfreitas.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielfreitas.biblioteca.dtos.AutorRecordDTO;
import com.danielfreitas.biblioteca.models.AutorEntity;
import com.danielfreitas.biblioteca.models.Views;
import com.danielfreitas.biblioteca.services.AutorService;
import com.fasterxml.jackson.annotation.JsonView;

import jakarta.validation.Valid;

@RestController
@RequestMapping("autor")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @PostMapping
    public ResponseEntity<AutorEntity> saveAutor(@RequestBody @Valid AutorRecordDTO autorRecordDTO) {
        return autorService.saveAutor(autorRecordDTO);
    }

    @GetMapping
    @JsonView(Views.Autor.class)
    public ResponseEntity<List<AutorEntity>> getAutores() {
        return autorService.getAutores();
    }
}
