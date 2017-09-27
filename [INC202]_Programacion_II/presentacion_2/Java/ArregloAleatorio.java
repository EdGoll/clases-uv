import java.util.Random;
import java.util.Scanner;

public class ArregloAleatorio {
	private int largo;
	private int[] arreglo;
	
	public ArregloAleatorio() {
	}
	
	public void leerLargo() {
		largo = -1;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Ingrese el largo del arreglo ");
			largo = sc.nextInt();
			if (largo > 0){
				arreglo = new int[largo];
			}
		} catch(Exception ex) {
			largo = -1;
		}
	}
	
	public void llenar() {
		if (largo > 0) {
			Random rnd = new Random();
			for(int i = 0; i < largo; i++){
				arreglo[i] = rnd.nextInt(100) + 1;
			}
		} else {
			System.out.println("No es posible llenar el arreglo");
		}
	}
	
	public void mostrar() {
		if (largo > 0) {
			for(int i = 0; i < largo; i++){
				System.out.print(arreglo[i] + ", ");
			}
			System.out.println("");
		} else {
			System.out.println("No es posible mostrar el arreglo");
		}
	}
	
	public void sumar() {
		if (largo > 0) {
			int suma = 0;
			for(int i = 0; i < largo; i++){
				suma += arreglo[i];
			}
			System.out.println(suma);
		} else {
			System.out.println("No es posible sumar el arreglo");
		}
	}
	
	public static void main(String[] args) {
		ArregloAleatorio aa = new ArregloAleatorio();
		
		aa.leerLargo();
		aa.llenar();
		aa.mostrar();
		aa.sumar();
	}
}