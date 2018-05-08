
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class GestionBodega {
	private List<Producto> listaProductos = new ArrayList<Producto>(); //arreglo de tipo dinamico que permita guardar los productos

	public void crearProducto() throws IOException {
		/*crea un producto especifico y asigna el precio al cual el 
		sistema debe agregarle el IVA sobre el precio ingresado y luego
		ingresarlo a listaProductos*/

		Producto product;
		//VARIABLES DE BEAN
		int codigo = 0;
		String nombre = null;
		int stock = 0;
		double precio = 0;
		Integer answer=0;
		Scanner teclado = new Scanner(System.in);

		do{
			System.out.println("Desea ingresar un producto? Responda Si=1 o No=0");
			answer = teclado.nextInt();

			System.out.println("Codigo: ");
			codigo = teclado.nextInt();
				
			System.out.println("Nombre: ");
			nombre = teclado.nextLine();
			
			System.out.println("Stock : ");
			stock = teclado.nextInt();
				
			System.out.println("Precio: ");
			precio =  teclado.nextDouble();
			this.crearProducto(codigo, nombre, stock, precio);
			teclado.nextLine();
		} while(answer!=0);
	}

	public void crearProducto(Integer codigo, String nombre,Integer stock, Double precio){
		Producto product = new Producto(codigo, nombre, stock, precio);
		listaProductos.add(product);
	}
	
	public void listarStock() {
		/*visualiza el codigo, nombre y stock de cada producto*/
		Producto inventario;

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

	public void valorInventario(){
		Double sumaValor=0.0;
		Double sumaValorIva=0.0;
		Double sumaValorTotal=0.0;
		Double sumaValorIvaTotal=0.0;
		for(int i=0; i<(listaProductos.size())-1; i++){
			sumaValor = (listaProductos.get(i).getPrecio())*listaProductos.get(i).getStock();
			sumaValorIva = (listaProductos.get(i).getPrecioConIva())*listaProductos.get(i).getStock();			
			System.out.println(listaProductos.get(i).getNombre() + " Valor Stock sin IVA: "+sumaValor);
			System.out.println(listaProductos.get(i).getNombre() + " Valor Stock con  IVA: "+sumaValorIva );
			sumaValorTotal += sumaValor;
			sumaValorIvaTotal += sumaValorIva;
		}
		System.out.println("Valor Total sin IVA: "+sumaValor);
		System.out.println("Valor Total con IVA: "+sumaValorIva);
	}

}
