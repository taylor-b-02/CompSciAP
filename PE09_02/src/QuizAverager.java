
public class QuizAverager {

	public static void main(String[] args) {
		final int COUNT = 10;
		DataSet ds = new DataSet();
		
		for (int i = 1; i <= COUNT; i++)
	      {  
	         Quiz d = new Quiz(Math.random() * 100);
	         double n = d.getMeasure();
	         ds.add(d);
	         System.out.print(n + " ");
	      }
		
		System.out.println();
	    System.out.println("Average: " + ds.getAverage());

	}

}
