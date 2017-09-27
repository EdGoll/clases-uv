public class Direccion{
	public String calle;
	public String numero;
	public String comuna;

	public Direccion(){
	}
	public Direccion(String calle, String numero, String comuna){
		this.calle=calle;
		this.numero=numero;
		this.comuna=comuna;
	}
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
		return calle+" "+numero+" "+comuna;
	}
}