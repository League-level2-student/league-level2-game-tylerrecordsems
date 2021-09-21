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

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void character() {

		frame.add(panel);

		frame.setVisible(true);

		

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
		frame.setTitle("Which GI Joe would you like to be? YO JOE!!!");
		
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
	public void Game_Over(){
		JOptionPane.showMessageDialog(null, "You failed to complete your Mission! Game Over!");
		
		frame.dispose();
	}
	public void stormShadow6() {
		
	}
	public int checkSstart(JButton button) {
		if(button == choices[0]) {
			JOptionPane.showMessageDialog(null, "You jumped out of the Cobra helecopter and \n landed on the roof of the GI Joe HQ!");
			JOptionPane.showMessageDialog(null, "You climb into a corrador, \n there are two ways to go! \n Left or Down to the Basement!");
		return 6;
		}if(button == choices[1]) {
			JOptionPane.showMessageDialog(null, "You climb into the Sewers and start to walk!");
			JOptionPane.showMessageDialog(null, "As you make your way through the Sewers, \n you hear squeaks and squeals! You try and flee \n but the Rats take you down!");
		
			return 7;
		}if(button == choices[2]) {
			JOptionPane.showMessageDialog(null, "You hang on to a GI Joe shipping truck and \n find your self at the cargo bay!");
		
		return 8;
		}
		
		return 0;
	}
	public void SS6_choice() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		choices[0] = new JButton();
		choices[0].setText("Left!");
		choices[1] = new JButton();
		choices[1].setText("Down into the Basement!");
		panel.add(choices[0]);
		panel.add(choices[1]);
		
		state=9;
	}
	public int checkSS(JButton button) {
		if(button == choices[0]) {
			JOptionPane.showMessageDialog(null, "You walk left, tense and scared. \n As you keep walking through the corrador, \n you notice there is no one around,\n until...");
			JOptionPane.showMessageDialog(null, "Wam! \n Someone slams into you, \n throwing you to the ground. StormShadow you are under arrest by GI_Joe!");

		return 7;
		}if(button == choices[1]) {
			JOptionPane.showMessageDialog(null, "You climb into the Sewers and start to walk!");
			
		
			return 7;
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
	
	public void SS11(){
		state=11;
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		choices[0].setText("Observe!");
		choices[1].setText("Run for the enterence!");
		panel.add(choices[1]);
		panel.add(choices[0]);
		frame.setBounds(450, 0, 500, 100);
		frame.pack();
		frame.setVisible(true);
		
	}
	public int SS11check(JButton button) {
		if(button == choices[0]) {
			JOptionPane.showMessageDialog(null, "As you hide behind a truck, you see workers. \n You can only hear little bits of their conversation. \n all you can hear is this \n 'Room A23' \n 'Secret Plans'");
			JOptionPane.showMessageDialog(null, "You see three men exit the door \n When they leave you dart into the room \n ");
		return 12;
		}if(button == choices[1]) {
			JOptionPane.showMessageDialog(null, "You make a run for the door! \n You find three Workers inside! \n they stand up when they see you! \n You punch one, kick another, and smash a chair over the last one. \n A Worker from outside cetches you in the head with a baton \n and you slip into unconsciousness");
			
		
			return 7;
		}
		return 0;
	}
	public void SS12() {
		state=11;
		frame.dispose();
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		choices[0].setText("Observe!");
		choices[1].setText("Run for the enterence!");
		panel.add(choices[1]);
		panel.add(choices[0]);
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
			nextState=checkSstart((JButton) arg0.getSource());
			break;
		case 11:
			nextState=SS11check((JButton) arg0.getSource());
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
		case 6:
			SS6_choice();
			break;
		case 7:
			Game_Over();
			break;
		case 8:
			SS11();
			break;
		case 11:
			SS12();
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
