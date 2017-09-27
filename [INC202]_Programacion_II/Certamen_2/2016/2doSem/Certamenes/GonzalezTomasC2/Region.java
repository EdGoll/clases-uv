


public class Region{
	
	
	 public int IdRegion;
	 public String NombreRegion;
	 public String NumeroRomano;
	 public int OrdenGeograﬁcoRegion; 

	
	
	public int getIdRegion() {
		return IdRegion;
	}
	public void setIdRegion(int idRegion) {
		IdRegion = idRegion;
	}
	public String getNombreRegion() {
		return NombreRegion;
	}
	public void setNombreRegion(String nombreRegion) {
		NombreRegion = nombreRegion;
	}
	public String getNumeroRomano() {
		return NumeroRomano;
	}
	public void setNumeroRomano(String numeroRomano) {
		NumeroRomano = numeroRomano;
	}
	public int getOrdenGeograﬁcoRegion() {
		return OrdenGeograﬁcoRegion;
	}
	public void setOrdenGeograﬁcoRegion(int ordenGeograﬁcoRegion) {
		OrdenGeograﬁcoRegion = ordenGeograﬁcoRegion;
	}
	@Override
	public String toString() {
		return "Region [IdRegion=" + IdRegion + ", NombreRegion=" + NombreRegion + ", NumeroRomano=" + NumeroRomano
				+ ", OrdenGeograﬁcoRegion=" + OrdenGeograﬁcoRegion + "]";
	}
}
