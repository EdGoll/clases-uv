public class Persona{
	private String DNI;
	private String nombre;
	private String apellido;
	private String edad;
	private String direccionPersonal;
	private String direccionLaboral;

	public Persona(){
	}
	public Persona(String DNI, String nombre, String apellido, String edad, String direccionPersonal){
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.direccionPersonal=direccionPersonal;
		direccionLaboral="";
	}
		public Persona(String DNI, String nombre, String apellido, String edad, String direccionPersonal, String direccionLaboral){
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.direccionPersonal=direccionPersonal;
		this.direccionLaboral=direccionLaboral;
	}
		public void setDNI(String DNI){
		this.DNI=DNI;
	}
	public String getDNI(){
		return DNI;
	}	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public String getApellido(){
		return apellido;
	}	public void setEdad(String edad){
		this.edad=edad;
	}
	public String getEdad(){
		return edad;
	}	public void setDireccionPersonal(String direccionPersonal){
		this.direccionPersonal=direccionPersonal;
	}
	public String getDireccionPersonal(){
		return direccionPersonal;
	}	public void setDireccionLaboral(String direccionLaboral){
		this.direccionLaboral=direccionLaboral;
	}
	public String getDireccionLaboral(){
		return direccionLaboral;
	}
}