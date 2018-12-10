import java.util.Scanner;

public class MeanStand {
	
	public static void main(String[] args) {
		int count = 0;
		double sum = 0;
		double avg = sum / count;
		double sumsq = sum * sum;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Number of Inputs:");
		int iterations = in.nextInt();
		
		System.out.println("Data:");
		for (int i = 1; i <= iterations; i++) {
			
			count++;
			sum += in.nextDouble();
			avg = sum / count;
			sumsq = sum * sum;
			
			
		}
		double s = Math.sqrt( ( sumsq -  (1 / count) * sumsq ) / (count - 1)  );
		System.out.println("Average: " + avg);
		System.out.println("Standard Deviation: " + s);
		
		
	}

}
