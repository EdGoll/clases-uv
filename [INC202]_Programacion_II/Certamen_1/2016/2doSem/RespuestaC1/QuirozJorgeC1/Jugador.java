import java.util.Random;

public class Jugador{
	public int ID;
	public int BR;
	public int BG;
	public int GC;
	public int niveljuego;
	public String tipo;

	//constructor
	public Jugador(){
		setBR();
		setBG();
		setGC();
	}

	public void setID(int i){
		this.ID = i;
	}
	
	public void setBR(){
		Random rand = new Random();
		BR=rand.nextInt(101);
	}

	public void setBG(){
		Random rand = new Random();
		BG=rand.nextInt(101);
	}

	public void setGC(){
		if (tipo== "Portero"){
			GC=0;}
		else{
		Random rand = new Random();
		GC=rand.nextInt(101);}
	}

	public int getNivelJuego(){
		niveljuego=(int)Math.round((BR*0.2)+(BG*0.35)+(GC*0.45));
		return niveljuego;
	}

	public void setTipo(String type){
		this.tipo=type;
	}
}