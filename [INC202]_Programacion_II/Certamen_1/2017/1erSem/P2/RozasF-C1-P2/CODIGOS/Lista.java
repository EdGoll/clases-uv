import java.util.Random;
import java.util.ArrayList;

public class Lista {
	public  ArrayList<Alumno> lista = new ArrayList<>();// creamos una lista inicial para almacenar la lista inicial de alumnos.
	public int tamanio;// creamos la variable tamanio para almacenar el tamano de la lista aleatoriamente.
	public int max=75, min=40;
	public Random rand;
	
	public void totalAlumnos(){ //Generamos aleatoriamente un numero como max de 75 alumnos y lo guardamos en la variable tamanio.
		rand = new Random();
		tamanio = rand.nextInt(max - min) + min + 1; // para poder generar numeros aleatorios mayores a 40 y menores o igual a 75.
		System.out.println("El total de Alumnos es de");
		System.out.println(tamanio);
	}
	
	public void llenarLista(){ // Llenamos la lista principal que contiene a todos los alumnos generados aleatoriamente.
		for (int i = 0; i<tamanio; i++){
			Alumno al = new Alumno(); // variable de tipo Alumno.
			lista.add(al); //anadimos un alumno a la lista.
			}
		}
	
	public void mostrarLista(){// mostramos la lista con bucle foreach ya que nuestra lista tiene numeros enteros.
		System.out.println("La lista es");
		for(Alumno al: lista){
			System.out.println(al);
			int tam = rand.nextInt(2)+1; // separamos a los alumnos de la lista en grupos A y B 
				System.out.println(tam);
				System.out.println("Si el numero es 1 corresponde al grupo A, si es el numero 2 corresponde al B");
			
			}
		}
	
	public int generarId(){// generamos un id para cada alumno con numeros del 1 al 100
		int id = rand.nextInt(100)+1;
		for(Alumno identi : lista){
			System.out.println(identi);
			}
					
		return id;
	
	}
	
}

	
	
	