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
	JButton[] choices = new JButton[5];
//	JButton fourButton = new JButton();
//	JButton fiveButton = new JButton();
	// JButton sixButton = new JButton();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void character() {
//	String Name = JOptionPane.showInputDialog( null, "Which GI_JOE would you like to be?");

		frame.add(panel);

		frame.setVisible(true);

		
//fourButton.setText("Spirit!");
//fiveButton.setText("RoadBlock!");
//sixButton.setText("Shipreck!");

		frame.setBounds(450, 0, 500, 100);
		
		
		for (int i = 0; i < 5; i++) {
			choices[i]= new JButton();
			choices[i].addActionListener(this);
			panel.add(choices[i]);
		}
		choices[0].setText("StormShadow!");
		choices[1].setText("Flint!");
		choices[2].setText("Zartan!");
		choices[3].setText("SnakeEyes!");
		choices[4].setText("Sgt. Slaughter!");
//panel.add(fourButton);
//panel.add(fiveButton);
//panel.add(sixButton);
		frame.setTitle("Which GI Joe would you like to be? YO JOE!!!");
//frame.pack();
		
	}

	public int characterConfirm(JButton button) {
		if (button == choices[0]) {
			chosen = ("Storm Shadow!!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 1;

		}
		if (button == choices[4]) {
			chosen = ("Sgt. Slaughter!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 2;
		}
		if (button == choices[2]) {
			chosen = ("Zartan!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 3;
		}
		if (button == choices[3]) {
			chosen = ("SnakeEyes!");
			JOptionPane.showMessageDialog(null, "You have chosen " + chosen);
			return 4;
		}
		if (button == choices[1]) {
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
		JOptionPane.showMessageDialog(null, "Operation Desert Storm : Your Mission if you choose to accept is this:");
		label = new JLabel();
		JOptionPane.showMessageDialog(null, "Infultrate the GI Joe Headquarters and descover their plans!");
		JOptionPane.showMessageDialog(null, "CODE SHADOW");
		panel.add(label);
		for (int i = 0; i < 3; i++) {
			panel.add(choices[i]);
		}
		choices[0].setText("Parachute In!");
		choices[1].setText("Climb Through the Sewers!");
		choices[2].setText("Sneak In!");
		JOptionPane.showMessageDialog(null, "Start Mission!");
		
		frame.setVisible(true);
		frame.pack();
		state=1;
	}
	public void stormShadow6() {
		
	}
	public int checkSstart(JButton button) {
		if(button == choices[0]) {
			JOptionPane.showMessageDialog(null, "You jumped out of the Cobra helecopter and \n landed on the roof of the GI Joe HQ!");
		
		return 6;
		}if(button == choices[1]) {
			JOptionPane.showMessageDialog(null, "You");
		
		return 7;
		}if(button == choices[2]) {
			JOptionPane.showMessageDialog(null, "You jumped out of the Cobra helecopter and \n landed on the roof of the GI Joe HQ");
		
		return 8;
		}
		
		return 0;
	}
	public void  stormShadowTwo() {
		
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
		state =2;
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		switch (state) {
		case 0:
			nextState = characterConfirm((JButton) arg0.getSource());
			break;
		case 1:
			nextState=checkSstart((JButton) arg0.getSource());
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
