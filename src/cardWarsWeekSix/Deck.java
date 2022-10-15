package cardWarsWeekSix;

import java.util.ArrayList;
import java.util.Collections;


public class Deck {

	ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>();
		/*
		 * this for loop takes each of my 13 cards and assigns a suit. this happens for each suit,
		 * thus, 13 values * four suits = 52 cards. 
		 */
		
		for(int i = 2; i < 15; i++) {
			deck.add(new Card(i, "Spades"));
			deck.add(new Card(i, "Hearts"));
			deck.add(new Card(i, "Diamonds"));
			deck.add(new Card(i, "Clubs"));
		}
		
	}
	//draw card function removes the top card from the deck
	public Card drawCard() {
		return deck.remove(0);
	}
	/*
	 * using the collections.shuffle method it will randomize the order in which the
	 *  deck is organized.
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}
}
