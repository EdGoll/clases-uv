import java.util.Random;
import java.util.Scanner;

public class Principal{
	public static void main(String[] args){
		int id=0;
		Lista lista_final = new Lista(id);
		lista_final.llenarLista_completa();
		lista_final.llenarListas();
		lista_final.mostrar();
		Scanner scan=new Scanner(System.in);
		System.out.println("Indique la ID del alumno para obtener los datos de este: ");
		id=scan.nextInt();
		Alumno alumno=new Alumno(id);
		alumno.mostrar(); 
	}
}