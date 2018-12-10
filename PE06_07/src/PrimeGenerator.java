
public class PrimeGenerator {
	
	double num;
	int current = 2;
	
	public PrimeGenerator(int Number) {
		num = Number;
	}
	
	private boolean isPrime(int primeCheck) {
		for (int i = 2; i < primeCheck; i++) {
			if (primeCheck%i == 0)
				return false;
		}
		return true;
}
	public int nextPrime() {
		for (int i = current; i < num; i++) {
			if (isPrime(i)) {
				current = i + 1;
				return i;
			}
		}
		return 0;
}

}
