public class Adjuntar { 
	static final int NB_NOTAS = 5; 
	int notas[] ; 
	
	static void promedio(){ 
		// Promedio de notas
		float promedio=0;
		for (int i = 0 ; i < NB_NOTAS ; i++) { 
			promedio+=notas[i];}
		promedio/=NB_NOTAS;
		System.out.println ("El promedio es :"+promedio) ; 
	}
	
	void llenar(){ 
		// Llenar el arreglo
		if (argument.length == NB_NOTAS) { 
		for (int i = 0 ; i < NB_NOTAS ; i++) { 
			notas[i]=Integer.parseInt(argument[i]); 
			
		}} }
	
	public static void main( String [] argument) { 
	
		Estudiante duran = new Estudiante() ; 
		
		// Crear el arreglo de notas
		duran.notas = new int [NB_NOTAS] ; 
		duran.llenar();
		duran.mostrar();
		duran.promedio();
	
	} 