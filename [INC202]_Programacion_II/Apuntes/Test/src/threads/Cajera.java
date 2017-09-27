package threads;

public class Cajera {

    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra(DatosCliente datosCliente, long timeStamp) {

        System.out.println("La cajera " + this.nombre
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + datosCliente.getUidCliente()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000
                + "seg");

        for (int i = 0; i < datosCliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(datosCliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1)
                    + " ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000
                    + "seg");
        }

        System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR "
                + datosCliente.getUidCliente()+ " EN EL TIEMPO: "
                + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}