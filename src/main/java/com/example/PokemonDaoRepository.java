package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class PokemonDaoRepository implements PokemonDao {

	@PostConstruct
	private ArrayList<Type> llenarTipos() {
		ArrayList<Type> tiposLocales = new ArrayList<Type>();

		Type electric = new Type();
		electric.setType("electric");

		Type normal = new Type();
		normal.setType("normal");

		Type fire = new Type();
		fire.setType("fire");

		Type fighting = new Type();
		fighting.setType("fighting");

		Type water = new Type();
		water.setType("water");

		Type flying = new Type();
		flying.setType("flying");

		Type grass = new Type();
		grass.setType("grass");

		Type poison = new Type();
		poison.setType("poison");

		Type ground = new Type();
		ground.setType("ground");

		Type psychic = new Type();
		psychic.setType("spychic");

		Type rock = new Type();
		rock.setType("rock");

		Type ice = new Type();
		ice.setType("ice");

		Type bug = new Type();
		bug.setType("bug");

		Type dragon = new Type();
		dragon.setType("dragon");

		Type ghost = new Type();
		ghost.setType("ghost");

		Type dark = new Type();
		dark.setType("dark");

		Type steel = new Type();
		steel.setType("steel");

		Type fairy = new Type();
		fairy.setType("fairy");

		return tiposLocales;

	}

	@Override
	public ArrayList<Type> getTipos() {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();
		return todosLosTipos;
	}

	@Override
	public ArrayList<Type> getTipos(int id) {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();

		if (id == 0) {
			return todosLosTipos;
		}
		for (Type type : todosLosTipos) {
			if (type.getId() == id) {
				ArrayList<Type> t = new ArrayList<Type>();
				t.add(type);
				return t;
			}

		}
		return null;
	}

	@Override
	public ArrayList<Type> getTipos(String typeName) {
		ArrayList<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = llenarTipos();

		for (Type type : todosLosTipos) {
			if (type.getType().equals(typeName)) {
				ArrayList<Type> t = new ArrayList<Type>();
				t.add(type);
				return t;
			}

		}
		return null;
	}

	@PostConstruct
	public ArrayList<Pokemon> getPokemonList() {
		ArrayList<Pokemon> pokemonesLocales = new ArrayList<>();
		List<Type> tipoElectrico = new ArrayList<Type>();
		tipoElectrico.add(new Type(1, "electric"));
		ArrayList<Type> debilidadesElectricas = new ArrayList<Type>();
		debilidadesElectricas.add(new Type(9, "ground"));

		ArrayList<Type> tipoHierba = new ArrayList<Type>();
		tipoHierba.add(new Type(7, "grass"));
		ArrayList<Type> debilidadesHierba = new ArrayList<Type>();
		debilidadesHierba.add(new Type(3, "fire"));
		debilidadesHierba.add(new Type(12, "ice"));
		debilidadesHierba.add(new Type(6, "flying"));
		debilidadesHierba.add(new Type(10, "psychic"));

		Pokemon raichu = new Pokemon(2, "raichu", tipoElectrico, debilidadesElectricas, null, "TODO");
		pokemonesLocales.add(raichu);

		Pokemon pikachu = new Pokemon(1, "pikachu", tipoElectrico, debilidadesElectricas, raichu,
				"http://www.dondevive.org/wp-content/uploads/2016/07/pikachu.jpg");
		pokemonesLocales.add(pikachu);

		Pokemon bulbasaur = new Pokemon(3, "bulbasaur", tipoHierba, debilidadesHierba, null,
				"http://cartoonbros.com/wp-content/uploads/2016/11/Bulbasaur-8.png");
		pokemonesLocales.add(bulbasaur);
		return pokemonesLocales;

	}

	@Override
	public List<Pokemon> getPokes() {
		ArrayList<Pokemon> todosLosPokemones = new ArrayList<Pokemon>();
		todosLosPokemones = getPokemonList();
		return todosLosPokemones;

	}

	@Override
	public ArrayList<Pokemon> getPokes(String name) {
		ArrayList<Pokemon> todosLosPokes = new ArrayList<Pokemon>();
		todosLosPokes = getPokemonList();

		for (Pokemon pokemon : todosLosPokes) {
			if (pokemon.getNombre().equals(name)) {
				ArrayList<Pokemon> t = new ArrayList<>();
				t.add(pokemon);
				return t;
			}
		}

		return null;
	}

	@Override
	public ArrayList<Pokemon> getPokes(int parseInt) {
		ArrayList<Pokemon> todosLosPokes = new ArrayList<Pokemon>();
		todosLosPokes = getPokemonList();

		for (Pokemon pokemon : todosLosPokes) {
			if (pokemon.getId() == parseInt) {
				ArrayList<Pokemon> t = new ArrayList<>();
				t.add(pokemon);
				return t;
			}

		}
		return new ArrayList<Pokemon>();
	}

}
