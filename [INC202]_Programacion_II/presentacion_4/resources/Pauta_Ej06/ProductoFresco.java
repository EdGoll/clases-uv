public class ProductoFresco extends Producto {

    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String fechaEnvasado, String paisOrigen, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public void aString() {
        System.out.println("Fecha envasado : " + this.fechaEnvasado + ", Pais Origen : " + this.paisOrigen + ", Fecha Caducidad : " + super.fechaCaducidad + ", Numero Lote : " + super.numeroLote);
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
