package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		 JOptionPane.showMessageDialog(null, " If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog(null, "pick a adjective that you like?");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog(null, "pick a liquid that you like?");
		// Get the user to enter a body part
		String bodypart = JOptionPane.showInputDialog(null, "pick a body part that you like?");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog(null, "pick a verb that you like?");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog(null, "pick a place that you like?");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		String story = "pirahnas are more "+ adjective +" during the day so cross the river at night. piranhas are attracted to fresh "+
		liquid +" and will most likely take a bite out of your "+ bodypart +" if you "+ verb +" \n . whatever you do, if you have an open wound"
	   + " try to find another way to get back to the "+ place +" good luck!";
				
				
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		 JOptionPane.showMessageDialog(null, story);

	}
}

