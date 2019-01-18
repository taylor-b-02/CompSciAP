import java.util.Scanner;

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
		System.out.println("Volume of Cylinder: " + Geometry.cylinderVolume(r, h));
		System.out.println("Surface Area of Cylinder: " + Geometry.cylinderSurface(r,h));
		System.out.println("Volume of Cone: " + Geometry.coneVolume(r, h));
		System.out.println("Surface Area of Cone: " + Geometry.coneSurface(r, h));
	}

}
