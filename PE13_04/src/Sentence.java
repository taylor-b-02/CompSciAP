
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
	
	public boolean find(String t) {
		String test = t;
		int testLength = test.length();
		String testSentence = sentence.substring(0, testLength);
		//System.out.println(testSentence);
		if (testSentence.equals(test)) return true;
		Sentence nextSentence = new Sentence(sentence.substring(1));
		return nextSentence.find(test);
	}
	
	String sentence;
	String reverse = "";

}
