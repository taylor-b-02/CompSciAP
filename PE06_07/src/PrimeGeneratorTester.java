import java.util.Scanner;

public class PrimeGeneratorTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an Integer:");
		int input = in.nextInt();
		PrimeGenerator pg = new PrimeGenerator(input);
		
		for (int i = 0; i < input; i++) System.out.println(pg.nextPrime());
		

	}

}
