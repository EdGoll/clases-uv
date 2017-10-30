
import java.io.IOException;

public class GestionBodegaImpl {

	public static void main(String[] args) throws NumberFormatException, IOException {
		GestionBodega GB = new GestionBodega();
		GB.crearProducto();
		GB.listarStock();
		GB.venderProducto();
	}
}