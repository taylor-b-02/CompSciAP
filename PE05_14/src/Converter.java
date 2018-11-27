
public class Converter {
	
	double conValue;
	
	public String convert(String sunit, String eunit, double value) {
		
		conValue = value;
		
		if (sunit.equalsIgnoreCase("in")) conValue *= 0.0254;
		else if (sunit.equalsIgnoreCase("ft")) conValue *= 0.3048;
		else if (sunit.equalsIgnoreCase("mi")) conValue *= 1609.34;
		else if (sunit.equalsIgnoreCase("mm")) conValue *= 0.001;
		else if (sunit.equalsIgnoreCase("cm")) conValue *= 0.01;
		else if (sunit.equalsIgnoreCase("m")) conValue *= 1;
		else if (sunit.equalsIgnoreCase("km")) conValue *= 1000;
		else return "Error";
		
		if (eunit.equalsIgnoreCase("in")) conValue *= 39.3701;
		else if (eunit.equalsIgnoreCase("ft")) conValue *= 3.28084;
		else if (eunit.equalsIgnoreCase("mi")) conValue *= 0.000621371;
		else if (eunit.equalsIgnoreCase("mm")) conValue *= 1000;
		else if (eunit.equalsIgnoreCase("cm")) conValue *= 100;
		else if (eunit.equalsIgnoreCase("m")) conValue *= 1;
		else if (eunit.equalsIgnoreCase("km")) conValue *= 0.001;
		
		//System.out.println(conValue);
		return String.valueOf(value) + " " + sunit + " = " + conValue + " " + eunit; 
	}

}
