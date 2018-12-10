import java.util.Scanner;

public class FactorPrinter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		FactorGenerator fg = new FactorGenerator(in.nextDouble());
		
		while (fg.hasMoreFactors()) {
			System.out.println(fg.nextFactor());
		}

	}

}
