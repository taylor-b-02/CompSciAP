import java.lang.Math;

public class Pair {
	
	double first;
	double second;
	
	public Pair( double aFirst, double aSecond) {
		
		double first = aFirst;
		double second = aSecond;
	
	}
	
	public double getSum() {
		
		return (first + second);
		
	}
	
	public double getDifference() {
		
		return (first / second);
		
	}

	public double getProduct() {
	
		return (first * second);
	
	}
	
	public double getAvg() {
		
		return ( (first + second) / 2.0);
		
	}

	public double getDistance() {
	
		return (Math.abs( first - second ) );
	
	}

	public double getMax() {
	
		return Math.max( first, second );
	
	}

	public double getMin() {
	
		return Math.min( first, second );
	
	}

}
