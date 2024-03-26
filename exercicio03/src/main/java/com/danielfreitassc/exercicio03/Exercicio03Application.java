package com.danielfreitassc.exercicio03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.danielfreitassc.exercicio03.components.Indicacao;
import com.danielfreitassc.exercicio03.models.Ator;
import com.danielfreitassc.exercicio03.models.Filme;
import com.danielfreitassc.exercicio03.services.OscarService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Exercicio03Application {

    @Autowired
    private OscarService oscarService;

    public static void main(String[] args) {
        SpringApplication.run(Exercicio03Application.class, args);
    }

    @PostConstruct
    public void init() {
        Ator tomHanks = new Ator("Tom Hanks", "Estadunidense");
        Ator emmaWatson = new Ator("Emma Watson", "Paris, França");
		Filme harryPotter = new Filme("HarryPotter", "Fantasia");
		Filme aBelaeaFera = new Filme("A Bela e a Fera", "Fantasia");

        Indicacao indicacao1 = new Indicacao(emmaWatson, "Melhor Atora");
        Indicacao indicacao2 = new Indicacao(tomHanks, "Melhor Ator");
        Indicacao indicacao3 = new Indicacao(harryPotter, "Melhor filme");
        Indicacao indicacao4 = new Indicacao(aBelaeaFera, "Melhor trilha sonora");

		
        oscarService.adicionarIndicacao(indicacao1, indicacao1.getCategoria(), true);
		oscarService.adicionarIndicacao(indicacao2, indicacao2.getCategoria(),false );
        oscarService.adicionarIndicacao(indicacao3, indicacao3.getCategoria(), true);
        oscarService.adicionarIndicacao(indicacao4, indicacao4.getCategoria(), true);
        oscarService.mostrarListaIndicados();
    }
}
