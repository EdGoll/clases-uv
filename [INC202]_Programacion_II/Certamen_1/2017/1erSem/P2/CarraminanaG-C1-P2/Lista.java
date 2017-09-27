

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lista {
	ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
	Random rand = new Random();

	int totalAlumnos = rand.nextInt((75 - 40) + 1) + 40;

	

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	

	public void llenarLista() {
		for(int j=1;j< totalAlumnos; j++ ){
			Alumno alumno = new Alumno();
			alumno.setId(j);
			listaAlumnos.add(alumno);
		}
		Collections.shuffle(listaAlumnos);
		
	}

	public void mostrarLista() {
		System.out.println(listaAlumnos.toString());
	}
	
	/*public void mezclarListas(){		Intentando Mezclar listas
		
		for(int j=1;j< totalAlumnos; j++ ){
			ArrayList<Alumno> c = new ArrayList<Alumno>();
			c.add(a.get(j));
			c.add(b.get(j));
			System.out.println(c.toString());
		}
	}*/
	
}
