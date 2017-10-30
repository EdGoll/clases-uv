
public class Producto {
	Integer codigo,stock;
	String nombre;
	Double precio;
	
	public Producto (Integer codigo,String nombre,Integer stock,Double precio){
		this.codigo = codigo;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
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
		    public Double getPrecio() {
		        return precio;
		    }

		    public void setPrecio(Double precio) {
		        this.precio = precio;
		    }

	    
}
