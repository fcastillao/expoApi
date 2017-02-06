package com.example;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class PokemonDaoRepositoryTest extends PokemonDaoRepository {

	@Autowired
	PokemonDaoRepository pokemonDaoRepository;

	@Test
	public void getTypeId1ShouldReturnElectric() {
		Type electric = new Type();
		electric.setId(1);
		electric.setType("electric");

		assertThat(pokemonDaoRepository.getTipos("electric"), is(equalTo(electric)));
	}

}
