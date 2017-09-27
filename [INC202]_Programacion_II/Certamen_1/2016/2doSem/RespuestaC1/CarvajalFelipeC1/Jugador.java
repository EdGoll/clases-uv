


public class Jugador {
 private int id,br,bg,gc;
 private String tipo;
 private int lvl;
 
 
 public void setId(int id){
     this.id=id;
 }
 
 public int getId(){
     return id;
 }

    public int getBr() {
        return br;
    }

    public int getBg() {
        return bg;
    }

    public int getGc() {
        return gc;
    }

    public String getTipo() {
        return tipo;
    }

    public int getLvl() {
        return lvl;
    }

    public void setBr(int br) {
        this.br = br;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public void setGc(int gc) {
        this.gc = gc;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    @Override
    public String toString(){
    return "\nJugador: "+id+" Br: "+br+" Bg: "+bg+" Gc: "+gc+" Lvl: "+lvl+" Rol: "+tipo;
    }
    
}
