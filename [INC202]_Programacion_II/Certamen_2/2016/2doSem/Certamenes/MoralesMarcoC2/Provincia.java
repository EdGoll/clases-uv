public class Provincia{
	private String idProvincia;
	private String nombreProvincia;
	private String idRegion;

	public Provincia(){
	}
	public Provincia(String idProvincia, String nombreProvincia, String idRegion){
		this.idProvincia=idProvincia;
		this.nombreProvincia=nombreProvincia;
		this.idRegion=idRegion;
	}
		public void setIdProvincia(String idProvincia){
		this.idProvincia=idProvincia;
	}
	public String getIdProvincia(){
		return idProvincia;
	}
		public void setNombreProvincia(String nombreProvincia){
		this.nombreProvincia=nombreProvincia;
	}
	public String getNombreProvincia(){
		return nombreProvincia;
	}
		public void setIdRegion(String idRegion){
		this.idRegion=idRegion;
	}
	public String getIdRegion(){
		return idRegion;
	}
	@Override
	public String toString(){
		return idProvincia+" "+nombreProvincia+" "+idRegion;
	}
}
