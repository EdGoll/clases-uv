

import static java.lang.Double.parseDouble;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NotasAlumnosImp {

    public NotasAlumnosImp() {
        cargarAlumnos();
        cargarNotasAsignatura();
        promedio();
    }

    List<Asignatura> lasig = null;
    List<Alumno> lalum= new ArrayList<>();
    
    public void cargarAlumnos() {
        Alumno a ;
        FuenteDeDatos f = new FuenteDeDatos();
        List<String> lineas = f.leerArchivo("alumnos.csv");
        for (String linea : lineas) {
            a= new Alumno();
            StringTokenizer t = new StringTokenizer(linea, ";");
            while (t.hasMoreElements()) {
                a.setId(t.nextToken());
                a.setApellidoPaterno(t.nextToken());
                a.setApellidoMaterno(t.nextToken());
                a.setNombre(t.nextToken());
                
            }
            lalum.add(a);
        }

    }

    public void cargarNotasAsignatura() {
        Asignatura a = new Asignatura();
        lasig = new ArrayList<>();
        FuenteDeDatos f = new FuenteDeDatos();
        List<String> lineas = f.leerArchivo("asignatura1.csv");
        for (String linea : lineas) {
            StringTokenizer t = new StringTokenizer(linea, ";");
            while (t.hasMoreElements()) {
                a.setId(t.nextToken());
                a.setNotaQuiz1(t.nextToken());
                a.setNotaQuiz2(t.nextToken());
                a.setNotaQuiz3(t.nextToken());
                a.setNotaTarea1(t.nextToken());
                a.setNotaTarea2(t.nextToken());
                a.setNotaCertamen1(t.nextToken());
                a.setNotaCertamen2(t.nextToken());
                a.setNotaCertamen3(t.nextToken());

            }
            lasig.add(a);
        }
        

    }

    public void promedio() {
        double g = 0;
        for (int i = 0; i < lalum.size(); i++) {  
            for (Alumno alum : lalum) {
                for (Asignatura asignatura : lasig) {
                    if(Double.parseDouble(alum.getId())== Double.parseDouble(asignatura.getId())){
                        g= (Double.parseDouble(asignatura.getNotaQuiz1())+Double.parseDouble(asignatura.getNotaQuiz2())+Double.parseDouble(asignatura.getNotaQuiz3()))/3;
                    }
                }
            }
        }
        System.out.println(g);
    }
    
    


}

