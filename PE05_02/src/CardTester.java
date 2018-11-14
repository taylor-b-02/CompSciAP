import java.util.Scanner;

public class CardTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Card card = new Card();
		
		System.out.println("Enter the card notation:");
		System.out.println( card.getDescription( in.nextLine() ) );
		

	}

}
