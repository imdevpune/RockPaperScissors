package com.game;

import java.util.Scanner;

public class Player {

	private int id;
	private String name;
	private String value;

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

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	//This method will choose Players choice 
	public void getChoice() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Hi " + this.getName() + " , Please enter any one of the values - Rock, Paper, Scissors \n");
		
		String inputValue=scan.next();
		while (!"Rock".equalsIgnoreCase(inputValue) && !"Paper".equalsIgnoreCase(inputValue)
				&& !"Scissors".equalsIgnoreCase(inputValue)) {
			System.out.println("You have entered Invalid value, Enter any one of Rock, Paper, Scissors ");
			   inputValue = scan.next();
		}

		this.setValue(inputValue);
		System.out.println(this.getName() + " selected value=" + this.value);
		System.out.println();
	}
}