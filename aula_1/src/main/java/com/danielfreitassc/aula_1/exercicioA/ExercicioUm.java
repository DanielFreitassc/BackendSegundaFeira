package com.danielfreitassc.aula_1.exercicioA;

import java.net.URI;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


public class ExercicioUm {

    public static void main(String[] args) throws Exception{
        String listaDeNomes = retornaListaDaURI("https://venson.net.br/resources/data/nomes.txt");
        String nome = retornaIndiceAleatorio(listaDeNomes);

        String listaDeSobrenomes = retornaListaDaURI("https://venson.net.br/resources/data/sobrenomes.txt");
        String sobrenome = retornaIndiceAleatorio(listaDeSobrenomes);

        String listaDeClubes = retornaListaDaURI("https://venson.net.br/resources/data/clubes.txt");
        String clube = retornaIndiceAleatorio(listaDeClubes);

        String listaDeposicoes = retornaListaDaURI("https://venson.net.br/resources/data/posicoes.txt");
        String posicao = retornaIndiceAleatorio(listaDeposicoes);

        int idades = geraNumeroAleatorio(17,40);

        String mensagem = nome +""+ sobrenome + " é um futebolista brasileiro de " + idades + " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".";
        System.out.println(mensagem);

    }
    public static int geraNumeroAleatorio(int menor, int maior) {
        int diference = maior - menor;
        int aleatorio = (int) Math.floor(Math.random() * diference);
        return aleatorio + menor;
    }

    public static String retornaListaDaURI(String minhaUri) throws Exception{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(minhaUri)).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String lista = response.body();
        return lista;
    }

    public static String retornaIndiceAleatorio(String stringao) {
        String[] listaDeNomes = stringao.split("\n");
        int indiceAleatorio = (int) Math.floor(Math.random()* listaDeNomes.length);
        return listaDeNomes[indiceAleatorio];
    }
}
