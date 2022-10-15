package cardWarsWeekSix;

import java.util.ArrayList;
import java.util.List;


public class Player {

	/*
	 * Create a class called Player. Include the fields: hand (26 random cards drawn from the deck,
	 * score (initial score is set to zero and increments up depending on if the player wins a
	 * round), and name (just a String moniker).	
	 */
		
	// This is my list of Card called hand.	
		private List<Card> hand = new ArrayList<Card>();

	//These are the two other attributes of Player.
		private int score;
		
		private String name;


		public Player(String name, int score) {
			this.setName(name);
			this.setScore(score);
		}
		
		public void setScore(int score) {
			this.score = score;
		}

		/*
		 * This method displays the Player and their attributes (name and score)
		 * 
		 */
		public void describe() {
			System.out.println("Player name is: " + this.name);
			System.out.println("Player score is: " + this.score);

		}
		
		public void setName(String name) {
			this.name = name;
		}

		public int getScore() {
			return score;
		}

		public String getName() {
			return name;
		}
	/*
	 * this method halves the deck and creates a hand for each player when called.
	 */
		public void draw(Deck deck) {
			while(hand.size() < 26) {
			hand.add(deck.drawCard());
			}
			
		}
	/*
	 * This method removed the top card of the player's hand.
	 */
		public Card flip() {
			return hand.remove(0);
		}
	/*
	 * This method keeps track of the score after each round.	
	 */
		public void incrementScore() {
			score++;
		}
}
