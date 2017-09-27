import java.util.ArrayList;
import java.util.Random;

public class Llenador {
    
    int NJC=0;
    Random rnd = new Random();
    Jugador player = new Jugador();
    Equipo team = new Equipo();
    ArrayList<Jugador> equipo = new ArrayList<>();
    ArrayList<Equipo> torneo = new ArrayList<>();
    
    //Metodo crea un ArrayList con 11 jugadores cada uno con todos sus atributos
    public ArrayList CreadorJugadores(){
        NJC=0;
        int[] aidis = new int[100];
        for(int i=0; i<100; i++){
            aidis[i] = i+1;
        }
    
        for(int i=0; i<11; i++){
            int ID, aux1, aux2;
            float BR, BG, GC;
    
            switch(i){
                case 0: player.setPosicion("portero"); break;
                case 1: player.setPosicion("defensa"); break;
                case 2: player.setPosicion("defensa"); break;
                case 3: player.setPosicion("defensa"); break;
                case 4: player.setPosicion("lateral"); break;
                case 5: player.setPosicion("lateral"); break;
                case 6: player.setPosicion("centro campista"); break;
                case 7: player.setPosicion("centro campista"); break;
                case 8: player.setPosicion("delantero"); break;
                case 9: player.setPosicion("delantero"); break;
                case 10: player.setPosicion("delantero"); break;
            }
            
            player.setBR(rnd.nextInt(100)+1);
            player.setBG(rnd.nextInt(100)+1);
            if(player.getPosicion().equals("portero")){
                player.setGC(0);
            }
            else{
                player.setGC(rnd.nextInt(100)+1);
            }
            BR = player.getBR();
            BG = player.getBG();
            GC = player.getGC();
            //variable flotante en lugar de hacer conversion directa a entero para mayor exactitud
            float nivel = (float) ((BR*0.2)+(BG*0.35)+(GC*0.45));     
            player.setNJI(Math.round(nivel));
            NJC += player.getNJI();
            int control=0;
            while(control!=1){
                aux1 = rnd.nextInt(100);
                aux2 = aidis[aux1];
                if(aux2!=0){
                    player.setID(aux2);
                    aidis[aux1]=0;
                    control=1;
                }
                else{
                    control=0;
                }
            }
            equipo.add(player);
        }
        return equipo;
    }
    
    
    //Metodo crea los 16 equipor del torneo con sus respectivos atributos
    public void CreadorEquipos(){
        
        int aux1, aux2;
        int[] aidis = new int[100];
        for(int i=0; i<100; i++){
            aidis[i] = i+1;
        }
    
        for(int i=0; i<16; i++){
            
            int control=0;
            while(control!=1){
                aux1 = rnd.nextInt(100);
                aux2 = aidis[aux1];
                if(aux2!=0){
                    team.setID(aux2);
                    aidis[aux1]=0;
                    control=1;
                }
                else{
                    control=0;
                }
            }
            //Se llama al metodo anterior para obtener la lista de los 11 jugadores
            team.setListJugadores(CreadorJugadores());
            team.setNJC(NJC);
            torneo.add(team);
        }
    }
}
