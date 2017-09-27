

import java.util.ArrayList;
import java.util.Random;

public class Equipo {

	private int id;
	private double nivel_aux=0;
	private int nivel_e;
	private Random rd;
	private ArrayList<Jugador> j = new ArrayList<Jugador>();
	 
	
	public Equipo(){
		dar_id();
		llenado();
		nivel();
		//mostrar();
		
		
	}
	public void dar_id(){
		rd = new Random();
		id = rd.nextInt(100)+1;
	}
	
	public void llenado(){
		int p=0,d=0,l=0,c=0,dl=0;
		do {			
			Jugador jg = new Jugador();
			
			if(jg.getTipo()==1 && p<1){
				j.add(jg);//System.out.println("soy un portero");
				p++;
			}
			if(jg.getTipo()==2 && d<3){
				j.add(jg);//System.out.println("soy un defensa");
				d++;
			}
			if(jg.getTipo()==3 && l<2){
				j.add(jg);//System.out.println("soy un lateral");
				l++;
			}
			if(jg.getTipo()==4 && c<2){
				j.add(jg);//System.out.println("soy un central");
				c++;
			}
			if(jg.getTipo()==5 && dl<3){
				j.add(jg);//System.out.println("soy un delantero");
				dl++;
			}
			
			
			//System.out.println("nivel del jugador "+i+" es :"+jg.getNivel_j());
			//System.out.println("tamanio de j: "+j.size());
		}while(j.size()!=11);
		//System.out.println("sali de ciclo");
	}
		
	public void nivel(){//
		
		for(Jugador jg : j){
			nivel_aux+=jg.getNivel_j();
		}
		nivel_aux/=j.size();
		nivel_e = (int) Math.rint(nivel_aux);
		//System.out.println("NIVEL DE EQUIPO :"+nivel_e);
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getNivel_e() {
		return nivel_e;
	}


	public void setNivel_e(int nivel_e) {
		this.nivel_e = nivel_e;
	}


@Override

	public String toString(){
		return String.format("Equipo %d (nivel de juego %d)",id,nivel_e);
	}
}
