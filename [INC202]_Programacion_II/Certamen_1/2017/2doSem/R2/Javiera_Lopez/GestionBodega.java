/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Javibi
 */
public class GestionBodega {
    
    //Instancia de un arreglo dinamico
    //listaProductos hereda los atributos de Producto
    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    
    public void crearProducto()throws IOException{ //crea producto
        
        Producto p = null; //instancia de producto p
        
        Integer codigo;
        String nombre;
        Integer stock;
        float precio;
        String resp ="";
       
        do{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println('\n' +"---------------------------------------------------");
            System.out.println('\t' +"Almacen Javibi");
            System.out.println("---------------------------------------------------");
            System.out.println("PRODUCTO: " +'\n');
            System.out.print("Nombre: ");
            nombre = br.readLine(); //guarda el nombre ingresado en la variable nombre
            System.out.print("Codigo: ");
            codigo = Integer.valueOf(br.readLine());
            System.out.print("Precio: ");
            precio = Float.valueOf(br.readLine());
            precio= (float) (precio+(precio*0.19)); // el precio total sera el ingresado mas el iva
            System.out.print("Stock: ");
            stock = Integer.valueOf(br.readLine());
            p = new Producto(codigo,nombre,precio,stock); // guarda en el ArrayList el producto
            listaProductos.add(p);
            System.out.print('\n'+"Desea ud crear otro producto S/N:");
            resp = br.readLine();
            }while("S".equals(resp)); //ciclo para ingresar otro producto
    }

    public void listarStock(){ //mostrar todos los productos ingresados
        System.out.println("-----------------------------------------------");
        System.out.println("PRODUCTOS REGISTRADOS:" +'\n');
        for(int i=0;i<listaProductos.size();i++){ // muestra todo el tamaño del ArrayList o de los Productos
            Producto p = listaProductos.get(i);
            System.out.println("Nombre: " +p.getNombre());
            System.out.println("Codigo: " +p.getCodigo());
            System.out.println("Precio: $" +p.getPrecio());
            System.out.println("Stock: " +p.getStock());
            System.out.println(" ");
        }
        


    }

    public void venderProductos()throws IOException{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0;i<listaProductos.size();i++){
            int cantidad;
            int precioVenta;
            int precio;
            int cont=0;
            String resp="";
            
            Producto p = listaProductos.get(i);
            
            do{
                
                System.out.println("VENTA:" +'\n');
                System.out.print("Producto:");
                String producto = br.readLine();
            
                if(producto == null ? p.getNombre() == null : producto.equals(p.getNombre())){
                    System.out.print("Cantidad:");
                    cantidad = Integer.valueOf(br.readLine());
                    precio = (int) (cantidad * p.getPrecio());
                    System.out.println("El precio de tu compra es: $" +precio);
                    
                
                }else{
                    System.out.println("Producto No existe");
                }
                System.out.println("Deseas comprar otro producto S/N:");
                }while("S".equals(resp));
            
        }                 
    }           
}
