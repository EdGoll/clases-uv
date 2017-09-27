/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certamen2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author lab
 */
public class AlumnosImp {
    private List<String> lineas;
    private List<Alumnos> alumno;
    private List<Asignatura1> asig1;
    private List<Asignatura2> asig2;
    private StringTokenizer st;
    
    
    public void llenarAlumno(){
        Alumnos a;
        alumno = new ArrayList<Alumnos>();
        FuenteDeDatos fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("C:\\Users\\lab\\Downloads\\alumnos.csv");
        for(String linea : lineas){
            a = new Alumnos();
            st = new StringTokenizer(linea, ";");
            if(st.hasMoreTokens()){
                a.setid(st.nextToken());
                a.setap(st.nextToken());
                a.setam(st.nextToken());
                a.setnombre(st.nextToken());
                alumno.add(a);
            }
        }
    }
    
    public void llenarA1(){
        Asignatura1 a1;
        asig1 = new ArrayList<Asignatura1>();
        FuenteDeDatos fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("C:\\Users\\lab\\Downloads\\asignatura1.csv");
        for(String linea : lineas){
            a1 = new Asignatura1();
            st = new StringTokenizer(linea, ";");
            if(st.hasMoreTokens()){
                a1.setid(st.nextToken());
                a1.setq1(st.nextToken());
                a1.setq2(st.nextToken());
                a1.setq3(st.nextToken());
                a1.sett1(st.nextToken());
                a1.sett2(st.nextToken());
                a1.setc1(st.nextToken());
                a1.setc2(st.nextToken());
                a1.setc3(st.nextToken());
                asig1.add(a1);
            }
        }
    }
    
    public void llenarA2(){
        Asignatura2 a2;
        asig2 = new ArrayList<Asignatura2>();
        FuenteDeDatos fd = new FuenteDeDatos();
        lineas = fd.leerArchivo("C:\\Users\\lab\\Downloads\\asignatura2.csv");
        for(String linea : lineas){
            a2 = new Asignatura2();
            st = new StringTokenizer(linea, ";");
            if(st.hasMoreTokens()){
                a2.setid(st.nextToken());
                a2.setq1(st.nextToken());
                a2.setq2(st.nextToken());
                a2.setq3(st.nextToken());
                a2.sett1(st.nextToken());
                a2.sett2(st.nextToken());
                a2.setc1(st.nextToken());
                a2.setc2(st.nextToken());
                a2.setc3(st.nextToken());
                asig2.add(a2);
            }
        } 
    }
    
    public void mostrar(){
        for(Asignatura1 a1 : asig1){
            System.out.println((a1.getq1()+ a1.getq2()) +" "+ a1.getq3());
        }
    }
}
