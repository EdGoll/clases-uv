public class DatosP{

	private String dni;
	private String nombre;
	private String apellido;
	private String edad;
	private String direccionL;
	private String direccionP;
	private String calle;
	private String numero;

	public DatosP(){}

	public DatosP(String dni, String nombre, String apellido, String edad, String direccion){
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccionL = direccionL;
		this.direccionP = direccionP;
		this.calle = calle;
		this.numero = numero;

	}

	public String getDni() {
    	return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
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
    public String getDireccionL() {
    	return direccionL;
    }
    
    public void setDireccionL(String direccionL) {
        this.direccionL = direccionL;
    }
    public String getDireccionP() {
    	return direccionP;
    }
    
    public void setDireccionP(String direccionP) {
        this.direccionP = direccionP;
    }
     public String getCalle() {
    	return calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
     public String getNumero() {
    	return numero;
    }
    
    public void setDireccionP(String numero) {
        this.numero = numero;
    }


}