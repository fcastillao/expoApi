package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

	List<Pokemon> findByPokemonId(int pokemonId);

}
