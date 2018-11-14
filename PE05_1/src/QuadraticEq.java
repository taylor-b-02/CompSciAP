import java.lang.Math;
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
		
		if ( this.hasSolutions() )
		{
			double sol1 = ( -b + Math.sqrt( discriminant ) ) / (2 * a);
			return sol1;
		}
		else return 0;
		
	}
	
	public double getSolution2( ) {
		
		if ( this.hasSolutions() )
		{
			double sol2 = ( -b - Math.sqrt( discriminant ) ) / (2 * a);
			return sol2;
		}
		else return 0;
		
	}
	
	//Initializes the instance data for the object
	double a;
	double b;
	double c;
	double discriminant;
}
