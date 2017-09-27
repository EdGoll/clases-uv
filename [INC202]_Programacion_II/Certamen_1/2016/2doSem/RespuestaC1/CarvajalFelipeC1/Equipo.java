
import java.util.Random;

public class Equipo{ 
    Random rnd;
    private Jugador[] equipo=new Jugador[11];
    private int ide;
    private int lvle;
    
    public void fillEquipo(){
        Jugador player;
        for(int i=0;i<equipo.length;i++){
            player=new Jugador();
            equipo[i]=player;
        }
    }
    
    public void fillId(){
        int aux=equipo.length;
        int[] numeros=new int[aux];
        Random rnd=new Random();
        int res;
        
        for(int i=0;i<equipo.length;i++){
            numeros[i]=i+1;
        }
        for(int i=0;i<equipo.length;i++){
            res=rnd.nextInt(aux);            
            equipo[i].setId(numeros[res]);
            numeros[res]=numeros[aux-1];
            aux--;
            
        }
  }
    
   @Override
   public String toString(){
       String aux="";
       for(int i=0;i<equipo.length;i++){
           aux=aux+equipo[i].toString();
       }
       return aux;
   }
   public void fillBr(){
        rnd=new Random();   
        for(int i=0;i<equipo.length;i++){
           equipo[i].setBr(rnd.nextInt(100)+1);
        }
   }
      public void fillBg(){
        rnd=new Random();   
        for(int i=0;i<equipo.length;i++){
           equipo[i].setBg(rnd.nextInt(100)+1);
        }
   
}
        public void fillGc(){
        rnd=new Random();   
        for(int i=0;i<equipo.length;i++){
           equipo[i].setGc(rnd.nextInt(100)+1);
        }
   
}
        public void fillLvl(){
        rnd=new Random();   
        for(int i=0;i<equipo.length;i++){
           equipo[i].setLvl((equipo[i].getBr()*20/100 + equipo[i].getBg()*35/100 + equipo[i].getGc()*45/100));
        }
        }
        
        public void fillRol(){
            int portero=0,defensas=0,laterales=0,centro=0,delanteros=0;
            for(int i=0;i<equipo.length;i++){
                switch(rnd.nextInt(5)+1){
                    case 1:
                        if(portero<1){
                            equipo[i].setTipo("Portero");
                           equipo[i].setGc(0);
                            portero++;
                            break;
                        }else{
                            i--;
                            break;
                        }
                    case 2:
                        if(defensas<3){
                            equipo[i].setTipo("Defensa");
                            defensas++;
                            break;
                        }else{
                            i--;
                            break;
                        }
                    case 3:
                        if(laterales<2){
                            equipo[i].setTipo("Lateral");
                            laterales++;
                            break;
                        }else{
                            i--;
                            break;
                        }
                    case 4:
                        if(centro<2){
                            equipo[i].setTipo("Centro");
                            centro++;
                            break;
                        }else{
                            i--;
                            break;
                        }
                    case 5:
                        if(delanteros<3){
                            equipo[i].setTipo("Delantero");
                            delanteros++;
                            break;
                        }else{
                            i--;
                            break;
                        }
                }
            }
        }
   
        public void setIde(int ide){
            this.ide=ide;            
        }
        public int getIde(){
            return ide;
        }
        public void setLvle(){
            for(int i=0;i<equipo.length;i++){  
                lvle=lvle+equipo[i].getLvl();
            }         
        }
        public int getLvle(){
            return lvle;
        }
    
}

