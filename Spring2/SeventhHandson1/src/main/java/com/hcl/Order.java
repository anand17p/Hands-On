package com.hcl;

public class Order {
	String itemName;
	Double price;

	public Order() {
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Order Detail:");
		System.out.println("Item Name: " + itemName + "\n" + "Price: " + price);

	}

}
