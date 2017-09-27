public class Persona{
	private String dni;
	private String nombre;
	private String apellidos;
	private String edad;
	private String direccionper;
	private String direccionlab;

	public Persona(String dni, String nombre, String apellidos, String edad){
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	
	public void setDni(String dni){
		this.dni=dni;
	}

	public String getDni(){
		return dni;
	}

	public void setNombre(String nombrepersona){
		this.nombre=nombrepersona;
	}

	public String getNombre(){
		return nombre;
	}

	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}

	public String getApellidos(){
		return apellidos;
	}

	public void setEdad(String edad){
		this.edad=edad;
	}

	public String getEdad(){
		return edad;
	}

	public void setDireccionPer(String direccionper){
		this.direccionper=direccionper;
	}

	public String getDireccionPer(){
		return direccionper;
	}

	public void setDireccionLab(String direccionlab){
		this.direccionlab=direccionlab;
	}

	public String getDireccionLab(){
		return direccionlab;
	}
}