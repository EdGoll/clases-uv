import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GestionBodega {
	
	ArrayList<Producto> listaproducto = new ArrayList<>();
	
	public void crearProducto() throws IOException{ //Ingresar productos a bodega.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Producto prod;
		Integer codigo=0,stock=0;
		String nombre=null,respuesta=null;
		Double precio=0.0;
		
    	do{
    		System.out.println("Desea ingresar un producto? 'Si/No'");
    		respuesta = br.readLine();
    		if(respuesta.equalsIgnoreCase("Si")){
    			System.out.println("Ingrese codigo del producto.");
    			codigo = Integer.valueOf(br.readLine());
    			System.out.println("Ingrese nombre del producto.");
    			nombre = br.readLine();
    			System.out.println("Ingrese stock del producto.");
    			stock =Integer.valueOf(br.readLine());
    			System.out.println("Ingrese precio del producto.");
    			precio=	Double.parseDouble(br.readLine())*1.19;
    			prod = new Producto(codigo,nombre,stock,precio);
        		listaproducto.add(prod);
    		}
    	
    		
    	}
    	while(!respuesta.equalsIgnoreCase("No"));
	}
	
	public void listarStock() throws IOException{ //Mostrar los productos ingresados en bodega
		Producto lista;

		System.out.println("Productos ingresados: ");
		  if(listaproducto.isEmpty()){
              System.out.println("Ningun producto en bodega.");
		  }else{
			  for(int i = 0; i < listaproducto.size(); i++){
			lista = listaproducto.get(i);
			System.out.println( (i+1)+")"+"Codigo: "+lista.getCodigo()+". "+"Nombre: "+lista.getNombre()+". "+"Stock: "+lista.getStock());
			  }
		  }
	}
	public void venderProductos() throws IOException{ //vender productos a un cliente.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String respuesta=null;
		Integer resp=0,i=0;
		Double precioVenta=0.0;
		do{
			Producto lista;
		
			Integer stock=0;
			System.out.println("Productos En bodega : ");
			for( i= 0; i < listaproducto.size(); i++){
				lista = listaproducto.get(i);
				System.out.println( (i+1)+")"+"Codigo: "+lista.getCodigo()+". "+"Nombre: "+lista.getNombre()+". "+"Precio: $"+lista.getPrecio());
			}
			if(listaproducto.size()>0){
				System.out.println("¿Desea hacer alguna compra?. Si/No ");
				respuesta = br.readLine();
				if(respuesta.equalsIgnoreCase("Si")){
					System.out.println("Ingrese codigo del producto deseado.");
					resp= Integer.valueOf(br.readLine());
					for(i = 0; i < listaproducto.size(); i++){
						lista = listaproducto.get(i);
						if(resp == lista.getCodigo()){//hacer resta de stock y suma de venta
							stock=lista.getStock();
							if(stock==0){
								System.out.println("No queda stock.");
							}
							if(stock>=1){
							stock =stock-1;
							lista.setStock(stock);
							precioVenta= precioVenta+lista.getPrecio();
							}
						}else{
							System.out.println("Codigo no encontrado en bodega.");
							}
					}	
				}
    		}else{
    			respuesta =("no"); //para lograr que a pesar de llamar al metodo, y no se haya ingresado nada, pueda salir del do-while.
    		}
    	}
    	while(!respuesta.equalsIgnoreCase("No"));
		System.out.println("Total a pagar: "+precioVenta);
	}
}
