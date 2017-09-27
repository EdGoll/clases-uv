import java.util.Random;
import java.util.ArrayList;

public class ListaAlumno {
	
	private ArrayList id = new ArrayList();
	Random r = new Random();
	int totalcurso = r.nextInt(36)+40;
	public ArrayList listaa = new ArrayList();
	public ArrayList listab = new ArrayList();
	
	public void llenarid() {
		
		Random rnd = new Random();
		for (int i = 0; i < totalcurso; i++) {
				id.add(new Integer(rnd.nextInt(100) + 1));
			
		}
		
	}
	public void tamanio() {
		System.out.println("Tamanio curso actual: " + id.size());
	}
	public void llenarayb() {
		int tamaño = id.size();
			Random rnd = new Random();
			for (int i = 0; i < tamaño ; i++) {
				listaa.add(new Integer(rnd.nextInt((tamaño)) + 1));
				int tamañob = listaa.size()-tamaño;
				for (int j = 0; j < tamañob ; j++) {
					listab.add(new Integer(rnd.nextInt((tamañob)) + 1));
				
				}
			}
	}
	public void mostrartamanioA(){
		System.out.println("Tamaño curso A " + listaa.size());
	}
	
	public void mostrartamanioB(){
		System.out.println("Tamaño curso B " + listab.size());
	}
	
	public void verificarid(){
		
	}
	public void mostrar() {
		for (int i = 0; i < id.size(); i++) {
		
			System.out.println("Alumno " +  i + ": " + "ID" + ": " + id.get(i));
		}
	}
}