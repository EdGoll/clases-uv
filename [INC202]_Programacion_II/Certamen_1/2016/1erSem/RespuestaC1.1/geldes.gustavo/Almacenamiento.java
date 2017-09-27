
package exportaciones;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Almacenamiento {
    ArrayList<Bean> op= new ArrayList<Bean>();
    FuenteDeDatos agg= new FuenteDeDatos();
    
    private void Llenado(){
        List lol = agg.leerArchivo("D:\\Downloads\\expo201604.csv");
        StringTokenizer ar;
        Bean ex;
        for(Object ot : lol){
            ar = new StringTokenizer((String)ot,";");
            ex = new Bean();
            ex.setAnio(ar.nextToken());
            ex.setMes(ar.nextToken());
            ex.setPaisDestino(ar.nextToken());
            ex.setArancel(ar.nextToken());
            ex.setArancelUS(ar.nextToken());
            ex.setPesoBruto(ar.nextToken());
            ex.setCantidadMercancia(ar.nextToken());
            ex.setUnidadMedida(ar.nextToken());
            op.add(ex);
        }
    }
       public Almacenamiento(){
        Llenado();
        }
      
          
        public void Preguntitas(){
          int i=0,j=0,k=0,l=0,m=0;
            for(Bean ex : op){
                if(ex.getPaisDestino().equals("ARGENTINA")){
                    i++;
                }
                 if(ex.getArancel().equals("44101100")){
                j++;
            }
                  if(ex.getUnidadMedida().equals("MCUB")){
                k++;
           
            }
                  if(ex.getPesoBruto().equals("23470")){
                l++;
              }   
                   if(ex.getPaisDestino().equals("REINO UNIDO") && ex.getUnidadMedida().equals("KN")){
                       m++;
              }   
  
            }
            System.out.println(""+i+" Fueron para Argentina");
             System.out.println(""+j+" Tienen el mismo valor ");
             System.out.println(""+k+" Fueron exportados con la misma unidad de medida");
             System.out.println(""+l+" Fueron exportados con el mismo peso bruto");
             System.out.println(""+m+" Fueron exportados al Reino unido, con la misma unidad de medida");
    }
}