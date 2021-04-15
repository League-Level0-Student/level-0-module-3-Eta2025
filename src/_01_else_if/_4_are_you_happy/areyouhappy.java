package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
	public static void main(String[] args) {
		
		 String are =JOptionPane.showInputDialog("Are you happy");
		 if (are.equals("no")) { String why = JOptionPane.showInputDialog(null, "do you want to be happy");
		 if ( why.equals ("no")) {JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");}
		 else if (why.equals("yes")) {JOptionPane.showMessageDialog(null, "Change something");}}
		 else if (are.equals("yes")) {JOptionPane.showMessageDialog(null,"Keep doing what you are doing");}
		
		
		
		
		
		
	}

}
