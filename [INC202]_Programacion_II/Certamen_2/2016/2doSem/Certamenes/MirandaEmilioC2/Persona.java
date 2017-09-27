public class Persona{
	private String dni;
	private String nombre;
	private String apellidos;
	private String edad;
	private Direccion dirlab=new Direccion();
	private Direccion dirper=new Direccion();
	
	public Persona(String dni, String nombre, String apellidos, String edad){	
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	/*public Persona(String calle, String numero){
		Comuna c=new Comuna();
		dirlab.setCalle(calle);
		dirlab.setNumero(numero);
		dirlab.setComuna(c.getNomComuna);
	}*/		
	public void setDni(String dni){
		this.dni=dni;
	}
	public String getDni(){
		return dni;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
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
	public void setDirlab(Direccion dirlab){
		this.dirlab=dirlab;
	}
	public Direccion getDirlab(){
		return dirlab;
	}
	public void setDirper(Direccion dirper){
		this.dirper=dirper;
	}
	public Direccion getDirper(){
		return dirper;
	}
	@Override
	public String toString(){
		return "DNI: "+dni+"; Nombre: "+nombre+"; Apellidos: "+apellidos+"; Edad: "+edad+"; Dirección laboral: "+dirlab+"; Dirección personal: "+dirper;
	}
}
