import java.util.Scanner;

public class AltSumRun {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double sum = 0;
		System.out.println("Enter # of Integers:");
		int size = in.nextInt();
		double[] inputs = new double[size];
		
		System.out.println("Enter values:");
	
		for (int i = 0; i < size; i++) 
			inputs[i] = in.nextDouble();
		
		for (int i = 0; i < inputs.length; i +=2) 
			sum += inputs[i];

		for (int i = 1; i < inputs.length; i +=2) 
			sum -= inputs[i];
		
		System.out.println("Value: " + sum);
	}
}
