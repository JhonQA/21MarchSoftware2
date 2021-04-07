package com.qa.personchallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person("Jhon", 23, " Digital Consultant");
		Person obj2 = new Person("Vik, ", 18, " Sales assistant");
		Person obj3 = new Person("Tex", 33, " Janitor");
		Person obj4 = new Person("Wanda, ", 43, " Lawyer");
		
		
		PersonManager manager = new PersonManager();
		manager.addHuman(obj);
		manager.addHuman(obj2);
		manager.addHuman(obj3);
		manager.addHuman(obj4);
		
		System.out.println(obj);
		manager.searchHuman("Tex");
	}	

}
