import java.util.Random;
import java.util.ArrayList;

public class Lista
{	
	/**
	 * ArrayList de objetos Alumno
	 */
	public ArrayList<ArrayList<Alumno>> listas = new ArrayList<ArrayList<Alumno>>(2);
	
	/**
	 * ArrayList con los id's de los alumnos ingresados
	 */
	public ArrayList<Integer> idAlumnos;
	
	/**
	 * Cantidad de alumnos
	 */
	public int tamanio;
	
	/**
	 * Instancia de Random
	 */
	private Random r = new Random();
	
	public int limites;
	
	/**
	 * Constructor
	 * 
	 * Inicializa tamano, id's de alumnos y llama a la funcion llenar()
	 */
	public Lista()
	{					
		this.tamanio = this.r.nextInt(35) + 41;
		//this.tamanio = 6;		
		
		this.idAlumnos  = new ArrayList<Integer>(this.tamanio);
		
		this.llenar();
	}
	
	/**
	 * Llena el ArrayList
	 */
	public void llenar()
	{		
		// Creando las listas A y B
		this.listas.add(new ArrayList<Alumno>());
		this.listas.add(new ArrayList<Alumno>());

		for(int i = 0; i < this.tamanio; i++){	
			
			// Numero randomico entre 0 y 1, correspondiente a las listas A y B respectivamente
			int index = this.r.nextInt(2);
			
			// Agrega una instancia de Alumno cada elemento del ArrayList
			this.listas.get(index).add( new Alumno( this.generarId() ) );			
		}
	}
	
	/**
	 * Genera el identificador
	 * 
	 * @return int
	 */
	public int generarId()
	{					
		int num = this.r.nextInt(100) + 1;		
		boolean agregar = false;
		
		while(agregar == false){			
			
			// Si el array est vacio, se agrega el valor de inmediato
			if(this.idAlumnos.isEmpty()){
				this.idAlumnos.add(num);
				agregar = true;
			}
			
			// El numero randomico no esta en el array? Entonces se agrega
			if(this.idAlumnos.contains(num) == false){
				this.idAlumnos.add(num);
				agregar = true;
				
			// De lo contrario se crea uno nuevo
			} else {
				num = this.r.nextInt(100) + 1;
			}
			
		}
		
		return num;
	}
	
	public int generarId2()
	{
		int num = this.r.nextInt(100) + 1;
		
		boolean agregar = false;
		
		while(agregar == false){
		
			for(int i = 0; i < 2; i++){
				if(this.listas.get(i).isEmpty()){
					return num;
				}
				
				for(int k = 0; k < this.listas.get(i).size(); k++){
					
					Alumno al = this.listas.get(i).get(k);
					
					for(int j = 0; j < this.listas.get(i).size(); j++){
						
						if(al.comparar(this.listas.get(i).get(k)) == true){
							num = this.r.nextInt(100) + 1;
						} else {
							agregar = true;
						}
					}
				}
			}			
		}
		
		return num;
	}
	
	/**
	 * Muestra cantidad de alumnos, grupos y sus alumnos
	 */
	public void mostrar()
	{		
		System.out.println("Cantidad de alumnos: "+this.tamanio);
		
		for(int k = 0; k < this.listas.size(); k++){
			
			System.out.println("Grupo "+(k+1)+" ("+this.listas.get(k).size()+" Alumnos):");
			
			for(int i = 0; i < this.listas.get(k).size(); i++){
				
				System.out.print(this.listas.get(k).get(i).id+", ");
				
			}
			
			System.out.println();
		}
	}
}