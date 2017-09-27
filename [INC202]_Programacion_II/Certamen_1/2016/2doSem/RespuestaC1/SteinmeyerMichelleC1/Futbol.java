import java.util.Random;
import java.util.ArrayList;

public class Futbol {
    
     private ArrayList<BeanJugador> ListaJugadores = new ArrayList<>();
     private ArrayList<BeanEquipo> ListaEquipos = new ArrayList<>();
     private int tam;
     private int idmax = 100;
     private int idmin = 1;
     private Random r; 
     int port=0;
     int def = 0;
     int lat = 0; 
     int cent = 0; 
     int delan = 0;
     
     public Futbol(){
        r = new Random();
    }

    public void jugador(){
        BeanJugador j;
        for(int i = 0; i < tam ; i++ ){
            j = new BeanJugador();
            j.setId(genIDSinRepetirBeanJugador());
            ListaJugadores.add(j);
        }
        for(int i=0 ; i < ListaJugadores.size() ; i++){ 
            ListaJugadores.get(i).setBR(r.nextInt(100)+1); 
        }
        for(int i=0 ; i < ListaJugadores.size() ; i++){ 
            ListaJugadores.get(i).setBG(r.nextInt(100)+1); 
        }
        for(int i=0 ; i < ListaJugadores.size() ; i++){ 
            ListaJugadores.get(i).setGC(r.nextInt(100)+1); 
        }
           
        
        for(int i = 0; i < tam ; i++){
           switch(r.nextInt(5)+1){
                case 1:
                    if(port < 1){
                        ListaJugadores.setTipo("Portero");
                        port++;
                        break;
                    }else{
                        i--;
                        break;
                    }
                case 2:
                    if(def < 1){
                        ListaJugadores.setTipo("Defensa");
                        def++;
                        break;
                    }else{
                        i--;
                        break;
                    }
                case 3:
                    if(lat < 1){
                        ListaJugadores.setTipo("Lateral");
                        lat++;
                        break;
                    }else{
                        i--;
                        break;
                    }
                case 4:
                    if(cent < 1){
                        ListaJugadores.setTipo("Centro");
                        cent++;
                        break;
                    }else{
                        i--;
                        break;
                    }
                case 5:
                    if(delan < 1){
                        ListaJugadores.setTipo("Delantero");
                          delan++;
                        break;
                    }else{
                        i--;
                        break;
                    }
            }
        }
           
        

    }
    
    public void equipo(){
        BeanEquipo j;
        for(int i = 0; i < tam ; i++ ){
            j = new BeanEquipo();
            j.setId(genIDSinRepetirBeanEquipos());
            ListaEquipos.add(j);
        }
    }
    
    public void encuentro(){
    
    }
    
    public void liga(){
    
    }
    
    private int genIDSinRepetirBeanJugador(){
        int ID;
        do{
            ID = generarIDbJ();
        }while(ID < 0);
        return ID;
    }
    private int generarIDbJ(){
        int ID = r.nextInt(idmax) + 1;
        for(BeanJugador beanjugador : ListaJugadores){
            if(beanjugador.getID() == ID){
                ID = -1;
                break;
            }
        }
        return ID;
    }
   
    private int genIDSinRepetirBeanEquipo(){
        int ID;
        do{
            ID = generarIDbE();
        }while(ID < 0);
        return ID;
    }
    private int generarIDbE(){
        int ID = r.nextInt(idmax) + 1;
        for(BeanEquipo beanequipo : ListaJugadores){
            if(beanequipo.getId() == D){
                ID = -1;
                break;
            }
        }
        return ID;
    }


}
