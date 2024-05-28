package com.danielfreitas.exercicio08.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.danielfreitas.exercicio08.dtos.ClienteRecordDTO;
import com.danielfreitas.exercicio08.dtos.ResponseCliente;
import com.danielfreitas.exercicio08.models.ClienteEntity;
import com.danielfreitas.exercicio08.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ResponseEntity<Object> saveCliente(ClienteRecordDTO clienteRecordDTO) {
        String hashed = BCrypt.hashpw(clienteRecordDTO.senha(), BCrypt.gensalt());
        ClienteEntity clienteEntity = new ClienteEntity(clienteRecordDTO.nome(), clienteRecordDTO.saldo(), hashed);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(clienteEntity));
    }

    public ResponseEntity<ResponseCliente> getClienteByName(String nome) {
        Optional<ClienteEntity> result = clienteRepository.findByNome(nome);
        if (result.isPresent()) {
            ClienteEntity clienteEntity = result.get();
            ResponseCliente responseCliente = new ResponseCliente(clienteEntity.getNome(), clienteEntity.getSaldo());
            return ResponseEntity.status(HttpStatus.OK).body(responseCliente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
