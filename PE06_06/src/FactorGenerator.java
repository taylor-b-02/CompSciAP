
public class FactorGenerator {
	
	double num = 0;
	int f = 2;
	
	public FactorGenerator(double Number) {
	
		num = Number;
	
	}
	
	public boolean hasMoreFactors() {
		if (num > 2) return true;
		return false;
	}
	
	public int nextFactor() {
		
		while (num > 2) {
			
			if (num % f == 0) {
				num /= f;
				return f;
			}
			f ++;
			
		}
		return 1;
	}

}
