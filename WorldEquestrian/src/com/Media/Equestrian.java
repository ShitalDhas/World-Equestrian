package com.Media;

public class Equestrian {
	private int id;
	private String name;
	private String gender;
	private String country;
	private int medals;
	
	public Equestrian(int id, String name, String gender, String country, int medals) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.country = country;
		this.medals = medals;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getMedals() {
		return medals;
	}

	public void setMedals(int medals) {
		this.medals = medals;
	}

	@Override
	public String toString() {
		return "Equestrian [id=" + id + ", name=" + name + ", gender=" + gender + ", country=" + country + ", medals="
				+ medals + "]";
	}
	

}
