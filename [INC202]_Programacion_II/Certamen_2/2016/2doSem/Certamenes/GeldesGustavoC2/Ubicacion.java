/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Palurdo
 */
public class Ubicacion {
  int aux;
   Region region;
   Provincia prov;
   Comuna com;
    
     OrdenarRegiones aux_region = new OrdenarRegiones();
     OrdenarProvincias aux_provincia = new OrdenarProvincias();
     OrdenarComunas aux_comuna = new OrdenarComunas() ;
     Scanner csan = new Scanner(System.in);
    public Ubicacion(){
    aux_region.mostra_region();
    System.out.println("cual es el id de su reguion");
    aux=csan.nextInt();
    region=aux_region.es(aux);//region
      
    aux_provincia.mostra_provincia(region.getIdRegion());
    System.out.println("cual es el id de su provincia");
    aux = csan.nextInt();
    
    prov=aux_provincia.es(region.getIdRegion() ,aux);//provincia
      
    aux_comuna.mostra_Comunas(prov.getIdProvincia());
    System.out.println("cual es el id de su comuna");
    aux= csan.nextInt();
    com=aux_comuna.es(prov.getIdProvincia() ,aux);//comuna
      
    
  }

    
    public Region getRegion() {
        return region;
    }

    public Provincia getProv() {
        return prov;
    }

    public Comuna getCom() {
        return com;
    }
    

    
    
    
    
}
