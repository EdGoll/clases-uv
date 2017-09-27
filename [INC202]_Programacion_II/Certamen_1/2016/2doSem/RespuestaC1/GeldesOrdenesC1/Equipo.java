

import java.util.ArrayList;
import java.util.Random;

public class Equipo {
    Random rnd= new Random();
     int ID;
    private  ArrayList<Jugador> eq = new ArrayList<>();
    private Jugador play;
    public  int nivelColect;
    public Equipo(){
      this.ID = rnd.nextInt(30);
      aregar();
      NivelColect();
    }
    public void aregar(){
      eq.add(play = new Jugador("Portero"));
      eq.add(play = new Jugador("Delantero1"));
      eq.add(play = new Jugador("Delantero2"));
      eq.add(play = new Jugador("Delantero3"));
      eq.add(play = new Jugador("Defensa1"));
      eq.add(play = new Jugador("Defensa2"));
      eq.add(play = new Jugador("Defensa3"));
      eq.add(play = new Jugador("Centro Campista1"));
      eq.add(play = new Jugador("Centro Campista2"));
      eq.add(play = new Jugador("Laterales1"));
      eq.add(play = new Jugador("Laterales"));
    } 
  public void NivelColect(){
      int sum=0;
      for(int i=0;i<11;i++){
        sum = sum + eq.get(i).getNivel();
    }  
    nivelColect = sum;
  }
}  