
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;


public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. make the robot draw a shape (this will take more than one line of code)
		Robot bender = new Robot();
		bender.penDown();
		bender.setSpeed(2000);
		
		//2. set the pen width to 10
		bender.setPenWidth(10);
		//3. ask the user what color they would like the robot to draw
		//4. use an if/else statement to set the pen color that the user requested
		for (int i = 0; i < 500; i++) {
		String color = JOptionPane.showInputDialog("What color do you want?");
		if (color.equals("Red")) {
			bender.setPenColor(249, 0, 0);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
		}
		else if (color.equals("Purple")) {
			bender.setPenColor(191, 0, 249);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
		}
		else if (color.equals("Orange")) {
			bender.setPenColor(255, 110, 0);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
		}
		
		
		//5. if the user doesn’t enter anything, choose a random color
		if (color.equals("")) {
			bender.setRandomPenColor();
			bender.move(100);
			bender.turn(90);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
			bender.turn(90);
			bender.move(100);
		}
		//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
			if (color.equals("Blue")) {
				bender.setPenColor(0, 255, 255);
				bender.move(100);
				bender.turn(90);
				bender.move(100);
				bender.turn(90);
				bender.move(100);
				bender.turn(90);
				bender.move(100);
			}
		}
	}
}
