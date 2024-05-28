package com.daniel.aula06.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.daniel.aula06.models.CredenciasEntity;
import com.daniel.aula06.models.UsuarioEntity;
import com.daniel.aula06.services.LoginService;

@RestController
@RequestMapping("user")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/autenticar")
    public ResponseEntity<Object> login(@RequestBody CredenciasEntity credenciasEntity) {
        Boolean estaLogado = loginService.chegarCredencial(credenciasEntity.getNome(), credenciasEntity.getSenha());
        if(estaLogado) {
            UsuarioEntity usuarioEntity = loginService.retornarPessoa(credenciasEntity.getNome());
            ResponseEntity.status(HttpStatus.OK).body(usuarioEntity);
            return ResponseEntity.status(HttpStatus.OK).body(usuarioEntity);
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Não foi possivel logar");
    }
  
    
}
