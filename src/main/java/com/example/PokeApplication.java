package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokeApplication.class, args);
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();

	}
	
	private static ArrayList<Type> llenarTipos() {
		ArrayList<Type> tiposLocales = new ArrayList<Type>();

		Type electric = new Type(1, "electric");
		tiposLocales.add(electric);
		Type normal = new Type(2, "normal");
		tiposLocales.add(normal);
		Type fire = new Type(3, "fire");
		tiposLocales.add(fire);
		Type fighting = new Type(4, "fighting");
		tiposLocales.add(fighting);
		Type water = new Type(5, "water");
		tiposLocales.add(water);
		Type flying = new Type(6, "flying");
		tiposLocales.add(flying);
		Type grass = new Type(7, "grass");
		tiposLocales.add(grass);
		Type poison = new Type(8, "poison");
		tiposLocales.add(poison);
		Type ground = new Type(9, "ground");
		tiposLocales.add(ground);
		Type psychic = new Type(10, "psychic");
		tiposLocales.add(psychic);
		Type rock = new Type(11, "rock");
		tiposLocales.add(rock);
		Type ice = new Type(12, "ice");
		tiposLocales.add(ice);
		Type bug = new Type(13, "bug");
		tiposLocales.add(bug);
		Type dragon = new Type(14, "dragon");
		tiposLocales.add(dragon);
		Type ghost = new Type(15, "ghost");
		tiposLocales.add(ghost);
		Type dark = new Type(16, "dark");		
		tiposLocales.add(dark);
		Type steel = new Type(17, "steel");
		tiposLocales.add(steel);
		Type fairy = new Type(18, "fairy");
		tiposLocales.add(fairy);
		return tiposLocales;

	}

	private static void llenarLista(ArrayList<Pokemon> todosLosPokemones) {

		List<Type> tipoElectrico = new ArrayList<Type>();
		tipoElectrico.add(Type.getElectric());
		ArrayList<Type> debilidadesElectricas = new ArrayList<Type>();
		debilidadesElectricas.add(Type.getGround());

		ArrayList<Type> tipoHierba = new ArrayList<Type>();
		tipoHierba.add(Type.getGrass());
		ArrayList<Type> debilidadesHierba = new ArrayList<Type>();
		debilidadesHierba.add(Type.getFire());
		debilidadesHierba.add(Type.getIce());
		debilidadesHierba.add(Type.getFlying());
		debilidadesHierba.add(Type.getPsychic());

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
}