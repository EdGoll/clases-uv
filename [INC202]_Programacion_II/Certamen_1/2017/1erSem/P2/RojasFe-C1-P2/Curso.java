import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Curso{
	Random c = new Random();	

	private List<Alumno> paraleloA;
	private List<Alumno> paraleloB;
	private List<Alumno> curso;
	private final int TAMANIO = c.nextInt(75-40+1)+40;
 

	public void crearParalelos(){

        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            array.add(i);								//agregamos al final del arreglo un cierto indice.
        }
        Collections.shuffle(array);						//desordena el arreglo para luego ser ordenado por el curso.
		curso = new ArrayList<Alumno>();
        Alumno a=null;
        for(int i = 1; i<TAMANIO; i++){					
        	a = new Alumno();
            a.setNombreAl(array.get(i));
            curso.add(a);
        }
    


		Collections.shuffle(curso);
		paraleloA = new ArrayList<Alumno>();  //Creamos Paralelo A.
		Alumno b=null;
        for(int i = 1; i<(TAMANIO); i++){
        	b = new Alumno();
            b.setNombreAl(curso.get(i));
            paraleloA.add(b);
            i++;
        }

		paraleloB = new ArrayList<Alumno>();  //Creamos Paralelo B.        
        Alumno d=null;
        for(int i = 2; i<(TAMANIO); i++){
        	d = new Alumno();
            d.setNombreAl(curso.get(i));
            paraleloB.add(d);
        }
	}

	public void mostrarA(){
		for(int i=0; i<paraleloA.size(); i++){
			System.out.println("Alumno" + paraleloA.getNombreAl(i));

		}
	}
	public void mostrarB(){
		for(int i=0; i<paraleloB.size(); i++){
			System.out.println("Alumno" + paraleloB.getNombreAl(i));

		}
	}	
}