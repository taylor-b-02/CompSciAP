
public class Card {
	
	public Card()
	{
		value = "";
		family = "";
	}
	
	public String getDescription( String descript) 
	{
		
		value = descript.substring(0, 1);
		family = descript.substring(1);
		
		if (value.equalsIgnoreCase("2") ) value = "Two";
		else if (value.equalsIgnoreCase("3") ) value = "Three";
		else if (value.equalsIgnoreCase("4") ) value = "Four";
		else if (value.equalsIgnoreCase("5") ) value = "Five";
		else if (value.equalsIgnoreCase("6") ) value = "Six";
		else if (value.equalsIgnoreCase("7") ) value = "Seven";
		else if (value.equalsIgnoreCase("8") ) value = "Eight";
		else if (value.equalsIgnoreCase("9") ) value = "Nine";
		else if (value.equalsIgnoreCase("10") ) value = "Ten";
		else if (value.equalsIgnoreCase("A") ) value = "Ace";
		else if (value.equalsIgnoreCase("J") ) value = "Jack";
		else if (value.equalsIgnoreCase("Q") ) value = "Queen";
		else if (value.equalsIgnoreCase("K") ) value = "King";
		else value = "Invalid Value";
		
		if (family.equalsIgnoreCase("D")) family = "Diamonds";
		else if (family.equalsIgnoreCase("H")) family = "Hearts";
		else if (family.equalsIgnoreCase("S")) family = "Spades";
		else if (family.equalsIgnoreCase("C")) family = "Clubs";
		else family = "Invalid Family";
		
		
		return value + " of " + family;
	}

	String value;
	String family;
	String numbers;
}
