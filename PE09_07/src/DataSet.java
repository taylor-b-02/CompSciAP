import java.awt.Rectangle;

/**
   Analyzes a set of data values.
*/
public class DataSet
{
   /**
      Constructs an empty data set with a given measurer.
      @param aMeasurer the measurer that is used to measure data values
   */
   public DataSet(Measurer aMeasurer)
   {
      sum = 0;
      count = 0;
      maximum = null;
      minimum = null;
      measurer = aMeasurer;
      maxperim = null;
      
   }
   
   public DataSet() {
	   sum = 0;
	   count = 0;
	   maximum = null;
	   minimum = null;
	   maxperim = null;
	   class DefaultMeasurer implements Measurer
	      {
	         public double measure(Object anObject)
	         {
	            Measurable temp = (Measurable) anObject;
	            return temp.getMeasure();
	         }
	      }
	   DefaultMeasurer abmeasurer = new DefaultMeasurer();
	   measurer = abmeasurer;
   }

   /**
      Adds a data value to the data set.
      @param x a data value
   */
   public void add(Object x)
   {
      sum = sum + measurer.measure(x);
      if (count == 0 
         || measurer.measure(maximum) < measurer.measure(x))
         maximum = x;
      if (count == 0 || measurer.measure(minimum) > measurer.measure(x)) 
             minimum = x;
      //if (count == 0 || measurer.pmeasure(maxperim) < measurer.pmeasure(x)) 
          //maxperim = x;
      count++;
    
   }
   
   public Object getMaxPerim() {
	   return maxperim;
   }

   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage()
   {
      if (count == 0) return 0;
      else return sum / count;
   }

   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
   public Object getMaximum()
   {
      return maximum;
   }

   /**
      Gets the smallest of the added data.
      @return the minimum or 0 if no data has been added
   */
   public Object getMinimum()
   {
	   return minimum;
   }

   private double sum;
   private Object maximum;
   private Object minimum;
   private Object maxperim;
   private int count;
   private Measurer measurer;
   
}
