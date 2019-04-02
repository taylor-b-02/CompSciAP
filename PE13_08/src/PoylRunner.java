
public class PoylRunner {

	public static void main(String[] args){
		int[] x = new int[] {1,2,3,4,5};
		int[] y = new int[] {6,7,8,9,10};
		
		
		Polygon poly = new Polygon(x, y, x[0], y[0]);
		System.out.println(poly.getArea());
	}
}
