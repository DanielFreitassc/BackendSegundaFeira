package com.danielfreitassc.aula_1.exercicioB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    @Autowired
    private JogadorGerador jogadorGerador;

    @GetMapping("/nome")
    public String getNome() {
        return jogadorGerador.generateJogador().getNome();
    }

    @GetMapping("/sobrenome")
    public String getSobrenome() {
        return jogadorGerador.generateJogador().getSobrenome();
    }

    @GetMapping("/posicao")
    public String getPosicao() {
        return jogadorGerador.generateJogador().getPosicao();
    }

    @GetMapping("/idade")
    public int getIdade() {
        return jogadorGerador.generateJogador().getIdade();
    }

    @GetMapping("/clube")
    public String getClube() {
        return jogadorGerador.generateJogador().getClube();
    }

    @GetMapping("/descricao")
    public String getDescricao() {
        return jogadorGerador.generateJogador().getDescricao();
    }
}
