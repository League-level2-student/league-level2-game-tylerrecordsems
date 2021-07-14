import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Bert_ {
JFrame frame = new JFrame();
JPanel panel = new JPanel();

public void run() {
	frame.add(panel);
	frame.setVisible(true);
	JOptionPane.showMessageDialog(null, "To play, press the space bar to jump over the obstacles");
	
	
	frame.pack();
}

}
