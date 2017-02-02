package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//TODO ver que paso aqui  
//import org.thymeleaf.exceptions.ParserInitializationException;

@Controller
public class PokeController {
	ArrayList<Pokemon> pokes = new ArrayList<>();

	@RequestMapping("/pokemon")
	@ResponseBody

	public ArrayList<Pokemon> pokemon(@RequestParam(value = "name", required = false) String name) {

		if (name == null) {

			return (ArrayList<Pokemon>) PokeApplication.getPokes();

		}

		return PokeApplication.getPokes(name);
	}

	@RequestMapping("/pokemon/id")
	@ResponseBody

	public ArrayList<Pokemon> pokemonID(@RequestParam(value = "id", required = false) String id) {

		if (id == null) {

			return (ArrayList<Pokemon>) PokeApplication.getPokes();

		}

		return PokeApplication.getPokes(Integer.parseInt(id));
	}

	@RequestMapping("/pokemon/type")
	@ResponseBody

	public List<Type> type(@RequestParam(value = "name", required = false) String typeName) {

		if (typeName == null) {

			return PokeApplication.getTipos();

		}

		return PokeApplication.getTipos(typeName);
	}

	@RequestMapping("/pokemon/type/id")
	@ResponseBody

	public List<Type> typeID(@RequestParam(value = "id", required = true) String typeID) {

		if (typeID == null) {

			return PokeApplication.getTipos();

		}

		return PokeApplication.getTipos(Integer.parseInt(typeID));
	}

}