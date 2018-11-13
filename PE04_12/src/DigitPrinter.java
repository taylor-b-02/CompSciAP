public class DigitPrinter {
	
	public static void main(String[] args) {
		
		DigitExtractor myExtractor = new DigitExtractor(13578);
		
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		System.out.println(myExtractor.nextDigit());
		
	}
}