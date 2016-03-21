package connectFour;

import javax.swing.*;

public class Frame {

	public static void main(String[] args) {
			
			JFrame frame = new JFrame ("Quantum Connect 4");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//frame.getContentPane().add(new Panel());
			frame.pack();
			frame.setResizable(true);
			frame.setVisible(true);
		}

	}

