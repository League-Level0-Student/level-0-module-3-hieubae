package loops;

import javax.swing.JOptionPane;

public class AgeGame {
public static void main(String[] args) {
String num = JOptionPane.showInputDialog(null, "How old are you?");
	int age = Integer.parseInt(num);
	if (age > 30) {
		JOptionPane.showMessageDialog(null, "Sorry, you're too old to play this game.");
	}
	else {
		JOptionPane.showMessageDialog(null, "You are born in " + (2017 - age) + ".");
		
		
	}
	
	
}
}
