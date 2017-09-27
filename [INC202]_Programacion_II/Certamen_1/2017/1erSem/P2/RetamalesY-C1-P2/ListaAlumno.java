import java.util.ArrayList;
import java.util.Random;

public class ListaAlumno{
	private ArrayList<Alumno> Alumnos = new ArrayList();
        private ArrayList<Alumno> GrupoA = new ArrayList();
	private ArrayList<Alumno> GrupoB = new ArrayList();
	private Random rnd;
	private int tamano;


	public ListaAlumno(){
		rnd= new Random();
		tamano= rnd.nextInt(35)+41;
	}	

	public void llenadoLista(){
		Alumno a;
		int i;
		for(i=0;i<tamano;i++){
			a = new Alumno();
			a.setId(crearId());
			Alumnos.add(a);
		}
	}


	public void ordenarporListas(){
		Alumno a;
		int i;
		for(i=0; i<tamano;i++){
			a = Alumnos.remove(rnd.nextInt(Alumnos.size()));
			if (rnd.nextBoolean()){
				GrupoA.add(a);
			}else{
				GrupoB.add(a);
			}
		}
	}


	private int crearIdSinrepetir(){
		int id;
		do{
                    id=crearId();
		}while (id<0);
		return id;
	}
	
	private int crearId(){
		int id=rnd.nextInt(75)+1;
		for (Alumno alumno : Alumnos){
			if(alumno.getId()==id){
				id=-1;
				break;
			}
		}
		return id;
	}

	public void mostrarLista(){
		System.out.println("Curso:");
		for (Alumno a : Alumnos){
			System.out.println(a);
		}
	}
	public void mostrarGrupos(){
		System.out.println("Grupo A:");
		for (Alumno a : GrupoA){
			System.out.println(a);
		}
		System.out.println("Grupo B:");
		for(Alumno a :GrupoB){
			System.out.println(a);
		}
	}
}
