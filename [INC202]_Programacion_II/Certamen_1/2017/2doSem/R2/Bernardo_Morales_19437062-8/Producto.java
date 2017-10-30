

public class Producto {

	private Integer codigo,stock;
	private String nombre;
	private Double precio;
	
	public Producto(Integer codigo,Integer stock, String nombre, Double precio) {
		this.setCodigo(codigo);
		this.setStock(stock);
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
