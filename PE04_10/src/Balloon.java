public class Balloon {
	
	private double air;
	private double rad;
	
	public Balloon(double initAir) {
		air = initAir;
		rad();
	}
	
	public void addAir(double amount) {
		air += amount;
		rad();
	}
	
	public double getVolume() {
		return air; 
	}
	
	public double getSurfaceArea() {
		return 4 * Math.PI * rad * rad;
	}
	
	public double getRadius() {
		return rad;
	}
	
	private void rad() {
		rad = Math.cbrt(air * (3.0/4) / Math.PI);
	}
}