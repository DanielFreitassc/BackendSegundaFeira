package com.example.minecraft;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.minecraft.models.BlocoDeFerroEntity;
import com.example.minecraft.models.BlocoEntity;
import com.example.minecraft.models.ItemEntity;
import com.example.minecraft.models.JogarEntity;

@SpringBootApplication
public class MinecraftApplication {

	public static void main(String[] args) {
		JogarEntity jogarEntity1 = new JogarEntity();
		JogarEntity jogarEntity2 = new JogarEntity();
		BlocoEntity blocoEntity = new BlocoEntity();
		BlocoDeFerroEntity blocoDeFerroEntity = new BlocoDeFerroEntity("Mineiro de Ferro");
		ItemEntity drop1 = blocoDeFerroEntity.destruir();
		ItemEntity drop =  blocoEntity.destruir();

		if(drop1 == null) {
			System.out.println("Não dropou nada");
		} else {
			System.out.println(drop1.getNome());
		}
	

		jogarEntity1.mover(10,15);
		jogarEntity2.mover(20, 40);
		System.out.println(jogarEntity1);
		System.out.println(jogarEntity2);

		System.out.println(jogarEntity1.getPosicao());
		System.out.println(jogarEntity2.getPosicao());
	}

}
