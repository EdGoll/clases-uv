public class ProductoRefrigerado extends Producto {

    private String codigoOrganismo;

    public ProductoRefrigerado(String codigoOrganismo, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
    }

    @Override
    public void aString() {
        System.out.println("Codigo Organismo : " + this.codigoOrganismo + ", Fecha Caducidad : " + super.fechaCaducidad + ", Numero Lote : " + super.numeroLote);
    }

    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }
}
