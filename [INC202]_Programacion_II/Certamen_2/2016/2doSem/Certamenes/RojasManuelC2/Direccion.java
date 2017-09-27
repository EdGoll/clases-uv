public class Direccion {

    private String calle;
    private String numero;
    private Comuna comuna;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Comuna getComuna() {
        return comuna;
    }

    public void setComuna(Comuna Comuna) {
        this.comuna = Comuna;
    }

    @Override
    public String toString() {
        return comuna.toString() + "\t" + calle + "\t" + numero;
    }

}
