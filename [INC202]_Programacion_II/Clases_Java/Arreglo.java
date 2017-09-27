import java.util.Random;

public class Arreglo{
	
	int[] arreglo = new int[100];
	int[][] matriz = new int[3][3];
	
	public void llenado(){
		Random rnd = new Random();
		for(int i = 0; i < arreglo.length; i++){
			arreglo[i] = rnd.nextInt(100) + 1;
		}
	}

	public void mostrar(){
		for(int i = 0; i < arreglo.length; i++){
			System.out.println("valor = " + arreglo[i]);
		}
	}

	public void ordenar(char tipo) {
		if (tipo == 'A') {
			bubbleSort();
		} else if (tipo == 'B') {
			unBubbleSort();
		} else {
			System.out.println("Error de tipo orden");
		}
	}
	
	private void bubbleSort() {
		int temp;
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = 0; j < arreglo.length - i - 1; j++){
				if (arreglo[j] < arreglo[j+1]) {
					temp = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = temp; 
				}
			}
		}
	}
	
	private void unBubbleSort() {
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
	
	public void llenadoMatriz(){
		Random rnd = new Random();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rnd.nextInt(10) + 1;
			}
		}
	}
	
	public void mostrarMatriz() {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void determinante(){
		int det = matriz[0][0] * matriz[1][1] * matriz[2][2] +
				  matriz[0][1] * matriz[1][2] * matriz[2][0] +
				  matriz[0][2] * matriz[1][0] * matriz[2][1] -
				  matriz[0][0] * matriz[1][2] * matriz[2][1] -
				  matriz[0][1] * matriz[1][0] * matriz[2][2] -
				  matriz[0][2] * matriz[1][1] * matriz[2][0];
		
		System.out.println("El determinante es: " + det);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}