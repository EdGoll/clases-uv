package proyect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class GestionBodega {

    private List<Producto> listaProducto = new ArrayList<Producto>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void crearProducto(Producto o) throws IOException{
		int a=0;
		do{
	    	String nombre="";
	        int codigo=0;
	        int stock=0;
	        double precio = 0;
			System.out.println("Nombre: ");
			nombre = br.readLine();
			System.out.println("codigo: ");
			codigo = Integer.valueOf(br.readLine());
			System.out.println("stock: ");
			stock = Integer.valueOf(br.readLine());
			System.out.println("precio: ");
			precio = Double.valueOf(br.readLine());
			precio = precio +(precio*0.19);
			o.setNombre(nombre);
			o.setStock(stock);
	        o.setCodigo(codigo);
			o.setPrecio(precio);
	    	listaProducto.add(o);
	    	System.out.println("agregar uno mas?: ");
			a = Integer.valueOf(br.readLine());
    	
    	}while(a==0);
    }
   
    public void listarStock(){
    	 for(Producto o:listaProducto){
    		 
             System.out.println(o.getNombre()+" "+o.getStock()+" "+o.getPrecio()+" "+o.getCodigo());
            
    	 }
    }
    public int venderProducto{}
}
