package com.example;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

    List<Pokemon> findById(int id);
    
}
