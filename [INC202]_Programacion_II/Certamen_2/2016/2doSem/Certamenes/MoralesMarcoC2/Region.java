public class Region{
	private String idRegion;
	private String nombreRegion;
	private String numeroRomano;
	private String ordenGeograficoRegion;

	public Region(){
	}
	public Region(String idRegion,  String nombreRegion, String numeroRomano, String ordenGeograficoRegion){
		this.idRegion=idRegion;
		this.nombreRegion=nombreRegion;
		this.numeroRomano=numeroRomano;
		this.ordenGeograficoRegion=ordenGeograficoRegion;
	}
	public void setIdRegion(String idRegion){
		this.idRegion=idRegion;
	}
	public String getIdRegion(){
		return idRegion;
	}
		public void setNombreRegion(String nombreRegion){
		this.nombreRegion=nombreRegion;
	}
	public String getNombreREgion(){
		return nombreRegion;
	}
		public void setNumeroRomano(String numeroRomano){
		this.numeroRomano=numeroRomano;
	}
	public String getNumeroRomano(){
		return numeroRomano;
	}
		public void setOrdenGeograficoRegion(String ordenGeograficoRegion){
		this.ordenGeograficoRegion=ordenGeograficoRegion;
	}
	public String getOrdenGeograficoRegion(){
		return ordenGeograficoRegion;
	}
	@Override
	public String toString(){
		return idRegion+" "+nombreRegion+" "+numeroRomano+" "+ordenGeograficoRegion;
	}
}