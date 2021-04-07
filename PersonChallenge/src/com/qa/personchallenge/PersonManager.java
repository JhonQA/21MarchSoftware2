package com.qa.personchallenge;

import java.util.ArrayList;

public class PersonManager {
	
	
	private ArrayList<Person> people = new ArrayList<Person>();
	
	public void addHuman(Person p) {
		this.people.add(p);
	}
	
	public void searchHuman(String name) {
		
		for(Person p: people ) {
			if(p.getName().equals(name)) {
				System.out.println("found name " + p);
			}
		}
	}

}
