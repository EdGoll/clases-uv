import java.util.ArrayList;
import java.util.Random;


public class Lista{
//Declaro todo lo necesario
	private ArrayList<Alumno> lista = new ArrayList<>();
	private ArrayList<Alumno> listaGA = new ArrayList<>();
	private ArrayList<Alumno> listaGB = new ArrayList<>();
	private Random rnd;
	private int tamanio, min = 40, max = 75, idtotal = 100;
//NOTAS DE REPASO FUTURO
//me aprovecho del constructor para que genere la variable random para poder ocuparla 
//y no instanciarla luego y tambien genero el tamaño aleatorio enseguida

	public Lista() {
		rnd = new Random();
		tamanio = rnd.nextInt(max - min) +  min + 1;
	}
//se genera la variable fuera del for mara que se cree una nueva en cada iteracion 
//si se puede dar un metodo como parametro de otro metodo
	public void llenarLista() {
		Alumno a;
		for (int i = 0; i < tamanio; i++) {
			a = new Alumno();
			a.setId(idSinRep());
			lista.add(a);
		}
	}

//basicamente se saca los elementos del arraylist Lista para introducirlos en los
//otros arraylist
	public void crearGrupos() {
		Alumno a;
		for (int i = 0; i < tamanio; i++) {
			a = lista.remove(rnd.nextInt(lista.size()));
			if (rnd.nextBoolean()) {
				listaGA.add(a);
			} else {
				listaGB.add(a);
			}
		}
	}

	private int idSinRep() {
		int id;
		do {
			id = generarID();
		} while (id = 0);
			return id;
	}

//magia que encontre por internet y que al parecer es una manera de rrecorrer 
//un arraylist sin ocupar los sub indices 
	private int generarID() {
		int id = rnd.nextInt(idtotal) + 1;
		for (Alumno a : lista) {
			if (a.getId() == id) {
				id = 0;
				break;
			}
		}
		return id;
	}

//el tipoco codigo de mostrar los elementos de un arraylist solo que
//con la magia de antes para que se vea bonito y ahorrar espacio

	public void mostrarGrupos() {
		int i = 1;
		System.out.println("Grupo A:");
		for (Alumno a : listaGA) {
			System.out.println(i++ + ") " + a.mostrar());
		}
		i = 1;
		System.out.println("Grupo B:");
		for (Alumno a : listaGB) {
			System.out.println(i++ +") "+ a.mostrar());
		}
	}


	public void inicio(){
		llenarLista();
		crearGrupos();
		mostrarGrupos();
	}

}