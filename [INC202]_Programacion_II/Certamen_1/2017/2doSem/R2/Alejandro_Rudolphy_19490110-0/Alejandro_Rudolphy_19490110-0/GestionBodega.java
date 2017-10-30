
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
	
public class GestionBodega {
		
		private ArrayList<Producto> ListaProductos = new ArrayList<Producto>();
			
		public Producto crearProducto() throws NumberFormatException, IOException {
		Producto producto = null;
			
		Integer codigo = 0;
		Integer stock = 0;
		String nombre = "";
		Integer valor = 0;
		float precio = 0;
		String resp = "";
		System.out.println("Bienvenido al sistema de stock de productos UV 2017");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			producto = new Producto();
			System.out.println("Ingrese codigo unico del producto: ");	
			codigo = Integer.valueOf(br.readLine());
			System.out.println("Ingrese el numero de unidades del producto: ");
			stock = Integer.valueOf(br.readLine());
			System.out.println("Ingrese nombre del producto: ");
			nombre = br.readLine();
			System.out.println("Ingrese precio del producto sin IVA: ");
			valor = Integer.valueOf(br.readLine());
			precio = valor + ((valor*19)/100);
			System.out.println("El precio de su producto con IVA es "+precio);
			producto = new Producto(codigo, nombre, stock, precio, precio);
			ListaProductos.add(producto);
			System.out.println("Desea ingresar otro producto? ");
			resp = br.readLine();
		}while(!resp.equalsIgnoreCase("No"));
		System.out.println("Finalizado el ingreso de productos");
		return producto;
		}
			
		public void listarStock() throws NumberFormatException, IOException {
			for(int i = 0; i < ListaProductos.size(); i++) {
				Producto p = ListaProductos.get(i);
				System.out.println("En bodega hay "+p.getStock()+" unidades de "+p.getNombre()+" de precio "+p.getPrecio()+" por unidad.");
				System.out.println("El codigo de su producto es "+p.getCodigo());
		}
	}	
		 public void venderProducto() throws NumberFormatException, IOException {
				for(int i = 0; i < ListaProductos.size(); i++) {
				Producto p = ListaProductos.get(i);
			 	String nombre = "";
				Integer precio = 0;
				float precioVenta = 0;
				Integer stock = 0;
				Integer codigo = 0;
				String resp3 = "";
				Integer resp2 = 0;
				Integer restantes = 0;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				do{
					System.out.println("Desea comprar algun producto? Ingrese 1 si lo desea, ingrese 0 para salir del programa");
					resp2 = Integer.valueOf(br.readLine());
					if(resp2 == 1){
						System.out.println("Elija su producto.");
						if(p.getStock() > 0) {
							System.out.println("Los productos disponibles son: ");
							restantes = p.getStock();
							System.out.println(restantes+" unidades de "+p.getNombre()+" con un valor de "+p.getPrecio()+" por unidad, con codigo "+p.getCodigo());
							System.out.println("Ingrese el codigo del producto que desea: ");
							codigo = Integer.valueOf(br.readLine());
							if(codigo == p.getCodigo()) {
								System.out.println("El producto que usted desea es un "+p.getNombre());
								precioVenta = precioVenta + p.getPrecio(); 
								restantes = p.getStock() - 1;
								System.out.println("Unidades restantes: "+restantes+" "+p.getNombre());
								}
							else {
								System.out.println("No poseemos ningun producto con ese codigo, vuelva a intentar");
							 }
						}	 
						if(p.getStock() == 0){
							System.out.println("no existen unidades de ese producto"); 
						}
					if(resp2 == 0){
						System.out.println("Finalizado el programa");		
					}	
					p = new Producto(codigo, nombre, stock, precio, precioVenta);
					ListaProductos.add(p);
					System.out.println("Desea comprar algo mas?");
					resp3 = br.readLine();
					}
					}while(!resp3.equalsIgnoreCase("no"));
				  System.out.println("Finalizada la venta de productos, se junto en total "+p.getPrecioVenta());
				  System.out.println("Finalizado el programa");
				  break;
				}
		}
}
