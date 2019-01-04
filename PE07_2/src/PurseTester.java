
public class PurseTester {

	public static void main(String[] args) {
		
		Purse p = new Purse();
		p.addCoin("Quarter");
		p.addCoin("Dime");
		
		Purse p2 = new Purse();
		p2.addCoin("Quarter");
		p2.addCoin("Dime");
		
		System.out.println(p.sameContents(p2));
		
		System.out.println(p.toString());
		System.out.println(p2.toString() + '\n');
		
		p.reverse();
		System.out.println(p.toString() + '\n');
		
		p.transfer(p2);
		System.out.println(p.toString() + '\n' + p2.toString());

	}

}
