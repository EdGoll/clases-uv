import java.util.ArrayList;
import java.util.Random;

public class Lista{
	private ArrayList grupoA = new ArrayList();
	private ArrayList grupoB = new ArrayList();
	private int[] arreglo = new int[75];

	/*public void llenar(Random identificador){
		Alumno id = new Alumno();
		id.setIdentificador(identificador);
		grupoA.add(id);
		grupoB.add(id);
	}*/

	public void llenado(){
		int i=0;
		Random rd = new Random();
		int tamanio = rd.nextInt(35) + 40;
		Random ps = new Random();
		int sp = ps.nextInt(100) + 1;
		arreglo[i] = sp;
		int cont = 0;
		for(i = 1; i < tamanio; i++){
			sp = ps.nextInt(100) + 1;
			grupoA.add(sp);
			arreglo[i] = sp;
			for(int j = 0; j < tamanio; j++){
				if(arreglo[i] == arreglo[j]){
					cont++;
				}
			}
			if(cont != 0){
				i--;
			}
		}
		for(int k = 0; k < 75-tamanio; k++){
			sp = ps.nextInt(100) + 1;
			grupoB.add(k,sp);
			arreglo[tamanio + k] = sp;
			for(int l = tamanio; l < 75; l++){
				if(arreglo[tamanio + k] == arreglo[l]){
					cont++;
				}
			}
			if(cont != 0){
				i--;
			}
		}

	}

	public void mostrar(){
		for(int a = 0; a < grupoA.size(); a++){
			System.out.print(grupoA.get(a));
		}
		for(int b = 0; b < grupoB.size(); b++){
			System.out.print(grupoB.get(b));
		}
	}
}
