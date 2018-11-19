public class Triangle {
	
	double aX;
	double aY;
	double bX;
	double bY;
	double cX;
	double cY;
	
	public Triangle(double xPointA, double yPointA, double xPointB, double yPointB,
			double xPointC, double yPointC) {
		aX = xPointA;
		aY = yPointA;
		bX = xPointB;
		bY = yPointA;
		cX = xPointC;
		cY = yPointA;
	}
	
	double lengthC = 0;
	double lengthB = 0;
	double lengthA = 0;
	
	public double getLengthC() {
		lengthC = Math.sqrt((aX - bX) * (aX - bX) + (aY - bY) * (aY - bY));
		return lengthC;
	}
	
	public double getLengthA() {
		lengthA = Math.sqrt((bX - cX) * (bX - cX) + (cY - bY) * (cY - bY));
		return lengthA;
	}

	public double getLengthB() {
		lengthB = Math.sqrt((aX - cX) * (aX - cX) + (aY - cY) * (aY - cY));
		return lengthB;
	}
	
	public double getPerimeter() {
		return lengthA + lengthB + lengthC;
	}
	
	public double getAngleA() {
		return Math.acos((lengthA * lengthA - lengthB * lengthB - lengthC * lengthC) / (-1.0 *
				lengthB * lengthC));
	}
	
	public double getAngleB() {
		return Math.acos((lengthB * lengthB - lengthA * lengthA - lengthC * lengthC) / (-1.0 *
				lengthA * lengthC));
	}
	
	public double getAngleC() {
		return Math.acos((lengthC * lengthC - lengthB * lengthB - lengthA * lengthA) / (-1.0 *
				lengthB * lengthA));
	}
	
	
}