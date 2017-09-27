import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Lista {

    List<Alumno> lAlum = new ArrayList();
    List<Asignatura> lAsig = new ArrayList();
    FuenteDeDatos fd = new FuenteDeDatos();
    List<String> lineas;
    
    public void llenadoAlumno(String nameFileAlm){
        StringTokenizer tk;
        Alumno alum;
        
        lineas = fd.leerArchivo(nameFileAlm);
        for(String linea : lineas){
            tk = new StringTokenizer(linea, ";");
            if(tk.hasMoreElements()){
                alum = new Alumno();
                alum.setId(tk.nextToken());
                alum.setApellidoPaterno(tk.nextToken());
                alum.setApellidoMaterno(tk.nextToken());
                alum.setNombre(tk.nextToken());
                lAlum.add(alum);
            }
        }
    }
    
    public void llenadoPromedios(String nameFileAsg1, String nameFileAsg2){
        StringTokenizer tk;
        Asignatura asg;
        
        lineas = fd.leerArchivo(nameFileAsg1);
        for (String linea : lineas) {
            tk = new StringTokenizer(linea, ";");
            if (tk.hasMoreElements()) {
                asg = new Asignatura();
                asg.setId(tk.nextToken());
                asg.setnQ1(tk.nextToken());
                asg.setnQ2(tk.nextToken());
                asg.setnQ3(tk.nextToken());
                asg.setnC1(tk.nextToken());
                asg.setnC2(tk.nextToken());
                asg.setnC3(tk.nextToken());
                lAsig.add(asg);
                
            }
        }
    }
}