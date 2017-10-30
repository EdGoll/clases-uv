//Matias Ponce R.
//19.590.013-2

public class Producto { //En esta clase se definen los atributos de los objetos con los que se trabajaran
	private Integer codigo;
	private String nombreArticulo;
	private Double precio;
	private Integer stock;
	
	public Producto(Integer codigo, String nombreArticulo, Double precio, Integer stock){
	 	this.codigo = codigo;
	 	this.nombreArticulo = nombreArticulo;
	 	this.precio = precio;
	 	this.stock = stock;
	}
	public Producto(){
		
	}
	 
// A traves de los metodos set() y get(), obtenemos y/o asignamos los valores de los objetos 
	public Integer getCodigo(){
		return codigo;
	}
	public void setCodigo(Integer codigo){
		this.codigo = codigo;
	}
	public String getNombreArticulo(){
		return nombreArticulo;
	}
	public void setNombreArticulo(String nombreArticulo){
		this.nombreArticulo = nombreArticulo;
	}
	public Double getPrecio(){
		return precio;
	}
	public void setPrecio(Double precio){
		this.precio = precio;
	}
	public Integer getStock(){
		return stock;
	}
	public void setStock(Integer stock){
		this.stock = stock;
	}
}
