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
public class OrdenarComunas {
    public OrdenarComunas(){
        cargar();
    }
private List<String> lineas;
    private List<Comuna> cm= new ArrayList<>();
    public void cargar(){
        Comuna c = null;
        lineas = FuenteDatos.leerArchivo("Comuna.csv");
        StringTokenizer st;
       for(Object ob : lineas){
            st= new StringTokenizer((String)ob,(";"));
            if(st.hasMoreElements())
            {
                c = new Comuna();
                c.setIdComuna(st.nextToken());
                c.setNombreComuna(st.nextToken());
                c.setIdProvincia(st.nextToken());
                cm.add(c);
                
                
    }
        
    }
     
 }
    public Comuna es(String pu,int id){
    for (Comuna ar : cm){
      if(ar.getIdProvincia().equals(pu)){
       if(ar.getIdComuna().equals(Integer.toString(id))){
         
        return ar;
       }
       }
    }
      return null;
    }
    public void mostra_Comunas(String IdProvincia){
            for(Comuna aj : cm){
        System.out.println(aj.getIdComuna()+" "+aj.getNombreComuna()+" "+aj.getIdProvincia());//mostrar reguiones 
    
}
    }
}    
            