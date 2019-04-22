
public class CoinValueSort
{

   public static void sort(Coin[] a)
   {  
      for (int i = 0; i < a.length - 1; i++)
      {  
         int minPos = minimumPosition(a, i);
         ArrayUtil.swap(a, minPos, i);
      }
   }

   private static int minimumPosition(Coin[] a, int from)
   {  
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
      {
         if (a[i].getValue() < a[minPos].getValue()) { minPos = i; }
      }
      return minPos;
   }
}
