import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class TDAlista {
    int a;
    Scanner SC = new Scanner(System.in);
    FuenteDeDatos FD = new FuenteDeDatos();
    List<String> Lista = new ArrayList<>();
    public List ImportarArchivo(){
        System.out.println("Archivo que desea leer\n"
                + "1) Alumnos\n"
                + "2) Asignatura1\n"
                + "3) Asignatura2");
            
            FD.leerArchivo(Lista);
    }
    public void EscribirArchivo(){
        
    }
}
