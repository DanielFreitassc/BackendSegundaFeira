package com.danielfreitas.exercicio08.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielfreitas.exercicio08.dtos.ClienteRecordDTO;
import com.danielfreitas.exercicio08.dtos.ResponseCliente;
import com.danielfreitas.exercicio08.services.ClienteService;

import jakarta.validation.Valid;



@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;    
  
    @PostMapping
    public ResponseEntity<Object> saveCliente(@RequestBody @Valid ClienteRecordDTO clienteRecordDTO) {
        return clienteService.saveCliente(clienteRecordDTO);
    }

    @GetMapping("/{cliente}")
    public ResponseEntity<ResponseCliente> getClienteByName(@PathVariable(value = "cliente")String nome) {
        return clienteService.getClienteByName(nome);
    }
}
