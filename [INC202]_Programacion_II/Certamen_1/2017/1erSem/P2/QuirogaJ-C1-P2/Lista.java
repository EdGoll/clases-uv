import java.util.Random;

public class Lista extends Alumno{

	private int grupoAcant=0; //Tamaño del grupo A
	private int grupoBcant=0; //Tamaño del grupo B
	private int tamañoCurso; //cantidad de alumnos
	private int[] curso; //arreglo para cada ID

	public Lista(){
	}

	public void crearCurso(){
		Random rnd = new Random();
		tamañoCurso = rnd.nextInt(75) + 41; //numero aleatorio entre el 41 y el 75 para la cantidad de alumnos
	}

	public void crearLista(){

			for(int i = 0; i < tamañoCurso; i++){

				Random rnd2 = new Random();
				id = rnd2.nextInt(100) + 1;
				
				curso[i] = id;

				if (curso[i] = curso [i+1]){
					Random rnd2 = new Random();
					id = rnd2.nextInt(100) + 1;
					curso[i+1] = id;
				}
			}
	}

	public void crearGrupos(){

		for(int i = 0; i < tamañoCurso; i++){
			Random rnd3 = new Random();
			grupo = rnd3.nextBoolean();

			if (grupo = true){
				curso[i] = grupoA[i];
				grupoAcant = grupoAcant + 1;	
			}else{
				curso[i] = grupoB[i];
				grupoBcant = grupoBcant + 1;
			}


    	}
    	}

    public void mostrarCurso(){
    	System.out.print("lista del curso:  ");
    	for(int i = 0; i < tamañoCurso; i++){
    		System.out.println("Alumno  "+(i + 1) +":"+" -ID:" + curso[i];
    	}
	}
	public void mostrarGrupos(){ //no entiendo porque no se crea como metodo :(
    	System.out.print("lista del grupo A:  ");
    		for(int i = 0; i < grupoAcant; i++){
    		System.out.println("Alumno  "+(i + 1) +":"+" -ID:" + grupo[i];
    		}
    	System.out.print("lista del grupo B:  ");
    		for(int i = 0; i < grupoBcant; i++){
    		System.out.println("Alumno  "+(i + 1) +":"+" -ID:" + grupo[i];
    		}
    }
    

}