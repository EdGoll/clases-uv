
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PrAl {
    private final FuenteDeDatos fdd;
    StringTokenizer stz;
    List<String> lineas = null;
    List<Alumnos> al= new ArrayList<>();
    List<Asignaturas1> as1 = new ArrayList<>();
    List<Asignaturas2> as2 = new ArrayList<>();
       
    private PrAl(){
        fdd = new FuenteDeDatos();
        lineas = fdd.leerArchivo("alumnos.txt");
        lineas = fdd.leerArchivo("asignaturas1.txt");
        lineas = fdd.leerArchivo("asignaturas2.txt");
        stz = new StringTokenizer(stz,";");     

        if(stz.hasMoreElements()){            
            Alumnos Al = new Alumnos();
            Al.setID(integerInt.(nextToken()));
            Al.setApepa(String.nextToken());
            Al.setApema(String.(nextToken()));
            Al.setNombres(String.nextToken());
        }
        if(stz.hasMoreElements()){
            Asignaturas1 A1 = new Asignaturas1();
            A1.setId(integerInt(Int.nextToken()));
            A1.setNQ1(float.nextToken()); //no recuerdo como pasar el flotante. 
            A1.setNQ2(float.nextToken()); //".."
            A1.setNQ3(Float.nextToken());
            A1.setNT1(float.nextToken());
            A1.setNT2(float.nextToken());
            A1.setNC1(float.nextToken());
            A1.setNC2(float.nextToken());
            A1.setNC3(float.nextToken());
        }   
        if(stz.hasMoreElements()){
            Asignaturas2 A2 = new Asignaturas2();
            A2.setId(integerInt.(nextToken()));
            A2.setNQ1(float.nextToken()); //no recuerdo como pasar el flotante. 
            A2.setNQ2(float.nextToken()); //".."
            A2.setNQ3(Float.nextToken());
            A2.setNT1(float.nextToken());
            A2.setNT2(float.nextToken());
            A2.setNC1(float.nextToken());
            A2.setNC2(float.nextToken());
            A2.setNC3(float.nextToken());
            
            
        }
        
        Completar();
        
        }
    public void Completar(){   
        void Calcular(){
            PQ = 0;
            PT = 0;
            PC = 0;
            for(linea : l){
                if(){
                
                }
            
            }


        }
    }
}
    
        
    
    
    

