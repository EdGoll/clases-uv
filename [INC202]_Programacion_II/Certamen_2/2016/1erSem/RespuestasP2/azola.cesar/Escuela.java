

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Escuela {
    
    FuenteDeDatos fd = new FuenteDeDatos();
    List<String> lineas;
    List<Alumno> listAlumno = new ArrayList<Alumno>();
    List<Asignatura> listAsignaturas1 = new ArrayList<Asignatura>();
    List<Asignatura> listAsignaturas2 = new ArrayList<Asignatura>();
    List<PromAlumno> Consolidado = new ArrayList<PromAlumno>();
    
    StringTokenizer st;
    Alumno A;
    Asignatura As;
    PromAlumno pa;
    
    public void rellenarAlumno(){
        lineas = fd.leerArchivo("alumno.csv");
        
        for(String l: lineas){
            st = new StringTokenizer(l,",");
            A= new Alumno();
            
            try{
                if (st.hasMoreElements()){
                    A.setId(st.nextToken());
                    A.setApellidoPaterno(st.nextToken());
                    A.setApellidoMaterno(st.nextToken());
                    A.setNombres(st.nextToken());
                }
                
            }catch(Exception e){}
            listAlumno.add(A);
        }
       
    }
        public void rellenarAsignatura1(){
        lineas = fd.leerArchivo("asignatura1.csv");
        
        for(String l: lineas){
            st = new StringTokenizer(l,",");
            As = new Asignatura();
            
            try{
                if (st.hasMoreElements()){
                    As.setId(st.nextToken());
                    As.setNotaQ1(Float.parseFloat(st.nextToken()));
                    As.setNotaQ2(Float.parseFloat(st.nextToken()));
                    As.setNotaQ3(Float.parseFloat(st.nextToken()));
                    As.setNotaT1(Float.parseFloat(st.nextToken()));
                    As.setNotaT2(Float.parseFloat(st.nextToken()));
                    As.setNotaC1(Float.parseFloat(st.nextToken()));
                    As.setNotaC2(Float.parseFloat(st.nextToken()));
                    As.setNotaC3(Float.parseFloat(st.nextToken()));
                }

            }catch(Exception e){}
          listAsignaturas1.add(As);
        }
       
    }
        public void rellenarAsignatura2(){
        lineas = fd.leerArchivo("asignatura2.csv");
        
        for(String l: lineas){
            st = new StringTokenizer(l,",");
            As = new Asignatura();
            
            try{
                if (st.hasMoreElements()){
                    As.setId(st.nextToken());
                    As.setNotaQ1(Integer.parseInt(st.nextToken()));
                    As.setNotaQ2(Integer.parseInt(st.nextToken()));
                    As.setNotaQ3(Integer.parseInt(st.nextToken()));
                    As.setNotaT1(Integer.parseInt(st.nextToken()));
                    As.setNotaT2(Integer.parseInt(st.nextToken()));
                    As.setNotaC1(Integer.parseInt(st.nextToken()));
                    As.setNotaC2(Integer.parseInt(st.nextToken()));
                    As.setNotaC3(Integer.parseInt(st.nextToken()));
                }
                
            }catch(Exception e){}
          listAsignaturas2.add(As);
        }
       
    }
    public void calcularPromedio1(){
        float PQ,PT,PC;
        
        for (Asignatura asig: listAsignaturas1){
           pa = new PromAlumno();
           
           PQ = (asig.getNotaQ1()+asig.getNotaQ2()+asig.getNotaQ3())/3;
           PT = (asig.getNotaT1()+asig.getNotaT2())/2;
           PC = (asig.getNotaC1()+asig.getNotaC2()+asig.getNotaC3())/3;
           
           if (PC >= 40){
               pa.setNFAsignatura1(PC);
               pa.setId(asig.getId());
           }
           else if (PC <= 35){
               pa.setNFAsignatura1(PC*0.7+PQ*0.15+PT*0.15);
               pa.setId(asig.getId());
           }
           else if (PC >= 30){
               pa.setNFAsignatura1(PC*0.8+PQ*0.10+PT*0.10);
               pa.setId(asig.getId());
           }
           else {
               pa.setNFAsignatura1(PC);
           }
        }
    }
    public void calcularPromedio2(){
        float PQ,PT,PC;
        
        for (Asignatura asig: listAsignaturas2){
            for (PromAlumno p: Consolidado){
                pa = new PromAlumno();
           
                    PQ = (asig.getNotaQ1()+asig.getNotaQ2()+asig.getNotaQ3())/3;
                    PT = (asig.getNotaT1()+asig.getNotaT2())/2;
                    PC = (asig.getNotaC1()+asig.getNotaC2()+asig.getNotaC3())/3;

                    if (PC >= 40){
                        if (p.getId().equals(asig.getId())){
                        pa.setNFAsignatura2(PC);
                        }
                    }
                    else if (PC <= 35){
                        if (p.getId().equals(asig.getId())){
                        pa.setNFAsignatura2(PC*0.7+PQ*0.15+PT*0.15);
                        }
                    }
                    else if (PC >= 30){
                        if (p.getId().equals(asig.getId())){
                        pa.setNFAsignatura2(PC*0.8+PQ*0.10+PT*0.10);
                        }
                    }
                    else {
                        if (p.getId().equals(asig.getId())){
                        pa.setNFAsignatura2(PC);
                        }
                    }
                    
              }
        }
    }
    
    public void escribirConsolidado(){
        String linea;
        for (PromAlumno p: Consolidado){
            linea = p.getId()+","+p.getNFAsignatura1()+","+p.getNFAsignatura2();
            lineas.add(linea);
        }
        fd.escribirArchivo("consolidado.csv", lineas);
    }
    

    
}
