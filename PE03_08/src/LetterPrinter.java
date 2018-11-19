
public class LetterPrinter {
	
	public static void main(String args[]) {
		
		Letter test = new Letter("John", "Mary");
		
		test.addLine("Howdy bud");
		test.addLine("Howya doin?");
		
		test.getText();
	}

}
