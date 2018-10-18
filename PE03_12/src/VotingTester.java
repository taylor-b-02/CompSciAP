import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class VotingTester {
	
	public static void main(String args[]) {
		
		VotingMachine test = new VotingMachine();
		test.voteD();
		test.voteD();
		test.voteR();
		//System.out.println( test.count() );
		
		Calendar testCal = new GregorianCalendar( 2018, 11, 6);
		Calendar cal = new GregorianCalendar( TimeZone.getTimeZone("America/New_York") );
		
		//cal = testCal;
		//System.out.println(testCal);
		//System.out.println(cal);
		
		if (testCal == cal) {
			System.out.println( test.decide() );
		}
		
		else {
			System.out.println( test.count() );
		}
	
	}

}
