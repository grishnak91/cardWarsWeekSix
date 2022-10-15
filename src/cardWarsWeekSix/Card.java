package cardWarsWeekSix;

public class Card {
	
	/*
	 * Create a class called Card
	 * include the fields value(2-14 representing 2-Ace) and name (Ace of diamonds,
	 * two of hearts etc)
	 * include Methods: getters and setters, describe (prints info about the card).
	 */

	 private String name;
	 private int value;


	    public Card(int rank, String suit){
	    	
	    	value = rank;
/*
 * i used a switch break case to relate 2-14 to 2-ace.
 */
	        switch(rank) {
	            case 2: name = "2";
	                break;
	            case 3: name = "3";
	                break;
	            case 4: name = "4";
	                break;
	            case 5: name = "5";
	                break;
	            case 6: name = "6";
	                break;
	            case 7: name = "7";
	                break;
	            case 8: name = "8";
	                break;
	            case 9: name = "9";
	                break;
	            case 10: name = "10";
	                break;
	            case 11: name = "Jack";
	                break;
	            case 12: name = "Queen";
	                break;
	            case 13: name = "King";
	                break;
	            case 14: name = "Ace";
	                break;
	        }
/*
 * This is what will be called when I describe my Cards.
 */
	        name += " of " + suit;
	    }
	        
	    public int getValue() {
	        return value;
	    }

	    public void setValue(int value) {
	        this.value = value;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    //my describe card method
	    public void describeCard() {
	    	
	    	System.out.println(this.getName());
	    }
}
