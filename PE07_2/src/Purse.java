import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Purse {
	
	ArrayList purse = new ArrayList<String>();
	
	public void addCoin(String coinName) {
		purse.add(coinName);
	}
	
	public String toString() {
		return "Purse" + Arrays.toString(purse.toArray());
	}
	
	public void reverse() {
		Collections.reverse(this.purse);
	}

	public void transfer(Purse other) {
		
	}
}
