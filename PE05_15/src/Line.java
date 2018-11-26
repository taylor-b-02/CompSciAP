
public class Line {
	double m;
	double b;
	boolean vertical;
	
	public Line(double x, double y, double slope) {
		m = slope;
		//b = (slope * x) + y;
		b = y - (slope * x);
		vertical = false;
	}
	
	public Line(double ix1, double iy1, double ix2, double iy2) {
		m = (iy2 - iy1)/(ix2 - ix1);
		//b = (m * ix1) + iy1;
		b = iy1 - (m * ix1);
		vertical = false;
	}
	
	public Line(double slope, double intercept) {
		m = slope;
		b = intercept;
		vertical = false;
	}
	
	public Line(double vertLine) {
		m = vertLine;
		vertical = true;
	}
	
	public boolean intersects(Line other) {
		if (this.equals(other)) return true;
		else if (!(this.equals(other) || this.isParallel(other))) return true;
		return false;
	}
	
	public boolean equals(Line other) {
		if (vertical && other.vertical) {
			if (m == other.m) return true;
		}
		else if ( (m == other.m) && (b == other.b) ) return true;
		return false;
	}
	
	public boolean isParallel(Line other) {
		if (vertical && other.vertical) {
			if (m == other.m) return false;
			else return true;
		}
		else if (m == other.m && !(b == other.b)) return true;
		return false;
	}

}
