package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PokeApplication {
	
	@Autowired
	PokemonDao pokemonDao;


	public static void main(String[] args) {
		SpringApplication.run(PokeApplication.class, args);
		
		Pokemon pikachu = new Pokemon();
		pikachu.setNombre("pikachu");

		Pokemon raichu = new Pokemon();
		pikachu.setNombre("raichu");
		pikachu.setEvolution(raichu);
		
		
		
	}
}