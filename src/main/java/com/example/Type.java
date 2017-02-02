package com.example;

public class Type {
	private int id;
	private String type;
	private int[] weakness= new int[18]; 
	 
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
	public int[] getWeakness() {
		return weakness;
	}

	/**
	 * @param weakness the weakness to set
	 */
	public void setWeakness(int[] weakness) {
		this.weakness = weakness;
	}

	



}
