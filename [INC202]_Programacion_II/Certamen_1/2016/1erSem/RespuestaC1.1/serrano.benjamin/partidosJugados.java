package Mundial;

public class partidosJugados {

    private String id;
    private String fecha;
    private String lugar;
    private String paisLocal;
    private String resultado;
    private String paisVisita;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id.trim();
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha.trim();
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar.trim();
    }
    
    public String getPaisLocal() {
        return this.paisLocal;
    }

    public void setPaisLocal(String local) {
        this.paisLocal = local.trim();
    }
    
    public String getResultado(){
        return this.resultado;
    }
    
    public void setResultado(String resultado){
        this.resultado = resultado.trim();
    }
    
    public String getPaisVisita(){
        return this.paisVisita;
    }
    
    public void setPaisVisita(String visita){
        this.paisVisita = visita.trim();
    }
    
}
