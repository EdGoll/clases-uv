
import java.util.*;

public class ListaAlumno {
    private ArrayList<Alumno> list = new ArrayList<>() ;
    private ArrayList<Alumno> grupoA = new ArrayList<>();
    private ArrayList<Alumno> grupoB = new ArrayList<>();
    private Random r;
    private int tamaño_total;
  

public ListaAlumno(){
r = new Random();
tamaño_total = r.nextInt(75 - 40) + 40+1;
}
public void rellenarLista(){
    Alumno alu;
    System.out.println("__________________________________________________________");
    System.out.println("La cantidad de alumnos es: " + tamaño_total);
    System.out.println("__________________________________________________________");
    for (int i = 0; i < tamaño_total; i++) {
        alu = new Alumno();
        alu.guardarId (IdUnica());
        list.add(alu);
    }
}

private int IdUnica(){
int idd;
do{
    idd = crearId();
}while (idd < 0);
 return idd;
}
private int crearId(){   
    int id = (int) Math.floor(Math.random()*(100-1+1)+1);
    for (Alumno variable : list) {
        if (variable.obtenerId() == id) {
            id = - 1;
            break;
        }
    }

    return id;
}
public void grupos(){
    System.out.println("__________________________________________________________");
    System.out.println("Grupo A:");
    System.out.println("__________________________________________________________");
    for (Alumno alu : grupoA ) {
        System.out.println(alu);
    }
    System.out.println("__________________________________________________________");
    System.out.println("Grupo B:");
    System.out.println("__________________________________________________________");
    for (Alumno alu : grupoB ) {
        System.out.println(alu);
    }
}
public void SepararLista(){
    Alumno alu;
    IdUnica();
    for (int i = 0; i < tamaño_total; i++) {
        alu = list.remove(r.nextInt(list.size()));
        if (IdUnica() % 2 == 0){
            grupoA.add(alu);
        }else{
            grupoB.add(alu);
        }
    }
}

public void mostrarCurso(){
    System.out.println("__________________________________________________________");
    System.out.println("El curso es: ");
    System.out.println("__________________________________________________________");
    for (Alumno alu : list) {
        System.out.println(alu);
    }
}

}
