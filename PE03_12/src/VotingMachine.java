
public class VotingMachine {
	
	public void voteD() {
		D += 1;
	}
	
	public void voteR() {
		R += 1;
	}
	
	public String count() {
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
	
	int D = 0;
	int R = 0;

}
