package Euro;
//Se crea el bean del objeto 
public class Valores {

    private String nombre;
    private String precio;
    private String variacion;
    private String var_porcentaje;
    private String volumen;
    private String pais;
    private String sector;
    private String mercadoevaluado;
    private String pe;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio.trim();
    }

    public String getVariacion() {
        return variacion;
    }

    public void setVariacion(String variacion) {
        this.variacion = variacion.trim();
    }

    public String getVar_Porcentaje() {
        return var_porcentaje;
    }

    public void setVar_Porcentaje(String var_porcentaje) {
        this.var_porcentaje = var_porcentaje.trim();
    }

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen.trim();
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais.trim();
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector.trim();
    }

    public String getMercadoEvaluado() {
        return mercadoevaluado;
    }

    public void setMercadoEvaluado(String mercadoevaluado) {
        this.mercadoevaluado = mercadoevaluado.trim();
    }

    public String getPE() {
        return pais;
    }

    public void setPE(String pe) {
        this.pe = pe.trim();
    }
}
