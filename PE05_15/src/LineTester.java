
public class LineTester {

	public static void main(String[] args) {
		
		Line test = new Line(1, 2, 3, 4);
		Line test2 = new Line(2);
		
		System.out.println(test.isParallel(test2));
		System.out.println(test.intersects(test2));
		System.out.println(test.equals(test2));

	}

}
