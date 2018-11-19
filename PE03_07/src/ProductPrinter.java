
public class ProductPrinter {
	public static void main(String args[]) {
		//Creates objects of type Product
		Product p1 = new Product("INSERT_PRODUCT_EXAMPLE_HERE", 11.95);
		Product p2 = new Product("INSERT_DIF_PRODUCT_EXAMPLE_HERE", 25.95);
		
		System.out.println( p1.getName() + " $" + p1.getPrice());
		System.out.println( p2.getName() + " $" + p2.getPrice());
		
		p1.reducePrice( 5.00 );
		p2.reducePrice( 5.00 );
		
		System.out.println( p1.getName() + " $" + p1.getPrice());
		System.out.println( p2.getName() + " $" + p2.getPrice());
		
	}

}
