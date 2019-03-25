
public class Sentence {
	
	public Sentence(String asentence) {
		sentence = asentence;
	}
	
	public String getText() {
		return sentence;
	}
	public void reverse() {
		if (getText().length() == 1) {
		reverse += sentence;
		}
		
		
	}
	String sentence;
	String reverse;

}
