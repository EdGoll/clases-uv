import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class GestionBodega {
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
	public ArrayList<Producto> crearProducto(ArrayList<Producto> listaProductos) throws Exception{
		String pregunta2;
		do{
		Producto productoNuevo = new Producto();
		String pregunta1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//codigo
		System.out.println("Ingrese el codigo del producto : ");
		Integer codigo = Integer.parseInt(br.readLine());
		if(listaProductos.size()==0){
			productoNuevo.setCodigo(codigo);
			//nombre
			System.out.println("Ingrese el nombre del producto : ");
			String nombre = br.readLine();
			productoNuevo.setNombre(nombre);
			//stock
			System.out.println("Ingrese el stock inicial del producto : ");
			Integer stock = Integer.parseInt(br.readLine());
			productoNuevo.setStock(stock);
			//precio
			System.out.println("Ingrese el precio bruto del producto (sin iva) : ");
			double precioBruto = Double.parseDouble(br.readLine());
			double precio = (precioBruto*(119/100));
			productoNuevo.setPrecio(precio);
			//añadiendo el producto al arreglo
			listaProductos.add(productoNuevo);
		}
		else{
			for(int i = 0; i < listaProductos.size(); i++){
				if(codigo.equals(listaProductos.get(i).getCodigo())){
					System.out.println("El producto ya esta ingresado, desea ingresar un nuevo stock? Si/No");
					pregunta1 = br.readLine();
					if(pregunta1.equalsIgnoreCase("Si")){
						Integer codigoAux = listaProductos.get(i).getCodigo();
						String nombreAux = listaProductos.get(i).getNombre();
						double precioAux = listaProductos.get(i).getPrecio();
						System.out.println("Ingrese nuevo stock : ");
						Integer stockAux = Integer.parseInt(br.readLine());
						listaProductos.remove(i);
						productoNuevo.setCodigo(codigoAux);
						productoNuevo.setNombre(nombreAux);
						productoNuevo.setPrecio(precioAux);
						productoNuevo.setStock(stockAux);
						listaProductos.add(i, productoNuevo);
					}
				}
			}
		}
		System.out.println("Desea agregar un nuevo producto? si/no");
		pregunta2 = br.readLine();
		}while(pregunta2.equalsIgnoreCase("si"));
		return listaProductos;
	}
	
	public void listarStock(ArrayList<Producto> listaProductos){
		if(listaProductos.size() > 0){
			for(int i = 0; i < listaProductos.size(); i++){
				//instanciando el producto a mostrar
				Producto p = new Producto();
				p = listaProductos.get(i);
				//"saco los valores"
				String codigo = String.valueOf(p.getCodigo());
				String nombre = p.getNombre();
				String stock = String.valueOf(p.getStock());
				//muestro los valores
				System.out.println("El codigo del producto " + (i+1)  + " es : ");
				System.out.println(codigo);
				System.out.println("El nombre del producto " + (i+1)  + " es : ");
				System.out.println(nombre);
				System.out.println("El stock del producto " + (i+1)  + " es : ");
				System.out.println(stock);			
			}
		}
		else{
			System.out.println("El inventario no tiene productos");
		}
	}
	
	public ArrayList<Producto> venderProducto(ArrayList<Producto> listaProductos) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.00");
		//mostrando los productos con stock mayor a cero
		for(int i = 0; i < listaProductos.size(); i++){
			Producto p = new Producto();
			p = listaProductos.get(i);
			Integer stockEstado = p.getStock();
			if(stockEstado > 0){
				System.out.println("Codigo : " + String.valueOf(p.getCodigo()));
				System.out.println("Nombre : " + p.getNombre());
				System.out.println("Precio (iva incluido) : " + df.format(p.getPrecio()));
			}
		}
		
		//venta
		ArrayList<Double> venta = new ArrayList<Double>();
		String pregunta;
		do{
			System.out.println("ingrese el codigo del producto que desea comprar : ");
			Integer codigoV = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < listaProductos.size(); i++){
				if(codigoV.equals(listaProductos.get(i).getCodigo())){
					System.out.println("Ingrese la cantidad que desea llevar : ");
					Integer cantidad = Integer.parseInt(br.readLine());
					double precioProducto = listaProductos.get(i).getPrecio();
					double precioV = precioProducto*cantidad;
					venta.add(precioV);
					//quitando stock
					Integer codigoAux = listaProductos.get(i).getCodigo();
					String nombreAux = listaProductos.get(i).getNombre();
					Integer stockAux = (listaProductos.get(i).getStock() - cantidad);
					listaProductos.remove(i);
					Producto pAux = new Producto();
					pAux.setCodigo(codigoAux);
					pAux.setNombre(nombreAux);
					pAux.setPrecio(precioProducto);
					pAux.setStock(stockAux);
					listaProductos.add(i,pAux);
				}
			}
			
			System.out.println("Desea agregar otro producto a la compra? : Si/No");
			pregunta = br.readLine();
		}while(!pregunta.equalsIgnoreCase("No"));
		//calculando precio total de la venta
		double precioVenta = 0;
		for(int i = 0; i < venta.size(); i++){
			precioVenta = precioVenta + venta.get(i);
		}
		
		System.out.println("El saldo a pagar es : ");
		System.out.println(df.format(precioVenta));
		
		return listaProductos;
	}
	
}
