package com.game;

import java.util.Scanner;

public class RockPaperScissorGame {

	public static void main(String[] args) {

		String playagain;
		
		@SuppressWarnings("resource")
		Scanner playerScan = new Scanner(System.in);
		
		//Select if you would like to Play MultiPlayer Game OR Game with Computer
		System.out.println("Would you like to play with Computer or Other Player ? Please enter any one of the values 'Computer' or  'Player'");
		String opponent=playerScan.next();
	
		Player player1 = new Player();
		player1.setId(1);
		player1.setName("Player1");
		
		Player player2;
		
		//Player2 is either Another player OR Computer based on user's input
		if(opponent.equalsIgnoreCase("Player")) {
			player2= new Player();
			player2.setId(2);
			player2.setName("Player2");
		}
		else {
			player2=new Computer();
			player2.setId(2);
			player2.setName("Computer");
		}

		//Play the Game until user selects 'N'
		do {
			player1.getChoice();
			player2.getChoice();
	
			if (player1.getValue().equalsIgnoreCase(player2.getValue())) {
				System.out.println("  *** Game is Draw ***\n");
			} else {
				Player winner = new WinnerCalculation().checkWinner(player1, player2);
				System.out.println("  *** The Winner is - " + winner.getName() +"  ***\n");
			}
			
	        System.out.println("Would you like to play again ? Please enter Y/N");
	        playagain = playerScan.next();

		}while("Y".equalsIgnoreCase(playagain));
				
	}

}