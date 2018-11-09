import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;

public class TwoSquare extends JApplet{
	public void paint(Graphics sq) {
		Graphics2D squa = (Graphics2D) sq;
		Color prp = new Color(153, 50, 204);
		Rectangle rect = new Rectangle(10,10,10,20);
		Rectangle rect2 = new Rectangle(25,10,10,20);
		squa.setColor(Color.RED);
		squa.draw(rect);
		squa.fill(rect);
		squa.setColor(prp);
		squa.draw(rect2);
		squa.fill(rect2);
		
	}

}
