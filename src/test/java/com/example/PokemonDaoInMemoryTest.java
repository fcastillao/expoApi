package com.example;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PokemonDaoInMemoryTest {
	// TODO do decent test
	// 3052491754
	PokemonDaoInMemory pokemonDao;

	@Before
	public void setUp() {
		pokemonDao = new PokemonDaoInMemory();
	}

	@Test
	public void getAllPokemons() {
		pokemonDao.getPokes();
	}

	@Test
	public void getAllTypes() {
		pokemonDao.getTipos();
	}

	@Test
	public void tipeId3ShouldReturnFire() {
		ArrayList<Type> arraySoloFire = new ArrayList<>();
		Type fireTest = new Type(3, "fire");
		arraySoloFire.add(fireTest);
		ArrayList<Type> arraySoloFireActual = new ArrayList<>();
		arraySoloFireActual = pokemonDao.getTipos(3);
		Assert.assertEquals(arraySoloFire.get(0).getType(), arraySoloFireActual.get(0).getType());
	}

}
