
public class Manager extends Employee{
	
	public Manager(String aname, int asalary, String adepartment) {
		super(aname, asalary);
		department = adepartment;
	}
	
	public String toString() {
		return "Manger[Name: " + name + " Salary: " + salary + " Department: " + department + "]";
	}
	
	protected String department;

}
