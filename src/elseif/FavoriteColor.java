package elseif;

import javax.swing.JOptionPane;

public class FavoriteColor {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog(null, "What's your favorite color?");
	JOptionPane.showMessageDialog(null, "My favorite color is " + color + " too.");
}
}
