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
	
	void promedio(){ 
		// Promedio de notas
		float promedio=0;
		for (int i = 0 ; i < NB_NOTAS ; i++) { 
			promedio+=notas[i];}
			promedio/=NB_NOTAS;
			System.out.println ("El promedio es :"+promedio) ; 
		 }
	public static void main (String arg []) { 
		// Crear un objeto del tipo Estudiante 
		Estudiante durand = new Estudiante() ; 
		
		// Crear el arreglo de notas
		durand.notas = new int [NB_NOTAS] ; 
		durand.llenar();
		durand.mostrar();
		durand.promedio();
	}} 