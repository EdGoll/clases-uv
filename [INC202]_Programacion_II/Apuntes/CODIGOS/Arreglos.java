import java.io.*;
public class Arreglos {
	
	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int[] examenes=new int[3];
		
		System.out.println("La longitud de datos de mi arreglo es:"+examenes.length);
		
		for (int i=0;i<examenes.length;i++){
			
			System.out.println("Ingrese el valor para el examen "+(i+1)+" de "+examenes.length);
			
			examenes[i]=leerInt(br);
			
		}
		
		System.out.println("El resultado del primer examen es:"+examenes[0]);
		
		System.out.println("El resultado del último examen es:"+examenes[examenes.length-1]);
		
	}
	
	public static int leerInt(BufferedReader buff){
		
		int lee=0;
		
		boolean error;
		
		do {
			
			error=false;
			
			try {lee = Integer.parseInt(buff.readLine());}
			
			catch (NumberFormatException ex) {
				
				System.out.println("Entrada erronea, repetir:?");
				
				error=true;}
			
			catch (Exception ex){ex.printStackTrace(System.err);}
			
		} while (error);
		
		return lee;
		
	}//final de la funcion leer
	
}