import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class ArrayListAleatorio {
	
	private ArrayList arrayList = new ArrayList();
	private final int TAMANIO = 15;
	
	public void llenar() {
		Random rnd = new Random();
		for (int i = 0; i < TAMANIO; i++) {
			arrayList.add(new Integer(rnd.nextInt(100) + 1));
		}
	}

	public void tamanio() {
		System.out.println("Tamanio actual: " + arrayList.size());
	}

	public void mostrar() {
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Elemento " +  i + ": " + arrayList.get(i));
		}
	}

	public void eliminar(int i) {
		try {
			System.out.println("Se elimina el elemento " + arrayList.remove(i));
		} catch(Exception ex) {
			System.out.println("El elemento no existe. No se ha eliminado");
		}
	}

	public void agregar() {
		Scanner sc;
		try {
			System.out.println("Ingrese un nuevo elemento para el arreglo");
			sc = new Scanner(System.in);
			arrayList.add(new Integer(sc.nextInt()));
		} catch(Exception ex) {
			System.out.println("Error en el valor ingresado");
		}
	}

	public void agregar(int i) {
		Scanner sc;
		System.out.println("Ingrese un nuevo elemento para el arreglo");
		try {
			sc = new Scanner(System.in);
			arrayList.add(i, new Integer(sc.nextInt()));
		} catch(Exception ex) {
			System.out.println("Error en el valor ingresado");
		}
	}

	public static void main(String[] args) {
		ArrayListAleatorio array = new ArrayListAleatorio();

		array.llenar();
		array.tamanio();
		array.mostrar();

		array.eliminar(3);
		array.eliminar(7);
		array.eliminar(11);
		array.eliminar(13);

		array.tamanio();
		array.mostrar();
		array.agregar(2);
		array.agregar(6);
		array.tamanio();
		array.mostrar();
	}
}