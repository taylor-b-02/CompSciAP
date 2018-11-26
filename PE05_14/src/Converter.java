
public class Converter {
	
	double conValue;
	
	public String convert(String sunit, String eunit, double value) {
		
		if (sunit.compareToIgnoreCase("in"))
		
		
		return sunit + String.valueOf(value) + "=" + eunit + conValue;
	}

}
