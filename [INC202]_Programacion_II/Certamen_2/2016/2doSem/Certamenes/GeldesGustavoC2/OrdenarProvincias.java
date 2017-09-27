/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Palurdo
 */
public class OrdenarProvincias extends Provincia{
    public OrdenarProvincias(){
        cargar();
    }
    private List<String> lineas;
    private List<Provincia> er= new ArrayList<>();
    public void cargar(){
        Provincia p = null;
        lineas = FuenteDatos.leerArchivo("Provincia.csv");
        StringTokenizer st;
       for(Object ob : lineas){
            st= new StringTokenizer((String)ob,(";"));
            if(st.hasMoreElements())
            {
                p = new Provincia();
                p.setIdProvincia(st.nextToken());
                p.setNombreProvincia(st.nextToken());
                p.setIdRegion(st.nextToken());
                er.add(p);
                
                
    }   
           
    
        
    }
     
 }
     public Provincia es(String pu,int id){
    for (Provincia ar : er){
      if(ar.getIdRegion().equals(pu)){
       if(ar.getIdProvincia().equals(Integer.toString(id))){
         
        return ar;
       }
       }
    }
      return null;
  
  }    
    public void mostra_provincia(String IdRegion){
            for(Provincia ar : er){
        System.out.println(ar.getIdProvincia()+" "+ar.getNombreProvincia()+" "+ar.getIdRegion());//mostrar reguiones 
    
            }    
    }
}    