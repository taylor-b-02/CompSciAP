
public class RoachSimulation {
	
	public static void main(String args[]) {
		
		RoachPopulation pop = new RoachPopulation(10);
		pop.breed();
		pop.spray();
		pop.getRoaches();
		
		pop.breed();
		pop.spray();
		pop.getRoaches();
		
		pop.breed();
		pop.spray();
		pop.getRoaches();
	}

}
