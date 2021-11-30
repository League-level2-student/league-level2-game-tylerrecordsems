package GI_JOE;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class GI_Joe_Response_Scene {
	
	public int checkSstart(JButton button , JButton[] choices) {   
		if (button == choices[0]) { 
			JOptionPane.showMessageDialog(null,
					"You jumped out of the Cobra helicopter and \n landed on the roof of the GI Joe HQ!");
			JOptionPane.showMessageDialog(null,
					"You climb into a corridor, \n there are two ways to go! \n Left or Down to the Basement!");
			return 6;  
		}
		if (button == choices[1]) {
			JOptionPane.showMessageDialog(null, "You climb into the Sewers and start to walk!");
			JOptionPane.showMessageDialog(null,
					"As you make your way through the Sewers, \n you hear squeaks and squeals! You try and flee \n but the Rats take you down!");

			return 7;
		}
		if (button == choices[2]) {
			JOptionPane.showMessageDialog(null,
					"You hang on to a GI Joe shipping truck and \n find your self at the cargo bay!");

			return 8;
		}

		return 0;
	}
	public int checkSS(JButton button , JButton[] choices) {
		if (button == choices[0]) {
			JOptionPane.showMessageDialog(null,
					"You walk left, tense and scared. \n As you keep walking through the corridor, \n you notice there is no one around,\n until...");
			JOptionPane.showMessageDialog(null,
					"Wam! \n Someone slams into you, \n throwing you to the ground. Storm Shadow you are under arrest by GI Joe!");

			return 7;
		}
		if (button == choices[1]) {
			JOptionPane.showMessageDialog(null, "You climb into the basement! \n It's dark and it's hard to see \n Wam! \n Something hits you in the back of the head and you fall into unconsciousness");
			JOptionPane.showMessageDialog(null, "You open your eyes \n 'Welcome Stormshadow!' \n 'To the Box!' \n 'you will never escape!' \n 'Muahahaha!'");

			return 7;
		}  
		return 0;
	}
	public int SS11check(JButton button , JButton[] choices) {
		if (button == choices[0]) {
			JOptionPane.showMessageDialog(null,
					"As you hide behind a truck, you see workers. \n You can only hear little bits of their conversation. \n all you can hear is this \n 'Room A4' \n 'Secret Plans'");
			JOptionPane.showMessageDialog(null,
					"You see three men exit the door \n When they leave you dart into the room they left \n You continue through the room and enter a hallway");
			return 12;
		}
		if (button == choices[1]) {
			JOptionPane.showMessageDialog(null,
					"You make a run for the door! \n You find three Workers inside! \n they stand up when they see you! \n You punch one, kick another, and smash a chair over the last one. \n A Worker from outside catches you in the head with a baton \n and you slip into unconsciousness");

			return 7;
		}
		return 0;
	}
	public int SS12check(JButton button , JButton[] choices) {
		if (button == choices[0]) {
			JOptionPane.showMessageDialog(null, "You enter room 1 and find nothing.");

			return 12;
		}
		if (button == choices[1]) {
			JOptionPane.showMessageDialog(null, "You enter room 2 and find a sleeping Hawk.");

			return 12;
		}
		if (button == choices[2]) {
			JOptionPane.showMessageDialog(null, "You enter room 3 and find a kitchen.");

			return 12;
		}
		if (button == choices[3]) {
			JOptionPane.showMessageDialog(null, "You enter room 4 and find a command room. You continue!");

			return 13;
		}
		if (button == choices[4]) {
			JOptionPane.showMessageDialog(null, "You enter room 5 and find a tank.");

			return 12;
		}
		return 0;
	}
	public int SS13check(JButton button , JButton[] choices) {
		if (button == choices[0]) {
			JOptionPane.showMessageDialog(null,
					"You run back through the corridors and \n dashed into a empty room \n the doors close and gas fills the room \n You fall into unconsciousness");

			return 7;
		}
		if (button == choices[1]) {
			JOptionPane.showMessageDialog(null,
					"You jump out of the room and find you are on the 8th floor \n you fall a few stories \n you open your eyes and wake up \n it was all a dream \n 'Honey, get ready for school!' \n you leave for school \n meanwhile, a tv somewhere : \n GI Joe take Cobra down with a special methods.");

			return 14;
		}
		if (button == choices[2]) {
			JOptionPane.showMessageDialog(null, "You come out of room A4 and \n look around the room");

			return 15;
		}
		return 0;

	}
	public int SS14check(JButton button , JButton[] choices) {
		if (button == choices[0]) {
			JOptionPane.showMessageDialog(null, "You enter room 1 and find nothing.");

			return 15;
		}
		if (button == choices[1]) {
			JOptionPane.showMessageDialog(null, "You enter room 2 and find a sleeping Hawk.");

			return 15;
		}
		if (button == choices[2]) {
			JOptionPane.showMessageDialog(null, "You enter room 3 and find a kitchen");

			return 15;
		}
		if (button == choices[3]) {
			JOptionPane.showMessageDialog(null,
					"You enter room 5 and find a tank! \n Your face grows into a mischievous grin. \n Boom! \n You bust out and ride into the sunset, completing your mission.");

			return 14;
		}
		return 0;

	}
}
