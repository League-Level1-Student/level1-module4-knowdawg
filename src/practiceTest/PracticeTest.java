package practiceTest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PracticeTest implements ActionListener{

	JFrame frame = new JFrame("Riddle");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("What is the best pet you could ever have?");
	JTextField field = new JTextField(10);
	JButton button1 = new JButton("Submit");
	JButton button2 = new JButton("Hint");
	
	public static void main(String[] args) {
		
		PracticeTest test = new PracticeTest();
		test.setUp();
		
		
	}
	
	void setUp() {
		
		frame.add(panel);
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(field);
		
		frame.setVisible(true);
		frame.pack();
		
		button2.addActionListener(this);
		button1.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button2) {
			
			JOptionPane.showMessageDialog(null, "ITS A DOG");
			
		} else {
			
			if (field.getText() .equals("dog") ) {
				
				JOptionPane.showMessageDialog(null, "THATS RIGHT!");
				
			} else {
				
				JOptionPane.showMessageDialog(null, "THATS WRONG!");
				
			}
			
		}
		
	}
	
	
}
