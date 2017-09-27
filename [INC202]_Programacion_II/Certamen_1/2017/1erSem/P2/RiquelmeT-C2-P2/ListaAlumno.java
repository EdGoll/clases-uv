import java.util.ArrayList;
import java.util.Random;




public class ListaAlumno {
    //Crear las listas del total de alumnos y los grupos
    private ArrayList<Alumno> totalAlumnos = new ArrayList<>();
    private ArrayList<Alumno> grupoAlumnosA = new ArrayList<>();
    private ArrayList<Alumno> grupoAlumnosB = new ArrayList<>();
    private final int MIN_TOTAL, MAX_TOTAL , MAX_IDENT;
    private Random rand;
    private int tam;
    
    public ListaAlumno(){
        /*iniciar y obtener variable random para la
        cantidad de alumnos*/
        this.MIN_TOTAL = 41;
        this.MAX_TOTAL = 75;
        this.MAX_IDENT = 100;
        rand = new Random();
        //Tamaño de la lista aleatoria entre 40 > x >= 75
        tam = rand.nextInt(MAX_TOTAL - MIN_TOTAL)+ MIN_TOTAL;
        
    }
    public void llenarLista(){		
	Alumno x;
        for (int i = 0; i < tam; i++) {
                x = new Alumno();
                x.setIdent(crearIdent());
                totalAlumnos.add(x);

		}   
    }
    private int crearIdent(){
        int ident = rand.nextInt(MAX_IDENT) + 1;
        return ident;
    }
    public void dividirListas() {
        Alumno b;
            for (int i = 0; i < tam; i++) {
                b = totalAlumnos.remove(rand.nextInt(totalAlumnos.size()));
            if ((rand.nextInt(10)%2) == 0) {
                grupoAlumnosA.add(b);
            } else {
                grupoAlumnosB.add(b);
            }
        }
    }
    public void mostrarLista() {
        System.out.println("Curso : ");    
	for (int i = 0; i < totalAlumnos.size(); i++) {
            System.out.println(totalAlumnos.get(i));
		}
	}
    public void mostrarGrupos() {
	System.out.println("Grupo A: "); {
	for (int i = 0; i < grupoAlumnosA.size(); i++){
            System.out.println(grupoAlumnosA.get(i));
            
            }
            
	}
        System.out.println("Grupo B: ");
        for (int i = 0; i < grupoAlumnosB.size(); i++){
            System.out.println(grupoAlumnosB.get(i));
            
            }
        
        }

        
}
