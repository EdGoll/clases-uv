public class Comuna{
	private String idComuna;
	private String nombreComuna;
	private String idProvincia;

	public Comuna(){
	}
	public Comuna(String idComuna, String nombreComuna, String idProvincia){
		this.idComuna=idComuna;
		this.nombreComuna=nombreComuna;
		this.idProvincia=idProvincia;
	}
		public void setIdComuna(String idComuna){
		this.idComuna=idComuna;
	}
	public String getIdComuna(){
		return idComuna;
	}
		public void setNombreComuna(String nombreComuna){
		this.nombreComuna=nombreComuna;
	}
	public String getNombreComuna(){
		return nombreComuna;
	}
		public void setIdProvincia(String idProvincia){
		this.idProvincia=idProvincia;
	}
	public String getIdProvincia(){
		return idProvincia;
	}
	@Override
	public String toString(){
		return idComuna+" "+nombreComuna+" "+idProvincia;
	}
}
