 import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.lang.Math;
public class Geometry {
	
	public static double sphereVolume(double r) {
		return ( (4 * Math.PI * Math.pow(r, 3) ) / 3);
	}
	
	public static double sphereSurface(double r) {
		return 4 * Math.PI * (r * r);
	}
	
	public static double cylinderVolume(double r, double h) {
		return Math.PI * (r * r) * h;
	}
	
	public static double cylinderSurface(double r, double h) {
		return (2 * Math.PI * r * h) + (2 * Math.PI * (r * r));
	}
	
	public static double coneVolume(double r, double h) {
		return Math.PI * (r * r) * (h / 3);
	}
	
	public static double coneSurface(double r, double h) {
		return Math.PI * r * (r + Math.sqrt( (h * h) + (r * r) ));
	}
	
	public static double perimeter(Ellipse2D.Double e) {
		double a = e.getWidth();
		double b = e.getHeight();
		double h = Math.pow( (a - b), 2) / Math.pow( (a + b), 2);
		
		return ( Math.PI * (a + b) ) * ( (1 + ( (3 * h) / (10 + Math.sqrt(4 - ( 3 * h) ) ) ) ) );
	}
	
	public static double area(Ellipse2D.Double e) {
		double a = e.getHeight();
		double b = e.getWidth();
		
		return Math.PI * a * b;
		
	}
	
	public static double angle(Point2D.Double p, Point2D.Double q) {
		
    	return Math.atan(p.getX() - q.getX() / (p.getY() - q.getY() ) );
    
	}
    
    public static double slope(Point2D.Double p, Point2D.Double q) {
    	
    	return p.getX() - q.getX()/(p.getY() - q.getY());
    }
    
    public static boolean isInside(Point2D.Double p, Ellipse2D.Double e) {
    	
    	if (Math.pow( (p.getX() - e.getCenterX() ), 2) / (Math.pow( (e.getWidth() * .5),2) ) + (Math.pow( (p.getY() - e.getCenterY() ), 2) / (Math.pow( (e.getHeight() * .5),2) ) ) <= 1)
    		return true;
    	
    	return false;
    }
    
    public static boolean isOnboundary(Point2D.Double p, Ellipse2D.Double e) {
    	
    	if (Math.pow( (p.getX() - e.getCenterX() ), 2) / (Math.pow( (e.getWidth() * 0.5),2) ) + (Math.pow( (p.getY() - e.getCenterY() ), 2) / (Math.pow( (e.getHeight() * .5),2) ) ) == 1)
    		return true;
    	
    	return false;
}

}
