import java.util.Random;
import java.util.ArrayList;

public class listaAlumnos {
	
	private ArrayList arrayList = new ArrayList();
	private ArrayList listaA = new ArrayList();
	private ArrayList listaB = new ArrayList();
	Random r = new Random();
	int valor = r.nextInt(35)+40;
	Random p = new Random();
	int val = p.nextInt(valor);

	public void llenar() {
		
		Random rnd = new Random();
		for (int i = 0; i < valor; i++) {
			arrayList.add(new Integer(rnd.nextInt(100) + 1));

		}
		for (int i = 0; i < (arrayList.size()-val); i++) {
			listaA.add(arrayList.get((arrayList.size()-val)));
		}
		for (int i = (arrayList.size()-val); i < arrayList.size(); i++){
			listaB.add(arrayList.size());
		}

	}

	public void tamanio() {
		System.out.println("Tamanio actual: " + arrayList.size());
		System.out.println("Tamaño lista a: " + listaA.size());
		System.out.println("Tamaño lista b: " + listaB.size());
	}

	public void mostrar() {
		for (int i = 1; i <= arrayList.size(); i++) {
			System.out.println("Elemento " +  i + ": " + arrayList.get(i));
		}
		for (int i = 1; i <= (arrayList.size()-val); i++) {
            System.out.println("lista a " +  i + " : " + arrayList.get(i));
        }
        for (int i = (arrayList.size()-val); i < arrayList.size(); i++){
            System.out.println("lista b " +  i +": " + arrayList.get(i));
        
        }

	}

	public static void main(String[] args) {
		listaAlumnos array = new listaAlumnos();

		array.llenar();
		array.tamanio();
		array.mostrar();
	}
}

