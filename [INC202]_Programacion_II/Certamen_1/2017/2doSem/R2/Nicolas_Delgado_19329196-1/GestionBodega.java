import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionBodega{

	private ArrayList<Producto> listaProducto = new ArrayList<Producto>();
	
	public void crearProducto() throws IOException {
		Producto producto = null;
		
		Integer codigo = 0;
		String nombre = "";
		Integer stock = 0;
		double precio = 0;
		Integer resp = 1;
		double pre = 0;
		System.out.println("Bienvenido a Gestion De Bodega");
		
		do{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			producto = new Producto();
			//CODIGO
			System.out.println("Ingrese el codigo del producto (ej. 12345)");
			codigo = Integer.valueOf(br.readLine());
			//NOMBRE
			System.out.println("Ingrese nombre del producto: ");
			nombre = br.readLine();
			//STOCK
			System.out.println("Ingrese el stock del producto (Unidades)");
			stock = Integer.valueOf(br.readLine());
			//PRECIO
			System.out.println("Ingrese el precio de su producto sin IVA (Pesos)");
			pre = sc.nextDouble();
			//PRECIO + IVA
			precio = pre + (pre * 0.19);
			//AÑADIR VALORES A LA LISTA
			producto = new Producto(codigo, nombre, stock, precio);
			listaProducto.add(producto);
			//PREGUNTAR SI QUIERE INGRESAR OTRO PRODUCTO
			System.out.println("\n¿Desea ingresar otro Producto?\n");
			System.out.println("Presione 1 para SI");
			System.out.println("Presione 2 para NO");
			resp = Integer.valueOf(br.readLine());

		}
		while(resp != 2);
		System.out.println("Finalizado el ingreso de Productos");
	}
	public void listarStock() throws IOException {
		Producto p=null;
		
		//SI LA LISTA ESTA VACIA, SE ENVIA UN MENSAJE.
		if(listaProducto.isEmpty()) {			
		System.out.println("No hay productos registrados");
		}
		//SI LA LISTA CONTIENE ELEMENTEOS SE RECORRE PARA LUEGO OBTENER LOS VALORES.
		else {
			for (int i = 0; i < listaProducto.size(); i++) {
				p = listaProducto.get(i);
				System.out.println("|El CODIGO del producto" + " " + (i+1) + " es: "+ p.getCodigo()+ "|");
				System.out.println("|El NOMBRE del producto "+ " " + (i+1) + " es: "+p.getNombre()+ "|");
				System.out.println("|El STOCK del producto "+ " " + (i+1) + " es: "+p.getStock()+ "|\n");

			}
		}	
	}
	public void venderProductos() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Producto p=null;
		Integer precioVenta = 0;
		Integer cod;
		Integer y = 1;
		//Integer nuevoStock = 0;
		//Producto producto = new Producto();
		if(listaProducto.isEmpty()) {			
		System.out.println("No hay productos registrados");
		}
		else {
			//SE MUESTRAN LOS PRODUCTOS CUYO STOCK SEA IGUAL O MAYOR A 1.
			System.out.println("Los productos disponibles a vender son:\n");
			for (int i = 0; i < listaProducto.size(); i++) {
				p = listaProducto.get(i);
				if(p.getStock() >= 1) {
					System.out.println("|El CODIGO del producto" + " " + (i+1) + " es: "+ p.getCodigo()+ "|");
					System.out.println("|El NOMBRE del producto "+ " " + (i+1) + " es: "+p.getNombre()+ "|");
					System.out.println("|El PRECIO del producto "+ " " + (i+1) + " es: "+p.getPrecio()+ "|\n");
					
				}
			}
			do{
				System.out.println("Ingrese el codigo del producto que desea vender");
				cod = Integer.valueOf(br.readLine());
			
				//SE RECORRE LA LISTA Y SE IGUALA AL CODIGO INGRESADO PARA SUMAR LOS PRODUCTOS.
				for (int i = 0; i < listaProducto.size(); i++) {
					p = listaProducto.get(i);			
					int n = p.getCodigo();	
					nuevoStock = p.getStock();
					if(cod == n){
						
						//VARIABLE QUE ALMACENA EL PRECIO DE LA VENTA.
						precioVenta = (int) (p.getPrecio() + precioVenta);
						
						//NUEVO STOCK DEL PRODUCTO. ESTA ES LA FORMA QUE PIENSO SE PUEDE HACER, NO FUI CAPAZ DE IMPLEMENTARLO.	
						//nuevoStock = nuevoStock - 1;
						//System.out.println("nuevo stock =" + nuevoStock);
						//producto = new Producto(p.getCodigo(), p.getNombre(), nuevoStock, p.getPrecio());
						//listaProducto.add(producto);
						
						//PREGUNTAR SI SIGUE LA COMPRA O FINALIZA.
						System.out.println("\n¿Desea comprar otro Producto?\n");
						System.out.println("Presione 1 para SI");
						System.out.println("Presione 2 para NO");
						y = Integer.valueOf(br.readLine());
						
					}
					else {
						if(cod == n){
							
						}
						
					}
				}
			}
			while (y == 1 );  
			System.out.println("Precio final:" + precioVenta);
			
		}	
	}

}


