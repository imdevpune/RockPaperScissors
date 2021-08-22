package com.game;

public class WinnerCalculation {

	private Player winner;

	//This method will determine who is winner based on Player's input
	//TODO : Modify this method in case you want to extend game to "Rock, paper, scissors, lizard, spock"
	public Player checkWinner(Player player1, Player player2) {

		String val1 = player1.getValue();
		String val2 = player2.getValue();

		if (val1.equalsIgnoreCase("Rock")) {
			winner = val2.equalsIgnoreCase("Scissors") ? player1 : player2;
		} else if (val1.equalsIgnoreCase("Paper")) {
			winner = val2.equalsIgnoreCase("Rock") ? player1 : player2;
		} else {
			winner = val2.equalsIgnoreCase("Paper") ? player1 : player2;
		}
		return winner;

	}

}