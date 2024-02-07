package com.asma.Fruity.Loops.models;
public class Item {
    // MEMBER VARIABLES
    private String name;
    private double price;

    public String getName() {
		return name;
	}
 // CONSTRUCTOR
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
