package com.example;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import oldstuff.PokemonDaoInMemory;

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
	public void getPokemonId1ShouldReturnPikachu() {

		Assert.assertEquals("pikachu", pokemonDao.getPokes(1).get(0).getNombre());
	}

	// linea divisora ^^test pokemon // test
	// Tipos-----------------------------------------------------
	@Test
	public void getAllTypes() {
		pokemonDao.getTipos();
	}

	@Test
	public void typeId3ShouldReturnFire() {
		ArrayList<Type> arraySoloFire = new ArrayList<>();
		Type fireTest = new Type(3, "fire");
		arraySoloFire.add(fireTest);
		ArrayList<Type> arraySoloFireActual = new ArrayList<>();
		arraySoloFireActual = pokemonDao.getTipos(3);
		Assert.assertEquals(arraySoloFire.get(0).getType(), arraySoloFireActual.get(0).getType());
	}

	@Test
	public void typeStringShouldReturnEmpty() {
		ArrayList<Type> tipoEsperado = new ArrayList<>();
		ArrayList<Type> tipoActual = new ArrayList<>();

		tipoActual = pokemonDao.getTipos("string");
		Assert.assertEquals(tipoEsperado, tipoActual);

	}

	@Test
	public void type200ShouldReturnEmpty() {
		ArrayList<Type> tipoEsperado = new ArrayList<>();
		ArrayList<Type> tipoActual = new ArrayList<>();

		tipoActual = pokemonDao.getTipos(200);
		Assert.assertEquals(tipoEsperado, tipoActual);
	}

	@Test
	public void type0ShouldReturnEmpty() {
		ArrayList<Type> tipoEsperado = new ArrayList<>();
		ArrayList<Type> tipoActual = new ArrayList<>();

		tipoActual = pokemonDao.getTipos(0);
		Assert.assertEquals(tipoEsperado, tipoActual);
	}

}
