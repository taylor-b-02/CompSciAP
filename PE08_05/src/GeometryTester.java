import java.util.Scanner;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;

public class GeometryTester {

	public static void main(String[] args) {

		double r;
		double h;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a radius:");
		r = in.nextDouble();
		
		System.out.println("Enter a height:");
		h = in.nextDouble();
		
		System.out.println("Volume of Sphere: " + Geometry.sphereVolume(r));
		System.out.println("Surface Area of Sphere: " + Geometry.sphereSurface(r));
		System.out.println("\n" + "Volume of Cylinder: " + Geometry.cylinderVolume(r, h));
		System.out.println("Surface Area of Cylinder: " + Geometry.cylinderSurface(r,h));
		System.out.println("\n" + "Volume of Cone: " + Geometry.coneVolume(r, h));
		System.out.println("Surface Area of Cone: " + Geometry.coneSurface(r, h));
		
		Ellipse2D elli = new Ellipse2D.Double(0,0,5,10);
		System.out.println("\n" + "Perimeter of Ellipse: " + Geometry.perimeter((Double) elli));
		System.out.println("Area of Ellipse: " + Geometry.area((Double) elli));
	}

}
