import java.lang.Math;

public class DataSet {
	
	public DataSet() {
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
	}
	
	public void addValue(int x) {
		
		max = Math.max( max, x );
		min = Math.min( min, x );
		
	}
	
	public int getLargest() {
		
		return max;
		
	}
	
	public int getSmallest() {
		
		return min;
		
	}

	private int max;
	private int min;
}
