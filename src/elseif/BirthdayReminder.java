
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "May 24th";
		String dadsBirthday = "Febuary 13th";
		String myBirthday = "June 18th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String bday = JOptionPane.showInputDialog(null, "Who's birthday do you want?");
		// 3. Print out what the user typed
		if(bday.equals("Hieu")) {
			 JOptionPane.showMessageDialog(null, "June 18th.");
		}
	
		// 4. if user asked for "mom"
			//print mom's birthday
		else if(bday.equals("Mom")) {
			JOptionPane.showMessageDialog(null, "May 24th.");
		}

		// 5. if user asked for "dad"
			// print dad's birthday
		else if(bday.equals("Dad")) {
		JOptionPane.showMessageDialog(null, "Febuary 13th.");
	}
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday.
	else {
		JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday.");	
	}
	}
	}


