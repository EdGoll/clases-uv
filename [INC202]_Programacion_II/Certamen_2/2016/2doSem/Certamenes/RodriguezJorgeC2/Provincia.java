public class Provincia {

    private String idProvincia;
    private String nombreProvincia;
    private String idRegion;

    public String getIdProvincia() {
        return idProvincia;
    }

    

    public void setIdProvincia(String idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public String getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
    }
    
    @Override
    public String toString() {
        return "Provincia{" + "idProvincia=" + idProvincia + ", nombreProvincia=" + nombreProvincia + ", idRegion=" + idRegion + '}';
    }
}
