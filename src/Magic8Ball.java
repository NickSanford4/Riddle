// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int rand = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(rand);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Ask the magic 8 ball a question");
	// 5. If the random number is 0
if (rand  == 0) {
	JOptionPane.showMessageDialog(null, "I can't hear you");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if (rand  == 1) {
	JOptionPane.showMessageDialog(null, "I don't know I am just a toy");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (rand  == 2) {
	JOptionPane.showMessageDialog(null, "Blah Blah Blah");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (rand  == 3) {
	JOptionPane.showMessageDialog(null, "I don't care go away");
}
	// -- write your own answer

}
}

