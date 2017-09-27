import java.util.ArrayList;
import java.util.Random;

public class Lista {
	//ATRIBUTOS-------------------
	private ArrayList<Alumno> ListaAlumnos = new ArrayList<> ();
	private ArrayList<Alumno> ListaGrupoA = new ArrayList<>();
	private ArrayList<Alumno> ListaGrupoB = new ArrayList<> ();
	private Random nros;
	//agregamos limites al tamaño de la lista
	private int tamanio, limiteinferior = 40, limitemaximo = 75;
	//limite para el identificador
	private int identmaximo = 100;

	
//Constructor y Metodos------------

	public Lista () {
		nros = new Random();
		//Limite del tamaño entre 40-75 alumnos
		tamanio = nros.nextInt(limitemaximo - limiteinferior) + limiteinferior;		
	}
	public void llenarLista() {
		Alumno al1;
		for(int i = 0; i<tamanio; i++){
			al1 = new Alumno();
			//al1.setIdent(generarIdent());
			al1.setIdent(generarIdent());
			ListaAlumnos.add(al1);

			//Separamos en grupo A y B
			al1 = ListaAlumnos.remove(nros.nextInt(ListaAlumnos.size()));
			if (nros.nextBoolean()){
				ListaGrupoA.add(al1);
			}else{
				ListaGrupoB.add(al1);
			}
		}
	}
	
/*	private int generarIdentSinRepetir() {
		int identificador; int suma;
		do{}while???????	
	}*/
	private int generarIdent(){
		int identificador = nros.nextInt(identmaximo) + 1;
		return identificador;
	}

//Recorrer grupos al momento de mostrar mediante for(c : )
	public void mostrarGrupos() {
		int suma = 0;	
		System.out.println("\nLos alumnos del Grupo A son: ");
		for (Alumno al1 : ListaGrupoA){
			System.out.println(al1);
			//conteo += 0;
			suma ++;
		}
		System.out.println("\nLos alumnos del Grupo B son: ");
		for(Alumno al1 : ListaGrupoB){
			System.out.println(al1);
			suma ++;
		}
		System.out.println("\nDonde la Lista es de "+suma+" alumnos");
	}
}
