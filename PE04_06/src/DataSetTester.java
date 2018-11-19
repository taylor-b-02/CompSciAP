
public class DataSetTester {

	public static void main(String[] args) {
		
		DataSet test = new DataSet();
		
		test.addValue( 1 );
		test.addValue( 2 );
		test.addValue( 3 );
		test.addValue( 4 );
		
		System.out.println( test.getLargest() );
		System.out.println( "Expected: 4");
		System.out.println( test.getSmallest() );
		System.out.println( "Expected: 1");
	}

}
