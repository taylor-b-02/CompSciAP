import javax.swing.JFrame;

public class ellipseViewer {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		frame.setSize(500,500);
		frame.setTitle("Ellipse my dude");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		ellipseComponent component = new ellipseComponent();
		frame.add(component);
		frame.setVisible(true);
	}

}
