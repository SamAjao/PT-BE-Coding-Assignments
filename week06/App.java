//
// Program: Promineo Tech Backend Java Development Course
// Author:  Samuel Ajao
// Subject:  Java Week 06 Final Java Project - War Card Game
// Create Date: May 26, 2024
//
/*
 * a.  Instantiate a Deck and two Players, call the shuffle method on the deck.
 * 
 * b.  Using a traditional for loop, iterate 52 times calling the Draw method on 
 * 			the other player each iteration using the Deck you instantiated.
 * 
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
		
		//a. Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck warDeck = new Deck("War Deck");
		Player player1 = new Player("Michelle");
		Player player2 = new Player("Tina");
		warDeck.shuffleDeck();
		System.out.println("Number of cards in Deck: " + warDeck.getDeckSize());
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR WAR");
		System.out.println("--------------------------------------------------------------------------------------");
		
		
		//b. Using a traditional for loop, iterate 52 times calling the Draw method on
		//		the other player each iteration using the Deck you instantiated.
		for(int i = 0; i < 26; i++) {
			player1.draw(warDeck);
			player2.draw(warDeck);
		}
		
		/*	c. Using a traditional for loop, iterate 26 times and call the flip method for each player.
		 * Compare the value of each card returned by the two player’s flip methods. Call the incrementScore
		 * method on the player whose card has the higher value.  Print a message to say which player received a point.
		 * Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
		 */
		for(int i = 0; i < 26; i++) {
			System.out.println("Draw number: " + (i+1));
			
			System.out.print(player1.getName() + " Draws ::: ");
			player1.topCardIs().describe();
			System.out.print(player2.getName() + " Draws ::: ");
			player2.topCardIs().describe();
			
			
			int result = player1.flip().getValue() - player2.flip().getValue();
			if(result > 0) {
				player1.incrementScore();
				System.out.println("Point to " + player1.getName() + "!");
			}
			else if(result < 0) {
				player2.incrementScore();
				System.out.println("Point to " + player2.getName() + "!");
			}
			else {
				System.out.println("Tie. No point awarded.");
			}
			
			System.out.println("--------------------------------------------------------------------------------------");
		}
		
		//d. After the loop, compare the final score from each player.
		int finalScore = player1.getScore() - player2.getScore();
		
		//e. Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending
		//		on which score is higher or if they are both the same.
		System.out.println("!!! FINAL SCORE !!!");
		System.out.println(player1.getName() + "'s Score: " + player1.getScore() + "\t" + "---" + player2.getName() + "'s Score: " + player2.getScore());
		if(finalScore > 0) {
			System.out.println(player1.getName() +" Wins!");
		}
		else if(finalScore < 0) {
			System.out.println(player2.getName() + " Wins!");
		}
		else {
			System.out.println("Game is a Draw!");
		}
		
		System.out.println("Number of cards remaining in Deck: " + warDeck.getDeckSize());


	}//End Main

}//End App Class
