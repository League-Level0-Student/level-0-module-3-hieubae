package loops;

public class BottlesOfBeer {
public static void main(String[] args) {

	int bottles = 99;
	
	for (int i = bottles; i > 0; i--) {
		
		System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down pass it around, " + i + " bottles of beer on the wall.");
		
	}
	System.out.println("No more bottles of beer on the wall, no more bottles of beer. \r\n" + 
			"Go to the store and buy some more, 99 bottles of beer on the wall.");
	
}
}
