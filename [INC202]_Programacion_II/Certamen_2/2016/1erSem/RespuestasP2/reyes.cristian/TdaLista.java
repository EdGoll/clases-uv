
package ce2;

import java.util.*;
public class TdaLista {
    public TdaLista(){
        
    }
    public void promedio(){
    
    }
    FuenteDeDatos fd = new FuenteDeDatos();
	List<String> lineas;
	List<Alumnos> alumno ;
	List<Asignatura1> asi1;
        List<Asignatura1> asi2;
        
        public void cargarAlumnos(){
            StringTokenizer st=null;
            lineas= fd.leerArchivo("alumnos.csv");
            for(String Linea: (lineas)){
                st=new StringTokenizer(Linea,";");
                if(st.hasMoreElements()){
                    Alumnos al= new Alumnos();
                    al.setID(st.nextToken());
                    al.setApellidoM(st.nextToken());
                    al.setApellidoP(st.nextToken());
                    al.setNombre(st.nextToken());
                    alumno.add(al);
                }
            }
        }
        public void cargarAsignatura1(){
            StringTokenizer st=null;
            lineas= fd.leerArchivo("alumnos.csv");
            for(String Linea: (lineas)){
                st=new StringTokenizer(Linea,";");
                if(st.hasMoreElements()){
                    Asignatura1 al=new Asignatura1();
                    al.setId(st.nextToken());
                    al.setNotaq1(Float.parseFloat(st.nextToken())); 
                    al.setNotaq2(Float.parseFloat(st.nextToken()));
                    al.setNotaq3(Float.parseFloat(st.nextToken()));
                    al.setTar1(Float.parseFloat(st.nextToken()));
                    al.setTar2(Float.parseFloat(st.nextToken()));
                    al.setCer1(Float.parseFloat(st.nextToken()));
                    al.setCer2(Float.parseFloat(st.nextToken()));
                    al.setCer3(Float.parseFloat(st.nextToken()));
                    asi1.add(al);  
         
                }
            }
        }
        public void cargarAsignatura2(){
            StringTokenizer st=null;
            lineas= fd.leerArchivo("alumnos.csv");
            for(String Linea: (lineas)){
                st=new StringTokenizer(Linea,";");
                if(st.hasMoreElements()){
                    Asignatura1 al=new Asignatura1();
                    al.setId(st.nextToken());
                    al.setNotaq1(Float.parseFloat(st.nextToken())); 
                    al.setNotaq2(Float.parseFloat(st.nextToken()));
                    al.setNotaq3(Float.parseFloat(st.nextToken()));
                    al.setTar1(Float.parseFloat(st.nextToken()));
                    al.setTar2(Float.parseFloat(st.nextToken()));
                    al.setCer1(Float.parseFloat(st.nextToken()));
                    al.setCer2(Float.parseFloat(st.nextToken()));
                    al.setCer3(Float.parseFloat(st.nextToken()));
                    asi1.add(al);
              
                }
            }
        }
        public void Completar(){
            for(Alumnos pa: alumno){
                for(Asignatura1 asignatura1: asi1){
                    for (Asignatura2 asignatura2: asi2){
                    }
                }
            }
        }
        
}
