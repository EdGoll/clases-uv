

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Certamen2 {

    public static void main(String[] args) {
        Certamen2.escribir();
    }    
    
 static void escribir(){
        Asignatura asig = new Asignatura();
        double valor=asig.promedios();
        try{
        File f;
        Alumno alumnos = new Alumno(valor);
        FileWriter Escritor;
        f = new File("consolidado.csv");
        Escritor = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(Escritor);
        PrintWriter escribir = new PrintWriter(bw);
        escribir.write("ID ALUMNO: "+alumnos.getId()+" Nota Final Asignatura 1: "+alumnos.getNotafinaluno()+"Nota Final Asignatura 2:"+alumnos.getNotalfinaldos());
        bw.close();
        escribir.close();
        
        }
        catch(IOException e){
            System.out.println("ERROR");
        }
        
    }
    
    
}
