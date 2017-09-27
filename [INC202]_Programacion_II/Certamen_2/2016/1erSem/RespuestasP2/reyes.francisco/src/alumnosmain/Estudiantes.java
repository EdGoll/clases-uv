
package alumnosmain;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Estudiantes {
    
    public String oracion,corte;
   
    ArrayList<String> nombre = new ArrayList<>();
    ArrayList<String> apellido1 = new ArrayList<>();
    ArrayList<String> apellido2 = new ArrayList<>();
    ArrayList<String> notas1 = new ArrayList<>();
    ArrayList<String> notas2 = new ArrayList<>();
 
    public int i=0;
    
    public void cambiarString(List<String> linea){
        for(int i=0; i<linea.size();i++){
            oracion= linea.get(i);
        }
        i++;
        if (i==1){
        mostrarArchivo(linea);
        }
        if(i==2){
        parciarNombre(oracion);
        }
        if(i==3){
        parciarAsignatura1(oracion);
        }
        if(i==4){
        parciarAsignatura2(oracion);
        }
    }
    
    public void parciarNombre(String var){
       StringTokenizer tk = new StringTokenizer(var,";");
       for(int i=0;i<var.length();i++){
           corte = tk.nextToken();
           i++;
           if(i==1){
              nombre.add(corte);
           }
           if(i==2){
               apellido1.add(corte);
           }
           if(i==3){
               apellido2.add(corte);
               i=0;
           }        
       }      
    }
       
    
    
    public void parciarAsignatura1(String var){
       StringTokenizer tk = new StringTokenizer(var,";");
       for(int i=0;i<var.length();i++){
           corte = tk.nextToken();
           notas1.add(corte);
       }
    }
    
    public void parciarAsignatura2(String var){
           StringTokenizer tk = new StringTokenizer(var,";");
       for(int i=0;i<var.length();i++){
           corte = tk.nextToken();
           notas2.add(corte);
       }
    
    }
    
    public void mostrarArchivo(List<String> var){
            for(i=0;i<var.size();i++){
            System.out.println(var.get(i));
            }
    }


}

