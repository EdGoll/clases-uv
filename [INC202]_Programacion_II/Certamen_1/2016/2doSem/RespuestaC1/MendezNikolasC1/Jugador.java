

import java.util.Random;

public class Jugador {
	
	private int id;
	private int br;
	private int bg;
	private int gc;
	private int tipo; // 1=portero(1) 2=defensa(3) 3=laterales(2) 4=centro(2) 5=delantero(3)
	private double nivel_aux;
	private int nivel_j;
	private Random rd;
	
	
	
	public Jugador(){
		
		tipo_j();
		
		dar_habilidad();
		
		
		
	}
	public void dar_habilidad(){
		rd = new Random();
		
		id = rd.nextInt(10)+1;//le doy el num de camiseta
		//System.out.println("NUMERO DE CAMISETA: "+id);
		br = rd.nextInt(99)+1;//le doy habilidad de recuperar balon
		//System.out.println("BR: "+br);
		bg = rd.nextInt(99)+1;//le doy habilidad de entregar balon
		//System.out.println("BG: "+bg);
		if(tipo != 1){
		gc = rd.nextInt(99)+1;	//si no es portero le doy habildiad goleadora
		//System.out.println("GC: "+gc);
		}else {
			gc = 0; //si lo es gc vale 0
			//System.out.println("GC: "+gc);
		}
		
		nivel_aux = Math.rint(br*0.2 + bg*0.35 + gc*0.45); //calculo el nivel de juego
		nivel_j = (int)nivel_aux;
		//System.out.println("NIVEL J: "+nivel_j);
	}
	
	public void tipo_j(){
		
		rd = new Random();
		tipo = rd.nextInt(5)+1;
		//System.out.println("soy de tipo: "+tipo);
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBr() {
		return br;
	}
	public void setBr(int br) {
		this.br = br;
	}
	public int getBg() {
		return bg;
	}
	public void setBg(int bg) {
		this.bg = bg;
	}
	public int getGc() {
		return gc;
	}
	public void setGc(int gc) {
		this.gc = gc;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getNivel_j() {
		return nivel_j;
	}
	public void setNivel_j(int nivel_j) {
		this.nivel_j = nivel_j;
	}
	
}
