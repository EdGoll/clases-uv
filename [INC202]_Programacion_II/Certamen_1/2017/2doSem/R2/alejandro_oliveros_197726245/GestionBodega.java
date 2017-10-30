package gestionbodegaimpl;

import java.io.*;
import java.util.*;

public class GestionBodega {
    
    //Atributos
    
    ArrayList<Producto> listaProducto = new ArrayList<>();
    int codigo;
    String nombre;
    int stock;
    double precio;
    Producto registro;
    
    //Metodos
    
    //Este es el metodo que crea un producto en el arreglo listaProducto
    
    public void crearProducto() throws IOException{
        //Definicion de variables
        String respuesta;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Desea ingresar productos? (Si/No)");
        respuesta = br.readLine();
        if(respuesta.equalsIgnoreCase("Si")){
            do{
                do{
                    System.out.println("Ingrese el codigo del producto: "); //Aqui se ocupa manejo de excepciones para que no se ingresen valores erroneos
                    try{
                        codigo = Integer.parseInt(br.readLine());
                
                    }catch(IOException | NumberFormatException e){
                        System.out.println("Error, el codigo tiene que ser un numero entero");
                    }
                }while(codigo == 0); //"codigo == 0" porque si no se asigna un valor real, el valor default queda en 0 y queremos que el usuario digite un codigo valido
                
                System.out.println("Ingrese el nombre del producto: ");
                nombre = br.readLine();
                
                do{
                    System.out.println("Ingrese el stock del producto: ");
                    
                    try{
                        stock = Integer.parseInt(br.readLine());

                    }catch(IOException | NumberFormatException e){
                        System.out.println("Error: El stock tiene que ser un numero");
                    }finally{
                        if(stock <= 0){
                            System.out.println("Error: El stock tiene que ser mayor a 0");
                        }
                    }
                }while(stock <= 0); //Aqui no nos sirve que el usuario digite un numero menor o igual a 0 (no tiene sentido que ingrese un producto sin stock o con stock negativo)
                
                do{
                    System.out.println("Ingrese el precio del producto: ");
                    try{
                        precio = Integer.parseInt(br.readLine()) * 1.19; //Aqui se agrega el iva al precio
                    }catch(IOException | NumberFormatException e){
                        System.out.println("Error: El precio tiene que ser un numero");
                    }finally{
                        if(precio<=0){
                            System.out.println("Error: El precio tiene que ser mayor a 0");
                        }
                    }
                }while(precio<=0);
                
                System.out.println("Desea ingresar otro producto?(Si/No)");
                respuesta = br.readLine();
            
                registro = new Producto(codigo, nombre, stock, precio);
                listaProducto.add(registro);
                //codigo, stock y precio vuelven a ser 0 para que al volver a ingresar un producto obligue al usuario a digitar un numero valido y el programa no guarde el codigo, stock o precio del producto anterior
                stock = 0;
                codigo = 0; 
                precio = 0;
            }while(!respuesta.equalsIgnoreCase("NO"));
        }
    }
    
    //Este metodo muestra los productos que se han ingresado
    
    public void listarStock(){
	Producto lista;
	
        if(listaProducto.isEmpty()){
            System.out.println("No se ha ingresado ningún producto");
        }
        else{
            System.out.println("Productos Ingresados: ");
            for(int i = 0; i < listaProducto.size(); i++){
                lista = (Producto) listaProducto.get(i);
                System.out.println( (i+1)+") Codigo: "+lista.getCodigo()+"; Nombre: "+lista.getNombre()+"; Stock: "+ lista.getStock());
            }
        }
    }
    
    //Este metodo es el encargado de vender productos
    
    public void venderProductos() throws IOException{
        //Definicion de variables
        String respuesta;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Producto lista;
        int codigoCompra;
        int nuevoStock;
        double precioVenta = 0;

        
        System.out.println("Desea vender un producto?(Si/No)");
        respuesta = br.readLine();
        
        if (respuesta.equalsIgnoreCase("SI")){
            do{
                boolean existeProductos = false;
                boolean codigoValido = false;
                
                for(int i = 0; i<listaProducto.size(); i++){
                    lista = (Producto) listaProducto.get(i);
                    if(lista.stock>0){
                        existeProductos = true; //Aqui se determina si existen productos con stock para que no aparezca una lista vacía al intentar vender sin stock
                        System.out.println( (i+1)+") Codigo: "+lista.getCodigo()+"; Nombre: "+lista.getNombre()+"; Precio: $"+ lista.getPrecio());
                    }
                }
                if(existeProductos == true){ //Esta parte del programa solo se ejecuta cuando existen productos con stock mayor a 0 en el inventario
                    System.out.println("Ingrese el codigo del producto que desea comprar: ");

                    codigoCompra = Integer.parseInt(br.readLine());

                    for(int i = 0; i<listaProducto.size(); i++){
                        lista = (Producto) listaProducto.get(i);
                        if(codigoCompra == lista.getCodigo() && lista.getStock() > 0){
                            codigoValido = true;
                            nuevoStock = lista.getStock() - 1;
                            lista.setStock(nuevoStock);
                            precioVenta = precioVenta + lista.getPrecio();
                        }
                    }
                    if(codigoValido == false){ //si despues de recorrer todo el arreglo no se encuentra ningun codigo que concuerde con el digitado, saldra un error
                        System.out.println("No se ha encontrado ningun producto con ese codigo");
                    }
                    System.out.println("Desea hacer otra compra?(Si/No)");
                    respuesta = br.readLine();
                }
                else{ //si no existen productos con stock mayor a 0 en el inventario, el programa finaliza
                    System.out.println("No hay productos para vender");
                    break;
                }
                
            }while(respuesta.equalsIgnoreCase("SI"));
            System.out.println("El precio total de la compra es: $"+precioVenta);
        }
    }   
}