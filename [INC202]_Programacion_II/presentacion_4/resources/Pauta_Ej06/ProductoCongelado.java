public class ProductoCongelado extends Producto {

    private float temperatura;
    
    public ProductoCongelado(float temperatura, String fechaCaducidad, int numeroLote) {
        super(fechaCaducidad, numeroLote);
        this.temperatura = temperatura;
    }
    
    @Override
    public void aString() {
        System.out.println("Temperatura : " + this.temperatura + ", Fecha Caducidad : " + super.fechaCaducidad + ", Numero Lote : " + super.numeroLote);
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
}
