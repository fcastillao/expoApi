package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokeController {
	ArrayList<Pokemon> pokes = new ArrayList<>();

	@RequestMapping("/pokemon")
	@ResponseBody

	public ArrayList<Pokemon> pokemon(@RequestParam(value = "name", required = false) String name) {
		
		if (name==null) {

			return (ArrayList<Pokemon>) PokeApplication.getPokes();

		}

		return PokeApplication.getPokes(name);
	}
	
	
	@RequestMapping("/pokemon/type")
	@ResponseBody
	
	

	public List<Type> type(@RequestParam(value = "type", required = false) String typeID) {
		
		if (typeID==null) {

			return PokeApplication.getTipos();

		}

		return PokeApplication.getTipos(Integer.parseInt(typeID));
	}
	
	
}