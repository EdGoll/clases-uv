import java.util.ArrayList;
import java.util.Random;

public class Encuentro{
	//ArrayList de los equipos que 
	private ArrayList<Equipo> equiposOctavos= new ArrayList<>();
	private ArrayList<Equipo> equiposCuartos= new ArrayList<>();
	private ArrayList<Equipo> equiposSemifinal= new ArrayList<>();
	private ArrayList<Equipo> equiposFinal= new ArrayList<>();
	
	//Entrega de los equipos creados en la clase Liga
	public Encuentro(ArrayList<Equipo> equipos){
		equiposOctavos=equipos;
	}
	//Fases de la liga
	public void octavosFinal(){
				encuentros(equiposOctavos);
	}
	public void cuartosFinal(){
				encuentros(equiposCuartos);
	}
	public void semifinal(){
				encuentros(equiposSemifinal);
	}
	public void finalLiga(){
				encuentros(equiposFinal);
	}
	
	//Metodo encuentros que recive el ArrayList de los equipos que se encuentran participando en cada una de las fases.
	//Tambien selecciona los equipos randomicamente sin posivilidad de repeticion ya que son removidos del ArrayList.
	public void encuentros(ArrayList<Equipo> equipos){
		Random r =new Random();
		int nomEquiGana;
		for(int i=0;i<(equipos.size()/2);i++){
			Equipo a= new Equipo();
			a=(Equipo) equipos.remove(r.nextInt(equipos.size()));
			Equipo b= new Equipo();
			b=(Equipo) equipos.remove(r.nextInt(equipos.size()));
			nomEquiGana=ganador(a,b,equipos.size());
			System.out.println(a.toString() + " v/s " + b.toString() + ", Resultado: Ganador Equipo: " + nomEquiGana);
		}
		
	}
	//Metodo para definir el ganador de cada encuentro
	public int ganador(Equipo a,Equipo b,int cantEquipos){
		Random r= new Random();
		int nivelColectivoA= a.getNivelColectivo();
		int nivelColectivoB= b.getNivelColectivo();
		if(cantEquipos==16){								//Este 16 al igual que 8,4,2 es para identficar la fase al cual pertenece el encuentro.
			if(nivelColectivoA > nivelColectivoB){
				Equipo e= new Equipo(a.getNombre());		//Para redefinirl los niveles colectivos para la proccima fase simpliente se crea un Equipo que conserva el nombre del equipo ganador mediante el constructor de la clase Equipo, que asigna el nombre entregado al constructor y define los niveles individuales de cada jugador y luego el nivel colecivo.
				equiposCuartos.add(e);
				return a.getNombre();
			}
			else if(nivelColectivoA < nivelColectivoB){
				Equipo e= new Equipo(b.getNombre());
				equiposCuartos.add(e);
				return b.getNombre();
			}
			else{
				if(r.nextBoolean()){
					Equipo e= new Equipo(a.getNombre());
					equiposCuartos.add(e);
					return a.getNombre();
				}
				else{
					Equipo e= new Equipo(b.getNombre());
					equiposCuartos.add(e);
					return b.getNombre();
				}
			}
		}
		else if(cantEquipos==8){
			if(nivelColectivoA > nivelColectivoB){
				Equipo e= new Equipo(a.getNombre());
				equiposSemifinal.add(e);
				return a.getNombre();
			}
			else if(nivelColectivoA < nivelColectivoB){
				Equipo e= new Equipo(b.getNombre());
				equiposSemifinal.add(e);
				return b.getNombre();
			}
			else{
				if(r.nextBoolean()){
					Equipo e= new Equipo(a.getNombre());
					equiposSemifinal.add(e);
					return a.getNombre();
				}
				else{
					Equipo e= new Equipo(b.getNombre());
					equiposSemifinal.add(e);
					return b.getNombre();
				}
			}
		}
		else if(cantEquipos==4){
			if(nivelColectivoA > nivelColectivoB){
				Equipo e= new Equipo(a.getNombre());
				equiposFinal.add(e);
				return a.getNombre();
			}
			else if(nivelColectivoA < nivelColectivoB){
				Equipo e= new Equipo(b.getNombre());
				equiposFinal.add(e);
				return b.getNombre();
			}
			else{
				if(r.nextBoolean()){
					Equipo e= new Equipo(a.getNombre());
					equiposFinal.add(e);
					return a.getNombre();
				}
				else{
					Equipo e= new Equipo(b.getNombre());
					equiposFinal.add(e);
					return b.getNombre();
				}
			}
		}
		else if(cantEquipos==2){
			if(nivelColectivoA > nivelColectivoB)
				return a.getNombre();
			else if(nivelColectivoA < nivelColectivoB)
				return b.getNombre();
			else{
				if(r.nextBoolean())
					return a.getNombre();
				else

					return b.getNombre();
			}
		}
		return 0;
	}
}

