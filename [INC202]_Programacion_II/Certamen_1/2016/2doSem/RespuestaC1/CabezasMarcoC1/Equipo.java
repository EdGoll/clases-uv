




import java.util.List;

public class Equipo {
    private int nombreId;
    private List<Jugador> equipo;
    private int nj_colectivo;
    public int getNombreId() {
        return nombreId;
    }

    public void setNombreId(int nombreId) {
        this.nombreId = nombreId;
    }

    public List<Jugador> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<Jugador> equipo) {
        this.equipo = equipo;
    }

    public int getNj_colectivo() {
        return nj_colectivo;
    }

    public void setNj_colectivo(int nj_colectivo) {
        this.nj_colectivo = nj_colectivo;
    }
}
