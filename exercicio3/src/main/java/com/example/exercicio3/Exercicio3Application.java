package com.example.exercicio3;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.exercicio3.models.IndicavelEntity;
import com.example.exercicio3.services.OscarService;

@SpringBootApplication
public class Exercicio3Application {
	@Autowired
	OscarService oscarService;


	public static void main(String[] args) {
		
		IndicavelEntity indicavelEntity = new IndicavelEntity();

		OscarService oscarService = new OscarService();
		oscarService.adicionarIndicacao();
		

	}

}
