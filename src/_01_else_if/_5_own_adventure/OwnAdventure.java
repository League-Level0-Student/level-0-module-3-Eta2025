package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
	String start = JOptionPane.showInputDialog("You hear a knock on the door. Do you answer it y or n");
	if (start.equals("y")) {String shadow = JOptionPane.showInputDialog("there is no one at the door."
			+ "As you look back you see a dark shadow."
			+ " Do you approch the shadow or  run out the door");
	if (shadow.equals ("approch")) {JOptionPane.showMessageDialog(null," as you approch. the entity. it leaps towards you. you grab the axe right beside you and take a big slash. As it bleeds on you. You run away");}
	else if (shadow.equals ("run")) {String axe = JOptionPane.showInputDialog("As you run out the house, you trip , you see an ax. do you go for the axe or keep on running ,axe or run");
	 if (axe.equals("axe")) {JOptionPane.showMessageDialog( null, "As you try to go for the axe. the shadow grabs you. Its too late");}
	 else if (axe.equals("run")) {}}}
	else if (start.equals ("n")) {  String run =JOptionPane.showInputDialog("the knocking gets louder. As you turn back from the door you glimpse of a dark shadow creature. Do you run or ignore the creature.");
	if (run.equals("ignore")) {JOptionPane.showMessageDialog(null, "you glance over. It gets closer. You try to run but its too late. ");}
	else if (run.equals ("run")) {String hide = JOptionPane.showInputDialog("As you run u pick up an axe. You find a house. do you go in the house , y or n");
	if ( hide.equals ("n")) {JOptionPane.showMessageDialog( null, "you dont go into the house and keep on running. As you look back you see from the house the creature looks at you.  You are back at ur house safly. ");
if (hide.equals("y")) {JOptionPane.showMessageDialog(null, "as you go in the house. the creature is in the house. as you try to open the door out, your realize its locked. You use the axe to open the door. But its to late :).");}}}}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
