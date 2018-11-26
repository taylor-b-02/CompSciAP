
public class StringSorter {
	
	public String sort(String ione, String itwo, String ithree) {
		String sorted = "";
		String one = ione;
		String two = itwo;
		String three = ithree;
		String sone;
		String stwo;
		String sthree;
		
		if (one.compareTo(two) <= 0) {
			
			if (three.compareTo(one) <= 0) {
				sone = three;
				stwo = one;
				sthree = two;	
			}
			
			else if (three.compareTo(two) <= 0) {
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
			
			if (three.compareTo(two) <= 0) {
				sone = three;
				stwo = two;
				sthree = one;
			}
			
			else if (three.compareTo(one) <= 0) {
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
		
		sorted = "Sorted:" + "\n" + sone + "\n" + stwo + "\n" + sthree;
		return sorted;
	}
}
