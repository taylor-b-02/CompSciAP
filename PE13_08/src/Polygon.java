public class Polygon {
	
	public Polygon(int[] xcoords, int[] ycoords, int firstx, int firsty) {
		fx = firstx;
		fy = firsty;
		System.arraycopy(xcoords, 1, x, 0, (xcoords.length - 1) );
		System.arraycopy(ycoords, 1, y, 0, (ycoords.length - 1) );
		
	}
	public double getArea() {
		if (x.length == 0) {
			return 0;
		}
		x2 = x[0];
		x3 = x[1];
		y2 = y[0];
		y3 = y[1];
		int area = Math.abs((fx * y2) + (x2*y3) + (x3 * fy) - (fy * x2) - (y2 * x3) - (y3 * fx)) / 2;
		int[] smallx;
		System.arraycopy(x, 1, smallx, 0, (x.length - 1) );
		int[] smally;
		System.arraycopy(y, 1, smally, 0, (y.length - 1) );
		Polygon smollygon = new Polygon(smallx, smally, fx, fy);
		return area + smollygon.getArea();
	}
	
	public int fx, fy, x2, x3, y2, y3;
	public int[] x, y;

}
