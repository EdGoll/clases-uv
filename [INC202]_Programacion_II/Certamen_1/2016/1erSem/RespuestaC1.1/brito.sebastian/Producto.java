class Producto implements Comparable<Producto> {
  int id;
  String nombre;
  double precio;
  int inventario;
  
  public Producto(int id, String nombre, 
                  double precio, int inventario){
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.inventario = inventario;
  }
  
  public String toString(){
    return id + " " + nombre + " " + 
           precio + " " + inventario;
  }
  
  // Este metodo es el que nos permite comparar
  // entre productos y de esta forma puedan ser ordenados.
  public int compareTo(Producto p){
    return id - p.id;
  }
  
	  
}
