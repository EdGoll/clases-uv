

import java.io.IOException;

public class GestionBodegaImpl {

	public static void main(String[] args) throws IOException {
		
		GestionBodega a = new GestionBodega();
		a.crearProducto();
		a.listarStock();
		a.venderProductos();
	}
}
