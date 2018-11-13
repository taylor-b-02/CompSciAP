
public class QuadraticEq {

	public QuadraticEq( double ia, double ib, double ic ) {
		
		//Assigns parameters to instance fields
		a = ia;
		b = ib;
		c = ic;
		
	}
	
	public boolean hasSolutions( ) {
		boolean tf;
		
		discriminant = (b * b) - (4 * a * c);
		
		//If the discriminant is negative then it as no solutions and tf is subsequently set to false
		if ( discriminant  < 0) tf = false;
		else tf = true;
		
		return tf;
	}
	
	public double getSolution1( ) {
		
		d
		
	}
	
	public double getSolution2( ) {
		
		d
		
	}
	
	//Initializes the instance data for the object
	double a;
	double b;
	double c;
	double discriminant;
}
