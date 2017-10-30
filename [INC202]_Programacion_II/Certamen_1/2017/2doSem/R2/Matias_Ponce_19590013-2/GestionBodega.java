//Matias Ponce R.
//19.590.013-2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class GestionBodega {
	
	private ArrayList<Producto> listaProducto = new ArrayList<Producto>();
	
	public void crearProducto() throws IOException { //En esta clase se crea el producto junto a los demas atributos solicitados
		Producto p=null;
		Integer codigo = 0;
		String nombreArticulo= "";
		Double precio;
		Integer stock = 0;
		String resp = "";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
		
			System.out.print("Ingrese el codigo del Producto(4 digitos):");
			codigo = Integer.valueOf(br.readLine());
			System.out.print("Ingrese el nombre del Producto: ");
			nombreArticulo = br.readLine();
			System.out.print("Ingrese el precio del Producto:");
			precio = Double.valueOf(br.readLine());
			if(precio > 0) {
				precio = ((precio) * 0.19)+precio;
			}
			System.out.print("Ingrese el stock:");
			stock = Integer.valueOf(br.readLine());
			
			p= new Producto(codigo,nombreArticulo,precio, stock);
			listaProducto.add(p);
		
			System.out.print("Desea Ingresar Otro Producto si/no:");
			resp = br.readLine();
		
		}while(!resp.equalsIgnoreCase("no"));
		
	}
	
	public void venderProductos() throws IOException { // Muestra en el tamaño de un arreglo los objetos ingresados y los compara
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer busqueda = 0;
		String resp2 = "";
		do {
			System.out.println("Ingrese el codigo del producto para venta: ");
			busqueda = Integer.valueOf(br.readLine());
			
			for (int j = 0; j < listaProducto.size(); j++) {
				Producto t = listaProducto.get(j);
				if(busqueda.equals(t.getCodigo())) {
					System.out.println("El producto que busca para venta es: "+t.getNombreArticulo());
					System.out.println("El stock es de : "+t.getStock());
					System.out.println("Su precio total es: "+t.getPrecio());
					
					System.out.println("Desea buscar otro producto para venta? si/no");
					resp2 = br.readLine();
	
				}
			}
			if(listaProducto == null) {		
				System.out.println("El producto que usted busca no se encuentra");
			}
		}while(!resp2.equalsIgnoreCase("no"));
		System.out.println("Finalizada la venta");	
	}
	
	public void listarStock() { //A traves del arreglo se guardara y mostrara por pantalla los objetos ingresados
		for (int i = 0; i < listaProducto.size(); i++) {
			Producto p = listaProducto.get(i);
			System.out.println("El codigo es : "+p.getCodigo());
			System.out.println("El nombre del producto es: "+p.getNombreArticulo());
			System.out.println("El precio final es : "+p.getPrecio());
			System.out.println("El stock es : "+p.getStock());
		}	
	}
}
