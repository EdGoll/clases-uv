public class Region{
	private int idRegion;
	private String romano;
	private String ordenGeo;
	private String nombreRegion;
 
	public void setIdRegion(int idRegion){
		this.idRegion = idRegion;
	}
	public int getIdRegion(){
		return idRegion;
	}
	public void setRomano(String romano){
		this.romano = romano;
	}
	public String getRomano(){
		return romano;
	}
	public void setOrdenGeo(String ordenGeo){
		this.ordenGeo = ordenGeo;
	}
	public String getOrdenGeo(){
		return ordenGeo;
	}
	public void setNombreRegion(String nombreRegion){
		this.nombreRegion = nombreRegion;
	}
	public String getNombreRegion(){
		return nombreRegion;
	}
	@Override
	public String toString(){
		return(idRegion + " " + nombreRegion + " " + romano + " " + ordenGeo);
	}
}

