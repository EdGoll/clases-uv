public class Equipo{
	public Jugador[] jugadores = new Jugador[11];	
	public String nombre;
	public boolean octavos=false;
	public boolean cuartos=false;
	public boolean semi=false;
	public boolean fin=false;
	public Equipo(){
		llenarEquipo();
	}

public void llenarEquipo(){
	for (int i=0;i<11;i++){
	jugadores[i] = new Jugador();}

	jugadores[0].setID(1);
	jugadores[0].setTipo("Portero");

	jugadores[1].setID(2);
	jugadores[1].setTipo("Defensa");

	jugadores[2].setID(3);
	jugadores[2].setTipo("Defensa");

	jugadores[3].setID(4);
	jugadores[3].setTipo("Defensa");

	jugadores[4].setID(5);
	jugadores[4].setTipo("Lateral");

	jugadores[5].setID(6);
	jugadores[5].setTipo("Lateral");

	jugadores[6].setID(7);
	jugadores[6].setTipo("CentroCampista");

	jugadores[7].setID(8);
	jugadores[7].setTipo("CentroCampista");

	jugadores[8].setID(9);
	jugadores[8].setTipo("Delantero");

	jugadores[9].setID(10);
	jugadores[9].setTipo("Delantero");

	jugadores[10].setID(11);
	jugadores[10].setTipo("Delantero");
}

	public int getJuegoColectivo(){
		return (jugadores[0].getNivelJuego()+
			jugadores[1].getNivelJuego()+jugadores[2].getNivelJuego()+
			jugadores[3].getNivelJuego()+jugadores[4].getNivelJuego()+
			jugadores[5].getNivelJuego()+jugadores[6].getNivelJuego()+
			jugadores[7].getNivelJuego()+jugadores[8].getNivelJuego()+
			jugadores[9].getNivelJuego()+jugadores[10].getNivelJuego());
	}

	public void setNombre(String name){
		this.nombre=name;
	}

}