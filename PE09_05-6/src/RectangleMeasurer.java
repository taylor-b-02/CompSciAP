import java.awt.Rectangle;

/**
   Objects of this class measure rectangles by area.
*/
public class RectangleMeasurer implements Measurer
{
   public double measure(Object anObject)
   {
      Rectangle aRectangle = (Rectangle) anObject;
      double area = aRectangle.getWidth() * aRectangle.getHeight();
      return area;
   }
   
   public double pmeasure(Object anObject) {
	   Rectangle aRectangle = (Rectangle) anObject;
	   double perimeter = (aRectangle.getWidth() * 2) + (aRectangle.getHeight() * 2);
	   return perimeter;
   }
}
