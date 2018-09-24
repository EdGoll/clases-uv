import java.util.Random;
import java.util.Scanner;

public class Estudiante {
	private final int NB_NOTAS = 15;
	private float[] notas = new float[NB_NOTAS];
	
	public void llenar() {
		int min = 1, max = 7;
		Random rnd = new Random();
		for (int i = 0; i < NB_NOTAS; i++) {
			notas[i] = (rnd.nextFloat() * (max - min)) + min;
		}
	}
	
	public void mostrar() {
		for (int i = 0; i < NB_NOTAS; i++) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
		}
	}
	
	public void promedio() {
		float suma = 0;
		for (int i = 0; i < NB_NOTAS; i++) {
			suma += notas[i];
		}
		System.out.println(String.format("Promedio: %.7f", (suma / NB_NOTAS)));
	}
}