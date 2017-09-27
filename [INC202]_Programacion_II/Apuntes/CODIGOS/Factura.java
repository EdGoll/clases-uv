import java.util.Scanner;
public class Factura { 	
	final static double IMPUESTO=18.7;
	
	static void descuentoCal (double precioImp){ 
		// calcular el valor - descuento
		double des,precioFinal;
		if (precioImp < 1000.) des=0;
		else if (precioImp < 3000.) des=1.;
		else if (precioImp < 5000.) des=3.;
		else des=5.;
		
		precioFinal= precioImp - (precioImp * (des/100.));				
			System.out.println ("El precio final es : " +precioFinal ); 
	}
	
	static void impuestoCal(){ 
		// Calcular precio + impuesto
			Scanner kyb = new Scanner(System.in); 
			double precio =kyb.nextFloat();
			double precioImp = precio + (precio * (IMPUESTO/100.)); 
			System.out.println ("El precio es sin impuesto es : " +precio ); 
			System.out.println ("El precio con impuesto es: " +precioImp ); 
			descuentoCal(precioImp);
	}
	public static void main( String [] arg) { 
		System.out.println ("Ingrese el precio");
		impuestoCal();}}