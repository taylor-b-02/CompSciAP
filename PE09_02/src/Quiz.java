
public class Quiz implements Measurable {
	
	private String letter = "";
	private double score = 0;
	
	public Quiz(double ascore) {
		if (ascore > 89) letter = "A";
		else if (ascore > 80) letter = "B";
		else if (ascore > 70) letter = "C";
		else if (ascore > 60) letter = "D";
		else letter = "F";
		score = ascore;
	}
	
	public double getMeasure() {
		return score;
	}

}
