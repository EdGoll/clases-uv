import java.util.Random;
import java.util.ArrayList;

public class ListaAlumno {
    private ArrayList<Alumno> lista = new ArrayList<>();
    private ArrayList<Alumno>grupoA = new ArrayList<>();
    private ArrayList<Alumno>grupoB = new ArrayList<>();
    private Random rnd;
    private int tamanio;

//constructor y metodos
    public ListaAlumno() {
        rnd = new Random();
        tamanio = rnd.nextInt(35) + 40;
    }

    public void llenar() {
		Alumno a;
        for (int i = 0; i < tamanio; i++) {
		    a = new Alumno();
            a.setId(generarId());
            lista.add(a);
        }
    }
    public void dividir(){
        Alumno a;
        Random jiji;
        for (int i = 0; i < tamanio; i++) {
            jiji = new Random();
            int j = jiji.nextInt(1) + 1;
            a = new Alumno();
            if ( j == 1){
                grupoA.add(a); 
            }
            if ( j ==2 ){
                grupoB.add(a);
            }
        }
	}
    public int generarId(){
       int id = rnd.nextInt(100) + 1;
       for(Alumno g : lista){
           if(g.getId() == id){
                break;
           }
        }
         return id;   
    }

    
    public void mostrarL(){
        System.out.println("El total de alumnos es" + tamanio);
        }

    
    public void mostrarG(){
        System.out.println("Grupo A:");  
        for(Alumno a : grupoA) {
            System.out.println(a);
        }
        System.out.println("Grupo B:");
        for(Alumno a : grupoB) {
            System.out.println(a);
        }
    } 
}