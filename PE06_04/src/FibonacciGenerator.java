
public class FibonacciGenerator {
	
	int fold1 = 0;
	int fold2 = 1;
	int fnew = fold1 + fold2;
	
	public int nextNumber() {	
		fold2 = fold1;
		fold1 = fnew;
		fnew = fold1 + fold2;
		return fnew;
	}

}
