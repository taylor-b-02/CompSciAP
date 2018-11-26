
public class Grade {
	
	public String getNumericGrade(String ilgrade) {
		
		String lgrade = ilgrade;
		double numGrade = 0;
		
		if (lgrade.compareToIgnoreCase("A+") == 0) numGrade = 4;
		else if (lgrade.compareToIgnoreCase("A") == 0) numGrade = 4;
		else if (lgrade.compareToIgnoreCase("A-") == 0) numGrade = 3.7;
		else if (lgrade.compareToIgnoreCase("B+") == 0) numGrade = 3.3;
		else if (lgrade.compareToIgnoreCase("B") == 0) numGrade = 3;
		else if (lgrade.compareToIgnoreCase("B-") == 0) numGrade = 2.7;
		else if (lgrade.compareToIgnoreCase("C+") == 0) numGrade = 2.3;
		else if (lgrade.compareToIgnoreCase("C") == 0) numGrade = 2;
		else if (lgrade.compareToIgnoreCase("C-") == 0) numGrade = 1.7;
		else if (lgrade.compareToIgnoreCase("D+") == 0) numGrade = 1.3;
		else if (lgrade.compareToIgnoreCase("D") == 0) numGrade = 1;
		else if (lgrade.compareToIgnoreCase("D-") == 0) numGrade = .7;
		else numGrade = 0;
		
		

		return String.valueOf(numGrade);
	}
	
	public String EgetNumericGrade(String ilgrade) {
		
		String l = ilgrade.substring(0,1);
		String mod = ilgrade.substring(1);
		double numGrade = 0;
		
		if (mod.compareTo("+") == 0) numGrade += .3;
		else if (mod.compareTo("-") == 0) numGrade -= .3;
		else numGrade = numGrade;
		
		if (l.compareTo("A") == 0) {
			if ((numGrade += 4) > 4) numGrade = 4;
		}
		else if (l.compareTo("B") == 0) numGrade += 3;
		else if (l.compareTo("C") == 0) numGrade += 2;
		else if (l.compareTo("D") == 0) numGrade += 1;
		else numGrade = 0;
		
		return String.valueOf(numGrade);
		
		
	}

	//String lgrade = "";

}
