import javax.swing.JOptionPane;


public class ViewLogin {
	public static void main (String [] args){


		String name = JOptionPane.showInputDialog("Inform your name: ");
		JOptionPane.showMessageDialog(null, "Hello " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("inform your age: "));
		JOptionPane.showMessageDialog(null, "You are"+age +"years old");

		double height = Double.parseDouble(JOptionPane.showInputDialog("Inform your height: "));
		JOptionPane.showMessageDialog(null, "You are "+ height +" cm tall");

	}
}