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
		other.purse.addAll(this.purse);
		this.purse.clear();
	}
	
	public boolean sameContents(Purse other) {
		for (int i = 0; i < this.purse.size(); i++) {
			if (this.purse.get(i) != other.purse.get(i)) {
				return false;
			}
			//else return true;
		}
		return true;
	}
}
