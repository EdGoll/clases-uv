import java.util.Random;
import java.util.ArrayList;
import java.lang.Math.*;
public class Lista{
	private int tamaño;
	private ArrayList lista_a= new ArrayList();
	private ArrayList lista_b= new ArrayList();
	private ArrayList identificador= new ArrayList();

	public void generarIdentificadorSinRepetir(){
		Alumno a = new Alumno();
		Random rnd = new Random();
		tamaño = rnd.nextInt(35) + 40;
		a.llenar();
		identificador=a.asignarIdentificador(tamaño);
	}
	public void llenarListas(){
		int aux=0;
		for(int i=0; i<tamaño; i++){
			if((rnd.nextInt(100)%2==0) && (aux<Math.round(tamaño/2))){
				lista_a.add(identificador.get(i));
				aux+=1;
			}
			else{
				lista_b.add(identificador.get(i));
			}
		}
	}
	public void mostrar(){
		System.out.println("Lista A");
		for(int i = 0; i < lista_a.length; i++){
			System.out.print(lista_a.get(i) + " ");
		}
		System.out.println("Lista B");
		for(int i = 0; i < lista_b.length; i++){
			System.out.print(lista_b.get(i) + " ");
		}
		System.out.println("");
	}
}