package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Pokemon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id = 0;
	@Column
	private String nombre = "null";
	@OneToMany
	private List<Type> tipos = new ArrayList<>();
	@OneToMany
	private List<Type> debilidades = new ArrayList<>();
	@OneToOne
	private Pokemon evolution;
	@Column
	private String image = "";

	public Pokemon() {

	}

	public Pokemon(int id, String nombre, List<Type> tipoElectrico, List<Type> debilidades, Pokemon evolution,
			String image) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipos = tipoElectrico;
		// this.debilidades = debilidades;
		this.evolution = evolution;
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

	public void setEvolution(Pokemon evolution) {
		this.evolution = evolution;
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

	public Pokemon getEvolution() {
		return evolution;
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
		// cadena.append("\ndebilidades= " + debilidades);
		if (evolution == null)
			cadena.append("\nNo evoluciona");
		if (evolution != null)
			cadena.append("\nevolution=" + evolution);

		cadena.append("\nimage=" + image + "\n");

		return cadena.toString();

	}

}
