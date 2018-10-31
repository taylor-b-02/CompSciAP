
public class Converter {
	
	public Converter (double aConversionFactor) {
		
		convFactor = aConversionFactor;
		
	}
	
	public double convertTo(double fromMeasurement) {
		
		measurement = fromMeasurement * convFactor;
		return measurement;
		
	}
	
	public double convertFrom(double toMeasurement) {
		
		measurement = toMeasurement / convFactor;
		return measurement;
		
	}

	private double convFactor;
	private double measurement;
}
