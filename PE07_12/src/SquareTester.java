import java.util.Scanner;
public class SquareTester{
	public static void main(String []args) {
		
		
		Scanner sq = new Scanner(System.in);
		System.out.println("Input Square Size:");
		int num = sq.nextInt();
		//System.out.println(num);
		Square tester = new Square(num);
		for(int i =0; i < (num * num); i++) {
			System.out.println("Input Value:");
			tester.add(sq.nextInt());
		}
		
		System.out.println(tester.isMagic());
	}
}