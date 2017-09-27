import java.util.Random;
import java.util.ArrayList;

public class Lista{
	//Atributos
	private ArrayList <Integer> lista_completa=new ArrayList <Integer> ();
	public ArrayList <Integer> lista1=new ArrayList <Integer> (lista_completa);
	public ArrayList <Integer> lista2=new ArrayList <Integer> (lista_completa);
	public int[] lista_A;
	public int[] lista_B;
	private int tamanio=0;
	private int tamanio1=0;
	private int tamanio2=0;
	//Metodos
	public void llenarLista_completa(){ //Llena la Lista completa de alumnos segun la cantidad necesitada.
		Random rnd=new Random();
		Random rnd2=new Random();
		boolean flag=false;
		int alum=0;
		while(flag==false){
			if(rnd.nextInt()>=40 && rnd.nextInt()<=75){
				int tamanio=rnd.nextInt();
				flag = true;
			}
		}
		this.tamanio=tamanio;
		while (flag==true){
			int j=0;
			if (lista_completa.contains((rnd2.nextInt(100))+1)==false){
				lista_completa.add((rnd2.nextInt(100))+1);
				j++;
			}
			if (j==tamanio){
				flag=false;
			}
		}
	}
	public void llenarListas(){
		Random rnd=new Random();
		this.tamanio1=rnd.nextInt(tamanio);
		this.tamanio2=tamanio-tamanio1;
		int i=0;
		if (tamanio1<tamanio){
			while(i<tamanio1){
				if (i == 0){
					lista_A[i]= Integer.valueOf( lista1.remove( rnd.nextInt( lista1.size() ) ) );
					i++;
				}
				else{
					if (lista_A[i-1]!= Integer.valueOf(lista1.get(rnd.nextInt(lista1.size())))){
						lista_A[i]= Integer.valueOf(lista1.remove(rnd.nextInt(lista1.size())));
						i++;
					}
				}
			}
		}
		else if (tamanio2<tamanio){
			i=0;
			while(i<tamanio2){
				if (i == 0){
					lista_B[i]= Integer.valueOf(lista1.remove(rnd.nextInt(lista1.size())));
					i++;
				}
				else{
					if (lista_B[i-1]!= Integer.valueOf(lista1.get(rnd.nextInt(lista1.size())))){
						lista_B[i]= Integer.valueOf(lista1.remove(rnd.nextInt(lista1.size())));
						i++;
					}
				}
			}
		}
	}
	public void mostrar(){
		for (int i=0; i<lista_completa.size(); i++){
			System.out.println("La lista completa es: " + lista_completa.get(i) + "\n");
		}
		for (int i=0; i<lista_A.length; i++){
			System.out.println("La lista A tiene las siguientes IDs: " + lista_A[i] + "\n");
		}
		for (int i=0; i<lista_B.length; i++){
			System.out.println("La lista B tiene las siguientes IDs: " + lista_B[i] + "\n");
		}
	}

	//Constructor
	public Lista(int d){
		this.tamanio=d;
	}
}	