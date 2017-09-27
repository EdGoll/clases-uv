public class Jugador {

    private int numero;
    private int BR;
    private int BG;
    private int GC;
    private String tipo;
    private int nivel_juego;

    public Jugador() {
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel_juego() {
        return nivel_juego;
    }

    public void setNivel_juego(int nivel_juego) {
        this.nivel_juego = nivel_juego;
    }
}
