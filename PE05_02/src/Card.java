
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
		
		return value + " of " + family;
	}

	String value;
	String family;
	String numbers;
}
