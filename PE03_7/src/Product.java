
public class Product {
	String name;
	double price;
	
	//Constructors
	public Product() {
		name = "";
		price = 0.00;
	}
	
	public Product(String iName, double iPrice) {
		name = iName;
		price = iPrice;
	}
	
	//Methods
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void reducePrice(double amount) {
		price -= amount;
	}

}
