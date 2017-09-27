

public class DATOS {
	private String rut;
	private String nombre;
	private String apellido;
	private String edad;
	private DIRECCION dirlab;
	private DIRECCION dirper;
	
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public DIRECCION getDirlab() {
		return dirlab;
	}
	public void setDirlab(DIRECCION dirlab) {
		this.dirlab = dirlab;
	}
	public DIRECCION getDirper() {
		return dirper;
	}
	public void setDirper(DIRECCION dirper) {
		this.dirper = dirper;
	}
	
	public String toString(){
		return String.format("%s \n%s \n%s \n%s \n%s \n",rut,nombre,apellido,edad,dirlab.toString(),dirper.toString());
	}
	
	
	

}
