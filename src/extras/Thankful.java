package extras;

import javax.swing.JOptionPane;

public class Thankful {
public static void main(String[] args) {
	
	String ans = JOptionPane.showInputDialog(null, "What's 1 things that you are thankful for?");
	String ans1 = JOptionPane.showInputDialog(null, "What's another thing that you're thankful for?");
	String ans2 = JOptionPane.showInputDialog(null, "What's another thing that you're thankful for?");
	JOptionPane.showMessageDialog(null, "Remember to be thankful for:\n " + ans + "\n" + ans1 + "\n" + ans2);
	
	
	
}
}
