//Matias Ponce R.
//19.590.013-2

import java.io.IOException;


public class GestionBodegaImpl {

	public static void main(String[] args) throws IOException {
		System.out.println("BIENVENIDO");

		GestionBodega listaProducto = new GestionBodega();
		listaProducto.crearProducto();
		
		listaProducto.venderProductos();
		System.out.println("Acontinuacion se mostrara el total de productos guardados en bodega");
		listaProducto.listarStock();
		
		System.out.println("GRACIAS POR PREFERIRNOS, ADIOS");

	}
	
}
