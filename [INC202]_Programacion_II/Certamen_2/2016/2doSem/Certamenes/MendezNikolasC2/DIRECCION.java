

public class DIRECCION {
	
	private String calle;
	private String numero;
	private String comuna;
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	
	public String toString(){
		return String.format("%s \n%s \n%s \n",calle,numero,comuna);
	}
	
	

}
