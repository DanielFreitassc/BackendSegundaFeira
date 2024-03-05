package com.danielfreitassc.aula_1.exercicioB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import org.springframework.stereotype.Service;

@Service
public class JogadorGerador {
    private static final String SOBRENOMES_URI = "https://venson.net.br/resources/data/sobrenomes.txt";
    private static final String NOMES_URI = "https://venson.net.br/resources/data/nomes.txt";
    private static final String CLUBES_URI = "https://venson.net.br/resources/data/clubes.txt";
    private static final String POSICOES_URI = "https://venson.net.br/resources/data/posicoes.txt";

    private List<String> sobrenomes;
    private List<String> nomes;
    private List<String> clubes;
    private List<String> posicoes;
    
    public JogadorGerador() {
        this.sobrenomes = fetchData(SOBRENOMES_URI);
        this.nomes = fetchData(NOMES_URI);
        this.clubes = fetchData(CLUBES_URI);
        this.posicoes = fetchData(POSICOES_URI);
    }

        private List<String> fetchData(String urlString) {
        List<String> data = new ArrayList<>();
        try {
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                data.add(inputLine);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public Jogador generateJogador() {
        Random random = new Random();
        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        String clube = clubes.get(random.nextInt(clubes.size()));
        String posicao = posicoes.get(random.nextInt(posicoes.size()));
        int idade = random.nextInt(20) + 18;
        return new Jogador(nome, sobrenome, posicao, idade, clube);
    }

    public List<Jogador> generateJogadores(int quantity) {
        List<Jogador> jogadores = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            jogadores.add(generateJogador());
        }
        return jogadores;
    }
}
