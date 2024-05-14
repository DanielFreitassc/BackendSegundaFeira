package com.danielfreitas.exercicio07.services;

import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.danielfreitas.exercicio07.dtos.ClienteRecordDTO;
import com.danielfreitas.exercicio07.dtos.ResponseCliente;
import com.danielfreitas.exercicio07.models.ClienteEntity;
import com.danielfreitas.exercicio07.repositories.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ResponseEntity<ClienteEntity> saveCliente(ClienteRecordDTO clienteRecordDTO) {
        ClienteEntity clienteEntity = new ClienteEntity();
        BeanUtils.copyProperties(clienteRecordDTO, clienteEntity);
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
