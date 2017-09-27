public class Direccion{
	private String calle;
	private String numero;
	private String comuna;

	public void setCalle(String calle){
		this.calle=calle;
	}
	public String getCalle(){
		return calle;
	}
	public void setNumero(String numero){
		this.numero=numero;
	}
	public String getNumero(){
		return numero;
	}
	public void setComuna(String comuna){
		this.comuna=comuna;
	}
	public String getComuna(){
		return comuna;
	}
	@Override
	public String toString(){
		return "Calle: "+calle+", Número: "+numero+", Comuna: "+comuna;
	}
}
