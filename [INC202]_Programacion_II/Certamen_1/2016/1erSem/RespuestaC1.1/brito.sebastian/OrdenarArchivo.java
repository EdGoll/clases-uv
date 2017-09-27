import java.io.*;
import java.util.*;

public class OrdenarArchivo{
  public static void main(String [] args){
    String filename = "productos.txt";
    String linea = null;
    String[] datos = null;
    List<Producto> productos = new ArrayList<Producto>();
    Producto producto = null;
    try{
      BufferedReader br = new BufferedReader(new FileReader(filename)); 
      // leer todas la lineas del archivo
      while((linea=br.readLine())!=null){
        // cada linea tiene los datos para crear un producto
        datos = linea.split(" ");
        producto = new Producto(
                    Integer.parseInt(datos[0]),
                    datos[1],
                    Double.parseDouble(datos[2]),
                    Integer.parseInt(datos[3]));
        // agregamos el producto a la lista de productos
        productos.add(producto);
      }
      br.close();
      // imprimir archivo en orden original
      System.out.println("Elementos originales:");
      System.out.println("Id; Nombre; Precio; Inventario");
      System.out.println(productos);
      Collections.sort(productos);
      // imprimir archivo ordenado
      System.out.println("Elementos ordenados:");
      System.out.println("Id; Nombre; Precio; Inventario");
      System.out.println(productos);
    }catch(IOException e){
      System.out.println(e);   
    }

  
  }
}
