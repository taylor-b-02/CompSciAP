/**
   Computes the minimum and maximum of a set of Comparable values.
*/
public class DataSet
{
	private Comparable maximum = 0;
	private Comparable minimum = 0;
	private double sum;
	private int count;
   /**
      Constructs an empty data set.
   */
   public DataSet()
   {
	    sum = 0;
	    count = 0;
	    maximum = null;
	    minimum = null;
   }

   /**
      Adds a data value to the data set.
      @param x a data value
   */      
   public void add(Comparable x) 
   { 
		   //sum = sum + x;
	   if (count == 0 || maximum.compareTo(x) < 0)
	       maximum = x;
	   if (count == 0 || minimum.compareTo(x) > 0) 
	       minimum = x;
	   count ++;
   }     

   /**
      Gets the largest of the added data.
      @return the maximum or null if no data has been added
   */
   public Comparable getMaximum()
   {
     return (Comparable) maximum;
   }
   
   /**
      Gets the largest of the added data.
      @return the maximum or null if no data has been added
   */
   public Comparable getMinimum()
   {
	   return (Comparable) minimum;
   }   

   
}
