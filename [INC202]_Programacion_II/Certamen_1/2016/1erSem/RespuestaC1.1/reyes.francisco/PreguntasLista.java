
package babyboom;

import java.util.ArrayList;
import java.util.List;



public class PreguntasLista {
    public String lbs ;
    public String lineafinal;
    ArrayList<String> pnacido = new ArrayList();
    ArrayList<String> psexo = new ArrayList();
    ArrayList<String> ppeso = new ArrayList();
     ArrayList<String> pmin = new ArrayList();
    
    public void lector(List<String> lineas){
        for (int i = 0; i < lineas.size(); i++) {
            lineafinal = lineas.get(i);
            particionar(lineafinal);
        }
    }

    public void particionar(String lineafinal){ 
        ListaBebe lbb = new ListaBebe();
         lbs= lineafinal.substring( 1, 9);
         lbb.SethoraNacido(lbs.trim());
         pnacido.add(lbb.gethoranacido());
         lbs = lineafinal.substring(10,16);
         lbb.SetsexoNinio(lbs.trim());
         psexo.add(lbb.getsexoNinio());
         lbs = lineafinal.substring(17,27);
         lbb.Setpeso(lbs.trim());
         ppeso.add(lbb.getpeso());
         lbs = lineafinal.substring(27,32);
         lbb.SetminDespues12(lbs.trim());
         pmin.add(lbb.getminDespues12());
    }
  
    public void mostrarhoranacido(){
        for(int i=0;i<psexo.size();i++){
           if("2".equals(psexo.get(i))){
               System.out.println(pnacido.get(i));
           }
        }
    }
    
        public void contarmh(){
        int conth=0,contm=0;
            for(int i=0;i<psexo.size();i++){
              if("1".equals(psexo.get(i))){
                 contm++;   
              }
              if("2".equals(psexo.get(i))){
                 conth++;   
              }
            }
          System.out.println("las mujeres son " + contm); 
          System.out.println("los hombres son " + conth);   
        }
    
        public void mostrarhoradespues12(){
            for(int i=0;i<psexo.size();i++){
                if("1".equals(psexo.get(i))){
                     System.out.println(pmin.get(i));
                }
            }
        }
        
        public void mostrarpeso(){
          for(int i=34;i<psexo.size();i++){
                     System.out.println(ppeso.get(i));
            }
        }
        
        public void mostrarEnRango(int x, int y){
            for(int i= x; i<= y;i++){
                System.out.println(pnacido.get(i) +" "+ psexo.get(i) +" "+ ppeso.get(i) +" "+ pmin.get(i));

            }
        
        }
}    
    
    
