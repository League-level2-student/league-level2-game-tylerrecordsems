package GI_JOE;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class GI_Joe implements ActionListener {
String chosen;
	JButton Flint = new JButton();
	JButton SnakeEyes = new JButton();
	JButton Zartan = new JButton();
	JButton StormShadow = new JButton();
	JButton SgtSlaughter = new JButton();
//	JButton fourButton = new JButton();
//	JButton fiveButton = new JButton();
	//JButton sixButton = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void character(){
//	String Name = JOptionPane.showInputDialog( null, "Which GI_JOE would you like to be?");

		frame.add(panel);
	
frame.setVisible(true);

Flint.setText("Flint!");
SnakeEyes.setText("SnakeEyes!");
StormShadow.setText("Storm Shadow!");
SgtSlaughter.setText("Sgt. Slaughter!");
Zartan.setText("Zartan!");
//fourButton.setText("Spirit!");
//fiveButton.setText("RoadBlock!");
//sixButton.setText("Shipreck!");


frame.setBounds(450, 0, 500, 100);
panel.add(StormShadow);
panel.add(Zartan);
panel.add(SnakeEyes);
panel.add(Flint);
panel.add(SgtSlaughter);
//panel.add(fourButton);
//panel.add(fiveButton);
//panel.add(sixButton);
frame.setTitle("Which GI Joe would you like to be? YO JOE!!!");
//frame.pack();
StormShadow.addActionListener(this);
SnakeEyes.addActionListener(this);
Flint.addActionListener(this);
	
SgtSlaughter.addActionListener(this);
Zartan.addActionListener(this);
	}
	
		
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	if(arg0.getSource()==StormShadow) {
		chosen=("Storm Shadow!!");
		JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
	}if(arg0.getSource()==SgtSlaughter) {
		chosen=("Sgt. Slaughter!");
		JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
	}if(arg0.getSource()==Zartan) {
		chosen=("Zartan!");
		JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
	}if(arg0.getSource()==SnakeEyes) {
		chosen=("SnakeEyes!");
		JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
	}if(arg0.getSource()==Flint) {
		chosen=("Flint!");
		JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
	}
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		/*
		 class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing the file passed in:");
        while(sc.hasNextLine()) System.out.println(sc.nextLine());
    }
}
		 */
		frame.add(panel);
		panel.add(new JButton());
		frame.setVisible(true);
		frame.pack();
	}
	


		
	
}

