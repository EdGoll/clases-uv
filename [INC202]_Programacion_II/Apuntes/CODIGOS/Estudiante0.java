public class Estudiante { 
	// Numero de notas
	static final int NB_NOTAS = 10; 
	// Arreglo de notas
	int notas[] ; 
	
	void mostrar(){ 
		// Mostrar las notas del estudiante 
		for (int i = 0 ; i < notas.length ; i++)  
			System.out.println (notas [i]) ; 
	} 
	void llenar(){ 
		// Llenar el arreglo
		for (int i = 0 ; i < NB_NOTAS ; i++) { 
			notas[i]=(int)(Math.random()*10);
			//System.out.println (notas [i]) ; 
		} }
	
	