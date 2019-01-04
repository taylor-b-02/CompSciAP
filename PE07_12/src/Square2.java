import java.util.ArrayList;
import java.util.Collections;

public class Square2 {
	
	private int n;
	ArrayList square = new ArrayList<Integer>();
	
	public Square2() {
		square.add(1);
	}
	
	public void add(int i) {
		square.add(i);
		n++;
	}
	
	public boolean isMagic() {
		if (Math.sqrt(square.size()) == (int)
			Math.sqrt(square.size()) * (int) Math.sqrt(square.size())) {
			for (int i = 1; i <= square.size(); i++) {
				if (! square.contains(i))
					return false;
			}
			return true;
		}
		return true;
	}
}