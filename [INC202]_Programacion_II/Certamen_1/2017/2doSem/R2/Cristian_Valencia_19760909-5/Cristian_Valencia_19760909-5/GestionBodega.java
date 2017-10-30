import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GestionBodega {
	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	Producto p = null;
	public Producto crearProducto() throws IOException{
		String resp = "";
		double precio2 = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Desea ingresar un producto(Si/No):");
		resp=br.readLine();
		do{
			
			p = new Producto();
			System.out.println("Ingrese nombre del producto: ");
			String nombre = br.readLine();	
			((Producto)p).setNombre(nombre);
			System.out.println("Ingrese stock del producto: ");
			Integer stock = Integer.valueOf(br.readLine());
			((Producto)p).setStock(stock);
			System.out.println("Ingrese codigo del producto: ");
			Integer codigo = Integer.valueOf(br.readLine());
			((Producto)p).setCodigo(codigo);
			System.out.println("Ingrese precio del producto: ");
			double precio = Integer.valueOf(br.readLine());			
			precio2 = precio + (precio*19)/100;
			precio = precio2;
			((Producto)p).setPrecio(precio);
			//System.out.println("Precio con iva incluido(19%): "+precio2);
			Producto p = new Producto(nombre, stock, codigo, precio);
			listaProductos.add(p);
			System.out.println("Desea ingresar otro producto:");
			resp=br.readLine();
		}while(!resp.equalsIgnoreCase("no"));
		
		return p;
		
	}
	
	public void listarStock() {
		Producto p = null;
		System.out.println("Productos en bodega: ");
		for(int i=0; i<listaProductos.size(); i++) {
			p = listaProductos.get(i);
			System.out.println("El nombre del producto es: "+p.getNombre()+",su stock: "+p.getStock()+" y por ultimo su codigo es: "+p.getCodigo());
		}
		
	}
	
	public void venderProducto() throws IOException{
		Integer codP = 0;
		String resp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Producto p = null;
		double precioVenta = 0;
		System.out.println("Listado de producto(s): ");
		for(int i=0; i<listaProductos.size(); i++) {
			p = listaProductos.get(i);			
			while(p.getStock()>0) {
				System.out.println( "Producto: "+p.getNombre());
				System.out.println(	"Codigo :"+ p.getCodigo());
				System.out.println( "Precio: "+ p.getPrecio());
				break;
			}
		}
		
		do {
			
			for(int i=0; i<listaProductos.size(); i++) {
				Producto l = listaProductos.get(i);
				System.out.println("!Venta de Productos¡");
				System.out.println("Ingrese codigo del producto que desee: ");			
				codP = Integer.valueOf(br.readLine());								
				if(codP == p.getCodigo()) {
					
					System.out.println("El precio: "+l.getPrecio());
					
				}
				else {					
					System.out.println("Codigo ingresado erroneo");
				}
				System.out.println("Desea ingresar otro codigo(Si/No): ");
				resp = br.readLine();								
				precioVenta = precioVenta + l.getPrecio();
				System.out.println("Precio de la venta: "+precioVenta);
				System.out.println("ADIOS");
			}					
		}while(!resp.equalsIgnoreCase("no"));
		
				
			
			
	
	}	
	
}
