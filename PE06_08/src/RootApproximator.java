public class RootApproximator {
	private double pre;
	private static double A;
	private static double dif;
	private boolean simGuess = false;
	
	public RootApproximator(double a, double EPSILON) {
		
		A = a;
	    
		pre = (A + 1)/2.0;
	    
		dif = EPSILON;
	}
	
	public double nextGuess() {
		
		double guess = ((A/pre)+pre)/2;
		
		if (Math.abs(guess-pre) <= dif) simGuess = true; 
		
		pre = guess;
		
		return guess;
	}
	
	public boolean hasMoreGuesses() {
		
		if (simGuess) return false;
		
		return true;
	}
}