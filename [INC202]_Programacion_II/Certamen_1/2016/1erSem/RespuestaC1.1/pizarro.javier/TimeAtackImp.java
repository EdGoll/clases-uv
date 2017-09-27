/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certamen1.pkg1;

import java.util.ArrayList;
import java.util.List;



public class TimeAtackImp {
    private List<Auto>ListaAutos;
    private List<String>lineas;
    
    
    public void llenarCorredores(){
       int totalcorredores=0;
        Auto a;
        ListaAutos = new ArrayList<Auto>();
        DatosCorredores dc = new DatosCorredores();
        lineas = dc.LeerArchivo("C:\\Users\\javier\\Desktop\\timeatack.txt");
        for(String linea : lineas){
            a = new Auto();
            linea.substring(0,3);
            System.out.print(linea.substring(0,3) + linea.substring(4,23)+ linea.substring(24,37)+ linea.substring(38,47));         // divide el texto en fragmentos designados y los guarda en Listaautos            
            System.out.println(linea.substring(48,linea.length()));
            ListaAutos.add(a);
            totalcorredores++;
            }
    System.out.println("RESPUESTA 1):"+" "+"El total de corredores fue="+" "+ (totalcorredores-1));
    }
    public void categorias(){
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("RESPUESTA 2):"+" "+"las categorias que se corrieron fueron:");
        Auto a;
          int pro=0;  
        for(String linea : lineas){
            a = new Auto();
            if(linea.substring(56,linea.length()).equals("Pro")){
                pro++;
            }
           System.out.println(linea.substring(56,linea.length()));
         
            ListaAutos.add(a);
            
    }
          System.out.println("RESPUESTA 3):"+" "+pro+ " " + "PARTICIPANTES CORRIERON EN LA CATEGORIA PRO");
}
    
    
    public void corredorAuto(){
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("RESPUESTA 4):"+" "+"Los corredores y sus autos son:");
       int evo=0,porsche=0, nissan=0, honda=0,mus=0;
         Auto a;  
        for(String linea : lineas){
            a = new Auto();
            if(linea.contains("EVO")){  //busca la palabra para afirmar que los autos estan repetidos (decidi solo buscar por modelo en general y no sobre modelos especificos como evo x, evo iv,etc.
                evo++;    
            }
            if(linea.contains("Porsche")){
                porsche++;
            }
            if(linea.contains("Nissan")){
                nissan++;
            }
            if(linea.contains("Honda")){
                honda++;
            }
            if(linea.contains("Mustang")){
                mus++;
            }
            
           System.out.println(linea.substring(4,23)+ linea.substring(24,37));
         
            ListaAutos.add(a);
            
            
    }
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("RESPUESTA 5):");
         System.out.println("Hay"+ " "+evo+" "+ "Mitsubishi Lancer EVO"); 
         System.out.println("Hay"+ " "+porsche+" "+ "Porsche"); 
         System.out.println("Hay"+ " "+nissan+" "+ "Nissan"); 
         System.out.println("Hay"+ " "+honda+" "+ "Honda");
         System.out.println("Hay"+ " "+mus+" "+ "Mustang"); 
    }
}
    
    
       
    

