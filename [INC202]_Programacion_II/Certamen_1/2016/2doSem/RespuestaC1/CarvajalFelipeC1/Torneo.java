
import java.util.Random;
import java.util.ArrayList;
public class Torneo {
    Equipo aux;
    Equipo[] teamlist=new Equipo[16]; 
    
   public void fillLiga(){
       for(int i=0;i<teamlist.length;i++){
           aux= new Equipo();
           teamlist[i]=aux;
           teamlist[i].fillEquipo();
           teamlist[i].fillId();
           teamlist[i].fillBg();
           teamlist[i].fillBr();
           teamlist[i].fillGc();
           teamlist[i].fillRol();
           teamlist[i].fillLvl();
           

       } 
   }
   
  public void fillIde(){
      
       int aux=teamlist.length;
        int[] numeros=new int[aux];
        Random rnd=new Random();
        int res;
        
        for(int i=0;i<teamlist.length;i++){
            numeros[i]=i+1;
        }
        for(int i=0;i<teamlist.length;i++){
            res=rnd.nextInt(aux);            
            teamlist[i].setIde(numeros[res]);
            numeros[res]=numeros[aux-1];
            aux--;
            
        }
  }
  
  public void fillLvle(){
      for(int i=0;i<teamlist.length;i++){
          teamlist[i].setLvle();          
      }
  }
   
   
 /*public void games(){
     Random rnd=new Random();
     ArrayList<Integer> teams=new ArrayList();
     for(int i=0;i<teamlist.length;i++){
         teams.add(i);
     }
     Integer aux=0,aux2=0;
     for(int i=0;i<8;i++){
        aux=rnd.nextInt(16)+1;
        aux2=rnd.nextInt(16)+1;
        
        if(aux==aux2){
            while(aux==aux2){
               aux2=rnd.nextInt(16)+1;
            }
        }
         
                         
                     if(teamlist[aux].getLvle()>teamlist[aux2].getLvle()){
                          System.out.println("\nEquipo "+teamlist[aux].getIde()+" (nivel de juego "+teamlist[aux].getLvle()
                          +") v/s Equipo "+teamlist[aux2].getIde()+" (nivel de juego "+teamlist[aux2].getLvle()+"), "
                                  + "Resuldado: Ganador equipo: "+teamlist[aux].getIde());
                          System.out.println("aux:"+aux+"aux2:"+aux2);
                          teams.remove(aux);
                          teams.remove(aux2);
                          
                          
                      }else{
                          System.out.println("\nEquipo "+teamlist[aux].getIde()+" (nivel de juego "+teamlist[aux].getLvle()
                          +") v/s Equipo "+teamlist[aux2].getIde()+" (nivel de juego "+teamlist[aux2].getLvle()+"), "
                                  + "Resuldado: Ganador equipo: "+teamlist[aux2].getIde());
                      teams.remove(aux);
                      teams.remove(aux2);
                      }
                 }
        }
   
 */
  public void games(){
      Random rnd=new Random();
      int[]aux2=new int[teamlist.length];
      int aux=aux2.length;
        int[] numeros=new int[aux];
        int res;
        
        for(int i=0;i<aux2.length;i++){
            numeros[i]=i+1;
        }
        for(int i=0;i<aux2.length;i++){
            res=rnd.nextInt(aux);            
            aux2[i]=numeros[res];
            numeros[res]=numeros[aux-1];
            aux--;
        }
         

        for(int i=0;i<teamlist.length;i++){
            if(teamlist[i].getLvle()==teamlist[i+1].getLvle()){
                aux=rnd.nextInt(2)+1;
                if(aux==1){
                 System.out.println("\nEquipo "+teamlist[aux2[i]].getIde()+" (nivel de juego "+teamlist[aux2[i]].getLvle()
                          +") v/s Equipo "+teamlist[aux2[i+1]].getIde()+" (nivel de juego "+teamlist[aux2[i+1]].getLvle()+"), "
                                  + "Resuldado: Ganador equipo: "+teamlist[aux2[i]].getIde());
                          i++;
                             
                }else{
                 System.out.println("\nEquipo "+teamlist[aux2[i]].getIde()+" (nivel de juego "+teamlist[aux2[i]].getLvle()
                          +") v/s Equipo "+teamlist[aux2[i+1]].getIde()+" (nivel de juego "+teamlist[aux2[i+1]].getLvle()+"), "
                                  + "Resuldado: Ganador equipo: "+teamlist[aux2[i+1]].getIde());
                      i++;
                     
                }
            }
                 if(teamlist[aux2[i]].getLvle()>teamlist[aux2[i+1]].getLvle()){
                          System.out.println("\nEquipo "+teamlist[aux2[i]].getIde()+" (nivel de juego "+teamlist[aux2[i]].getLvle()
                          +") v/s Equipo "+teamlist[aux2[i+1]].getIde()+" (nivel de juego "+teamlist[aux2[i+1]].getLvle()+"), "
                                  + "Resuldado: Ganador equipo: "+teamlist[aux2[i]].getIde());
                          i++;
                          
                      }else{
                          System.out.println("\nEquipo "+teamlist[aux2[i]].getIde()+" (nivel de juego "+teamlist[aux2[i]].getLvle()
                          +") v/s Equipo "+teamlist[aux2[i+1]].getIde()+" (nivel de juego "+teamlist[aux2[i+1]].getLvle()+"), "
                                  + "Resuldado: Ganador equipo: "+teamlist[aux2[i+1]].getIde());
                      i++;
                     
                      }
                 
  }
  }
  
   public void impLiga(){
       for(int i=0;i<teamlist.length;i++){
           System.out.println("\n\nEquipo: "+teamlist[i].getIde()+"\nLvl colctivo: "+teamlist[i].getLvle()+"\n"+teamlist[i].toString());
       }
   }
}
    

    
    
    
    
