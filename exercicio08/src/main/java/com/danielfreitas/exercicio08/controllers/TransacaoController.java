package com.danielfreitas.exercicio08.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielfreitas.exercicio08.dtos.TransacaoRecordDTO;
import com.danielfreitas.exercicio08.models.TransacaoEntity;
import com.danielfreitas.exercicio08.services.TransacaoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("transacoes")
public class TransacaoController {
    @Autowired 
    private TransacaoService transacaoService;

    @PostMapping
    public ResponseEntity<TransacaoEntity> saveTransacao(@RequestBody @Valid TransacaoRecordDTO transacaoRecordDTO) {
        return transacaoService.saveTransacao(transacaoRecordDTO);
    }
    
    @GetMapping
    public ResponseEntity<List<TransacaoEntity>> getTransacoes() {
        return transacaoService.getTransacoes();
    }
}
