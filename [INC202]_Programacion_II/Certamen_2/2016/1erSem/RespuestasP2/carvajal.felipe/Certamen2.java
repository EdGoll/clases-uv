
package certamen2;

import java.util.ArrayList;
import java.util.StringTokenizer;




public class Certamen2 {
    ArrayList<Alumno> Alumnos = new ArrayList();
    public Alumno alum = new Alumno();
    
    public void Setnom(String linea){
        StringTokenizer tk = new StringTokenizer(linea);
        alum.setapp(tk.nextToken());
        alum.setApm(tk.nextToken());
        alum.setNombres(tk.nextToken());
       
    }
    public static Alumno Setn1(String linea){
         StringTokenizer tk = new StringTokenizer(linea);
         for(int i=0; int<8;i++){
        alum.setnota1[i](tk.nextToken());
    }}
    
    public static Alumno Setn2(String linea){
         StringTokenizer tk = new StringTokenizer(linea);
         for(int i=0; int<8;i++){
        alum.setnota2[i](tk.nextToken());
  
         }
    }
    
    public static void main(String[] args) {
        Certamen2 c2= new Certamen2();
        Fuente fdd = new Fuente();
        fdd.leerArchivo("nombes");
        fdd.leerArchivo("notas1");
        fdd.leerArchivo("notas2");
        
    }
    
}
