
public class Sentence {
	
	public Sentence(String asentence) {
		sentence = asentence;
	}
	
	public String getText() {
		return sentence;
	}
	public void reverse() {
		reverse += sentence.substring(sentence.length() - 1);
		sentence = sentence.substring(0, sentence.length() - 1);
		
		if (sentence.length() > 0) reverse();
		else {
			sentence = reverse;
			reverse = "";
		}
		
	}
	String sentence;
	String reverse = "";

}
