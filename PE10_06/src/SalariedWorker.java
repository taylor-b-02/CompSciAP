
public class SalariedWorker extends Worker{
	
	public SalariedWorker(String aname, double asalary, int ahours) {
		super(aname, asalary);
		hours = ahours;	
	}
	
	public double computePay() {
		return salary;
	}
	
	int hours;
}
