package com.example;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PokeController {
	ArrayList<Pokemon> pokes = new ArrayList<>();

	@RequestMapping("/pokemon")
	@ResponseBody

	public String pokemon(@RequestParam(value = "name", required = false) String name) {
		
		if (name==null) {

			return PokeApplication.getPokes().toString();

		}

		return null;
	}

	@RequestMapping("/pokemon/type")
	@ResponseBody

	public String pokemon(@RequestParam(value = "type", required = false) String type) {
		
		if (type==null) {

			return PokeApplication.getTypes().toString();

		}

		return null;
	}
	
	
}