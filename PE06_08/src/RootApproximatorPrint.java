import java.util.Scanner;

public class RootApproximatorPrint {
	
	public static void main(String []args) {
		
		System.out.println("Type a number: ");
		Scanner in = new Scanner(System.in);
		int root = in.nextInt();
		RootApproximator approx = new RootApproximator(root, .000000001);
		
		while (approx.hasMoreGuesses()) {
			System.out.println(approx.nextGuess());
		}
	}
}