public class PersonRunner
{
   public static void main(String[] args)
   {
      final int TRIES = 10;
      DataSet ds = new DataSet();
      
      for (int i = 1; i <= TRIES; i++)
      {  
         Die d = new Die(6);
         int n = d.cast();
         ds.add(d);
         System.out.print(n + " ");
      }

      System.out.println();
      System.out.println("Average: " + ds.getAverage());      
   }
}