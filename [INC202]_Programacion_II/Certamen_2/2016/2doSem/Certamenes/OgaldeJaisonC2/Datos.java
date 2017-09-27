public class DatosPersonales{
	private String iDNI;
	private String nombre;
	private String apellido;
	private int edad;
	private String calle;
	private int numCalle;
	private String comuna;
	private String domicilio;
	private String tipoPersona;


	public DatosPersonales(){
		this.dDNI = dDNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.calle = calle;
		this.numCalle = numCalle;
		this.comuna = comuna;
	}

	public void setDDNI(String dDNI){
		this.dDNI = dDNI;
	}

	public String getDDNI(){
		return dDNI;
	}

	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}

	public String getApellidos(){
		return apellidos;
	}

	public void setEdad(int edad){
		this.edad = edad;
	}

	public int getEdad(){
		return edad;
	}


	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setCalle(String calle){
		this.calle = calle;
	}

	public String getCalle(){
		return calle;
	}

	public void setNumCalle(int numCalle){
		this.numCalle = numCalle;
	}

	public int getNumCalle(){
		return numCalle;
	}

	public void setComuna(String comuna){
		this.comuna = comuna;
	}

	public String getComuna(){
		return comuna;
	}

	public void setDomicilio(String domicilio){
		this.domicilio = domicilio;
	}

	public String getdomicilio(){
		return domicilio;
	}

	public void setTipoPersona(String tipoPersona){
		this.tipoPersona = tipoPersona;
	}

	public String getTipoPersona(){
		return tipoPersona;
	}

	@Override

	public String toString(){
		return( dDNI +" "+ nombre + " " + apellidos + " " + edad + " " + tipoPersona + " " + domicilio + " " + calle + " " + numCalle + " " + comuna);
	}
}

