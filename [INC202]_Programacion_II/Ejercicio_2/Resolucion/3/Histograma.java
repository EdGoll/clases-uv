import java.util.Random;

public class Histograma{
	
	private int[] arreglo = new int[500];
	private int[][] histograma;

	public void llenado() {
		Random rnd = new Random();
		for(int i = 0; i < arreglo.length; i++){
			arreglo[i] = rnd.nextInt(100) + 1;
		}
	}
	
	public void generarHistograma(){
		bubbleSort();
		int count = 0;
		for(int i = 0; i < arreglo.length; i++){
			for(int j = i; j < arreglo.length; j++) {
				if (arreglo[i] == arreglo[j]) {
					count++;
				}
			}
			System.out.print(arreglo[i] + ":");
			for (int k = 0; k < count; k++){
				System.out.print("*");
			}
			System.out.print(",");
			i = i + count;
			count = 0;
		}
		System.out.println("");
	}
	
	public void mostrar(){
		for(int i = 0; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println("\n******************");
	}
	
	private void bubbleSort() {
		int temp;
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = 0; j < arreglo.length - i - 1; j++){
				if (arreglo[j] > arreglo[j+1]) {
					temp = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = temp; 
				}
			}
		}
	}
}