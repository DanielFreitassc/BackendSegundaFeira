package br.com.danielfreitassc.exercicio04.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import br.com.danielfreitassc.exercicio04.models.JogadorEntity;

@Service
public class JogadorService {

    private static final String SOBRENOMES_URI = "http://localhost:8081/sobrenomes.txt";
    private static final String NOMES_URI = "http://localhost:8081/nomes.txt";
    private static final String CLUBES_URI = "http://localhost:8081/clubes.txt";
    private static final String POSICOES_URI = "http://localhost:8081/posicoes.txt";

    private List<String> sobrenomes;
    private List<String> nomes;
    private List<String> clubes;
    private List<String> posicoes;

    public JogadorService() {
        this.sobrenomes = fetchData(SOBRENOMES_URI);
        this.nomes = fetchData(NOMES_URI);
        this.clubes = fetchData(CLUBES_URI);
        this.posicoes = fetchData(POSICOES_URI);
    }   

    public List<String> fetchData(String urlString) {
        List<String> data = new ArrayList<>();

        try {
            URI uri = new URI(urlString);
            HttpURLConnection con = (HttpURLConnection) uri.toURL().openConnection();
            con.setRequestMethod("GET");
            try(BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                in.lines().forEach(data::add);
            }
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return data;
    }

    public JogadorEntity generateJogador() {
        Random random = new Random();
        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        String clube = clubes.get(random.nextInt(clubes.size()));
        String posicao = posicoes.get(random.nextInt(posicoes.size()));
        int idade = random.nextInt(20) + 18;
        return new JogadorEntity(nome, sobrenome, posicao, idade, clube);
    }

    public List<JogadorEntity> generateJogadores(int quantity) {
        List<JogadorEntity> jogadores = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            jogadores.add(generateJogador());
        }
        return jogadores;
    }
}

