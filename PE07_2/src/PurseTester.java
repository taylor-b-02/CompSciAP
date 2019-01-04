
public class PurseTester {

	public static void main(String[] args) {
		
		Purse p = new Purse();
		p.addCoin("Quarter");
		p.addCoin("Quarter");
		p.addCoin("Quarter");
		p.addCoin("Quarter");
		p.addCoin("Penny");
		
		Purse p2 = new Purse();
		p2.addCoin("Dime");
		
		System.out.println(p.toString());
		System.out.println(p2.toString() + '\n');
		
		p.reverse();
		System.out.println(p.toString() + '\n');
		
		p.transfer(p2);
		System.out.println(p.toString() + '\n' + p2.toString());
		
		System.out.println("\n" + p.sameContents(p2));

	}

}
