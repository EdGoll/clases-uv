import java.util.Scanner;

public class Alumno extends PersonaTipo{
	Scanner sn = new Scanner (System.in);
	String[] asignaturas = new String[5];

	public void llenarAsignaturas(){
		public String aux;
		for (int i=0; i<asignaturas.length; i++){
			System.out.println("Ingrese asignatura: ");
			aux = sn.next();
			asignaturas[i] = aux;
		}


	}
	public void mostrarAsignaturas(){
		for int i=0;i<asignaturas.length;i++){
			System.out.println("" + asignaturas[i]);
		}
	}




}