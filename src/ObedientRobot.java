import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot bender = new Robot();
public static void main(String[] args) {
	//1. Make a new class, create a main method, and show the robot.
	//2. Have the robot draw a square.
	String shape = JOptionPane.showInputDialog(null, "What shape do you want?");
	String color = JOptionPane.showInputDialog(null, "What color do you want the shape to be?");
	if (color.equals("red")) {
		bender.setPenColor(255, 0, 0);
	}
	if (color.equals("blue")) {
		bender.setPenColor(0, 0, 255);
	}
	if (color.equals("green")) {
		bender.setPenColor(0, 255, 0);
	}
		
	if (shape.equals("square")) {
		drawSquare();
	}
	if (shape.equals("triangle")) {
		drawTriangle();
	}
	if (shape.equals("circle")) {
		drawCircle();
	}
}
//	3. Extract this code into a drawSquare() method.
static void drawSquare() {
	bender.setSpeed(100);
	bender.penDown();
	bender.move(100);
	bender.turn(90);
	bender.move(100);
	bender.turn(90);
	bender.move(100);
	bender.turn(90);
	bender.move(100);
	bender.turn(90);
	
}
	//4. Have the robot draw a triangle.
	//5. Extract this code into a drawTriangle() method.
static void drawTriangle() {
	bender.setSpeed(100);
	bender.penDown();
	bender.turn(45);
	bender.move(200);
	bender.turn(90);
	bender.move(200);
	bender.turn(135);
	bender.move(250);
}
	//6. Have the robot draw a circle.
	//7. Extract this code into a drawCircle() method.
static void drawCircle() {
	
	bender.penDown();
for (int i = 0; i < 360; i++) {
	bender.setSpeed(10000);
	bender.move(5);
	bender.turn(360/360);
}
}
	//8. Ask the user which shape they want. Draw the appropriate shape depending on their answer.

//	9. Ask the user which color they want. Color the the shape depending on their answer.
	
	
}
	
	
	
	

	
	
	

