package com.example;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Pokemon {
	private int id = 0;
	private String nombre = "null";
	private List<Type> tipos = new ArrayList<>();
	private List<Type> debilidades = new ArrayList<>();
	private int evolutionId = 0;
	private String image = "";

	public Pokemon(int id, String nombre, List<Type> tipoElectrico, List<Type> debilidades, int evolutionId,
			String image) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipos = tipoElectrico;
		this.debilidades = debilidades;
		this.evolutionId = evolutionId;
		this.image = image;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipos(List<Type> tipos) {
		this.tipos = tipos;
	}

	public void setDebilidades(List<Type> debilidades) {
		this.debilidades = debilidades;
	}

	public void setEvolutionId(int evolutionId) {
		this.evolutionId = evolutionId;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public List<Type> getTipos() {
		return tipos;
	}

	public List<Type> getDebilidades() {
		return debilidades;
	}

	public int getEvolutionId() {
		return evolutionId;
	}

	public String getImage() {
		return image;
	}

	@Override
	public String toString() {
		StringBuilder cadena = new StringBuilder();
		cadena.append("Pokemon = " + nombre);
		if (tipos.size() == 1)
			cadena.append(" \ntipo =");
		if (tipos.size() == 2)
			cadena.append("\ntipos= ");
		cadena.append(tipos);
		cadena.append("\ndebilidades= " + debilidades);
		if (evolutionId == 0)
			cadena.append("\nNo evoluciona");
		if (evolutionId != 0)
			cadena.append("\nevolutionId=" + evolutionId);

		cadena.append("\nimage=" + image + "\n");

		return cadena.toString();

	}

}
