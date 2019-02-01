
public class Person implements Measurable {
	
	double height = 0;
	String name = "";
	
	public Person(String aname, double aheight) {
		height = aheight;
		name = aname;
	}
	
	public double getMeasure() {
		return height;
	}
	
	public String getName() {
		return name;
	}

}
