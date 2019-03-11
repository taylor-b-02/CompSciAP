
public class Executive extends Manager{
	
	public Executive(String aname, int asalary, String adepartment) {
		super(aname, asalary, adepartment);
	}
	
	public String toString() {
		return "Executive[Name: " + name + " Salary: " + salary + " Department: " + department + "]";
	}

}
