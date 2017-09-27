
import java.util.ArrayList;
import java.util.Random;

public class JugadorImp {
    
    public ArrayList<Jugador> jdr= new ArrayList<>();
    public ArrayList<Equipo> eqp = new ArrayList(); 
    Random rnd = new Random();
    public JugadorImp(){
      
    }
    public void llenarJugador(){
        Jugador j ;
        for (int i = 0; i < 11 ; i++){
            j=new Jugador();
            j.setId(i);
            int id = rnd.nextInt(100)+1;
            j.setBR(id);
            int id2 = rnd.nextInt(100)+1;
            j.setBG(id2);
            int id3 = rnd.nextInt(100)+1;
            if(j.getId()==0){
               id3 = 0;
                j.setGC(id3);
            }else{
                j.setGC(id3);
            }
            int sum = (int) (id * 0.2 + id2 * 0.35 + id3 * 0.45);  
            j.setNivelJuego(sum);
            jdr.add(j);
        }
    }
  
    
    
    public void totalJugadores(){
        int sum = 0;
        for (Jugador jugador : jdr) {
            
            sum=sum + jugador.getNivelJuego();
            jugador.setTotal(sum);
        }
       
        
        System.out.println("el equipo tiene " + sum);
        
    }
    
   
      
     
    public void mostrar(){
        for (Jugador jugador : jdr) {
            System.out.println(jugador);
            
        }
    }

   
}