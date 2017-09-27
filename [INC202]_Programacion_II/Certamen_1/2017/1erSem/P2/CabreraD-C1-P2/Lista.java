import java.util.Random;
import java.util.ArrayList;

public class Lista {
	private Random num_ale = new Random();
	private Alumno[] lista = new Alumno[num_ale.nextInt(60)+40];
	private ArrayList <Alumno> grupo_A = new ArrayList();
	private ArrayList <Alumno> grupo_B = new ArrayList();
	
	public Lista(){
		this.LlenarGrupos();
	}

	private void LlenarGrupos(){
		this.IdentificadoresSinRepeticion();
		for(Alumno i: lista){
			if(num_ale.nextInt(2) == 1){
				grupo_A.add(i);
			}
			else{
				grupo_B.add(i);
			}
		}
	}

	private void IdentificadoresSinRepeticion(){
		int i=0,z;
		boolean repeticion;
		lista[i] = new Alumno(num_ale.nextInt(lista.length));

		for(i=1; i<lista.length; i++){
			repeticion = false;
			while(!repeticion){
				lista[i] = new Alumno(num_ale.nextInt(lista.length));
				z=0;
				while(!repeticion && z<i){
					if(lista[i].equals(lista[z])){
						repeticion = true;
					}
					else{
						z++;
					}
				}
				repeticion= (repeticion)?false :true;
			}
			
		}
	}
	
	
	public void MostrarGrupos(){
		System.out.print("De un total de "+lista.length+" Estudiantes, se han creado los siguientes grupos para rendir el Certamen 3.\n\nGRUPO A ("+grupo_A.size()+" Estudiantes):\n[");
		for(Alumno i: grupo_A){
			System.out.print(i.toString()+"\t");		
		}
		System.out.println("]");
		
		System.out.print("\nGRUPO B ("+grupo_B.size()+" Estudiantes):\n[");
		for(Alumno i: grupo_B){
			System.out.print(i.toString()+"\t");
		}
		System.out.println("]");
	}
}
