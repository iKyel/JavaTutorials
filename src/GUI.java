import javax.swing.JOptionPane; 
public class GUI {
	// GRAPHICAL USER INTERFACE
	// A visual program that we can see and interact with 
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));	
		JOptionPane.showMessageDialog(null, "You are "+age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
	}
}
