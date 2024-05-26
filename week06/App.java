//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Object Oriented Programming
// Java Week 06 Final Java Project - War Card Game
// Student: Samuel Ajao
//
/*
 * a.  Instantiate a Deck and two Players, call the shuffle method on the deck.
 * b.  Using a traditional for loop, iterate 52 times calling the Draw method on 
 * 			the other player each iteration using the Deck you instantiated.
 * c.  Using a traditional for loop, iterate 26 times and call the flip method for each player.
•	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore 
		method on the player whose card has the higher value.  Print a message to say which player received a point.
•	Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
d.    After the loop, compare the final score from each player.
e.    Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending 
		on which score is higher or if they are both the same.

 */
package week06;

public class App {

	public static void main(String[] args) {
		
		Deck warDeck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();

	}

}
