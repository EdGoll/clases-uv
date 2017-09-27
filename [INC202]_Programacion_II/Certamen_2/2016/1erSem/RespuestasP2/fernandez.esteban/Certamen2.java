

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Certamen2 {
    
    private StringTokenizer st;
    private FuenteDeDatos fdd;
    List<String> lista1 = null;
    List<String> lista2 = null;
    List<String> lista3 = null;
    ArrayList<Alumnos> alumnos = new ArrayList<>();
    ArrayList<Asignatura1> asignatura1 = new ArrayList<>();
    ArrayList<Asignatura2> asignatura2 = new ArrayList<>();
    
    
    private void Certamen2(){
        
        fdd = new FuenteDeDatos();
        lista1 = fdd.leerArchivo("alumnos.csv");
        lista2 = fdd.leerArchivo("asignatura1.csv");
        lista3 = fdd.leerArchivo("asignatura2.csv");
        
    }

    public void loadAlumnos(){
        
        Alumnos A;
        for(String l: lista1){
            A = new Alumnos();
            st = new StringTokenizer(l,";");
            while(st.hasMoreElements()){
                A.setId(Integer.parseInt(st.nextToken()));
                A.setaPaterno(st.nextToken());
                A.setaMaterno(st.nextToken());
                A.setNombres(st.nextToken());
                alumnos.add(A);
            }
        }
    }
    
    public void loadAsignatura1(){
    
        Asignatura1 A1;
        for(String l: lista2){
            A1 = new Asignatura1();
            st = new StringTokenizer(l,";");
            while(st.hasMoreElements()){
                A1.setId(Integer.parseInt(st.nextToken()));
                A1.setNQ1(Float.parseFloat(st.nextToken()));
                A1.setNQ2(Float.parseFloat(st.nextToken()));
                A1.setNQ3(Float.parseFloat(st.nextToken()));
                A1.setNT1(Float.parseFloat(st.nextToken()));
                A1.setNT2(Float.parseFloat(st.nextToken()));
                A1.setNC1(Float.parseFloat(st.nextToken()));
                A1.setNC2(Float.parseFloat(st.nextToken()));
                A1.setNC3(Float.parseFloat(st.nextToken()));
                asignatura1.add(A1);
            }
        }
    }
    
    public void loadAsignatura2(){
    
        Asignatura2 A2;
        for(String l: lista3){
            A2 = new Asignatura2();
            st = new StringTokenizer(l,";");
            while(st.hasMoreElements()){
                A2.setId(Integer.parseInt(st.nextToken()));
                A2.setNQ1(Float.parseFloat(st.nextToken()));
                A2.setNQ2(Float.parseFloat(st.nextToken()));
                A2.setNQ3(Float.parseFloat(st.nextToken()));
                A2.setNT1(Float.parseFloat(st.nextToken()));
                A2.setNT2(Float.parseFloat(st.nextToken()));
                A2.setNC1(Float.parseFloat(st.nextToken()));
                A2.setNC2(Float.parseFloat(st.nextToken()));
                A2.setNC3(Float.parseFloat(st.nextToken()));
                asignatura2.add(A2);
            }
        }
    }
    
    public float promedioA1(){
    
        float PC=0, PQ=0, PT=0;
        for(Asignatura1 aux: asignatura1){
            PC = (aux.getNC1() + aux.getNC2() + aux.getNC3())/3;
            PQ = (aux.getNQ1() + aux.getNQ2() + aux.getNQ3())/3;
            PT = (aux.getNT1() + aux.getNT2())/2;
            if(PC>=4.0){
                return(float) (PC*0.7 + PQ*0.15 + PT*0.15);
            }
            else if (PC>=3.5 && PC<4.0){
                return(float) (PC*0.8 + PQ*0.10 + PT*0.10);
            }
            else if (PC>=3.0 && PC<3.5){
                return(float) (PC*0.9 + PQ*0.05 + PT*0.05);
            }
            else{
                return(float) PC;
            }
        
        }
        return 0;
    }
    
    public float promedioA2(){
    
        float PC=0, PQ=0, PT=0;
        for(Asignatura2 aux: asignatura2){
            PC = (aux.getNC1() + aux.getNC2() + aux.getNC3())/3;
            PQ = (aux.getNQ1() + aux.getNQ2() + aux.getNQ3())/3;
            PT = (aux.getNT1() + aux.getNT2())/2;
            if(PC>=4.0){
                return(float) (PC*0.7 + PQ*0.15 + PT*0.15);
            }
            else if (PC>=3.5 && PC<4.0){
                return(float) (PC*0.8 + PQ*0.10 + PT*0.10);
            }
            else if (PC>=3.0 && PC<3.5){
                return(float) (PC*0.9 + PQ*0.05 + PT*0.05);
            }
            else{
                return(float) PC;
            }
        }
        return 0;
    }
 
    public void consolidar(){
        Consolidar C;
        Alumnos A;
        Asignatura1 A1;
        Asignatura2 A2;
        C = Consolidar();
        A = new Alumnos();
        A1 = new Asignatura1();
        A2 = new Asignatura2();
        fdd = new FuenteDeDatos();
        fdd.escribirArchivo("Consolidado.csv", lista1);
        ArrayList<Consolidar> consolidar = new ArrayList<>();
        C.setId();
        
    
    }
    
}
