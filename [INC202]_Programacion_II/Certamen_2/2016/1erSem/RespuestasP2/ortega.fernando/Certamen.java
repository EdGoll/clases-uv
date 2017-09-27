
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.List;
/**
 *
 * @author Lab
 */
public class Certamen {

    public class llenado{
        ArrayList<alumno> al = new ArrayList<alumno>();
        List<String> lista = new List<String>();
        StringTokenizer st = new StringTokenizer(String(","));
        FuenteDeDatos fd = new FuenteDeDatos();
        lista = fd.leerArchivo("alumnos.csv");
        for (Object cd : st){
        st = new StringTokenizer(String(","));
        
        }
    }
    public void respuestas(){
        PQ = (alumno.getnotaq1 + alumno.getnotaq2 + getnotaq3)/2;
        PT = (alumno.getnotat1 + alumno.getnotat2 + getnotat3)/2;
        PC = (alumno.getnotac1 + alumno.getnotac2 + alumno.getnotac3)/2;
           
        }
    
}
