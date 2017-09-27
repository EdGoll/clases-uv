
package climate;

/*
Preguntas:
       -¿Cuantos Datos hay  en el total de años?
       -¿Cuales son las ID Existentes?
       -¿Cual es el promedio del total de todos los años?
       -ingrese ID y mostrar las ID con sus respectivos datos 
**/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClimateImp {

    private FuenteDeDatos fu;
    List <String> lineas = null;
    List <Climate> lc = new ArrayList<Climate>();

    public ClimateImp() {
        fu = new FuenteDeDatos();
        lineas=fu.leerArchivo("dataset_climate.txt");
        iniciarClimate();
        
    }
    
    private void iniciarClimate(){
                                        
        Climate c ;
        
        for (String Clima : lineas) {
            c = new Climate();
            c.setId(Clima.substring(2,5));
            c.setAnio(Clima.substring(6, 10));
            c.setTotal(Clima.substring(13, 18));
            c.setAnom(Clima.substring(19,Clima.length()-1));
            lc.add(c);
           
        }
        
    }
    public void totalclima() {

        System.out.println( "total: " + lc.size());

    }
    
    public void idExistentes(){
        List<String> Clma = null;
        Clma = new ArrayList<String>();
        Climate c = new Climate();
        for (Climate clm : lc) {
            if(!Clma.contains(clm.getId())||!Clma.contains(clm.getId())){
                Clma.add(clm.getId());
                System.out.println(" * " + clm.getId());
                        
            }
        }
    }
    
    public void promedio(){
        double suma = 0;
        double  num=0;
        List<String> Clma = null;
        Clma = new ArrayList<String>();
        Climate c = new Climate();
        
        for (Climate clm : lc) {
        num=Double.parseDouble(clm.getTotal());       
        suma=suma + num;
        
        
        }
        suma=suma/lc.size();
        
        System.out.println(suma);
        
    }
    
    public void buscar(){
        
    List<String> Clma = null;
        Clma = new ArrayList<String>();
        Climate c = new Climate();
        Scanner sc = new Scanner(System.in);
        String id,ID;
        try{
            System.out.println("Ingrese id de climate:");
            id=sc.nextLine();
            ID=id.toUpperCase();
            for (Climate clm : lc) {
                if(clm.getId().equals(ID)){
                    System.out.println(clm.getId() + " " + clm.getAnio() + " " + clm.getTotal() + " " +  clm.getAnom()); 
                }
            }
                    
                    
    }catch( Exception ex){
}
}

}
        
            