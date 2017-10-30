
import java.io.IOException;

public class GestionBodegaImpl {

    public static void main(String[] args)throws IOException{
        
    	GestionBodega Producto = new GestionBodega();
    	
    	Producto.crearProducto();
    	Producto.listarStock();
    	Producto.venderProductos();
        }
}
