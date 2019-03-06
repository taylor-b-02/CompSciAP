
public class Instructor extends Person{
	
	public Instructor(String aname, int abirthyear, int asalary) {
		super(aname, abirthyear);
		salary = asalary;
	}
	
	public String toString() {
		return "Instructor[Name: " + name + "Birth Year: " + birthyear + "Salary: " + salary +"]";
	}
int salary;
}
