
public class HourlyWorker extends Worker{

	public HourlyWorker(String aname, double asalary, int ahours) {
		super(aname, asalary);
		hours = ahours;
	}
	
	public double computePay() {
		if (hours < 41) 
			return hours * salary;
		else
			return (40 * salary) + ( (hours - 40) * (1.5 * salary) );
	}
	
	int hours;
}
