import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JApplet;

public class nameDrawer extends JApplet {
	public void paint(Graphics g) {
		Graphics2D gee = (Graphics2D) g;
		Rectangle rect = new Rectangle(10,10,500,600);
		gee.setColor(Color.BLUE);
		gee.draw(rect);
		gee.setColor(Color.RED);
		gee.drawString("Taylor Pancake", 300, 300);
	}

}
