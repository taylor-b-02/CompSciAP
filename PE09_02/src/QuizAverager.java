
public class QuizAverager {

	public static void main(String[] args) {
		final int COUNT = 10;
		DataSet ds = new DataSet();
		
		for (int i = 1; i <= COUNT; i++)
	      {  
	         //Quiz d = new Quiz(Math.random() * 100);
	         double n = d.getMeasure();
	         ds.add(d);
	         System.out.print(n + " ");
	      }
		
		Quiz highest = (Quiz) ds.getMaximum();
		System.out.println();
	    System.out.println("\nAverage Grade: " + ds.getAverage());
	    System.out.println("Highest Grade: " + highest.getMeasure() + " " + highest.getLetter());

	}

}
