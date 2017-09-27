import java.util.Random;
import java.lang.Math;

public class Jugador{
	private int id;
	private int BR;
	private int BG;
	private int GC;
	private String tipo;
	private int nivelIndividial;
	
	public Jugador(){
	}
	
	//Constructor, que recive el identifucado dado en la creacion de este en la clase Equipo.
	//Tambien se le asignan de inmediato todos sus atributos.
	public Jugador(int id){
		this.id=id+1;
		BR=genNumRandom();
		BG=genNumRandom();
		if(id!=0)
			GC=genNumRandom();
		else
			GC=0;
		tipo=defTipo();
		nivelIndividial=defNivelIndividual();
	}
	//El tipo de jugador se define mediante el idenificador.
	private String defTipo(){
		if(id==1)
			return "portero";
		else if(id==2||id==3||id==4)
			return "defensas";
		else if(id==5||id==6)
			return "laterales";
		else if(id==7||id==8)
			return "centro campistas";
		else
			return "delanteros";
	}
	//Generador de numeros aleatorios.
	private int genNumRandom(){
		Random r= new Random();
		return r.nextInt(100)+1;
	}
	//Calculo de nivel de individualidad
	private int defNivelIndividual(){
		int nivInd=(int) Math.round(BR*0.2+BG*0.35+GC*0.45);
		return nivInd;
	}
	//Metodos set y get para los atrivutos.
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setBR(int BR){
		this.BR=BR;
	}
	public int getBR(){
		return BR;
	}
	public void setBG(int BG){
		this.BG=BG;
	}
	public int getBG(){
		return BG;
	}
	public void setGC(int GC){
		this.GC=GC;
	}
	public int getGC(){
		return GC;
	}
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public String getTipo(){
		return tipo;
	}
	public void setNivelIndividual(int nivelIndividual){
		this.nivelIndividial=nivelIndividial;
	}
	public int getNivelIndividual(){
		return nivelIndividial;
	}
}
