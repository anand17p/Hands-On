package com.abc43;

public class Item {
	String name;
	String type;
	Integer cost;
	Integer availableQuantity;
	public Item()
	{
		
	}
	public Item(String name, String type, Integer cost, Integer availableQuantity) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.availableQuantity = availableQuantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public Integer getCost() {
		return cost;
	}
	public Integer getAvailableQuantity() {
		return availableQuantity;
	}
	
}
