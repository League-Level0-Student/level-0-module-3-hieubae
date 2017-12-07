//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String ans = JOptionPane.showInputDialog(null, "Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (ans .equals("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy foo.");
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		
		//	show a pop up that says "<your hobby> is much better with bananas!"
		if (ans .equals("yes")) {
			String hobby = JOptionPane.showInputDialog(null, "What's your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " sucks bro. It's all about the bananas.");
		}
		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are bananas!â€�
		else {
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}
	
	}

}
