 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class photoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String Url1 = "https://media1.britannica"
		+ ".com/eb-media/55/174255-004-9A4971E9.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component a = createImage(Url1);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
String Url2 = "http://www.noneedtowander.com/wp-content/upl"
		+ "oads/2017/04/meest-random-website-ooit-tostis-zijn-net-mensen-image-1.png";
Component b = createImage(Url2);
quizWindow.add(b);
quizWindow.add(a);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ans = JOptionPane.showInputDialog("How many cows are in this photo?");
		// 7. print "CORRECT" if the user gave the right answer
if (ans.equals("2")){
	JOptionPane.showMessageDialog(null, "CORRECT!!!");
	
}
		// 8. print "INCORRECT" if the answer is wrong
else{
	JOptionPane.showMessageDialog(null, "INCORRECT!!!");
	// 9. remove the component from the quiz window (you may not see the effect
		// of this until step 12)
	quizWindow.remove(a);
}
	
	
	// 10. find another image and create it (might take more than one line of
	// code)

	
	// 11. add the second image to the quiz window


	// 12. pack the quiz window
quizWindow.pack();
b.setSize(500,500);
	// 13. ask another question
String Ans2 =JOptionPane.showInputDialog("What is the president of ukranes first name?");
	// 14+ check answer, say if correct or incorrect, etc.
if(Ans2.equals("Petro")){
	JOptionPane.showMessageDialog(null, "CORRECT!!!");
}
else if(Ans2.equals("petro")){
	JOptionPane.showMessageDialog(null, "CORRECT!!!");
}
else{
	JOptionPane.showMessageDialog(null, "INCORRECT!!!");
}
	}
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





