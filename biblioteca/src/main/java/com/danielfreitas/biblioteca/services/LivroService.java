package com.danielfreitas.biblioteca.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.danielfreitas.biblioteca.dtos.LivroRecordDTO;
import com.danielfreitas.biblioteca.models.LivroEntity;
import com.danielfreitas.biblioteca.repositories.LivroRepository;

@Service
public class LivroService {
    @Autowired 
    private LivroRepository livroRepository;

    public ResponseEntity<LivroEntity> saveLivro(LivroRecordDTO livroRecordDTO) {
        LivroEntity livroEntity = new LivroEntity();
        BeanUtils.copyProperties(livroRecordDTO, livroEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(livroRepository.save(livroEntity));
    }

    public ResponseEntity<List<LivroEntity>> getLivros() {
        List<LivroEntity> livros = livroRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(livros);
    }

}
