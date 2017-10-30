

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GestionBodega {

	private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
	
	public void crearProducto() throws IOException {
		Producto p = null;
		String nombre="";
		Integer codigo=null,stock=null;
		Double precio=null;
		String re="no";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.print("Ingrese el nombre del producto:");
			nombre=br.readLine();
			System.out.print("Ingrese el codigo del producto:");
			codigo=Integer.parseInt(br.readLine());
			System.out.print("Precio:");
			precio=Double.parseDouble(br.readLine());
			precio=precio * 1.19;
			System.out.print("Cantidad de unidades:");
			stock=Integer.parseInt(br.readLine());
			p= new Producto(codigo, stock, nombre, precio);
			listaProductos.add(p);
			System.out.print("Desea ingresar otro producto?(si/no): ");
			re = br.readLine();
			while(!re.equalsIgnoreCase("si") && !re.equalsIgnoreCase("no")) {
				System.out.println("Intentelo de nuevo");
				System.out.print("Desea ingresar otro producto?(si/no): ");
				re = br.readLine();
			}
		}while(re.equalsIgnoreCase("si"));
	}
	
	public void listarStock() {
		for(int i=0;i<listaProductos.size();i++) {
			Producto p = listaProductos.get(i);
			System.out.println("\nProductos enlistados");
			System.out.println("\nNombre: "+p.getNombre());
			System.out.println("Codigo: "+p.getCodigo());
			System.out.println("Stock: "+p.getStock());
		}
	}
	
	public void venderProductos() throws IOException {
		Double precioVenta= 0.0;
		Integer co,stock;
		String re;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<listaProductos.size();i++) {
			Producto p = listaProductos.get(i);
			if(p.getStock() > 0) {
				System.out.println("\nProductos disponibles");
				System.out.println("\nNombre: "+p.getNombre());
				System.out.println("Codigo: "+p.getCodigo());
				System.out.println("Precio: "+p.getPrecio());
			}
		}
		System.out.println("\nIngrese el codigo de lo que desea vender: \n");
		do{
			System.out.print("Codigo:");
			co = Integer.parseInt(br.readLine());
			for(int i=0;i<listaProductos.size();i++) {
				Producto p = listaProductos.get(i);
				if(co.equals(p.getCodigo())) {
					stock=p.getStock();
					if(stock > 0) {
						stock = stock - 1;
						p.setStock(stock);
						precioVenta = precioVenta + p.getPrecio();
					}
					else System.out.println("Este producto esta agotado");
					
				}
			}
			System.out.print("Ingresar otro?(si/no): ");
			re = br.readLine();
			while(!re.equalsIgnoreCase("si") && !re.equalsIgnoreCase("no")) {
				System.out.println("Intentelo de nuevo");
				System.out.print("Ingresar otro?(si/no): ");
				re = br.readLine();
			}
		}while(re.equalsIgnoreCase("si"));
		System.out.println("\nEl total a pagar es: "+precioVenta);
	}
	
}
