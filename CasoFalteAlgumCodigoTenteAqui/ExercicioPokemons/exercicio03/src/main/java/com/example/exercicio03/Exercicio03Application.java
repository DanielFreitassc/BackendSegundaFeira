package com.example.exercicio03;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class Exercicio03Application {
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Pokemon pokemon1 = context.getBean(Pokemon.class, "Pikachu", 22);
        Pokemon pokemon2 = context.getBean(Pokemon.class, "Mewtwo", 10);

        PokemonService pokemonService = context.getBean(PokemonService.class);
        pokemonService.capturar(pokemon1);
        pokemonService.capturar(pokemon2);

		
		System.out.println("Agora você tem o total de  2 Pokemos: " +  pokemon1.getNome()  +" E "+ pokemon2.getNome() );

        context.close();
	}

}
