
public class Person implements Measurable {
	
	double height = 0;
	String name = "";
	
	public Person(double aheight, String aname) {
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
