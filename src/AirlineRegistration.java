
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter and print
 * their boarding pass. You need to collect the following information: First name Last name Destination airport Birthday
 * (for security purposes) Male/female (for security purposes)
 * 
 * Print the boarding pass in this format: LAST NAME / FIRST NAME (BIRTHDAY, M/F) Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/

public class AirlineRegistration {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("First Name");
		String b = JOptionPane.showInputDialog("Last Name");
		String c = JOptionPane.showInputDialog("Destination airport");
		String d = JOptionPane.showInputDialog("Birthday (for security purposes)");
		String e = JOptionPane.showInputDialog("Male/female (for security purposes)");
		System.out.println(b + "/" + a + "(" + d + "," + e + ")" + "Traveling to:" + c);
	}
}

/**
 * Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number
 * of passengers after each boarding pass.
 */
