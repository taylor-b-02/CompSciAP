
import java.util.Arrays;

public class Square {

	public Square(int n) {
		length = n;
		square = new int[n][n];
		System.out.println(Arrays.deepToString(square));
		
	}
	
	//Add method: adds an integer to the square
	public void add(int i) {
		if(column == length) { //Tests which column of the array it is to ensure that it remains in bounds
			row++;
			column = 0;
		}
		square[row][column] = i;
		column++;
		System.out.println(Arrays.deepToString(square));
	}
	
	//Tests if the inputs are a magic square
	public boolean isMagic() {
		for (int i = 0; i < ROWS; i++) {
			magicSum += square[0][i];
			System.out.println(magicSum);
		}
		
		System.out.println(magicSum);
		
		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < COLUMNS; j ++) {
				rowSum += square[i][j];
			}
			if (rowSum != magicSum) {
				isMagic = false;
			}
			else columnSum = 0;
		}
		
		for(int j = 0; j < COLUMNS; j++) {
			for(int i = 0; i < ROWS; i ++) {
				columnSum += square[j][i];
			}
			if (columnSum != magicSum) {
				isMagic = false;
				break;
			}
			else columnSum = 0;
		}
		System.out.println(magicSum + " " + rowSum + " " + columnSum);
		return isMagic;
	}
	
	//Variables
	private int[][] square;
	private int column = 0;
	private int row = 0;
	private int length;
	final private int ROWS = length - 1;
	final private int COLUMNS = length - 1;
	private int magicSum;
	private int rowSum = 0;
	private int columnSum = 0;
	public boolean isMagic;
	
}
