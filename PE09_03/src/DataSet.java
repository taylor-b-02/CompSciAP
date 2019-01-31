public class DataSet 
{ 
   
   public void add(Measurable x) 
   { 
      sum = sum + x.getMeasure(); 
      if (count == 0 || maximum.getMeasure() < x.getMeasure()) 
         maximum = x; 
      count++; 
   } 

   public Measurable getMaximum() 
   { 
      return maximum; 
   }
   
   public double getAverage() {
	   return sum/count;
   }

   private double sum; 
   private Measurable maximum; 
   private int count; 
}
