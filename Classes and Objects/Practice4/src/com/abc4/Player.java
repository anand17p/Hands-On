package com.abc4;

public class Player {
	private String name;
	private String country;
	private String skill;
	public Player() {
	}
	public Player(String name, String country, String skill) {
		super();
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getSkill() {
		return skill;
	}

}
