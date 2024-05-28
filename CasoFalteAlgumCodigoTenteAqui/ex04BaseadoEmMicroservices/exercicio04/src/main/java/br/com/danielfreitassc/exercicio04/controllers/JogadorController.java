package br.com.danielfreitassc.exercicio04.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danielfreitassc.exercicio04.services.JogadorService;

@RestController
@RequestMapping("jogador")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping("/nome")
    public String getNome() {
        return jogadorService.generateJogador().getNome();
    }

    @GetMapping("/sobrenome")
    public String getSobrenome() {
        return jogadorService.generateJogador().getSobrenome();
    }

    @GetMapping("/posicao")
    public String getPosicao() {
        return jogadorService.generateJogador().getPosicao();
    }

    @GetMapping("/idade")
    public int getIdade() {
        return jogadorService.generateJogador().getIdade();
    }

    @GetMapping("/clube")
    public String getClube() {
        return jogadorService.generateJogador().getClube();
    }

    @GetMapping("/descricao")
    public String getDescricao() {
        return jogadorService.generateJogador().getDescricao();
    }
}