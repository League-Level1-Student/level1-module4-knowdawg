import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SensativeKeyboard implements KeyListener{

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Press a key!");
	
	public static void main(String[] args) {
		
		SensativeKeyboard key = new SensativeKeyboard();
		key.setup();
		
	}
	
	void setup() {
		
		//SensativeKeyboard key = new SensativeKeyboard();
		
		frame.add(label);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println("ouch");
		speak("ouch");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	static void speak(String words) {
		
		try {
			
			Runtime.getRuntime().exec("say " + words).waitFor();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			
			
		}
		
	}
	
}
