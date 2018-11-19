import java.util.Scanner;

public class SorterTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Sorter sort = new Sorter();
		
		System.out.println("Enter Three Floating Point Numbers:");
		System.out.println( sort.sort( in.nextDouble(), in.nextDouble(), in.nextDouble() ) );

	}

}
