import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "I am 12 years old");
		for (int i = 1; i <= 12; i++) {
			;
			JOptionPane.showMessageDialog(null, i);

		}
		String ans = JOptionPane.showInputDialog(null, "How old are you?");
		int age = Integer.parseInt(ans);
		for (int i = 1; i <= age; i++) {
			JOptionPane.showMessageDialog(null, i);
		}
	}
}
