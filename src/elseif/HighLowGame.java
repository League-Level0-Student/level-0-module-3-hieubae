//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(1000001);
		// 2. Print out the random variable above
		// 11. do the following 10 times

		for (int i = 0; i < 22; i++) {
			
	
			// 1. ask the user for a guess using a pop-up window, and save their response 
		String guess = JOptionPane.showInputDialog(null, "Guess");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int guess2 = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (guess2 == random) {
				JOptionPane.showMessageDialog(null, "You Win!");
			}
				// 6. win
			// 7. if the guess is high
			if (guess2 > random) {
				JOptionPane.showMessageDialog(null, "Your guess is too high! You lose!");
			}
				// 8. tell them it's too high
			if (guess2 < random) {
				JOptionPane.showMessageDialog(null, "Your guess is too low! You lose!");
			}
			// 9. if the guess is low
			
				// 10. tell them it's too low

			}// 12. tell them they lose
			
	}

}


