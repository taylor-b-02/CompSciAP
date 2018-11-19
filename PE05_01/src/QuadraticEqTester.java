
public class QuadraticEqTester {

	public static void main(String[] args) {
		
		QuadraticEq qe = new QuadraticEq(2, -3, -4);
		
		String solution = String.valueOf( qe.hasSolutions() );
		solution = solution.substring(0,1).toUpperCase() + solution.substring(1);
		System.out.println( solution);
		
		System.out.println( qe.getSolution1() );
		System.out.println( qe.getSolution2() );
	
	}

}
