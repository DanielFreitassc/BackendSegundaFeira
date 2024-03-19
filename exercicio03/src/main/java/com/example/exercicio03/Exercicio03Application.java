package com.example.exercicio03;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.example.exercicio03.models.Pokemon;
import com.example.exercicio03.models.ProjectConfiguration;

@SpringBootApplication
public class Exercicio03Application {
	@Autowired
	Pokemon pokemon;
	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		Pokemon pokemon = context.getBean(Pokemon.class);
		System.out.println(pokemon.getNome());
		context.close();
	}

}
