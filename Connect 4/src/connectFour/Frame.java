package connectFour;

import javax.swing.JFrame;


public class Frame{

	/**
	 * Creates the frame of the game
	 * @param args
	 */
	public static void main(String[] args) {
			
			JFrame frame = new JFrame ("Quantum Connect 4");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(new Panel());
			frame.pack();
			frame.setResizable(false);
			frame.setVisible(true);
		}

	}