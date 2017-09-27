import java.util.Random;
import java.util.ArrayList;


public class Lista{

	private ArrayList<Alumno> listaTotal = new ArrayList<>();
	private ArrayList<Alumno> lista_A = new ArrayList<>();
	private ArrayList<Alumno> lista_B = new ArrayList<>();
	private Random rand;
	private int tam_LIST, max_LIM = 75, min_LIM = 40, max_ID = 100;

	

	public void llenadoLista(){
		rand = new Random();
		tam_LIST = rand.nextInt(max_LIM - min_LIM) + min_LIM + 1;
		Alumno alumno;
		for (int i = 0; i < tam_LIST; i ++){
			alumno = new Alumno();
			alumno.setID(generarID());
			listaTotal.add(alumno);
		}

	}
	public int generarID(){
		int id = rand.nextInt(max_ID) + 1;

		return id;
	}

	public void separarListas(){

		Alumno alumno;
		for(int i = 0; i < tam_LIST; i++){
			alumno = listaTotal.remove(rand.nextInt(listaTotal.size()));

			if(rand.nextInt(2) == 0){
				lista_A.add(alumno);
			}else{
				lista_B.add(alumno);
			}
		}
	}

	public void imprimirGruposSeparados() {
		System.out.println("Grupo A:");
		for(int i = 0; i < lista_A.size();i++){
			System.out.println(lista_A.get(i));
		}
		System.out.println("Grupo B:");
		for(int i = 0; i < lista_B.size();i++){
			System.out.println(lista_B.get(i));
		}
	}	



	public void imprimirListaCompleta(){
		System.out.println("Curso Completo: ");
		for(int i = 0; i < listaTotal.size();i++){
			System.out.println(listaTotal.get(i));
		}

	}



}










