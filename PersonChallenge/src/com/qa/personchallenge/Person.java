package com.qa.personchallenge;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	
	
	public Person(String name, int age, String jobTitle) {
		
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
		
	
	public String getName() {
		
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

@Override
	public String toString() {
		return "Customer: " + name+ " is "+ this.age + " is a " + this.jobTitle;
	}
	
	
}
