
package promedio;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PromedioImp {

    FuenteDeDatos fu = new FuenteDeDatos();
    List<String> lineas=null;
    List<String> escribir=null;
    List <Void> esc;
    List<Promedio> alumnos= new ArrayList<Promedio>();
    List<Asignatura> asignatura1 = new ArrayList<Asignatura>();
    List<Asignatura> asignatura2 = new ArrayList<Asignatura>();

    public PromedioImp() {
        this.esc = null;
    }

    public void cargarAlumnos(){
        Promedio pr;
        lineas=fu.leerArchivo("alumnos.cvs");
        StringTokenizer st;
        for (String alumno : lineas) {
            pr= new Promedio();
            st = new StringTokenizer(alumno,";");
            if(st.hasMoreTokens()){
                pr.setId(st.nextToken());
                pr.setApellidoPaterno(st.nextToken());
                pr.setApellidoMaterno(st.nextToken());
                pr.setNombre(st.nextToken());
            }
            alumnos.add(pr);
        }
        
    }
    
    public void cargarAsignaturas1() {
        Asignatura as;
        lineas = fu.leerArchivo("asignatura1.csv");
        StringTokenizer st;
        for (String asignatura : lineas) {
            as = new Asignatura();
            st = new StringTokenizer(asignatura, ";");
            float nota, nota2, nota3;
            float pq, pt, pc;
            if (st.hasMoreTokens()) {
                as.setIdAlumno(st.nextToken());
                nota = Float.parseFloat(st.nextToken()); 
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());
                pq = (nota + nota2 + nota3) / 3;
                nota = Float.parseFloat(st.nextToken());
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());
                pt = (nota + nota2 + nota3) / 3;
                nota = Float.parseFloat(st.nextToken());
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());
                pc = (nota + nota2 + nota3) / 3;
                if(pc >= 4.0){
                    as.setNotaFinal(pc * 0.7f + pq * 0.15f + pt * 0.15f);
                }else if(pc >= 3.5){
                    as.setNotaFinal(pc * 0.8f + pq * 0.10f + pt * 0.10f);
                }else if(pc >= 3.0){
                    as.setNotaFinal(pc * 0.9f + pq * 0.05f + pt * 0.05f);
                }else{
                    as.setNotaFinal(pc);
                }
            }
            asignatura1.add(as);
        }

    }
    
    public void cargarAsignaturas2() {
        Asignatura as;
        lineas = fu.leerArchivo("asignatura2.csv");
        StringTokenizer st;
        for (String asignatura : lineas) {
            as = new Asignatura();
            st = new StringTokenizer(asignatura, ";");
            float nota,nota2,nota3;
            float pq, pt, pc;
            if (st.hasMoreTokens()) {
                as.setIdAlumno(st.nextToken());
                nota = Float.parseFloat(st.nextToken()); 
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());
                pq = (nota + nota2 + nota3) / 3;
                nota = Float.parseFloat(st.nextToken());
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());
                pt = (nota + nota2 + nota3) / 3;
                nota = Float.parseFloat(st.nextToken());
                nota2 = Float.parseFloat(st.nextToken());
                nota3 = Float.parseFloat(st.nextToken());
                pc = (nota + nota2 + nota3) / 3;
                if(pc >= 4.0){
                    as.setNotaFinal(pc * 0.7f + pq * 0.15f + pt * 0.15f);
                }else if(pc >= 3.5){
                    as.setNotaFinal(pc * 0.8f + pq * 0.10f + pt * 0.10f);
                }else if(pc >= 3.0){
                    as.setNotaFinal(pc * 0.9f + pq * 0.05f + pt * 0.05f);
                } else {
                    as.setNotaFinal(pc);
                }
            }
            asignatura2.add(as);
        }

    }
    
   
    
    
    
    
    
    
    
    
}
