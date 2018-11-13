public class Month {
	
	//initialized variable number of int type
	private int number;
	//initializes variable months of String type
	private String months;
	//Constructor for Month
	public Month( int monthNumber ){
		
		number = monthNumber;
		
		//String for which the names of months are retrieved via the substring method
		months = "January   February  March     April     May       June      July      August    September October   November  December  ";
	}
	
	//gets the name of a month based off of the integer passed through
	public String getName(  ){
		
		//returns the name of a month based off its numerical value using the substring method
		return months.substring( 10 * ( number - 1 ), 10 * ( number - 1 ) + 10 ).trim(  );
	
	}
		
		
}
