/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ManejoDeDatos {
    
    FuenteDeDatos fd=new FuenteDeDatos();
    ArrayList<Alumno> listaalumnos= new ArrayList<>();
    ArrayList<al> alumnos= new ArrayList<>();
    ArrayList<asignatura1> asignatura1= new ArrayList<>();
    ArrayList<asignatura1> asignatura2= new ArrayList<>();
    asignatura1 as;
    al alu;
    Alumno al;
    
    StringTokenizer tk;
    List<String> lineas;
    
    
    public void llenar1(){
        lineas=fd.leerArchivo("alumnos.csv");
        for(String ll : lineas){
            alu= new al();
            tk= new StringTokenizer(ll,";");
            if(tk.hasMoreElements()){
               alu.setid(tk.nextToken());
               alu.setapellidoP(tk.nextToken());
               alu.setapellidoM(tk.nextToken());
               alu.setnombres(tk.nextToken());
               alumnos.add(alu);
            }       
        }    
    } 
    public void llenar2(){
        
    lineas=fd.leerArchivo("asignatura1.csv");
        for(String ll : lineas){
            tk= new StringTokenizer(ll,";");
            as=new asignatura1();
            if(tk.hasMoreElements()){
               as.setid(tk.nextToken());
               as.setquiz1(tk.nextToken());
               as.setquiz2(tk.nextToken());
               as.setquiz3(tk.nextToken());
               as.settarea1(tk.nextToken());
               as.settarea2(tk.nextToken());
               as.settarea3(tk.nextToken());
               as.setc1(tk.nextToken());
               as.setc2(tk.nextToken());
               as.setc3(tk.nextToken());
               asignatura1.add(as);
            }       
        }    
    } 
    public void llenar3(){
        
    lineas=fd.leerArchivo("asignatura2.csv");
        for(String ll : lineas){
            tk= new StringTokenizer(ll,";");
            as=new asignatura1();
            if(tk.hasMoreElements()){
               as.setid(tk.nextToken());
               as.setquiz1(tk.nextToken());
               as.setquiz2(tk.nextToken());
               as.setquiz3(tk.nextToken());
               as.settarea1(tk.nextToken());
               as.settarea2(tk.nextToken());
               as.settarea3(tk.nextToken());
               as.setc1(tk.nextToken());
               as.setc2(tk.nextToken());
               as.setc3(tk.nextToken());
               asignatura2.add(as);
            }       
        }    
    }  
    public void listacompleta(){
        for(al ll: alumnos){
            for(asignatura1 ss :asignatura1){
                if(ll.getid().equals(ss.getid())){
                }            
            }
        }
    
    }
}