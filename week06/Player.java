 /* Author : Samuel Ajao
 * Subject: Java Week 06 Coding Project - WAR Card Game
 * Program : Promineo Tech
 * Date   : May 26, 2024
 * Player Class
 */
/*
 * i.     Fields

                1.     hand (List of Card)

                 2.     score (set to 0 in the constructor)

                 3.     name

ii.    Methods

                1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)

                2.     flip (removes and returns the top card of the Hand)

                3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)

               4.     incrementScore (adds 1 to the Player’s score field)
 */
package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<String> hand = new ArrayList<String>();
	private int score;
	private String name;
	
	
	
	public Player() {
		setScore(0);
	}
	
	public Player(String playerName) {
		setScore(0);
	}
	
	public List<String> getHand() {
		return hand;
	}
	
	public void setHand(List<String> hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	
	
}