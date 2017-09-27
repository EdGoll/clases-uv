public class Region{
	private int idRegion;
	private String nombreRegion;
	private String ordenGeografico;
	private String romano;
 
	public void setIdRegion(int idRegion){
		this.idRegion = idRegion;
	}

	public int getIdRegion(){
		return idRegion;
	}

	public void setNombreRegion(String nombreRegion){
		this.nombreRegion = nombreRegion;
	}

	public String getNombreRegion(){
		return nombreRegion;
	}

	public void setOrdenGeografico(String ordenGeografico){
		this.ordenGeografico = ordenGeografico;
	}

	public String getOrdenGeografico(){
		return ordenGeografico;
	}

	public void setRomano(String romano){
		this.romano = romano;
	}

	public String getRomano(){
		return romano;
	}


	@Override

	public String toString(){
		return(idRegion + " " + nombreRegion + " " + romano + " " + ordenGeografico);
	}
}
