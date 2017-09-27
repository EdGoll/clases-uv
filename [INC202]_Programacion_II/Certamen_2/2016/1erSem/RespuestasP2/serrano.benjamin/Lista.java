package Certamen;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Lista {
    
    private List<Alumno> listaAlumno;
    private List<Asignatura1> listaCurso1;
    private List<Asignatura2> listaCurso2;
    FuenteDeDatos fd = new FuenteDeDatos();
    private Alumno alumno;
    private Asignatura1 curso1;
    private Asignatura2 curso2;
    List<String> lineasAlumnos;
    List<String> lineas1;
    List<String> lineas2;
    
    Lista(){
        listaAlumno = new ArrayList<Alumno>();
        lineasAlumnos = fd.leerArchivo("C:\\alumnos.csv");
        Sistema();
        listaCurso1 = new ArrayList<Asignatura1>();
        lineas1 = fd.leerArchivo("C:\\asignatura1.csv");
        Sistema();
        listaCurso2 = new ArrayList<Asignatura2>();
        lineas2 = fd.leerArchivo("C:\\asignatura2.csv");
        Sistema();
    }
    
    private void Sistema(){
        
        StringTokenizer p = new StringTokenizer(";");
        
        for (String linea: lineasAlumnos) {
            if(p.hasMoreElements()){
                if(p.hasMoreElements()){
                    alumno = new Alumno();
                    alumno.setId(p.nextToken());
                    alumno.setApellidoPaterno(p.nextToken());
                    alumno.setApellidoMaterno(p.nextToken());
                    alumno.setNombres(p.nextToken());
                    listaAlumno.add(alumno);
                }
            }
        }
        
        for (String linea : lineas1) {
            if(p.hasMoreElements()){
                if(p.hasMoreElements()){
                   curso1 = new Asignatura1();
                   curso1.setId(p.nextToken());
                   curso1.setQuiz1(p.nextToken());
                   curso1.setQuiz2(p.nextToken());
                   curso1.setQuiz3(p.nextToken());
                   curso1.setTarea1(p.nextToken());
                   curso1.setTarea2(p.nextToken());
                   curso1.setCertamen1(p.nextToken());
                   curso1.setCertamen2(p.nextToken());
                   curso1.setCertamen3(p.nextToken());
                   listaCurso1.add(curso1);
                }
            }
        }
        for (String linea : lineas2) {
            if(p.hasMoreElements()){
                if(p.hasMoreElements()){
                   curso2 = new Asignatura2();
                   curso2.setId(p.nextToken());
                   curso2.setControl1(p.nextToken());
                   curso2.setControl2(p.nextToken());
                   curso2.setControl3(p.nextToken());
                   curso2.setTarea1(p.nextToken());
                   curso2.setTarea2(p.nextToken());
                   curso2.setCertamen1(p.nextToken());
                   curso2.setCertamen2(p.nextToken());
                   curso2.setCertamen3(p.nextToken());
                   listaCurso2.add(curso2);
                }
            }
        }
        
    }
    
    public void Promedios(){
        
        for (Alumno listaAlumno: listaAlumno) {
            for (Asignatura1 listaCurso1 : listaCurso1) {
                if(listaAlumno.getId().equals(listaCurso1.getId())){
                    
                }
            }
        }
    }
}
