import java.util.ArrayList;

public class Equipo {
   
    private int ID, NJC;
    private boolean SIG, JUGADO;
    ArrayList<Jugador> ListJugadores = new ArrayList<>();

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getNJC() {
        return NJC;
    }

    public void setNJC(int NJC) {
        this.NJC = NJC;
    }

    public boolean isSIG() {
        return SIG;
    }

    public void setSIG(boolean SIG) {
        this.SIG = SIG;
    }

    public boolean isJUGADO() {
        return JUGADO;
    }

    public void setJUGADO(boolean JUGADO) {
        this.JUGADO = JUGADO;
    }

    public ArrayList<Jugador> getListJugadores() {
        return ListJugadores;
    }

    public void setListJugadores(ArrayList<Jugador> ListJugadores) {
        this.ListJugadores = ListJugadores;
    }

    
     
}