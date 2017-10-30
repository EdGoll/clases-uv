import java.io.IOException;

public class GestionBodegaImpl {

    public static void main(String[] args) throws IOException {

        GestionBodega lista = new GestionBodega();
        Producto o1 = new Producto();
        lista.crearProducto(o1);
        

        lista.listarStock();
    }
}
