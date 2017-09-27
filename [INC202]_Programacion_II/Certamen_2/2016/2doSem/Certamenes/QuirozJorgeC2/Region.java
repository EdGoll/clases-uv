public class Region{
	private String idRegion;
	private String nombreRegion;
	private String numeroRomano;
	private String ordenGeograficoRegion;

	public void setidRegion(String id){
		this.idRegion=id;
	}

	public String getidRegion(){
		return idRegion;
	}

	public void setNombreRegion(String nombre){
		this.nombreRegion=nombre;
	}

	public String getNombreRegion(){
		return nombreRegion;
	}

	public void setNumeroRomano(String romano){
		this.numeroRomano=romano;
	}

	public String getNumeroRomano(){
		return numeroRomano;
	}

	public void setOrdenGeograficoRegion(String orden){
		this.ordenGeograficoRegion=orden;
	}

	public String getOrdenGeograficoRegion(){
		return ordenGeograficoRegion;
	}
}