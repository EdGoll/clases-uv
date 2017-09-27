
import java.util.Random;

public class Jugador {
   private final  int ID,GC,BR,BG;
   private final  String tipo;
    private int nivelI = 0;
    public Jugador(String tipo) {
        this.tipo = tipo;
        Random rnd = new Random();
        ID = rnd.nextInt(30);
        GC = rnd.nextInt(99)+1;
        BR = rnd.nextInt(99)+1;
        BG = rnd.nextInt(99)+1;
        nivelI= (int) ((BR*0.2)+(BG*0.35)+(GC*0.45));
    }
      public int getNivel(){
        return nivelI;
    }
}
   

