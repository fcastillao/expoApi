package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeApplication.class, args);
		ArrayList<Type> todosLosTipos = new ArrayList();
		
	
	
	}

	private static void llenarLista(ArrayList<Pokemon> todosLosPokemones) {

		List<Type> tipoElectrico = new ArrayList<Type>();
		tipoElectrico.add(Type.electric);
		ArrayList<Type> debilidadesElectricas = new ArrayList<Type>();
		debilidadesElectricas.add(Type.ground);

		ArrayList<Type> tipoHierba = new ArrayList<Type>();
		tipoHierba.add(Type.grass);
		ArrayList<Type> debilidadesHierba = new ArrayList<Type>();
		debilidadesHierba.add(Type.fire);
		debilidadesHierba.add(Type.ice);
		debilidadesHierba.add(Type.flying);
		debilidadesHierba.add(Type.psychic);

		Pokemon pikachu = new Pokemon(1, "pikachu", tipoElectrico, debilidadesElectricas, 0,
				"http://www.dondevive.org/wp-content/uploads/2016/07/pikachu.jpg");
		todosLosPokemones.add(pikachu);

		Pokemon bulbasaur = new Pokemon(2, "bulbasaur", tipoHierba, debilidadesHierba, 0,
				"http://cartoonbros.com/wp-content/uploads/2016/11/Bulbasaur-8.png");
		todosLosPokemones.add(bulbasaur);

	}

	public static List<Pokemon> getPokes() {
		ArrayList<Pokemon> todosLosPokemones = new ArrayList<Pokemon>();
		llenarLista(todosLosPokemones);
		return todosLosPokemones;
	}
	
	public llenarVectorTipos(ArrayList<Type> tiposLocal){
	
	 Type electric = new Type(1, "electric");
	 Type normal = new Type(2, "normal");
	 Type fire = new Type(3, "fire");
	 Type fighting = new Type(4, "fighting");
	 Type water = new Type(5, "water");
	 Type flying = new Type(6, "flying");
	 Type grass = new Type(7, "grass");
	 Type poison = new Type(8, "poison");
	 Type ground = new Type(9, "ground");
	 Type psychic = new Type(10, "psychic");
	 Type rock = new Type(11, "rock");
	 Type ice = new Type(12, "ice");
	 Type bug = new Type(13,"bug"); 
	 Type dragon = new Type(14,"dragon"); 
	 Type ghost = new Type(15,"ghost");
	 Type dark = new Type(16,"dark"); 
	 Type steel = new Type(17,"steel"); 
	 Type fairy = new Type(18,"fairy");
	 
	 
	 
	
	
}
