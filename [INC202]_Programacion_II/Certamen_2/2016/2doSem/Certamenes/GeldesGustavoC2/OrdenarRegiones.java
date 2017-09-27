

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class OrdenarRegiones extends Region {
    public OrdenarRegiones(){
        cargar();
    }
    private List<Region> ag= new ArrayList<>();
    private List<String> lineas;
    public void cargar(){
        Region r = null;
        lineas = FuenteDatos.leerArchivo("Region.csv");
        StringTokenizer st;
       for(Object ob : lineas){
            st= new StringTokenizer((String)ob,(";"));
            if(st.hasMoreElements())
            {
                r = new Region();
                r.setIdRegion(st.nextToken());
                r.setNombre(st.nextToken());
                r.setNumeroRomano(st.nextToken());
                r.setOrdenGeograficoRegion(st.nextToken());
                ag.add(r);
       
            }
        }
    }
    public Region es(int id){
    for (Region im : ag){
       if(im.getIdRegion().equals(Integer.toString(id))){
        return im;
       }  
    }  
      return null;
  
 }    
        public void mostra_region(){
   
        for (Region im : ag){
          System.out.println(im.getIdRegion()+" "+im.getNombre()+" "+im.getOrdenGeograficoRegion());//mostrar reguiones
  }   }
    

            }

        
    

