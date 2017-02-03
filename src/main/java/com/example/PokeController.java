package com.example;

import java.util.ArrayList;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//TODO ver que paso aqui  
//import org.thymeleaf.exceptions.ParserInitializationException;

@Controller
public class PokeController {
	ArrayList<Pokemon> pokes = new ArrayList<>();

	@Autowired
	PokemonDao pokemonDao;

	@RequestMapping("/pokemon")
	@ResponseBody
	// TODO arreglar como tipo
	public ResponseEntity<String> pokemon(@RequestParam(value = "name", required = false) String name) {

		if (name == null) {

			return ResponseEntity.ok(pokemonDao.getPokes().toString());

		}
		boolean b = Pattern.matches(".*\\d.*", name);
		if (b) {
			String sb = "no puede haber numeros en el nombre";
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb);
			
		}
		if (pokemonDao.getPokes(name) == null) {
			String sb = "no existe dicho pokemon<br><br>" + "*recomendación*<br>" + "-revise la escritura<br>";
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb);
		}
		return ResponseEntity.ok(pokemonDao.getPokes(name).toString());

	}

	@RequestMapping("/pokemon/id")
	@ResponseBody
	// TODO arreglar como tipo
	public ArrayList<Pokemon> pokemonID(@RequestParam(value = "id", required = false) String id) {
		return pokemonDao.getPokes(Integer.parseInt(id));
	}

	@RequestMapping("/pokemon/type")
	@ResponseBody
	public ResponseEntity<String> type(@RequestParam(value = "name", required = false) String typeName) {

		if (typeName == null) {

			return ResponseEntity.ok(pokemonDao.getTipos().toString());

		}
		if (pokemonDao.getTipos(typeName) == null) {
			String sb = "no existe dicho tipo<br>" + "*recomendación*<br>" + "-revise la escritura<br>";
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(sb);
		} else
			return ResponseEntity.ok(pokemonDao.getTipos(typeName).toString());

	}

	@RequestMapping("/pokemon/type/id")
	@ResponseBody

	public ResponseEntity<String> typeID(@RequestParam(value = "id", required = false) String typeID) {

		if (typeID == null) {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
					"debe digitar un ID para buscar el tipo<br>escriba en la URL lo siguiente:<br>?id=X<br><br>donde x es la ID del tipo que quiere buscar<br>0 para todos los tipos");
		}

		if (Integer.parseInt(typeID) < 0 || Integer.parseInt(typeID) > 18) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("no existe dicho tipo <br>use un id entre 1 y 18 (inclusivo)<br> 0 para todos los tipos");
		}
		return ResponseEntity.ok(pokemonDao.getTipos(Integer.parseInt(typeID)).toString());
	}

}