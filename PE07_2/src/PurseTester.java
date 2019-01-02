
public class PurseTester {

	public static void main(String[] args) {
		
		Purse p = new Purse();
		p.addCoin("Quarter");
		p.addCoin("Quarter");
		p.addCoin("Quarter");
		p.addCoin("Quarter");
		p.addCoin("Penny");
		
		System.out.println(p.toString());
		
		p.reverse();
		System.out.println(p.toString());

	}

}
