public class ListaPrincipal {
	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.generarTamanio();
		lista.llenarNumeros();
		lista.crearId();
		lista.crearGrupos();
		lista.mostrar();
	}
}