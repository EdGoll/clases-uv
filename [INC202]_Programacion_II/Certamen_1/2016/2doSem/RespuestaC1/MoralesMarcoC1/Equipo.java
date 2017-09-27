import java.util.ArrayList;

public class Equipo{
	private int nombre;
	private int nivelColectivo;
	private boolean jugo;
	private boolean gano;
	private ArrayList<Jugador> jugadores= new ArrayList<>();
	
	public Equipo(){
	}
	//Constructor que asigna el nombre del Equipo que lo recive de la clase Liga.
	public Equipo(int nombre){
		this.nombre=nombre;
	}
	public void llenarEquipo(){
		for(int i=0;i<11;i++){
			Jugador j= new Jugador(i);
			jugadores.add(j);
				
		}
	}
	public void defNivelColectivo(){
		for(int i=0;i<11;i++)
			nivelColectivo += ((Jugador)jugadores.get(i)).getNivelIndividual();
	}
	
	public void setNombre(int nombre){
		this.nombre=nombre;
	}
	public int getNombre(){
		return nombre;
	}
	public void setNivelColectivo(int nivelColectivo){
		this.nivelColectivo=nivelColectivo;
	}
	public int getNivelColectivo(){
		return nivelColectivo;
	}
	public void setJugo(boolean jugo){
		this.jugo=jugo;
	}
	public boolean getJugo(){
		return jugo;
	}
	public void setGano(boolean gano){
		this.gano=gano;
	}
	public boolean getGano(){
		return gano;
	}

	@Override
	public String toString(){
		return String.format("Equipo %d (nivel de juego %d)",nombre,nivelColectivo);
	}
}
