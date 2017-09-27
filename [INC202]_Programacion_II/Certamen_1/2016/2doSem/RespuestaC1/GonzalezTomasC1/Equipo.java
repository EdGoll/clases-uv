

import java.util.ArrayList;
import java.util.Random;



public class Equipo {
	public int nombre_equipo;
	public ArrayList<Jugador> list_jugadores = new ArrayList<>();
	public int nivel_juego;
		
	public Equipo(int nombre_equipo){
		setNombre_equipo(nombre_equipo);
		setList_jugadores(llenar());
		setNivel_juego(calc_nivel_juego());
	}
	private ArrayList<Jugador> llenar(){
		Random sc = new Random();
		for (int i = 0; i < 11; i++) {
			Jugador jugador = new Jugador();
			jugador.setId(i+1);
			jugador.setRecuperar(sc.nextInt(100)+1);
			jugador.setEntregar(sc.nextInt(100)+1);
			if (i==0) {
				jugador.setGoleador(0);
			}else{
				jugador.setGoleador(sc.nextInt(100)+1);
			}
			float aux = ((jugador.getRecuperar()*20)/100)+((jugador.getEntregar()*35)/100)+((jugador.getGoleador()*45)/100);
			jugador.setJuego_individual(Math.round(aux));
			if (i==0) {
				jugador.setTipo(1);
			}else if(i>=1 && i<4){
				jugador.setTipo(2);
			}else if(i>=4 && i<6){
				jugador.setTipo(3);
			}else if (i>=6 && i<8){
				jugador.setTipo(4);
			}else {
				jugador.setTipo(5);
			}
			
			jugador.toString();
			list_jugadores.add(jugador);
			
		}
		return list_jugadores;
	}
	
	public int calc_nivel_juego(){
		int nivel=0;
		for (Jugador jugador : list_jugadores) {
			nivel= nivel+jugador.getJuego_individual();
		}
		return nivel;
	}
	public int getNombre_equipo() {
		return nombre_equipo;
	}
	public void setNombre_equipo(int nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}
	public ArrayList<Jugador> getList_jugadores() {
		return list_jugadores;
	}
	public void setList_jugadores(ArrayList<Jugador> jugadores) {
		this.list_jugadores = jugadores;
	}
	public int getNivel_juego() {
		return nivel_juego;
	}
	public void setNivel_juego(int nivel_juego) {
		this.nivel_juego = nivel_juego;
	}
	@Override
	public String toString() {
		return "Equipo " + nombre_equipo  + "( nivel_juego "
				+ nivel_juego + ")";
	}
		
}
	
	 
