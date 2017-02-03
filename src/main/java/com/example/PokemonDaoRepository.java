package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PokemonDaoRepository implements PokemonDao {

	@Autowired
	PokemonRepository pokemonRepository;
	@Autowired
	TypeRepository typeRepository;

	

	@PostConstruct
	private void llenarTipos() {

		Type electric = new Type();
		electric.setType("electric");
		typeRepository.saveAndFlush(electric);

		Type normal = new Type();
		normal.setType("normal");
		typeRepository.saveAndFlush(normal);

		Type fire = new Type();
		fire.setType("fire");
		typeRepository.saveAndFlush(fire);

		Type fighting = new Type();
		fighting.setType("fighting");
		typeRepository.saveAndFlush(fighting);

		Type water = new Type();
		water.setType("water");
		typeRepository.saveAndFlush(water);

		Type flying = new Type();
		flying.setType("flying");
		typeRepository.saveAndFlush(flying);

		Type grass = new Type();
		grass.setType("grass");
		typeRepository.saveAndFlush(grass);

		Type poison = new Type();
		poison.setType("poison");
		typeRepository.saveAndFlush(poison);

		Type ground = new Type();
		ground.setType("ground");
		typeRepository.saveAndFlush(ground);

		Type psychic = new Type();
		psychic.setType("spychic");
		typeRepository.saveAndFlush(psychic);

		Type rock = new Type();
		rock.setType("rock");
		typeRepository.saveAndFlush(rock);

		Type ice = new Type();
		ice.setType("ice");
		typeRepository.saveAndFlush(ice);

		Type bug = new Type();
		bug.setType("bug");
		typeRepository.saveAndFlush(bug);

		Type dragon = new Type();
		dragon.setType("dragon");
		typeRepository.saveAndFlush(dragon);

		Type ghost = new Type();
		ghost.setType("ghost");
		typeRepository.saveAndFlush(ghost);

		Type dark = new Type();
		dark.setType("dark");
		typeRepository.saveAndFlush(dark);

		Type steel = new Type();
		steel.setType("steel");
		typeRepository.saveAndFlush(steel);

		Type fairy = new Type();
		fairy.setType("fairy");
		typeRepository.saveAndFlush(fairy);

	}

	@Override
	public List<Type> getTipos() {
		List<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = typeRepository.findAll();

		return todosLosTipos;
	}

	@Override
	public List<Type> getTipos(int id) {
		List<Type> todosLosTipos = new ArrayList<Type>();
		todosLosTipos = typeRepository.findAll();

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
		List<Type> todosLosTipos;
		todosLosTipos = typeRepository.findAll();

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
	public void fillPokemonRepository() {
		Pokemon raichu = new Pokemon();
		raichu.setEvolution(null);
		raichu.setImage("TODO");
		raichu.setTipos(typeRepository.findByType("electric"));
		raichu.setDebilidades(typeRepository.findByType("ground"));
		raichu.setNombre("raichu");

		Pokemon pikachu = new Pokemon();
		raichu.setEvolution(raichu);
		raichu.setImage("http://www.dondevive.org/wp-content/uploads/2016/07/pikachu.jpg");
		raichu.setTipos(typeRepository.findByType("electric"));
		raichu.setDebilidades(typeRepository.findByType("ground"));
		raichu.setNombre("pikachu");

		Pokemon bulbasaur = new Pokemon();
		bulbasaur.setNombre("bulbasaur");
		bulbasaur.setTipos(typeRepository.findByType("grass"));

		ArrayList<Type> debilidadesHierba = new ArrayList<>();
		debilidadesHierba.add(typeRepository.findByType("bug").get(0));
		debilidadesHierba.add(typeRepository.findByType("fire").get(0));
		debilidadesHierba.add(typeRepository.findByType("flying").get(0));
		debilidadesHierba.add(typeRepository.findByType("ice").get(0));
		debilidadesHierba.add(typeRepository.findByType("poison").get(0));

		bulbasaur.setDebilidades(debilidadesHierba);
		bulbasaur.setEvolution(null);
		bulbasaur.setImage("http://cartoonbros.com/wp-content/uploads/2016/11/Bulbasaur-8.png");
		pokemonRepository.saveAndFlush(raichu);
		pokemonRepository.saveAndFlush(pikachu);
		pokemonRepository.save(bulbasaur);
	}

	@Override
	public ArrayList<Pokemon> getPokes() {
		ArrayList<Pokemon> todosLosPokemones = new ArrayList<Pokemon>();
		todosLosPokemones = (ArrayList<Pokemon>) pokemonRepository.findAll();
		return todosLosPokemones;

	}

	@Override
	public ArrayList<Pokemon> getPokes(String name) {
		List<Pokemon> todosLosPokes = new ArrayList<Pokemon>();
		todosLosPokes = pokemonRepository.findAll();

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
		List<Pokemon> todosLosPokes = new ArrayList<Pokemon>();
		todosLosPokes = pokemonRepository.findAll();

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
