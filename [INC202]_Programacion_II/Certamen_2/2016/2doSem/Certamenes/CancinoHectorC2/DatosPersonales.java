public class DatosPersonales{
	private String iDNI;
	private String nombre;
	private String apellidos;
	private int edad;
	private String calle;
	private int numCalle;
	private String comuna;
	private String tipoDomicilio;
	private String tipoPersona;


	public DatosPersonales(){
		this.iDNI = iDNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.calle = calle;
		this.numCalle = numCalle;
		this.comuna = comuna;
	}

	public void setIDNI(String iDNI){
		this.iDNI=iDNI;
	}
	public String getIDNI(){
		return iDNI;
	}
	public void setApellidos(String apellidos){
		this.apellidos=apellidos;
	}
	public String getApellidos(){
		return apellidos;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public int getEdad(){
		return edad;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return nombre;
	}

	public void setCalle(String calle){
		this.calle=calle;
	}
	public String getCalle(){
		return calle;
	}

	public void setNumCalle(int numCalle){
		this.numCalle=numCalle;
	}
	public int getNumCalle(){
		return numCalle;
	}
	public void setComuna(String comuna){
		this.comuna=comuna;
	}
	public String getComuna(){
		return comuna;
	}
	public void setTipoDomicilio(String tipoDomicilio){
		this.tipoDomicilio=tipoDomicilio;
	}
	public String getTipoDomicilio(){
		return tipoDomicilio;
	}
	public void setTipoPersona(String tipoPersona){
		this.tipoPersona=tipoPersona;
	}
	public String getTipoPersona(){
		return tipoPersona;
	}
	@Override
	public String toString(){
		return( iDNI +" "+ nombre + " " + apellidos + " " + edad + " " + tipoPersona + " " + tipoDomicilio + " " + calle + " " + numCalle + " " + comuna);
	}
}

