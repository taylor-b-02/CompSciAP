import java.util.Scanner;

public class GradeTester {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Grade grade = new Grade();
		
		System.out.println("Enter a letter grade:");
		
		System.out.println( grade.EgetNumericGrade( in.nextLine() ) );
	}
	
}
