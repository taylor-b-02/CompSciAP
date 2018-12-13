//Taylor Barnabic, Coding Prodigy/Extrordonaire
import java.util.Arrays;
import java.util.Random;

public class PermutationGenerator {
	
	public static void main(String[] args) {
		
		int[] valueArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] permutationArray = new int[10];
		int i = 0;
		Random rand = new Random();
		while (i < 10) {
			int r = rand.nextInt(10);
			
			if (valueArray[r] != 0) {
				permutationArray[i] = valueArray[r];
				valueArray[r] = 0;
				i ++;
			}
		}
		
		System.out.println(Arrays.toString(permutationArray));
	}

}
