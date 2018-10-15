
public class CarTester {
	
	public static void main(String args[]) {
		
		Car whip = new Car(50); //Car fuel efficiency is 50 mpg
		whip.addGas(20); //Car has 20 gallons of gas
		whip.drive(100); //Car drives 100 miles
		System.out.println( whip.getGasInTank() ); //Car has 18 gallons of gas left
		
	}

}
