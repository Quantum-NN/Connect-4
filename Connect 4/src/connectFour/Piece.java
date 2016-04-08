package connectFour;

/**
 * the piece class, for the object piece. 
 * @author Aum, Nilukshan
 *
 */
public class Piece {

	
	private int vN; // Vertical total
	private int hN; // horizontal side total	
	private int dN1; // diagonal 1 total
	private int dN2; // diagonal 2 total
	private int player; // color of the piece
	private boolean oStat; // occupied status
	
	/**
	 * the piece constructor, which gives the basic values to the instance variables.
	 * they are fixed values and do not need to be brought in as an argument.
	 */
	public Piece(){
		vN = 0;
		hN = 0;
		dN1 = 0;
		dN2 = 0;
		player = 3;
	}
	
	/**
	 * The set player method sets the player number as 0 or 1, to identify the color of the piece
	 * @param a
	 */
	public void setPlayer(int a){
		player = a;
	}
	
	/**
	 * this method is a accessor method to get the value of the instance variable player.
	 * @return
	 */
	public int getPlayer(){
		return player;
	}
	
	/**
	 * this method is a mutator method to set the value of the instance variable oStat.
	 * oStat stands for occupied status.
	 * @param a
	 */
	public void setOStat(boolean a){
		oStat = a;
	}
	/**
	 * an accessor method to get the value of the instance varaible oStat.
	 * @return
	 */
	public boolean getOStat(){
		return oStat;
	}
	
	/**
	 * this is a mutator method to set the value of the instance variable vN.
	 * vN stands for vertical number.
	 * @param a
	 */
	public void setvN(int a){
		vN = a;
	}
	
	/**
	 * This is an accessor method to get the value of the instance varaible vN.
	 * @return
	 */
	public int getvN(){
		return vN;
	}
	
	/**
	 * this is a mutator method to set the value of the instance variable hN.
	 * hN stands for horizontal number.
	 * @param a
	 */
	public void sethN(int a){
		hN = a;
	}
	
	/**
	 * This is an accessor method to get the value of the instance varaible hN.
	 * @return
	 */
	public int gethN(){
		return hN;
	}
	
	/**
	 * this is a mutator method to set the value of the instance variable dN1
	 * dN1 stands for diagonal number 1
	 * @param a
	 */
	public void setdN1(int a){
		dN1 = a;
	}
	
	/**
	 * This is an accessor method to get the value of the instance varaible dN1.
	 * @return
	 */
	public int getdN1(){
		return dN1;
	}
	
	/**
	 * this is a mutator method to set the value of the instance variable dN2
	 * dN2 stands for diagonal number 2
	 * @param a
	 */
	public void setdN2(int a){
		dN2 = a;
	}
	
	/**
	 * This is an accessor method to get the value of the instance varaible dN2.
	 * @return
	 */
	public int getdN2(){
		return dN2;
	}
}
