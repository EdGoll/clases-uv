import java.util.Random;
import java.util.ArrayList;

public class Lista{

	private ArrayList<Alumno> lista   = new ArrayList<>();
	private ArrayList<Alumno> lista_A = new ArrayList<>();
	private ArrayList<Alumno> lista_B = new ArrayList<>();

	private Random ran = new Random();
	private Alumno a   = new Alumno();

	private int min = 40; 
	private int max = 75; 
	private int num_id = 100;
	private int tamanio = (min + ran.nextInt( (max + 1) - min) );

	public void llenar(){
		for(int i = 0; i < tamanio; i++){
			
			a.setId( ID_sin_rep() );
			lista.add(a);
		}
	}
	
	public void dividir(){
		for (int i = 0; i < tamanio; i++) {
			Alumno a = lista.remove(ran.nextInt ( lista.size() ) );

		}
	}

	private int ID_sin_rep() {
		
	}

	private int generar_ID() {
		int id = ran.nextInt(num_id) + 1;
		
	}

	public void mostrar_lista(){
		System.out.println("*** Lista ***");
	 	for (int i = 0; i < lista.size(); i++){
			System.out.println (lista.get (i) );
		}
	}

	public void mostrar_grupo(){

		System.out.println("*** Grupo A ***");

		for (int i = 0; i < lista_A.size(); i++){
			System.out.println (lista_A.get (i) );
		}

		System.out.println("*** Grupo B ***");

		for (int i = 0; i < lista_B.size(); i++){
			System.out.println (lista_B.get (i) );
		}
	}

}