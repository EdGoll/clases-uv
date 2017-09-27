import java.util.ArrayList;
import java.util.Random;

public class Liga {
	private ArrayList<Equipo> equipos= new ArrayList<>();
	
	public void generarEquipos(){
		for(int i=0;i<16;i++){
			int nom=generarNombre();
			Equipo e= new Equipo(nom);
			e.llenarEquipo();
			e.defNivelColectivo();
		}
	}
	//Este metodo genera nombres aleatorios sin repeticiones
	private int generarNombre(){
		Random r= new Random();
		int nombre;
		boolean encontro;
		do{
			nombre=r.nextInt(16)+1;
			encontro=false;
			int i=0;
			while(i<equipos.size() && !encontro){
				if(((Equipo)equipos.get(i)).getNombre()==nombre)
					encontro=true;
				i++;
			}
		}while(!encontro);
		return nombre;
	}
	public void desarrolloLiga(){
		Encuentro e= new Encuentro(equipos);
		e.octavosFinal();
		e.cuartosFinal();
		e.semifinal();
		e.finalLiga();
	}
}
