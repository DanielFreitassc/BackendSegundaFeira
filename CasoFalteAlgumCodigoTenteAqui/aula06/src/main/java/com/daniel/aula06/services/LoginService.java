package com.daniel.aula06.services;

import org.springframework.stereotype.Service;

import com.daniel.aula06.models.UsuarioEntity;

@Service
public class LoginService {
    public Boolean chegarCredencial(String nome, String senha) {
        return nome.equals("satc") && senha.equals("1234");
    }
    
    public UsuarioEntity retornarPessoa(String nome) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
    }
    
}
