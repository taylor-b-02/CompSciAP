
public class VotingMachine {
	
	public void voteD() {
		D += 1;
	}
	
	public void voteR() {
		R += 1;
	}
	
	public String decide() {
		if (D > R) {
			return "Democrats Win";
		}
		else if (R > D) {
			return "Republicans Win";
		}
		else {
			return "Recount needed";
		}
			
	}
	
	public void clear() {
		D = 0;
		R = 0;
	}
	
	public String count() {
		return "Democrats: " + D + " Republicans: " + R;
	}
	
	int D = 0;
	int R = 0;

}
