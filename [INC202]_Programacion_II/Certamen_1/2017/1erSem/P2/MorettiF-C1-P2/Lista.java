import java.util.Random;
import java.util.ArrayList;

public class Lista {
	
	private ArrayList curso = new ArrayList();
	private ArrayList grupoA = new ArrayList();
	private ArrayList grupoB = new ArrayList();


	public void generar_lista() {
		boolean condicion = true;
		Random r = new Random();
		while (condicion){
			int total_alumnos = r.nextInt(75) + 1;
			if (total_alumnos > 45 && total_alumnos <= 75){
				condicion = false;
			}
		}
		for (int i = 1; i <= total_alumnos; i++){
			curso.add(i);
		}
	}

	
	public void generar_grupos() {
		int aux = curso.size();
		Random r = new Random();
		for (int i = 0; i < aux; i++){
			int a = curso.size();
			int b = r.nextInt(2);
			int c = r.nextInt(a);
			int d = curso.get(c);
			if (b == 0){
				grupoA.add(d);
			}
			else{
				grupoB.add(d);
			}
			curso.remove(d);
		}
	}	
			

	public void mostrar() {
		System.out.println("Grupo A: ");
		for (int i = 0; i < grupoA.size(); i++) {
			System.out.println("Alumno: " + grupoA.get(i));
		}
		System.out.println("Grupo B: ");
		for (int i = 0; i < grupoB.size(); i++) {
			System.out.println("Alumno: " + grupoB.get(i));
		}
	}


	
}
