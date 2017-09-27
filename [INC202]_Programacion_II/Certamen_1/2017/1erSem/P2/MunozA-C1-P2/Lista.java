import java.util.Random;
import java.util.ArrayList;

public class Lista {
	//Arreglos para el total de alumnos, grupo a y grupo b
	/*<alumno> porque así hace referencia a la clase "alumno" donde se
	encuentran las ID*/
	private ArrayList<Alumno> lista_alumnos = new ArrayList<>();
	private ArrayList<Alumno> lista_grupoA = new ArrayList<>();
	private ArrayList<Alumno> lista_grupoB = new ArrayList<>();
	//variables de operacion
	private int tam, min_lista=40; int max_lista = 75; int max_ID = 100;
	private Random aleat;

	//genera la lista
	public Lista() {
		Random aleat = new Random();
		tam = (min_lista+aleat.nextInt( (max_lista+1) -min_lista));
	}

	public void llenar() {
		//llena la lista por alumno con ids distintas
		Alumno alum;
		for (int i = 0; i < tam; i++){
			alum = new Alumno ();
			alum.setID(generar_id_SinRep());
			lista_alumnos.add(a);
		}
	}

	public void dividir_listas(){
		//divide listas en lista_grupoA y lista_grupoB	
		
	}

	private int generar_id() {
		//genera id
	}
	
	private int generar_id_SinRep() {
		//genera id unico para cada uno de los alumnos
	}

	public void mostrar_lista(){
		for (int i = 0; i < lista_alumnos.size; i++) {
			System.out.print(lista_alumnos.get(i) + ", ");
		}
		System.out.println();
	}
	
	public void mostrar_grupos() {
		System.out.println("Grupo A: ");
		for (int i = 0; i < lista_grupoA.size; i++) {
			System.out.print(lista_grupoA.get(i) + ", ");
		}
		System.out.println();
	}
	
}
