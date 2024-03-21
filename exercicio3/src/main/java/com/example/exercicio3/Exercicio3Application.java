package com.example.exercicio3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.exercicio3.services.OscarService;

@SpringBootApplication
public class Exercicio3Application {
	@Autowired
	private static OscarService oscarService;

	public static void main(String[] args) {
	 SpringApplication.run(Exercicio3Application.class, args);

	 oscarService.mostrarListaIndicados();
	 
	}


}
