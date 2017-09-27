public class AdjuntarNotas { 
	int notas[] ; 
	
	void promedio(String [] arg){ 
		// Promedio de notas
		float promedio=0;
		for (int i = 0 ; i < arg.length ; i++) { 
			promedio+=notas[i];}
		promedio/=arg.length;
		System.out.println ("El promedio es :"+promedio) ; 
	}
	
	void llenar(String [] arg){ 
		// Llenar el arreglo
		for (int i = 0 ; i < arg.length ; i++) { 
			notas[i]=Integer.parseInt(arg[i]); 
						
		}}
	
	public static void main( String [] arg) { 
	
		AdjuntarNotas duran = new AdjuntarNotas() ; 
		
		// Crear el arreglo de notas
		duran.notas = new int [arg.length] ; 
		duran.llenar(arg);
		duran.promedio(arg);} }