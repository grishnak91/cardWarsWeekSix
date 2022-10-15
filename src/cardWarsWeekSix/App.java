package cardWarsWeekSix;



public class App {

	public static void main(String[] args) {
		
		//Instantiate Deck deck.
		Deck deck = new Deck();
		
		System.out.println();
		
//shuffle the deck
		deck.shuffle();
		
		
//System.out.println(deck.getDeck());
		
//Instantiate two players
		Player playerOne = new Player("Gilly", 0);
		playerOne.draw(deck);
				
		Player playerTwo = new Player("Farley", 0);
		playerTwo.draw(deck);

//Just some formatting to help the print out be more legible.
		System.out.println("**************");
		playerOne.describe();
		System.out.println("--------------");
		playerTwo.describe();
		System.out.println("**************");
		System.out.println();
		
// This	for loop iterates 26 times for 26 rounds of play.	
		for (int i = 2; i < 26; i++) {
            Card playerOneCard = playerOne.flip();
            Card playerTwoCard = playerTwo.flip();

// This loop describes what will happen if playerOneCard has a higher value than playerTwoCard.
            if (playerOneCard.getValue() > playerTwoCard.getValue()) {
            	System.out.println();
            	System.out.println();
            	System.out.println("---NEW ROUND---");
            	playerOneCard.describeCard();
            	playerTwoCard.describeCard();
            	System.out.println("--------------");
            	playerOne.incrementScore();
            	playerOne.describe();
            	playerTwo.describe();

// This loop describes what will happen if playerTwoCard has a higher value than playerOneCard.
            } else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
            	System.out.println();
            	System.out.println();
            	System.out.println("---NEW ROUND---");
            	playerOneCard.describeCard();
            	playerTwoCard.describeCard();
            	System.out.println("--------------");
                playerTwo.incrementScore();
                playerOne.describe();
            	playerTwo.describe();
            	
// This loop describes what will happen if playerOneCard has an equal value to playerTwoCard.
            }else if(playerOneCard.getValue() == playerTwoCard.getValue()) {
            	System.out.println();
            	System.out.println();
            	System.out.println("---NEW ROUND---");
            	playerOneCard.describeCard();
            	playerTwoCard.describeCard();
            	System.out.println("--------------");
            	System.out.println("No points awarded.");
            }
        }
//More formatting and the print out of the total results for all 26 rounds.
		System.out.println();
		System.out.println();
		System.out.println("---FINAL SCORE---");
		System.out.println("**************");
		
		System.out.println("Gilly's score is: " + playerOne.getScore());
        System.out.println("Farley's score is: " + playerTwo.getScore());
        
/*
 *  This loop determines what will be printed to the console depending on which player has the
 *  most points or if it's a tie.
 */
        if (playerOne.getScore() > playerTwo.getScore()) {
            System.out.println("Gilly is the winner!");
        } else if (playerOne.getScore() < playerTwo.getScore()) {
            System.out.println("Farley is the winner!");
        } else {
            System.out.println("It is a tie!");
        }
        System.out.println("**************");
	
	}

}		


