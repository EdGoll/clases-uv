import java.util.Random;

public class Partido{
	private int pierde;
	private int gana;
	private int empata;
	private int jugador1;
	private int jugador2;

	public void setPierde(int pier){
		this.pierde = pier;
	}

	public int getPierde(){
		return pierde;
	}
	public void setGana(int gan){
		this.gana = gan;
	}

	public int getGana(){
		return gana;
	}
	public void setEmpata(int emp){
		this.empata = emp;
	}

	public int getEmpata(){
		return empata;
	}
	public void setJugador1(int j1){
		this.jugador1 = j1;
	}

	public int getJugador1(){
		return jugador1;
	}
	public void setJugador2(int j2){
		this.jugador2 = j2;
	}

	public int getJugador2(){
		return jugador2;
	}


}