import java.util.Scanner;

public class CurrencyConverter {
	
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		boolean test = true;
		String input;
		while (test) {
			
			System.out.println("Enter USD Value:");
			
			input = in.nextLine();
			
			if ( input.equalsIgnoreCase("q") ) {
				System.out.println("Terminated");
				test = false;
			}
			else {
				if (in.hasNextDouble()) {
					System.out.println(in.nextDouble() * 0.88);
				}
				else System.out.println("Invalid Input");
			}
		}
		
	}

}
