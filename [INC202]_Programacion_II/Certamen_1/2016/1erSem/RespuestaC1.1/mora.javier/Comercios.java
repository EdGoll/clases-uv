public class Comercios {
	private String rut, nombre, calle, inicioAct, casaMatriz, giro, codSii, actSii;
	private int numero;
	
	public void setRut(String rut, String dv){
		this.rut = rut +"-"+ dv;
	}
	public String getRut(){
		return rut;
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
	public void setInicioAct(String inicioAct){
		this.inicioAct = inicioAct;
	}
	public String getInicioAct(){
		return inicioAct;
	}
	public void setCasaMatriz(String casaMatriz){
		this.casaMatriz = casaMatriz;
	}
	public String getCasaMatriz(){
		return casaMatriz;
	}
	public void setGiro(String giro){
		this.giro = giro;
	}
	public String getGiro(){
		return giro;
	}
	public void setCodSii(String codSii){
		this.codSii = codSii;
	}
	public String getCodSii(){
		return codSii;
	}
	public void setActSii(String actSii){
		this.actSii = actSii;
	}
	public String getActSii(){
		return actSii;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getNumero(){
		return numero;
	}	

	@Override
	public String toString(){
		return "RUT: " + rut + " NOMBRE: " + nombre + " CALLE: " + calle + " NRO: #" + numero + " GIRO: " + giro;
	}
}
