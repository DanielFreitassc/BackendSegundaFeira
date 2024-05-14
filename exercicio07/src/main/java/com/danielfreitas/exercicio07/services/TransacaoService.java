package com.danielfreitas.exercicio07.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.danielfreitas.exercicio07.dtos.TransacaoRecordDTO;
import com.danielfreitas.exercicio07.models.TransacaoEntity;
import com.danielfreitas.exercicio07.repositories.TransacaoRepository;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public ResponseEntity<TransacaoEntity> saveTransacao(TransacaoRecordDTO transacaoRecordDTO) {
        TransacaoEntity transacaoEntity = new TransacaoEntity();
        BeanUtils.copyProperties(transacaoRecordDTO, transacaoEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(transacaoRepository.save(transacaoEntity));
    }
    
    public ResponseEntity<List<TransacaoEntity>> getTransacoes() {
        List<TransacaoEntity> transacoes = transacaoRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(transacoes);
    }
}
