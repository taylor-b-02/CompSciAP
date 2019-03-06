import java.awt.Rectangle;
public class Square extends Rectangle{
	
	public Square(int acenterx, int acentery, int awidth) {
		super.setLocation(acenterx, acentery);
		super.setSize(awidth, awidth);
	}

	public int getArea(Square s) {
		return (int) ( s.getHeight() * s.getHeight() );
	}
}
