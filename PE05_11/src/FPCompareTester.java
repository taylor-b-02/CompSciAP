import java.util.Scanner;

public class FPCompareTester {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	FPCompare test = new FPCompare();
	
	System.out.println("Enter two floating-point numbers:");
	System.out.println(test.Compare(in.nextDouble(), in.nextDouble()));


	}

}
