//Ana Muñoz Fuentes		19.817.247-2
import java.util.ArrayList;
import java.io.*;

public class GestionBodega {
	ArrayList<Producto> listaProductos = new ArrayList<>(); //arreglo de tipo dinamico que permita guardar los productos

	public void crearProducto() throws IOException {
		/*crea un producto especifico y asigna el precio al cual el 
		sistema debe agregarle el IVA sobre el precio ingresado y luego
		ingresarlo a listaProductos*/

		Producto product;
		String answer;

		//VARIABLES DE BEAN
		int codigo = 0;
		String nombre = null;
		int stock = 0;
		double precio = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do{
			System.out.println("Desea ingresar un producto? Responda 'Si' o 'No'");
			answer = br.readLine();

			if(answer.equalsIgnoreCase("Si")){
				
				System.out.println("Codigo: ");
				codigo = Integer.valueOf(br.readLine());
				
				System.out.println("Nombre: ");
				nombre = br.readLine();
				
				System.out.println("Stock inicial: ");
				stock = Integer.valueOf(br.readLine());
				
				System.out.println("Precio: ");
				//agregarle el IVA
				//precio = Integer.valueOf(br.readLine());
				//precio= precio + (precio*0.19);
				precio = Double.valueOf(br.readLine())*1.19;
				
			}

		product = new Producto(codigo, nombre, stock, precio);
		listaProductos.add(product);

		} while(!answer.equalsIgnoreCase("No"));
	}

	public void listarStock() {
		/*visualiza el codigo, nombre y stock de cada producto*/
		Producto inventario;

		System.out.println("-INVENTARIO-");

		if(listaProductos.isEmpty()){
			System.out.println("No hay productos registrados en el inventario.");
		} else{
			for(int i=0; i<(listaProductos.size())-1; i++){
				inventario = listaProductos.get(i);
				System.out.println((i+1)+"- Codigo: " + inventario.getCodigo() + " - "
				 + inventario.getNombre() + " - Stock: " + inventario.getStock());
			}
		}
	}

	public void venderProductos() throws IOException {
		/*muestra lista con su codigo, nombre y precio cuyo stock sea mayor a 0
		El usuario irá seleccionando en base al CODIGO el prod. que vendera
		y se debe descontar del inventario; se debe ir sumandolos precios
		de cada producto acumulandolo en una variable precioVenta
		Al finalizar, mostrar el total de la venta*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer;
		//String venta;
		int stock_updater=0;
		int code=0;
		double precioVenta=0;
		Producto inventario;
		
		do{
			System.out.println("efectuara venta? 'Si' 'No' ");
			answer = br.readLine();
			if(answer.equalsIgnoreCase("Si")){
				System.out.println("Productos Disponibles");
				for(int i=0; i<(listaProductos.size())-1; i++){
					inventario = listaProductos.get(i);
					System.out.println((i+1)+"- Codigo: " + inventario.getCodigo() + " - " + inventario.getNombre() + " - $" + inventario.getPrecio());
				}	
					System.out.println(" --  --  --  --  --  --  --  -- ");
					if(listaProductos.size() > 0) {
						System.out.println("Ingrese el codigo del producto que vendera: ");
						code = Integer.valueOf(br.readLine());

					//falta for pa buscar
						for(int i=0; i<listaProductos.size(); i++){
							inventario =listaProductos.get(i);

							if(code == inventario.getCodigo()){ 	//'==' porque se comparan datos de tipo entero
								//disminuye uno en el stock del producto solicitado
								stock_updater = inventario.getStock();
								stock_updater-=1;
								inventario.setStock(stock_updater);
								//precioVenta = inventario.getPrecio();

								System.out.println("----$----");

								precioVenta += (inventario.getPrecio());
							}
						}
					} else {
						System.out.println("No existe stock.");
					}
				}
			
		}while(!answer.equalsIgnoreCase("No"));

		//System.out.println("Total de su venta: $" + precioVenta);

		if (answer.equalsIgnoreCase("No")) {
			//mostrar el total de la venta
			System.out.println("Total de su venta: $" + precioVenta);
		}
	}

}
