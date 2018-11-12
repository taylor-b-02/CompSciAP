public class BalloonTester {
	public static void main(String []args) {
				
		Balloon bally = new Balloon(0);
		
		bally.addAir(100);
		
		System.out.println("Vol. Expected: 100 cm^3 Console: ");
		System.out.println(bally.getVolume());
		System.out.println("SA Expected: ~104 cm^2 Console: ");
		System.out.println(bally.getSurfaceArea());
		System.out.println("Radius Expected: ~2.8 cm Console: ");
		System.out.println(bally.getRadius());
		
		bally.addAir(100);
		
		System.out.println("Vol. Expected: 200 cm^3 Console: ");
		System.out.println(bally.getVolume());
		System.out.println("SA Expected: ~165 cm^2 Console: ");
		System.out.println(bally.getSurfaceArea());
		System.out.println("Radius Expected: ~3.6 cm Console: ");
		System.out.println(bally.getRadius());

	}
}