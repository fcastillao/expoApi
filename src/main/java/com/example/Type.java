package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Type {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String type;
	// private int[] weakness = new int[18];

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

	/**
	 * @return the weakness
	 */
	/*
	 * public int[] getWeakness() { return weakness; }
	 * 
	 * 
	 * @param weakness the weakness to set
	 * 
	 * public void setWeakness(int[] weakness) { this.weakness = weakness;
	 * 
	 * Type normal = new Type(2, "normal"); Type fighting = new Type(4,
	 * "fighting"); Type water = new Type(5, "water");
	 * 
	 * Type poison = new Type(8, "poison"); Type rock = new Type(11, "rock");
	 * Type ice = new Type(12, "ice"); Type bug = new Type(13, "bug"); Type
	 * dragon = new Type(14, "dragon"); Type ghost = new Type(15, "ghost"); Type
	 * dark = new Type(16, "dark"); Type steel = new Type(17, "steel"); Type
	 * fairy = new Type(18, "fairy");
	 */
	public static Type getElectric() {
		return new Type(1, "electric");

	}

	public static Type getGrass() {
		return new Type(7, "grass");

	}

	public static Type getGround() {
		return new Type(9, "ground");
	}

	public static Type getFire() {
		return new Type(3, "fire");
	}

	public static Type getIce() {
		return new Type(12, "ice");
	}

	public static Type getFlying() {
		return new Type(6, "flying");
	}

	public static Type getPsychic() {
		return new Type(10, "psychic");
	}

}
