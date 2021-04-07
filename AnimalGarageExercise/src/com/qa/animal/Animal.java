package com.qa.animal;

public class Animal {
	
	private String colour;
	private boolean doesItHunt;
	private boolean isDomesticated;
	
	
	public void eat(){
		System.out.println("Munching food");
	}
	
	public void toilet() {
		System.out.println("Emptying waste");
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	public boolean isDoesItHunt() {
		return doesItHunt;
	}

	public void setDoesItHunt(boolean doesItHunt) {
		this.doesItHunt = doesItHunt;
	}

	public boolean isDomesticated() {
		return isDomesticated;
	}

	public void setDomesticated(boolean isDomesticated) {
		this.isDomesticated = isDomesticated;
	}
	

	
	
}
