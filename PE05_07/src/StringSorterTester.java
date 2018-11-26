import java.util.Scanner;

public class StringSorterTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		StringSorter sort = new StringSorter();
		
		System.out.println("Enter Three Strings:");
		System.out.println( sort.sort( in.nextLine(), in.nextLine(), in.nextLine() ) );
	}

}
