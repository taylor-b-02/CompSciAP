
public class Sorter {
	
	public String sort(double ione, double itwo, double ithree) {
		String sorted = "";
		double one = ione;
		double two = itwo;
		double three = ithree;
		double sone;
		double stwo;
		double sthree;
		
		if (one <= two) {
			
			if (three <= one) {
				sone = three;
				stwo = one;
				sthree = two;	
			}
			
			else if (three <= two) {
				sone = one;
				stwo = three;
				sthree = two;
			}
			
			else {
				sone = one;
				stwo = two;
				sthree = three;
			}
		}
		
		else {
			
			if (three <= two) {
				sone = three;
				stwo = two;
				sthree = one;
			}
			
			else if (three <= one) {
				sone = two;
				stwo = three;
				sthree = one;
			}
			
			else {
				sone = two;
				stwo = one;
				sthree = three;
			}
			
		}
		
		sorted = sone + "\n" + stwo + "\n" + sthree;
		return sorted;
	}

}
