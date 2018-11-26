import java.util.Scanner;

public class ConverterTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Converter test = new Converter();
		
		System.out.println("Convert from:");
		String from = in.nextLine();
		System.out.println("Convert To:");
		String to = in.nextLine();
		
		System.out.println("Value:");
		double value = in.nextDouble();
		System.out.println(test.convert());

	}

}
