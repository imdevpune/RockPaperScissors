package com.game.test;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.game.Player;
import com.game.WinnerCalculation;

public class RockPaperScissorGameTest {

	public RockPaperScissorGameTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	WinnerCalculation winnerCalculator = new WinnerCalculation();
	Player player1=new Player();
	Player player2=new Player();
	
	@Test
	public void testRockbeatsScissors() {
		player1.setValue("Rock");
		player2.setValue("Scissors");
		
		Player winner=winnerCalculator.checkWinner(player1, player2);
		assertEquals(winner,player1);
	}

	
	@Test
	public void testRockCannotBeatPaper() {
		player1.setValue("Rock");
		player2.setValue("Paper");
		
		Player winner=winnerCalculator.checkWinner(player1, player2);
		assertEquals(winner,player2);
	}

	
	@Test
	public void testScissorsbeatPaper() {
		player1.setValue("Scissors");
		player2.setValue("Paper");
		
		Player winner=winnerCalculator.checkWinner(player1, player2);
		assertEquals(winner,player1);
	}
	
	@Test
	public void testScissorsCannotBeatRock() {
		player1.setValue("Scissors");
		player2.setValue("Rock");
		
		Player winner=winnerCalculator.checkWinner(player1, player2);
		assertEquals(winner,player2);
	}
	
	
	@Test
	public void testPaperbeatsRock() {
		player1.setValue("Paper");
		player2.setValue("Rock");
		
		Player winner=winnerCalculator.checkWinner(player1, player2);
		assertEquals(winner,player1);
	}
	
	@Test
	public void testPaperCannotBeatScissors() {
		player1.setValue("Paper");
		player2.setValue("Scissors");
		
		Player winner=winnerCalculator.checkWinner(player1, player2);
		assertEquals(winner,player2);
	}
	
	@Test
	public void testDraw() {
		player1.setValue("Scissors");
		player2.setValue("Scissors");
		
		Player winner=winnerCalculator.checkWinner(player1, player2);
		assertEquals(player1.getValue(),player2.getValue());
	}
}
