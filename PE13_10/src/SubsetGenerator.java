public class SubsetGenerator {

	public void generate(String subset, String word) {
		
		if (word.length()==0) {
			
			System.out.println(subset);
			return;
		
		}
		generate(subset+ word.substring(0,1), word.substring(1,word.length()));
		
		generate(subset, word.substring(1,word.length()));
		

	}
	
}