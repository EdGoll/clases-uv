import java.io.IOException;

public class GestionBodegaImpl {
	
	public static void main(String[] args) throws IOException{
		GestionBodega gBod = new GestionBodega();
		gBod.crearProducto();
		gBod.listarStock();
		gBod.venderProducto();
	}

}
