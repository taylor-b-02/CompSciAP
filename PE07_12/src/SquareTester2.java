import java.util.Scanner;

public class SquareTester2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Square2 sq = new Square2();
		
		boolean done = false;
		
		while (!done) {
			System.out.println("Type Next Input. Type a negative zero to check if it's magic");
			int newNum = in.nextInt();
			
			if (newNum < 1) {
				if (sq.isMagic())
					System.out.println("Magic");
				else
					System.out.println("Not Magic");
			}
			else
				sq.add(newNum);
		}
		
	}
}