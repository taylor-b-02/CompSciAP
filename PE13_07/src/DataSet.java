import java.util.Arrays;

public class DataSet {
	
	public DataSet(int[] values, int afirst, int alast) {
		array = values;
		first = afirst;
		last = alast;
	}
	
	public int getSum() {
		int sum = array[0];
		int[] arra = Arrays.copyOfRange(array, 1, array.length);
		
		if (array.length == 1) {
			//sum = array[0];
			return array[0];
		}
		DataSet d = new DataSet(arra, arra[0], arra[arra.length - 1]);
		return sum + d.getSum();
	}
	
	int[] array;
	int first, last;
	//int sum;

}
