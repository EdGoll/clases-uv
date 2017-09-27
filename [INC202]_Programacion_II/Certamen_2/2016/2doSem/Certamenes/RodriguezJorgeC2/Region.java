public class Region {
    
    private String idRegion;
    private String nombreRegion;
    private String numeroRomano;
    private String ordenGeograficoRegion;

    public String getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public String getNumeroRomano() {
        return numeroRomano;
    }

    public void setNumeroRomano(String numeroRomano) {
        this.numeroRomano = numeroRomano;
    }

    public String getOrdenGeograficoRegion() {
        return ordenGeograficoRegion;
    }

    public void setOrdenGeograficoRegion(String ordenGeograficoRegion) {
        this.ordenGeograficoRegion = ordenGeograficoRegion;
    }

    @Override
    public String toString() {
        return "Region{" + "idRegion=" + idRegion + ", nombreRegion=" + nombreRegion + ", numeroRomano=" + numeroRomano + ", ordenGeograficoRegion=" + ordenGeograficoRegion + '}';
    }
    
    
}
