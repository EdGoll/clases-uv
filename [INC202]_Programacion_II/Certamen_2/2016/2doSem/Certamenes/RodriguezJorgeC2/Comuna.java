public class Comuna {

    private String idComuna;
    private String nombreComuna;
    private String idProvincia;

    public String getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(String idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreComuna() {
        return nombreComuna;
    }

    public void setNombreComuna(String nombreComuna) {
        this.nombreComuna = nombreComuna;
    }

    public String getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Override
    public String toString() {
        return "Comuna{" + "idComuna=" + idComuna + ", nombreComuna=" + nombreComuna + ", idProvincia=" + idProvincia + '}';
    }
    
}
