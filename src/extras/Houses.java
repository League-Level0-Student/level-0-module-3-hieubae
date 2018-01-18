package extras;

import org.jointheleague.graphical.robot.Robot;
public class Houses {
	public static void main(String[] args) {
		Robot bender = new Robot();
		bender.miniaturize();
		bender.setSpeed(1000);
		bender.moveTo(0, 350);
		bender.penDown();
	    bender.move(100);
	    bender.turn(90);
	    bender.move(50);
	    bender.turn(90);
	    bender.move(100);
	    bender.turn(-90);
	    bender.move(50);
	    bender.turn(-90);
	    for (int i = 0; i < 10; i++) {
	    	bender.move(100);
		    bender.turn(90);
		    bender.move(50);
		    bender.turn(90);
		    bender.move(100);
		    bender.turn(-90);
		    bender.move(100);
		    bender.turn(-90);
		}
	    
	//1. Create a robot.

	//2. Have a robot start on the left side of the window near the bottom.

	//3. Draw a flat-topped house of height 100 with grass after it (see picture).

	//4. Use a for loop to draw 10 houses like the one in step 3.

	//5. Change the code to make the height random (100-500) so step 4 now draws 10 houses of different heights.

	//6. Make each house draw in a random color.

	//7. Set the scene to night. (Hint: use Robot's setWindowColor() method).

	//8. Give houses peaked roofs if their height is less than 300. Taller houses keep flat roofs. 
}
}