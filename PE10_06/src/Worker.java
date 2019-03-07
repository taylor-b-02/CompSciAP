
public class Worker {

	double salary;
	String name;
	
	public Worker(String aname, double asalary) {
		name = aname;
		salary = asalary;
	}
	
	public double computePay() {
		return salary;
	}
}
