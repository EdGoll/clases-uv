
public class Pokemon {

    private String id;
    private String nombre;
    private String evolucion;
    private String codigoTipoPrincipal;
    private String descripcionTipoPrincipal;
    private String codigoTipoSecundario;
    private String descripcionTipoSecundario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public String getCodigoTipoPrincipal() {
        return codigoTipoPrincipal;
    }

    public void setCodigoTipoPrincipal(String codigoTipoPrincipal) {
        this.codigoTipoPrincipal = codigoTipoPrincipal;
    }

    public String getDescripcionTipoPrincipal() {
        return descripcionTipoPrincipal;
    }

    public void setDescripcionTipoPrincipal(String descripcionTipoPrincipal) {
        this.descripcionTipoPrincipal = descripcionTipoPrincipal;
    }

    public String getCodigoTipoSecundario() {
        return codigoTipoSecundario;
    }

    public void setCodigoTipoSecundario(String codigoTipoSecundario) {
        this.codigoTipoSecundario = codigoTipoSecundario;
    }

    public String getDescripcionTipoSecundario() {
        return descripcionTipoSecundario;
    }

    public void setDescripcionTipoSecundario(String descripcionTipoSecundario) {
        this.descripcionTipoSecundario = descripcionTipoSecundario;
    }
    
    @Override
    public String toString() {
        return String.format("(%s) %s %s %s %s", id, nombre, evolucion, descripcionTipoPrincipal, descripcionTipoSecundario != null ? descripcionTipoSecundario : "");
    }
}
