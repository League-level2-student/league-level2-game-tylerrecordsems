package GI_JOE;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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
GI_Joe_Response_Scene response = new GI_Joe_Response_Scene();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void character() {

		frame.add(panel);

		frame.setVisible(true);

		frame.setBounds(450, 0, 500, 100);


		for (int i = 0; i < 5; i++) {
			choices[i] = new JButton();
			choices[i].addActionListener(this);
			
		}
		panel.add(choices[0]);
		choices[0].setText("StormShadow!");
		//frame.setTitle("Start");

	}

	public int characterConfirm(JButton button) {
		JOptionPane.showMessageDialog(null, "You are StormShadow \n an Elite Spy \n You are a part of an Evil corporation named Cobra. \n Cobra's enemy is GI Joe \n or, the good guys");
		
		return 1;
	}

	public void stormShadowStart() {
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setBounds(450, 0, 500, 100);
		JOptionPane.showMessageDialog(null, "Operation Desert Storm : Your Mission if you choose to accept is this:");
		JOptionPane.showMessageDialog(null, "Infiltrate the GI Joe Headquarters and discover their plans!");
		JOptionPane.showMessageDialog(null, "CODE SHADOW");
		JOptionPane.showMessageDialog(null, "Start Mission!");
		panel.add(choices[0]);
		panel.add(choices[1]);  
		panel.add(choices[2]);
		choices[0].setText("Parachute In!");
		choices[1].setText("Climb Through the Sewers!");
		choices[2].setText("Sneak In!");
		

		frame.setVisible(true);
		frame.pack();
		state = 1;
	}

	public void Game_Over() {
		JOptionPane.showMessageDialog(null, "You failed to complete your Mission! Game Over!");

		frame.dispose();
	}

	

	public void SS6_choice() {  
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		choices[0].setText("Left!");
		choices[1].setText("Down into the Basement!");
		panel.add(choices[0]);
		panel.add(choices[1]);

		state = 9;
		frame.setVisible(true);
		frame.pack();
	}
  

	
	//[START HEREEEEEEEEEEEE \/]
	

	public void stormShadowTwo() {

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
		frame.pack();
		state = 2;
	}

	public void SS11() {
		state = 11;
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		choices[0].setText("Observe!");
		choices[1].setText("Run for the entrance!");
		panel.add(choices[1]);
		panel.add(choices[0]);
		frame.setBounds(450, 0, 500, 100);
		frame.pack();
		frame.setVisible(true);

	}

	

	public void SS12() {
		state = 12;
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		JOptionPane.showMessageDialog(null,
				"You walk into a large room and see five rooms (1-5)");
		choices[0].setText("Room A1");
		choices[1].setText("Room A2");
		choices[2].setText("Room A3");
		choices[3].setText("Room A4");
		choices[4].setText("Room A5");
		panel.add(choices[0]);
		panel.add(choices[1]);
		panel.add(choices[2]);
		panel.add(choices[3]);
		panel.add(choices[4]);

		frame.setBounds(450, 0, 500, 100);
		frame.pack();
		frame.setVisible(true);

	}

	

	public void SS13() {
		state = 13;
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		JOptionPane.showMessageDialog(null,
				"You walk into Room A4 \n and you see a computer and lab \n this computer says \n PROJECT TAKEDOWN: \n This new Hacking Technology will be able to hack any Evil Corporation such as Cobra and bring them to their knees \n We will also take Evil Agents like Storm Shadow and Zartan \n");
		JOptionPane.showMessageDialog(null,
				"'HEY' What are you doing here!' \n 'Hands in the air' \n you hear gunshots behind you as you run out of the room! \n  ");
		choices[0].setText("Back through where you came from!");
		choices[1].setText("Climb out the window!");
		choices[2].setText("Hiding in the Rooms!");
		panel.add(choices[0]);
		panel.add(choices[1]);
		panel.add(choices[2]);

		frame.pack();
		frame.setVisible(true);
	}

	

	public void SSEnd1() {
		JOptionPane.showMessageDialog(null, "Thank you for playing, can you find the other way to win?");
		frame.dispose();
	}

	public void SS14() {
		state = 14;
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		JOptionPane.showMessageDialog(null, "You walk into the large room and see the 4 rooms (1, 2, 3, and 5.)");
		choices[0].setText("Room A1");
		choices[1].setText("Room A2");
		choices[2].setText("Room A3");
		choices[3].setText("Room A5");
		panel.add(choices[0]);
		panel.add(choices[1]);
		panel.add(choices[2]);
		panel.add(choices[3]);

		frame.setBounds(450, 0, 500, 100);
		frame.pack();
		frame.setVisible(true);
	}

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		switch (state) {
		case 0:
			nextState = characterConfirm((JButton) arg0.getSource());
			break;
		case 1:
			nextState = response.checkSstart((JButton) arg0.getSource(), choices);
			break;
		case 9:
			nextState = response.checkSS((JButton) arg0.getSource(), choices);
			break;
		case 11:
			nextState = response.SS11check((JButton) arg0.getSource(),choices);
			break;
		case 12:
			nextState = response.SS12check((JButton) arg0.getSource(), choices);
			break;
		case 13:
			nextState = response.SS13check((JButton) arg0.getSource(),choices);
			break;
		case 14:
			nextState = response.SS14check((JButton) arg0.getSource(),choices);
		default:
			//JOptionPane.showMessageDialog(null, state + " State Not Found");
		}
		switch (nextState) {
		case 1:
			stormShadowStart();
			break;
		case 2:
			stormShadowTwo();
			break;
		case 6:
			SS6_choice();
			break;
		case 7:
			Game_Over();
			break;
		case 8:
			SS11();
			break;
		case 12:
			SS12();
			break;
		case 13:
			SS13();
			break;
		case 14:
			SSEnd1();
			break;
		case 15:
			SS14();
			break;
		default:
			// JOptionPane.showMessageDialog(null, nextState + " Next State Not found");

		}

		/*
		 * class MyProg { public static void main(String[] args) { Scanner sc = new
		 * Scanner(System.in); System.out.println("Printing the file passed in:");
		 * while(sc.hasNextLine()) System.out.println(sc.nextLine()); } }
		 */

	}

}
