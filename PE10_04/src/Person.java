
public class Person {
	
	protected String name;
	protected int birthyear;
	
	public Person(String aname, int abirthyear) {
		name = aname;
		birthyear = abirthyear;
	}
	
	public String toString() {
		return "Person[Name: " + name + "Birth Year: " + birthyear + "]";
	}

}
