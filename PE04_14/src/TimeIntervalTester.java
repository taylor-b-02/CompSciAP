public class TimeIntervalTester {
	
	public static void main(String[] args) {
		
		//Creates object of type TimeInterval with a start time of 745 and an end time of 1515
		TimeInterval hour = new TimeInterval(745,1515);
		int hr = hour.difference() / 100;
		int min = hour.difference() % 100;
		//Prints the result of the TimeInterval object
		System.out.print( "" + hr + " Hours " + "" + min  + " Minutes");
				
   }
}
