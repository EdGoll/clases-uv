
package certamen2;

import java.util.*;

public class Lista {
    
    private List<Datos>datos;
    private List<String>lista;
    
    public Lista(){
        lista.FuenteDeDatos.LeerArchivo("C:\\Users\\lab\\Desktop\\asignatura1.csv");
        lista.FuenteDeDatos.LeerArchivo("C:\\Users\\lab\\Desktop\\asignatura2.csv");
        lista.FuenteDeDatos.LeerArchivo("C:\\Users\\lab\\Desktop\\alumnos.csv");
    }
    
    public void cargar(){
        Datos d;
        
        if(lista!=null &&  !lista.isEmpty()){
        
            for(String linea: lista){
               datos=new ArrayList<>();
               d=new Datos();
               StringTokenizer st= new  StringTokenizer(linea, ";");
               while(st.hasMoreElements()){
                   
                   d.setA_paterno(st.nextToken());
                   d.setA_materno(st.nextToken());
                   d.setNombre(st.nextToken());
                   
                   
                   
               }
               datos.add(d);
            } 
        }
        
        
    }
    
}
