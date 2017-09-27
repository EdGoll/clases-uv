//Yian Vera Soto, Programacion 2, evaluacion 1  

public class AlumListaPrincipal{

	public static void main(String [] args){

		Alumno alumnos = new Alumno();
		System.out.println("Lista de Alumnos en la Asignatura");
		alumnos.llenadoListaTotal();
		System.out.println("Total de ALumnos Cursando la Asignatura: "+alumnos.alumnosEnAsignatura());


		Lista be = new Lista();
		be.llenadoListaA();
		be.llenadoListaB();
		System.out.println("Alumnos de la lista A: ");
		be.mostrarListas('A');
		System.out.println("Alumons en la lista B: ");
		be.mostrarListas('B');
		
	}
}