import java.util.ArrayList;
import java.util.Random;

public class Lista{
	/*En esta clase se guardan todas las listas requeridas para
	separar el curso en dos grupos, tenemos listaAlumnos en donde 
	se guardan el total de los alumnos y luego  grupoA, grupoB*/
	ArrayList<Integer> numeros = new ArrayList<Integer>();
	ArrayList<Alumno> listAlumnos = new ArrayList<Alumno>();    
	ArrayList<Alumno> grupoA = new ArrayList<Alumno>();
	ArrayList<Alumno> grupoB = new ArrayList<Alumno>();

	Random random = new Random();
	int totalalumnos = tamaño();
	
	// se genera el tamaño total de alumnos 
	public int tamaño(){
		int total=random.nextInt(35)+41; 
		return total;
	}

	/*Se genera la id para cada alumno, asegurando que nunca se
	repite el mismo numero (por ese motivo se crea el ArrayList<integer> numeros
	y se utiliza la funcion contains()), luego por cada loop
	se crea una nueva instancia de la clase Alumno a la cual se le asigna 
	su id unica y luego se almacena el la lista total de alumnos*/
	public void generarid(){
	int i=0;	 
	while (numeros.size() < totalalumnos) {
		Alumno alumno = new Alumno();			
		int rand = random.nextInt(totalalumnos);
    	if (!numeros.contains(rand+1)) {
        	numeros.add(rand+1);
        	alumno.llenarId(rand+1);
        	listAlumnos.add(alumno);
        	//listAlumnos.get(i).mostrarId();
        	i++;
        	}
		}
	}

	/*En esta funcion separamos de manera aleatoria los grupos A y B*/
	public void separar(){
		boolean sorteo;
		for (int i =0; i< totalalumnos;i++){
			sorteo= random.nextBoolean();
			if (sorteo){
				grupoA.add(listAlumnos.get(i));
				
			}else{
				grupoB.add(listAlumnos.get(i));			
			}
		}
	}			
}