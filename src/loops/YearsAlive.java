package loops;

import javax.swing.JOptionPane;

public class YearsAlive {
public static void main(String[] args) {
	
	String str = JOptionPane.showInputDialog(null, "How many years have you lived?");
	int years = Integer.parseInt(str);
	for (int i = years; i >= 0; i--) {
		
		System.out.println(i);
		
		

	}
	
}
}
