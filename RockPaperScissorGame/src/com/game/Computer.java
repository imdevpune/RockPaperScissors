package com.game;

import java.util.Random;

public class Computer extends Player {

	private String value;

	public String getValue() {
		return value;
	}
	
    public void setValue(String value) {
		this.value = value;
	}

   //This method will generate the computer choice
	public void getChoice() {
		Random random = new Random();

		int num = random.nextInt(3) + 1;

		if (num == 1)
			value = "Rock";
		else if (num == 2)
			value = "Paper";
		else
			value = "Scissors";
		
		System.out.println("Computer selected="+value);
		System.out.println();
    }

}
