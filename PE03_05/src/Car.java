
public class Car {
	int eff;
	int fuel;
	
	//Constructors
	public Car() {
		eff = 0;
		fuel = 0;
	}
	
	public Car(int initeff) {
		eff = initeff;
		fuel = 0;
	}
	
	//Methods
	public void drive(int distance) {
		fuel -= (distance/eff);
	}
	
	public int getGasInTank() {
		return fuel;
	}
	
	public void addGas(int gal) {
		fuel += gal;
	}

}
