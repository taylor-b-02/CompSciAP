public class TimeInterval {
	
	public int t1;
	public int t2;
	
	public TimeInterval(int time1, int time2) {		
		if (time1 > time2) {
			t2 = time2 + 2400;
		}
		else {
			t2 = time2;
		}
		
		t1 = time1;
		
		if (time1 > 2400 || time2 > 2400 || time1 % 100 > 60 || time2 % 100 > 60) {
			System.out.println("Error");
			t1 = 0;
			t2 = 0;
		}
	}
	
	public int difference() {
		int hors = t2 / 100 - t1 / 100;
		int mins = t2 % 100 - t1 % 100;
		
		if (mins < 0) {
			mins = 60 + mins;
			hors--;	
		}
		
		return hors * 100 + mins;
	}
	
}