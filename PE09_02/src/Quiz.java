
public class Quiz implements Measurable {
	
	private String letter = "";
	private double score = 0;
	
	public Quiz(double ascore, String aletter) {
		score = ascore;
		letter = aletter;
	}
	
	public double getMeasure() {
		return score;
	}
	
	public String getLetter() {
		return letter;
	}

}
