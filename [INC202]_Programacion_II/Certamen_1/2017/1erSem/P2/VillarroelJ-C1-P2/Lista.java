import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Lista {
	private ArrayList<Alumno> lista = new ArrayList<>();
	private ArrayList<Integer> id = new ArrayList<>();
	private ArrayList<Integer> numeros = new ArrayList<>();
	public int tamanio = 0;
	
	public int generarTamanio() {
		Random r = new Random();
		while(this.tamanio < 39) {
			this.tamanio = r.nextInt(75);
		}
		return this.tamanio;
	}
	
	private void agregar(int ident, String grupo) {
		Alumno alm = new Alumno();
		alm.setIdent(ident);
		alm.setGrupo(grupo);
		lista.add(alm);
	}
	
	public void llenarNumeros() {
		for(int i = 0 ; i < 100 ; i++) {
			numeros.add(i + 1);
		}
	}
	
	public void crearId() {
		Random r = new Random();
		int contador = 0;
		int temp1 = 0;
		int temp2 = 0;
		while(contador < this.tamanio) {
			temp1 = r.nextInt(99) + 1;
			if(temp1 == 100) {
				temp1 -= 1;
			}
			temp2 = numeros.get(temp1);
			if (temp2 != 0) {
				id.add(numeros.get(temp1));
				numeros.set(temp1, 0);
				contador += 1;
			}
		}
	}

	public void crearGrupos() {
		Random r = new Random();
		boolean variable = true;
		int temp = 0;
		for(int i = 0 ; i < this.tamanio ; i++) {
			temp = id.get(i);
			variable = r.nextBoolean();
			if(variable) {
				agregar(temp, "Grupo A");
			}
			else {
				agregar(temp, "Grupo B");
			}
		}
	}
	
	public void mostrar() {
		for (Alumno alm : lista) {
            System.out.println("Estudiante ID: " + alm);
        }
	}
}