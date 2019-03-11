
public class Employee {
	
	public Employee(String aname, int asalary) {
		name = aname;
		salary = asalary;
	}
	
	public String toString() {
		return "Employee[Name: " + name + " Salary: " + salary + "]";
	}
	
	String name;
	int salary;

}
