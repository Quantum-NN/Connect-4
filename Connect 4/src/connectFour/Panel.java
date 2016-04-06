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
	private JLabel winnerLabel1;
	private JLabel winnerLabel2;
	private JLabel instructions;
	private JButton singlePlayerBttn;
	private JButton twoPlayerBttn;
	private JButton instructionsButton;
	private JButton leaderboardsBttn;
	private JButton quitBttn;
	private JLabel gridd[][] = new JLabel[6][7];
	private Piece grid[][] = new Piece[6][7];
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private boolean win;
	int count = 0;
	ImageIcon yp;
	ImageIcon ep;
	ImageIcon rp;
	ImageIcon gp;

	public Panel() {

		try {
			setLayout(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.insets = new Insets(5, 5, 5, 5);
			setPreferredSize(new Dimension(950, 600));
			setBackground(Color.blue);

			ImageIcon intro = new ImageIcon(System.getProperty("user.dir") + "\\titlee.png");
			introLabel = new JLabel(intro);
			gbc.gridx = 0;
			gbc.gridy = 0;
			add(introLabel, gbc);
			
			ImageIcon instruction = new ImageIcon(System.getProperty("user.dir") + "\\instructions.png");
			instructions = new JLabel(instruction);
			gbc.gridx = 0;
			gbc.gridy = 2;
			add(instructions, gbc);
			instructions.setVisible(false);
			
			ImageIcon quit = new ImageIcon(System.getProperty("user.dir") + "\\quit.png");
			quitBttn = new JButton(quit);
			gbc.gridx = 0;
			gbc.gridy = 4;
			add(quitBttn, gbc);
			quitBttn.setVisible(false);
			quitBttn.addActionListener(new clickListener());
			
			ImageIcon winner1 = new ImageIcon(System.getProperty("user.dir") + "\\player1.png");
			winnerLabel1 = new JLabel (winner1);
			gbc.gridx = 0;
			gbc.gridy = 2;
			add(winnerLabel1, gbc);
			winnerLabel1.setVisible(false);
			
			ImageIcon winner2 = new ImageIcon(System.getProperty("user.dir") + "\\player2.png");
			winnerLabel2 = new JLabel (winner2);
			gbc.gridx = 0;
			gbc.gridy = 2;
			add(winnerLabel2, gbc);
			winnerLabel2.setVisible(false);
			

			ImageIcon singlePlayer = new ImageIcon(System.getProperty("user.dir") + "\\Single Player.png");
			singlePlayerBttn = new JButton(singlePlayer);
			gbc.gridx = 0;
			gbc.gridy = 1;
			add(singlePlayerBttn, gbc);
			singlePlayerBttn.addActionListener(new clickListener());

			ImageIcon twoPlayer = new ImageIcon(System.getProperty("user.dir") + "\\Two Player.png");
			twoPlayerBttn = new JButton(twoPlayer);
			gbc.gridx = 0;
			gbc.gridy = 2;
			add(twoPlayerBttn, gbc);
			twoPlayerBttn.addActionListener(new clickListener());

			ImageIcon instructions = new ImageIcon(System.getProperty("user.dir") + "\\Instructions Button.png");
			instructionsButton = new JButton(instructions);
			gbc.gridx = 0;
			gbc.gridy = 3;
			add(instructionsButton, gbc);
			instructionsButton.addActionListener(new clickListener());

			ImageIcon leaderboards = new ImageIcon(System.getProperty("user.dir") + "\\Leaderboards.png");
			leaderboardsBttn = new JButton(leaderboards);
			gbc.gridx = 0;
			gbc.gridy = 4;
			add(leaderboardsBttn, gbc);
			leaderboardsBttn.addActionListener(new clickListener());

			yp = new ImageIcon(System.getProperty("user.dir") + "\\yp.png");
			ep = new ImageIcon(System.getProperty("user.dir") + "\\ep.png");
			rp = new ImageIcon(System.getProperty("user.dir") + "\\rp.png");
			gp = new ImageIcon(System.getProperty("user.dir") + "\\gp.png");

			gbc.gridx = 1;
			gbc.gridy = 0;
			ImageIcon btna = new ImageIcon(System.getProperty("user.dir") + "\\arrow.png");
			btn1 = new JButton(btna);
			btn1.addActionListener(new clickListener());
			add(btn1, gbc);
			btn1.setVisible(false);
			gbc.gridx = 2;
			ImageIcon btnb = new ImageIcon(System.getProperty("user.dir") + "\\arrow.png");
			btn2 = new JButton(btnb);
			btn2.addActionListener(new clickListener());
			add(btn2, gbc);
			btn2.setVisible(false);
			gbc.gridx = 3;
			ImageIcon btnc = new ImageIcon(System.getProperty("user.dir") + "\\arrow.png");
			btn3 = new JButton(btnc);
			btn3.addActionListener(new clickListener());
			add(btn3, gbc);
			btn3.setVisible(false);
			gbc.gridx = 4;
			ImageIcon btnd = new ImageIcon(System.getProperty("user.dir") + "\\arrow.png");
			btn4 = new JButton(btnd);
			btn4.addActionListener(new clickListener());
			add(btn4, gbc);
			btn4.setVisible(false);
			gbc.gridx = 5;
			ImageIcon btne = new ImageIcon(System.getProperty("user.dir") + "\\arrow.png");
			btn5 = new JButton(btne);
			btn5.addActionListener(new clickListener());
			add(btn5, gbc);
			btn5.setVisible(false);
			gbc.gridx = 6;
			ImageIcon btnf = new ImageIcon(System.getProperty("user.dir") + "\\arrow.png");
			btn6 = new JButton(btnf);
			btn6.addActionListener(new clickListener());
			add(btn6, gbc);
			btn6.setVisible(false);
			gbc.gridx = 7;
			ImageIcon btng = new ImageIcon(System.getProperty("user.dir") + "\\arrow.png");
			btn7 = new JButton(btng);
			btn7.addActionListener(new clickListener());
			add(btn7, gbc);
			btn7.setVisible(false);

		} catch (Exception e) {
			e.getMessage();
		}
	}

	private class clickListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			GridBagConstraints gbc = new GridBagConstraints();
			gbc.insets = new Insets(5, 5, 5, 5);

			if (event.getSource() == instructionsButton){
				System.out.println("instructions clicked");
				instructions.setVisible(true);
				introLabel.setVisible(false);
				singlePlayerBttn.setVisible(false);
				twoPlayerBttn.setVisible(false);
				instructionsButton.setVisible(false);
				leaderboardsBttn.setVisible(false);
			}
			if (event.getSource() == twoPlayerBttn) {
				instateGrid(grid);
				System.out.println("two player clicked");
				instructions.setVisible(false);
				introLabel.setVisible(false);
				singlePlayerBttn.setVisible(false);
				twoPlayerBttn.setVisible(false);
				instructionsButton.setVisible(false);
				leaderboardsBttn.setVisible(false);

				btn1.setVisible(true);
				btn2.setVisible(true);
				btn3.setVisible(true);
				btn4.setVisible(true);
				btn5.setVisible(true);
				btn6.setVisible(true);
				btn7.setVisible(true);

				setBackground(Color.red);
				// showBtns(gbc, btns);
				showLabels(gbc, gridd);
			}
			if (event.getSource() == btn1) {
				count += 1;
				setPieces(0, count % 2, gridd);
				updateLabels(gbc);
			}
			if (event.getSource() == btn2) {
				count += 1;
				setPieces(1, count % 2, gridd);
				updateLabels(gbc);
			}
			if (event.getSource() == btn3) {
				count += 1;
				setPieces(2, count % 2, gridd);
				updateLabels(gbc);
			}
			if (event.getSource() == btn4) {
				count += 1;
				setPieces(3, count % 2, gridd);
				updateLabels(gbc);
			}
			if (event.getSource() == btn5) {
				count += 1;
				setPieces(4, count % 2, gridd);
				updateLabels(gbc);
			}
			if (event.getSource() == btn6) {
				count += 1;
				setPieces(5, count % 2, gridd);
				updateLabels(gbc);
			}
			if (event.getSource() == btn7) {
				count += 1;
				setPieces(6, count % 2, gridd);
				updateLabels(gbc);
			}
			if (event.getSource() == quitBttn){
				System.exit(0);
			}
			
		//	System.out.print(count);
			
			setBackground(Color.black);

		}
	}

	private void instateGrid(Piece[][] grid) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				grid[i][j] = new Piece();
			}
		}
	}


	private JLabel[][] createLabels() {
		JLabel[][] labels = new JLabel[6][7];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
			labels[i][j] = new JLabel(ep);
				
			}
		}
		return labels;
	}

	private void showLabels(GridBagConstraints gbc, JLabel[][] labels) {

		labels = createLabels();
		gridd = labels;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				gbc.gridx = j + 1;
				gbc.gridy = i + 1;
				add(labels[i][j], gbc);
			}
		}
	}

	private void updateLabels(GridBagConstraints gbc) {
		for (int i = 0; i < 6; i++) {// 6 and 7 as it goes up to 6 and 7, they
										// are not included
			for (int j = 0; j < 7; j++) {
				if (grid[i][j].getPlayer() == 1) {
					gridd[i][j].setIcon(yp);
				} else if (grid[i][j].getPlayer() == 0) {
					gridd[i][j].setIcon(rp);
				} else if (grid[i][j].getPlayer() == 3) {
					gridd[i][j].setIcon(ep);
				} else {
					gridd[i][j].setIcon(gp);
				}
				gbc.gridx = j + 1;
				gbc.gridy = i + 1;
				add(gridd[i][j], gbc);
			}
		}
	}

	private void setPieces(int colm, int turnNum, JLabel[][] labels) {
		for (int i = 5; i >= 0; i--) {
			if (!grid[i][colm].getOStat()) {
				grid[i][colm].setOStat(true);
				if (colm == 0 || colm == 6 || i == 5) {
					grid[i][colm].setPlayer(turnNum);
					if (i != 5) {
						if (grid[i][colm].getPlayer() == grid[i + 1][colm].getPlayer()) {
							grid[i][colm].setvN(1 + grid[i + 1][colm].getvN());
						} else {
							grid[i][colm].setvN(1);
						}
					} else {
						grid[i][colm].setvN(1);
					}
					win = winH()||winV()||winD1()||winD2();//NILU, THIS IS THE SPOT WHERE YOU GET THE TRUE OR FALSE VALUES.
					if (win == true){
						System.out.println(win);  // TAKE THE VALUES AND TELL THE USER THEY WON 
						// WHICH USER?, THE turnNum VARIABLE IN THIS METHOD CORESPONDS TO THE USER (1 OR 2)
						btn1.setVisible(false);
						btn2.setVisible(false);
						btn3.setVisible(false);
						btn4.setVisible(false);
						btn5.setVisible(false);
						btn6.setVisible(false);
						btn7.setVisible(false);
						
						if (turnNum == 1){
							winnerLabel1.setVisible(true);
							quitBttn.setVisible(true);
						}
						if (turnNum == 2){
							winnerLabel2.setVisible(true);
							quitBttn.setVisible(true);
						}
						
					}
					

				} else {
					grid[i][colm].setPlayer(turnNum);
					if (grid[i][colm].getPlayer() == grid[i + 1][colm].getPlayer()) {
						grid[i][colm].setvN(1 + grid[i + 1][colm].getvN());
					} else {
						grid[i][colm].setvN(1);
					}
					win = winH()||winV()||winD1()||winD2();
					System.out.println(win);
				}
				break;
			}

		}

	}

	private void updateHoriz() {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 7; j++) {
				if (grid[i][j].getPlayer() == 1){
					grid[i][j].sethN(-1);
				}
				else if (grid[i][j].getPlayer() == 0){
					grid[i][j].sethN(1);
				}
				else {
					grid[i][j].sethN(0);
				}
			}
		}
	}
	
	private void updateDiag1(){
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 7; j++) {
				if (grid[i][j].getPlayer() == 1){
					grid[i][j].setdN1(-1);
				}
				else if (grid[i][j].getPlayer() == 0){
					grid[i][j].setdN1(1);
				}
				else {
					grid[i][j].setdN1(0);
				}
			}
		}
	}
	
	private void updateDiag2(){
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 7; j++) {
				if (grid[i][j].getPlayer() == 1){
					grid[i][j].setdN2(-1);
				}
				else if (grid[i][j].getPlayer() == 0){
					grid[i][j].setdN2(1);
				}
				else {
					grid[i][j].setdN2(0);
				}
			}
		}
	}

	private boolean winH() {
		updateHoriz();
		int horizTot = 0;
		int horiz = 0;
		for (int i = 5; i >= 0; i--) {
			//horizTot = 0;
			for (int j = 0; j < 7; j++) {
				if (grid[i][j].getPlayer() == 0){
					horizTot += grid[i][j].gethN();
					horiz = 0;
				}
				else if (grid[i][j].getPlayer() == 1){
					horiz += grid[i][j].gethN();
					horizTot = 0;
				}
				if ((Math.abs(horizTot)) > 3|| (Math.abs(horiz) >3)){
					return true;
				}
			}
			
		}
		return false;
	}
	
	private boolean winD1(){
		updateDiag1();
		int dTot = 0;
		int d = 0;
		int k = 0;
		for (int i = 5; i >= 0; i--) {
			k = i+1;
			for (int j = 0; j < 7; j++) {
				k-=1;
				if (grid[k][j].getPlayer() == 0){
					dTot += grid[k][j].getdN1();
					d = 0;
				}
				else if (grid[k][j].getPlayer() == 1){
					d += grid[k][j].getdN1();
					dTot = 0;
				}
				if ((Math.abs(dTot)) > 3|| (Math.abs(d) >3)){
					return true;
				}
				if (k==0){
					j =7;
				}
			}
			
		}
		dTot = 0;
		d = 0;
		k = 0;
		for (int i = 0; i < 6; i++) {
			k = i;
			for (int j = 6; j >=0; j--) {
				
				if (grid[k][j].getPlayer() == 0){
					dTot += grid[k][j].getdN1();
					d = 0;
				}
				else if (grid[k][j].getPlayer() == 1){
					d += grid[k][j].getdN1();
					dTot = 0;
				}
				if ((Math.abs(dTot)) > 3|| (Math.abs(d) >3)){
					return true;
				}
				if (k==5){
					j =-1;
				}
				k+=1;
			}
			
		}
		return false;
	}
	
	private boolean winD2(){
		updateDiag2();
		int dTot = 0;
		int d = 0;
		int k = 0;
		for (int i = 5; i >= 0; i--) {
			k = i+1;
			for (int j = 6; j >=0; j--) {
				k-=1;
				if (grid[k][j].getPlayer() == 0){
					dTot += grid[k][j].getdN2();
					d = 0;
				}
				else if (grid[k][j].getPlayer() == 1){
					d += grid[k][j].getdN2();
					dTot = 0;
				}
				if ((Math.abs(dTot)) > 3|| (Math.abs(d) >3)){
					return true;
				}
				if (k==0){
					j =-1;
				}
			}
			
		}
		dTot = 0;
		d = 0;
		k = 0;
		for (int i = 0; i < 6; i++) {
			k = i;
			for (int j = 0; j <7; j++) {
				
				if (grid[k][j].getPlayer() == 0){
					dTot += grid[k][j].getdN2();
					d = 0;
				}
				else if (grid[k][j].getPlayer() == 1){
					d += grid[k][j].getdN2();
					dTot = 0;
				}
				if ((Math.abs(dTot)) > 3|| (Math.abs(d) >3)){
					return true;
				}
				if (k==5){
					j =7;
				}
				k+=1;
			}
			
		}
		return false;
	}
	
	private boolean winV(){
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 7; j++) {
				if (grid[i][j].getvN() >3){
					return true;
				}
			}
			
		}
		return false;
	}

}
