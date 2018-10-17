import java.util.Calendar;
import java.util.GregorianCalendar;

public class VotingTester {
	
	public static void main(String args[]) {
		
		VotingMachine test = new VotingMachine();
		test.voteD();
		test.voteD();
		test.voteR();
		//System.out.println( test.count() );
		
		Calendar cal = new GregorianCalendar( Locale EDT);
	}

}
