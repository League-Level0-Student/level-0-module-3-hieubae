import java.util.Random;

import javax.swing.JOptionPane;

public class DragonSlayer {
public static void main(String[] args) {
	int dragonLife = 1000;
	String ans = JOptionPane.showInputDialog(null, "Fight the dragon! Punch, Kick, or Use Sword.");
	
	Random gen = new Random();
	int damage = gen.nextInt(5);
	gen.nextInt(500);
	
	if (ans.equals("Punch")) {
		damage = gen.nextInt(100);
		JOptionPane.showMessageDialog(null, damage + " health left. You died!");
	}
	
	if (ans.equals("Kick")) {
		damage = gen.nextInt(1000);
		JOptionPane.showMessageDialog(null, damage + " health left. You died!");
	}
	
	if (ans.equals("Use Sword")) {
		damage = gen.nextInt(1);
		JOptionPane.showMessageDialog(null, damage + " health left. YOU WON!");
	}
	dragonLife = dragonLife - damage;
	

}
}
	