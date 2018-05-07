
public class Producto {
	private int codigo;
	private String nombre;
	private int stock;
	private double precio;
	private double precioConIva;
	
	public Producto (){
		
	}
	
	public Producto (int codigo, String nombre, int stock, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.precioConIva = precio*1.19;
	}

	public int getCodigo(){
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public int getStock(){
		return stock;
	}

	public void setStock(int stock){
		this.stock = stock;
	}

	public double getPrecio(){
		return precio;
	}

	public void setPrecio(){
		this.precio = precio;
	}

	public double getPrecioConIva() {
		return precioConIva;
	}

	public void setPrecioConIva(double precioConIva) {
		this.precioConIva = precioConIva;
	}
	
	
}