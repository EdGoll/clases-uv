//Ana Muñoz Fuentes		19.817.247-2
import java.util.ArrayList;
import java.io.*;

public class GestionBodegaImpl {

	public static void main(String[] args) throws IOException {
		GestionBodega registro = new GestionBodega();
		registro.crearProducto();
		registro.listarStock();
		registro.venderProductos();
	}
}