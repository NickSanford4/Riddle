import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(1000000) + 1;
		// 2. Print out the random variable above
		//System.out.println(random);
		int num = 0;
		// 11. do the following 10 times
		for (int i = 0; i < 21; i++) {

			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String ans = JOptionPane.showInputDialog("Guess a number between 1 and 100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			num = Integer.parseInt(ans);
			// 5. if the guess is correct
			// 6. win
			if (num == random) {
				JOptionPane.showMessageDialog(null, "YOU WON THE LOTTERY");
				break;
			}
			// 7. if the guess is high
			// 8. tell them it's too high
			if (num > random) {
				JOptionPane.showMessageDialog(null, "Your guess is too high");
			}
			// 9. if the guess is low
			// 10. tell them it's too low
			if (num < random) {
				JOptionPane.showMessageDialog(null, "Your guess is too low");
			}
		}
		// 12. tell them they lose
		if (num != random) {
			JOptionPane.showMessageDialog(null, "YOU LOST!!!");
			System.out.println("the number was "+random);
		}
	}

}
