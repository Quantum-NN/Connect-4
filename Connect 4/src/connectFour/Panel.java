package connectFour;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Panel extends JPanel {
	
	private JLabel introLabel;
	private JButton instructionsButton;
	private JButton singlePlayerBttn;
	private JButton twoPlayerBttn;
	private JButton leaderboardsBttn;
	
	public Panel(){
	String name = "";	
	JButton[][] buttons = new JButton [6][7];
	setLayout (new GridBagLayout());
	GridBagConstraints gbc = new GridBagConstraints();
	gbc.insets = new Insets (5,5,5,5);
	setPreferredSize(new Dimension (640, 360));
	
	
	
	ImageIcon instructions = new ImageIcon (System.getProperty("user.dir") + "\\Instructions Button.png");
	JButton instructionsButton = new JButton (instructions);
	add(instructionsButton, gbc);
	instructionsButton.addActionListener(new ButtonListener());
	
	
	ImageIcon singlePlayer = new ImageIcon (System.getProperty("user.dir") + "\\Single Player.png");
	JButton singlePlayerBttn = new JButton (singlePlayer);
	gbc.gridx = 0;
	gbc.gridy = 1;
	add(singlePlayerBttn, gbc);
	
	ImageIcon twoPlayer = new ImageIcon (System.getProperty("user.dir") + "\\Two Player.png");
	JButton twoPlayerBttn = new JButton (twoPlayer);
	gbc.gridx = 0;
	gbc.gridy = 2;
	add(twoPlayerBttn, gbc);
	
	ImageIcon leaderboards = new ImageIcon (System.getProperty("user.dir") + "\\Leaderboards.png");
	JButton leaderboardsBttn = new JButton (leaderboards);
	gbc.gridx = 0;
	gbc.gridy = 3;
	add(leaderboardsBttn, gbc);	
	
	ImageIcon intro = new ImageIcon (System.getProperty("user.dir") + "\\titlee.png");
	JLabel introLabel = new JLabel(intro);
	gbc.gridx = 0;
	gbc.gridy = 0;
	add(introLabel, gbc);
	
	}
	
	private class ButtonListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
		
		}
	}
	
	
	
	
	
}