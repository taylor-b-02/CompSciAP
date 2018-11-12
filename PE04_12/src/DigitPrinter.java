public class DigitPrinter {
	
	public static void main(String[] args) {
		
		DigitExtractor myExtractor = new DigitExtractor(16384);
		
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		
	}
}