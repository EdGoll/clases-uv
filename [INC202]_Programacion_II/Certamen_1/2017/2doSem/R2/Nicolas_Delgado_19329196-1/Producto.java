
public class Producto {

	//ATRIBUTOS
	 private Integer codigo; 
	 private String nombre;
	 private Integer stock;
	 private double precio;
	 
	 public Producto(Integer codigo, String nombre, Integer stock,double precio){
		 	
		this.codigo = codigo;
	 	this.nombre = nombre;
	 	this.stock = stock;
	 	this.precio = precio;
	 }
	 
	 public Producto() {
		 
	 }
	 //CODIGO
	 public Integer getCodigo(){
 		return codigo;
	 }
	 public void setCodigo(Integer codigo){
 		this.codigo = codigo;
	 }
	 //NOMBRE
	 public String getNombre(){
	 		return nombre;
	 }
	 public void setNombre(String nombre){
 		this.nombre =nombre;
	 }
	 //STOCK
	 public Integer getStock(){
	 		return stock;
	 }
	 public void setStock(Integer stock){
 		this.stock = stock;
	 }
	 //PRECIO
	 public double getPrecio(){
	 		return precio;
	 }
	 public void setPrecio(Integer precio){
 		this.precio = precio;
	 }

	
	}

	 
	 

