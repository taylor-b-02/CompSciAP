
public class Person {
	
	String name;
	int birthyear;
	
	public Person(String aname, int abirthyear) {
		name = aname;
		birthyear = abirthyear;
	}
	
	public String toString() {
		return "Person[Name: " + name + "Birth Year: " + birthyear + "]";
	}

}
