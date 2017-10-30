
public class Producto {
	 private Integer codigo;
	 private String nombre;
	 private Integer stock;
	 private float precio;
	 private float precioVenta;
	 
	 public Producto(Integer codigo, String nombre, Integer stock, float precio, float precioVenta) {
		 this.codigo = codigo;
		 this.nombre = nombre;
		 this.stock = stock;
		 this.precio = precio;
		 this.precioVenta = precioVenta;
	 }
	 public Producto() {
		 
	}
	public Integer getCodigo() {
		 return codigo;
	 }
	 public void setCodigo(Integer codigo) {
		 this.codigo = codigo;
	 }
	 public String getNombre() {
		 return nombre;
	 }
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 public Integer getStock() {
		 return stock;
	 }
	 public void setStock(Integer stock) {
		 this.stock = stock;
	 }
	 public Float getPrecio() {
		 return precio;
	 }
	 public void setPrecio(float precio) {
		 this.precio = precio;
	 }
	 public float getPrecioVenta() {
		 return precioVenta;
	 }
	 public void setPrecioVenta(float precioVenta) {
		 this.precioVenta = precioVenta;
	 }
}
