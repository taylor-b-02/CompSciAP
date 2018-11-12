public class TimeIntervalTester {
	
	public static void main(String[] args) {
		
		TimeInterval hora = new TimeInterval(2100,990);
		System.out.println("Expected error because minutes can't be above 90");
		
		TimeInterval hora2 = new TimeInterval(242300,990);
		System.out.println("Expected error because time cannot be more than 2400");
		
		TimeInterval hora3 = new TimeInterval(2230,1920);
	 	System.out.println("Time Difference: " + hora3.difference());
		System.out.println("Expected: 2050");		
   }
}
