import java.util.ArrayList;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		GestionBodega registro = new GestionBodega();
		registro.crearProducto();
		registro.listarStock();
		registro.valorInventario();
	}
}