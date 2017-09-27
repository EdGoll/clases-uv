import java.util.Random;

public class Alumno extends Lista{
	//Atributos
	private int identificador=0;
	private int busca_identificador=0;
	//Metodos
	private void obtenerValor(){
		Random rndx=new Random();
		if (identificador != this.lista2.get(rndx.nextInt(lista2.size()))){
			identificador = this.lista2.remove(rndx.nextInt(lista2.size()));
		}
	}
	public void mostrar(){
		for (int i=0; i<lista_A.length; i++){
			if (busca_identificador==lista_A[i]){
				System.out.println("El Alumno pertenece a la lista A");
			}
		}
		for (int i=0; i<lista_B.length; i++){
			if (busca_identificador==lista_B[i]){
				System.out.println("El Alumno pertenece a la lista B");
			}
		}
	}

	
	//Constructor
	public Alumno(int d){
		super(d);
		busca_identificador=d;
	}
	
}