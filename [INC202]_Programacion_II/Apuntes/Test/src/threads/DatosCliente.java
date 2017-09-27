package threads;

public class DatosCliente {

    private String uidCliente;
    private int[] carroCompra;

    public DatosCliente(String uidCliente, int[] carroCompra) {
        this.uidCliente = uidCliente;
        this.carroCompra = carroCompra;
    }
    
    public String getUidCliente() {
        return uidCliente;
    }

    public void setUidCliente(String uidCliente) {
        this.uidCliente = uidCliente;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}
