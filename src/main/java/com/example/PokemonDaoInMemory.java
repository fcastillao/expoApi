package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class PokemonDaoInMemory implements PokemonDao {

	@PostConstruct
	private ArrayList<Type> llenarTipos() {
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

	public ArrayList<Type> getTipos() {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();
		return todosLosTipos;
	}

	public ArrayList<Type> getTipos(int id) {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();

		for (Type type : todosLosTipos) {
			if (type.getId() == id) {
				ArrayList<Type> t = new ArrayList<Type>();
				t.add(type);
				return t;
			}

		}
		return todosLosTipos;
	}

	public List<Type> getTipos(String typeName) {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();

		for (Type type : todosLosTipos) {
			if (type.getType().equals(typeName)) {
				ArrayList<Type> t = new ArrayList<Type>();
				t.add(type);
				return t;
			}

		}
		return todosLosTipos;
	}

	@PostConstruct
	public ArrayList<Pokemon> llenarLista() {
		ArrayList<Pokemon> pokemonesLocales = new ArrayList<>();
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
		pokemonesLocales.add(pikachu);

		Pokemon bulbasaur = new Pokemon(2, "bulbasaur", tipoHierba, debilidadesHierba, 0,
				"http://cartoonbros.com/wp-content/uploads/2016/11/Bulbasaur-8.png");
		pokemonesLocales.add(bulbasaur);
		return pokemonesLocales;

	}

	public List<Pokemon> getPokes() {
		ArrayList<Pokemon> todosLosPokemones = new ArrayList<Pokemon>();
		todosLosPokemones = llenarLista();

		return todosLosPokemones;
	}

	public ArrayList<Pokemon> getPokes(String id) {
		ArrayList<Pokemon> todosLosPokes = new ArrayList<Pokemon>();
		todosLosPokes = llenarLista();

		for (Pokemon pokemon : todosLosPokes) {
			if (pokemon.getNombre().equals(id)) {
				ArrayList<Pokemon> t = new ArrayList<>();
				t.add(pokemon);
				return t;
			}

		}
		return todosLosPokes;
	}

	public ArrayList<Pokemon> getPokes(int parseInt) {
		ArrayList<Pokemon> todosLosPokes = new ArrayList<Pokemon>();
		todosLosPokes = llenarLista();

		for (Pokemon pokemon : todosLosPokes) {
			if (pokemon.getId() == parseInt) {
				ArrayList<Pokemon> t = new ArrayList<>();
				t.add(pokemon);
				return t;
			}

		}
		return todosLosPokes;
	}

}
