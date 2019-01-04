import java.util.Scanner;

public class SquareTester2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Square2 sq = new Square2();
		
		boolean done = false;
		
		while (!done) {
			System.out.println("Type your next ineger to be added. Type a negative "
					+ "number or zero to check if it is a magic square.");
			int newNum = in.nextInt();
			
			if (newNum < 1) {
				if (sq.isMagic())
					System.out.println("This is a Magic Square.");
				else
					System.out.println("This is not a Magic Square.");
			}
			else
				sq.add(newNum);
		}
		
	}
}