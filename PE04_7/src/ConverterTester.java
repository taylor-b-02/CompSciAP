
public class ConverterTester {

	public static void main(String[] args) {
		
		final double MILE_TO_KM = 1.609;
		Converter milestoMeters = new Converter( 1000 * MILE_TO_KM );
		
		System.out.println( "Meters: " + milestoMeters.convertTo( 1 ) );
		System.out.println( "Expected: 1609" );
		
		System.out.println( "Miles: " + milestoMeters.convertFrom( 1609 ) );
		System.out.println( "Expected: 1" );

	}

}
