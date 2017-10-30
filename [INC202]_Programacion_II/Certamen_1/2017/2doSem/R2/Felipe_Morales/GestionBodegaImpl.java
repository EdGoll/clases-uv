import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GestionBodegaImpl {
	public static void main(String[] args) throws Exception{
		GestionBodega gb = new GestionBodega();
		ArrayList<Producto> listaProductos = new ArrayList<Producto>();
		Integer pregunta;
		System.out.println("Bienvenido al programa de Gestion de Bodega");
		do{
			System.out.println("Que desea hacer?");
			System.out.println("1) Ingresar producto nuevo al inventario. 2) Mostrar Stock. 3) Vender Producto. 4) Salir programa.");
			System.out.println("ingrese un numero : ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			pregunta = Integer.parseInt(br.readLine());
			if(pregunta == 1){
				listaProductos = gb.crearProducto(listaProductos);
			}
			else{
				if(pregunta == 2){
					gb.listarStock(listaProductos);
				}
				else{
					if(pregunta == 3){
						listaProductos = gb.venderProducto(listaProductos);
					}
				}
			}
		
		}while(pregunta != 4);
	}
}
