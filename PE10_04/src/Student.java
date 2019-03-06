
public class Student extends Person{
	
	public Student(String aname, int abirthyear, String amajor) {
		super(aname, abirthyear);
		major = amajor;
	}
	
	public String toString() {
		return "Student[Name: " + name + "Birth Year: " + "Major: " + major + "]";
	}
	
	protected String major;

}
