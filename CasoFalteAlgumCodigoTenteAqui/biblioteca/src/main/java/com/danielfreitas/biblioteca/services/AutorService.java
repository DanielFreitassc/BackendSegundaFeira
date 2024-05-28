package com.danielfreitas.biblioteca.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.danielfreitas.biblioteca.dtos.AutorRecordDTO;
import com.danielfreitas.biblioteca.models.AutorEntity;
import com.danielfreitas.biblioteca.repositories.AutorRepository;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public ResponseEntity<AutorEntity> saveAutor(AutorRecordDTO autorRecordDTO) {
        AutorEntity autorEntity = new AutorEntity();
        BeanUtils.copyProperties(autorRecordDTO, autorEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(autorRepository.save(autorEntity));
    }
    
    public ResponseEntity<List<AutorEntity>> getAutores() {
        List<AutorEntity> autores = autorRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(autores);
    }
    
}
