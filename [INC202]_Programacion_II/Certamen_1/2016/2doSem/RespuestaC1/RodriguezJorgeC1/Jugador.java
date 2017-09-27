
public class Jugador {

    private int id;
    private int BR;
    private int BG;
    private int GC;
    private int nivelJuego;
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNivelJuego() {
        return nivelJuego;
    }

    public void setNivelJuego(int nivelJuego) {
        this.nivelJuego = nivelJuego;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBR() {
        return BR;
    }

    public void setBR(int BR) {
        this.BR = BR;
    }

    public int getBG() {
        return BG;
    }

    public void setBG(int BG) {
        this.BG = BG;
    }

    public int getGC() {
        return GC;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" + "BR: " + BR + "\n" + "BG: " + BG + "\n" + "GC: " + GC + "\n" + "Nivel de Juego: " + nivelJuego + "\n";
    }
    
    
    }
