import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class ellipseComponent extends JComponent{

	public void paintComponent(Graphics g) {	
		Graphics2D gee = (Graphics2D) g;
		
		Ellipse2D el = new Ellipse2D.Double(0.0, 0.0, getWidth(), getHeight());
		gee.draw(el);
		gee.setColor(Color.RED);
		gee.fill(el);
	}

}
