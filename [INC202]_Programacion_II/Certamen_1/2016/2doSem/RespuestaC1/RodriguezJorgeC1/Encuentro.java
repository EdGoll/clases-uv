
import java.util.ArrayList;

public class Encuentro {

   
    public ArrayList<Equipo> j = new ArrayList(); 
    public ArrayList<Jugador> jdr = new ArrayList(); 
    
    
    public void llenarEquipo(){
        Equipo e;
        Jugador jug;
        for (int i = 1; i < 17; i++) {
           e = new Equipo();
           jug = new Jugador();
           e.setId(i);
          
          e.setNivelColectivo(nivelJuegoColectivo(jdr));
           j.add(e);
        }
        for (Equipo equipo : j) {
            System.out.println(equipo);
        }
    }  
    
   
        public int nivelJuegoColectivo(ArrayList<Jugador> lista_equipo) {
            int sum = 0;
            for (Jugador equipo : lista_equipo) {
                sum = sum + equipo.getNivelJuego();
            }
            System.out.println(sum);
            return sum;
   
            
        }
    
   
       
    }
