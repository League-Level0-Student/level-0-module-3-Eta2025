
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
	
		for(int a = 1; a < 100; a++) {
		//1. Create a new Robot
	  Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
    rob.setSpeed(100);
		//3. Set the pen width to 10
	 rob.setPenWidth(10);
	 rob.penDown();
		//4. Ask the user what color pen they would like the robot to draw with
	  
		String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with");
		//5. Use an if/else statement to set the pen color that the user requested
		

		if (color.equals ("green")) 
		{rob.setPenColor(0, 255, 0);}
		else  if (color.equals("red")) 
		{rob.setPenColor(255, 0 , 0);}
		else if(color.equals("blue")) 
		{rob.setPenColor(0 ,0 , 255);}
		else if (color.equals ("  "))
		{rob.setRandomPenColor();}
	
		   rob.move(100); 
	        rob.turn(60);
	        rob.move(100);
	        rob.turn(60);
	        rob.move(100);
	        rob.turn(60);
	        rob.move(100);
	        rob.turn(90);
	        rob.move(160);
		
		
		
		
		
		
		a+=1;
		}
        //6. If the user doesn't enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
	    

		



	}
}
