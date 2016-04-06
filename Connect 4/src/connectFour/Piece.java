package connectFour;


public class Piece {

	
	private int vN; // vartical total
	private int hN; // horizontal side total	
	private int dN1; // diagonal 1 total
	private int dN2; // diagonal 2 total
	private int player; // color of the piece
	private boolean oStat; // occupied status
	
	public Piece(){
		vN = 0;
		hN = 0;
		dN1 = 0;
		dN2 = 0;
		player = 3;
	}
	
	public void setPlayer(int a){
		player = a;
	}
	public int getPlayer(){
		return player;
	}
	
	public void setOStat(boolean a){
		oStat = a;
	}
	public boolean getOStat(){
		return oStat;
	}
	
	public void setvN(int a){
		vN = a;
	}
	public int getvN(){
		return vN;
	}
	
	public void sethN(int a){
		hN = a;
	}
	public int gethN(){
		return hN;
	}
	
	public void setdN1(int a){
		dN1 = a;
	}
	public int getdN1(){
		return dN1;
	}
	
	public void setdN2(int a){
		dN2 = a;
	}
	public int getdN2(){
		return dN2;
	}
}
