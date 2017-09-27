public class ArregloImpl{
	
	public static void main(String[] args) {
		Arreglo a = new Arreglo();
		//Ejercicio 1
		a.llenado();
		a.mostrar();
		a.ordenar('A');
		a.mostrar();
		a.ordenar('B');
		a.mostrar();
		//Ejercicio 2
		a.llenadoMatriz();
		a.mostrarMatriz();
		a.determinante();
	}
}