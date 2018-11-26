import java.math.BigDecimal;
public class FPCompare {
	
	public String Compare(double inum1, double inum2) {
		double rnum1 = round((float)inum1, 2);
		double rnum2 = round((float)inum2, 2);
		double diff = Math.pow((rnum1 - rnum2), 2);
		String output = "";
		
		if (rnum1 == rnum2) output = "They are the same when rounded to two decimal places.";
		else output = "They are different when rounded to two decimal places";
		
		if (diff <= 0.01) output += "\n" + "They differ by less than 0.01";
		else output += "\n" + "They differ by more than 0.01";
		
		return output;
	}
	
	public static float round(float d, int decimalPlace) {
	    BigDecimal bd = new BigDecimal(Float.toString(d));
	    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
	    return bd.floatValue();
	}
	

}
