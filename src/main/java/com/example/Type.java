package com.example;

public class Type {
	private int id;
	private String type;
	static Type electric = new Type(1, "electric");
	static Type normal = new Type(2, "normal");
	static Type fire = new Type(3, "fire");
	static Type fighting = new Type(4, "fighting");
	static Type water = new Type(5, "water");
	static Type flying = new Type(6, "flying");
	static Type grass = new Type(7, "grass");
	static Type poison = new Type(8, "poison");
	static Type ground = new Type(9, "ground");
	static Type psychic = new Type(10, "psychic");
	static Type rock = new Type(11, "rock");
	static Type ice = new Type(12, "ice");
	/*
	 * Type bug = new Type(); Type dragon = new Type(); Type ghost = new Type();
	 * Type dark = new Type(); Type steel = new Type(); Type fairy = new Type();
	 * 
	 */
	public Type(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;

	}

	



}
