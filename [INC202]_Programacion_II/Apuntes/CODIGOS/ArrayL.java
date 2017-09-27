import java.util.*;
public class ArrayL{

	public static void main (String arg[]){
		ArrayList v= new ArrayList();
		System.out.println(v.size());
		for (int i=0;i<10;i++)
		v.add(i);
		//v.add(new Integer(i));
		System.out.println("Tamano del vector : "+ v.size());
	//mostrar el contenido usando get
		System.out.println("Mostrar el contenido");
		for (int i=0;i<10;i++)
		System.out.print(v.get(i)+ " " );
		System.out.println( );
		
		//suprimir elementos
		v.remove(3);
		v.remove(5);
		System.out.println("Tamano del vector : "+ v.size());
		//modificar
		v.set(2,100);
		v.set(6,2000);
		System.out.println("El contenido es "+ v);
		System.out.println("Tamano del vector : "+ v.size());
	}}	
