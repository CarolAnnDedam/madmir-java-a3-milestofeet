import java.util.Scanner;
import javax.swing.JOptionPane;


public class MilesToFeetInteractive {
	
	public static void main(String[] args) {
		//* Declare and initialize named constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		
		//*Declare and initialize named variables  and initialize Scanner
		
		float  uncleMiles, uncleFeet;
		Scanner kbrd = new Scanner (System.in);	
		
		//User Input
		System.out.println ("Please enter the distance in miles. "
		 + "to your uncles house:");
		uncleMiles = kbrd.nextFloat();
		
		//Convert miles to feet
		uncleFeet = uncleMiles * FEET_PER_MILE;
		
		//Display  output
		JOptionPane.showMessageDialog(null,  "The distance between your house and your uncles house is, " + uncleFeet + "!");
		
	}

}
