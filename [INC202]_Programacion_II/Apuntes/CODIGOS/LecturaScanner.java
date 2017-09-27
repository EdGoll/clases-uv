import java.util.Scanner;
public class LecturaScanner {
	static final int TOT=4;	
	public static void main( String [] arg) { 
		int nota[]=new int [TOT];
		//creamos un objeto kyb que leera desde teclado 
		Scanner kyb = new Scanner(System.in); 
		System.out.println ("Deberas ingresar un total de "+ TOT + " valores");
		for (int i=0 ; i < TOT ; i++) { 
			System.out.println ("Ingresa el valor n :"+i);
			//el metodo nextInt permite leer el entero ingresado por el usuario
			nota[i] =kyb.nextInt();
			//System.out.println (nota[i]);
		}
	} 
} 

