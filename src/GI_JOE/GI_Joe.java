package GI_JOE;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class GI_Joe implements ActionListener {
	String chosen;
	int state = 0;
	int nextState = 0;
	JButton Next = new JButton();
	JLabel label = new JLabel();
	JButton Flint = new JButton();
	JButton SnakeEyes = new JButton();
	JButton Zartan = new JButton();
	JButton StormShadow = new JButton();
	JButton SgtSlaughter = new JButton();
//	JButton fourButton = new JButton();
//	JButton fiveButton = new JButton();
	// JButton sixButton = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void character() {
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

	public int characterConfirm(JButton button) {
		if (button == StormShadow) {
			chosen = ("Storm Shadow!!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 1;

		}
		if (button == SgtSlaughter) {
			chosen = ("Sgt. Slaughter!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 2;
		}
		if (button == Zartan) {
			chosen = ("Zartan!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 3;
		}
		if (button == SnakeEyes) {
			chosen = ("SnakeEyes!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 4;
		}
		if (button == Flint) {
			chosen = ("Flint!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 5;
		}
		return 0;
	}
	public void stormShadowStart() {
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setBounds(450, 0, 500, 100);
		frame.setTitle("Operation Desert Storm : Your Mission if you choose to accept is this:");
		label = new JLabel();
		label.setText("Infultrate the GI Joe Headquarters and descover their plans ");
		JLabel l = new JLabel("<html>Mission Code: <br/>CODE/SHADOW<html>",SwingConstants.CENTER);
		panel.add(l);
		panel.add(label);
		Next.addActionListener(this);
		Next.setText("Start Mission!");
		panel.add(Next);
		//next
		frame.setVisible(true);
		frame.pack();
		state=1;
		
	}
	public void  stormShadowTwo() {
		state =1;
		nextState = 2;
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		JOptionPane.showMessageDialog(null, ".");
		JOptionPane.showMessageDialog(null, "..");
		JOptionPane.showMessageDialog(null, "...");
		JOptionPane.showMessageDialog(null, ".");
		JOptionPane.showMessageDialog(null, "..");
		JOptionPane.showMessageDialog(null, "Process complete!");
		frame.setBounds(450, 0, 500, 100);
		frame.isVisible();
		
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		switch (state) {
		case 0:
			nextState = characterConfirm((JButton) arg0.getSource());
			break;
		case 1:
			break;
		default:
			JOptionPane.showMessageDialog(null, state + " State Not Found");
		}
		switch (nextState) {
		case 1:
			stormShadowStart();
			break;
		case 2:
			stormShadowTwo();
			break;
			default:
				JOptionPane.showMessageDialog(null, nextState + " Next State Not found");
			
		}
		
		
		/*
		 * class MyProg { public static void main(String[] args) { Scanner sc = new
		 * Scanner(System.in); System.out.println("Printing the file passed in:");
		 * while(sc.hasNextLine()) System.out.println(sc.nextLine()); } }
		 */
		
	}

}
