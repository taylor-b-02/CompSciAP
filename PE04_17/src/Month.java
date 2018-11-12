public class Month {
		
	private int num;
	private String months;
	public Month(int mnum){
		num = mnum;
		months = "January   February  March     April     May       June      July      August    September October   November  December  ";
	}
	public String getName(){
		return months.substring(10*(num-1), 10*(num-1)+10).trim();
	}
		
		
}
