
public class Jugador{
    //Atributos de la clase Jugador
    int ID; //numero identificador unico por equipo
    int BR; //habilidad para Recuperar Balon
    int BG; //habilidad para Entregar Balon
    int GC; //Capacidad Goleadora
    String Tipo; //portero, defensa, ....
    int NJ;// Nivel de juego individual 
    int c;
    
    //constructor de la clase jugador
    public Jugador(int ID, String Tipo, int c){
        this.ID = ID;
        BR = (int)(Math.random() * 100) + 1;
        BG = (int)(Math.random() * 100) + 1;
        this.Tipo = Tipo; 
        this.c = c;
        GC = (c * (int)(Math.random() * 100) + 1);
    
    }
}

