/**
   This program tests the measuring of Person objects.
*/
public class PersonTester
{
   public static void main(String[] args)
   {
      //. . .

      DataSet data = new DataSet();

      data.add(new Person("Joe", 183));
      data.add(new Person("Chrissy", 158));
      data.add(new Person("Bobby", 175));

      double avg = data.getAverage();
      Person max = (Person) data.getMaximum();

      System.out.println("Average height: " + avg);
      System.out.println("Expected: 172");
      System.out.println("Name of tallest person: " + max.getName());
      System.out.println("Expected: Joe");
   }
}