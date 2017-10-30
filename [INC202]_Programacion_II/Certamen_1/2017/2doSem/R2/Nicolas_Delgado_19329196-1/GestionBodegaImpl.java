import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class GestionBodegaImpl {

	public static void main(String[] args) throws IOException, ParseException {
		GestionBodega listaProducto = new GestionBodega();
		
		System.out.println("BIENVENIDO");

		Integer x = 1;

		//MENÚ DE UTILIZACION PARA LOS METODOS QUE SE TIENEN.
		while (x == 1) {
			System.out.println("Presione 1 para ingresar un producto.");
			System.out.println("Presione 2 para ver el listado de productos.");
			System.out.println("Presione 3 para vender(comprar) productos.");
			System.out.println("Presione 4 para finalizar...");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Integer opcion = Integer.valueOf(br.readLine());
			if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
				System.out.println("Opcion ingresada no valida, intente nuevamente:\n");

			}
			else {
				switch(opcion) {	
				case 1:
					listaProducto.crearProducto();
					System.out.println("¿Desea realizar otra operacion?\n");
					System.out.println("Presione 1 para SI");
					System.out.println("Presione 2 para NO");
					x = Integer.valueOf(br.readLine());
				break;	
				case 2:
					listaProducto.listarStock();
					System.out.println("¿Desea realizar otra operacion?\n");
					System.out.println("Presione 1 para SI");
					System.out.println("Presione 2 para NO");
					x = Integer.valueOf(br.readLine());
				break;
				case 3:
					listaProducto.venderProductos();
					System.out.println("¿Desea realizar otra operacion?\n");
					System.out.println("Presione 1 para SI");
					System.out.println("Presione 2 para NO");
					x = Integer.valueOf(br.readLine());
					
				break;
				case 4:
					x = 2;
				break;
				}
			}
		}	
		System.out.println("GRACIAS POR PREFERIRNOS");
	}
}

