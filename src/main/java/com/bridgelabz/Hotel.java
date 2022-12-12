package com.bridgelabz;

public class Hotel {
	private String name;
	private int rates;

	public Hotel(String name, int rates) {
		this.name = name;
		this.rates = rates;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setrates(int rates) {
		this.rates = rates;
	}
	
	public int getRating() {
		return rates;
	}
	

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rating=" + rates + "]";
	}

}
