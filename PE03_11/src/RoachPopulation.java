
public class RoachPopulation {
	
	//Constructor
	public RoachPopulation(int ipopulation) {
		population = ipopulation;
	}
	
	//Methods
	public void breed() {
		population = population * 2;
	}
	
	public void spray() {
		population -= (population * .10);
	}
	
	public int getRoaches() {
		System.out.println(population);
		return population;
		
	}
	
	int population = 0;

}
