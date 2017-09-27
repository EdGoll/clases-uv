public class Equipo {

    private int id;
    private int nivelColectivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivelColectivo() {
        return nivelColectivo;
    }

    public void setNivelColectivo(int nivelColectivo) {
        this.nivelColectivo = nivelColectivo;
    }

    @Override
    public String toString() {
        return "ID: " + id + "  Nivel Colectivo: " + nivelColectivo + "\n";
    }

   
    
    
}
