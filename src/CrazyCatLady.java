import java.net.URI;

import javax.swing.JOptionPane;
 
public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
 String ans = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
 int num = Integer.parseInt(ans);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
 if (num > 3){
	 JOptionPane.showMessageDialog(null, "You are a crazy cat lady");
 }
		// 4. If they have 3 or less, call the method below to show them a cat video
 if (num <= 3&&num>0){
	 playVideo ("https://www.youtube.com/watch?v=hmw-w4PFms8");
 }
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
if (num == 0){
	playVideo ("https://www.youtube.com/watch?v=KCtSxQDN37w");
}
else{
System.out.println("You can't have negitive cats!!!");	
}
	}
 
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
}
 
