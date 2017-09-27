/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.List;

public class Notas_lmp {
    ArrayList<Alumno> result = new ArrayList<>();
    ArrayList<Notas_A1> asig1 = new ArrayList<>();
    ArrayList<Notas_A2> asig2 = new ArrayList<>();
    FuenteDeDatos fd = new FuenteDeDatos();
    FuenteDeDatos f= new FuenteDeDatos();
    FuenteDeDatos d = new FuenteDeDatos();
    
    private void llenado(){
        List nombres = fd.leerArchivo("alumnos.csv");
        List asig_1 = f.leerArchivo("asignatura1.csv");
        List asig_2 = d.leerArchivo("asignatura2.csv");
        Alumno almn = null;
        Notas_A1 n1 = null;
        Notas_A2 n2 = null;
        StringTokenizer st;
        for(Object ob : nombres){
            st= new StringTokenizer((String)ob,(";"));
            almn= new Alumno();
            almn.setId(st.nextToken());
            almn.setApellido_Pa(st.nextToken());
            almn.setApellido_Ma(st.nextToken());
            almn.setNombre(st.nextToken());
            result.add(almn);
        }
        
        for (Object ob : asig_1){
            st= new StringTokenizer((String)ob,(";"));
            n1 = new Notas_A1();
            n1.setNQ1(Integer.parseInt(st.nextToken()));
            n1.setNQ2(Integer.parseInt(st.nextToken()));
            n1.setNQ3(Integer.parseInt(st.nextToken()));
            n1.setNT1_A1(Integer.parseInt(st.nextToken()));
            n1.setNT2_A1(Integer.parseInt(st.nextToken()));
            n1.setNC1_A1(Integer.parseInt(st.nextToken()));
            n1.setNC2_A1(Integer.parseInt(st.nextToken()));
            n1.setNC3_A1(Integer.parseInt(st.nextToken()));
            asig1.add(n1);
        }
        
        for (Object ob : asig_2){
            st = new StringTokenizer((String)ob,(";"));
            n2= new Notas_A2();
            n2.setNC1(Integer.parseInt(st.nextToken()));
            n2.setNC2(Integer.parseInt(st.nextToken()));
            n2.setNC3(Integer.parseInt(st.nextToken()));
            n2.setNT1_A2(Integer.parseInt(st.nextToken()));
            n2.setNT2_A2(Integer.parseInt(st.nextToken()));
            n2.setNC1_A2(Integer.parseInt(st.nextToken()));
            n2.setNC2_A2(Integer.parseInt(st.nextToken()));
            n2.setNC3_A2(Integer.parseInt(st.nextToken()));
            asig2.add(n2);   
        }
    }
        
    public Notas_lmp(){
        llenado();
    }
    
    public void promedio1(){
       
        }
    
    public void promedio2(){
        
    }
        
    }
    
    
    
    

