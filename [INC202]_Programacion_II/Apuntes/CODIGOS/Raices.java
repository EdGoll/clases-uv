import java.util.Scanner;
public class Raices { 	
	
	static void raizCal (float a){ 
		// calcular la raiz cuadrada
		float raiz = (float)Math.sqrt(a);				
		System.out.println ("La raiz de " +a +" es :"+raiz); }
	
	static void leerDato(int nveces){ 
		// Datos del usuario
		int i=1;
		Scanner kyb = new Scanner(System.in); 
		do {
			System.out.println ("Ingrese el valor para calcular");
			float dato =kyb.nextFloat();
			if (dato<0)	{
				System.out.println ("El valor ingresado debe ser mayor que 0");
				break;}
			raizCal(dato);
			i++;
			System.out.println ("Usted a ingresado"+i+"de"+nveces+"valores a ingresar");

		} while (i < nveces);}	
	public static void main( String [] arg) { 
		System.out.println ("Cuantos valores quieres calcular?");
		Scanner kyb = new Scanner(System.in); 
		int nveces =kyb.nextInt();
		leerDato(nveces);}}