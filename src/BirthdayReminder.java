
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "July 11th";
		String dadsBirthday = "Augest 20th";
		String myBirthday = "November 28th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String ans = JOptionPane.showInputDialog("Whos birthday do you want to know?");
		// 3. Print out what the user typed

		// 4. if user asked for "mom"
		if (ans.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		} else if (ans.equals("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		} else if (ans.equals("me")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
		}
	}
}
// print mom's birthday
// 5. if user asked for "dad"
// print dad's birthday
// 6. if user asked for your name
// print myBirthday
// 7. otherwise print "Sorry, i don't remember that person's birthday!"
