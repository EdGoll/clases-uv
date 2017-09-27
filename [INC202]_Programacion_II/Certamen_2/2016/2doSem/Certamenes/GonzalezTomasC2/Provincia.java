


public class Provincia {
	
	public int IdProvincia;
	public String NombreProvincia;
	public int IdRegion; 
	
	
	public int getIdProvincia() {
		return IdProvincia;
	}
	public void setIdProvincia(int idProvincia) {
		IdProvincia = idProvincia;
	}
	public String getNombreProvincia() {
		return NombreProvincia;
	}
	public void setNombreProvincia(String nombreProvincia) {
		NombreProvincia = nombreProvincia;
	}
	public int getIdRegion() {
		return IdRegion;
	}
	public void setIdRegion(int idRegion) {
		IdRegion = idRegion;
	}
	@Override
	public String toString() {
		return "Provincia [IdProvincia=" + IdProvincia + ", NombreProvincia=" + NombreProvincia + ", IdRegion="
				+ IdRegion + "]";
	}
}
