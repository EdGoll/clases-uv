public class Provincia{
	private int idProvincia;
	private String nombreProvincia;
	private int idRegion;
	 
	public void setIdProvincia(int idProvincia){
		this.idProvincia = idProvincia;
	}
	public int getIdProvincia(){
		return idProvincia;
	}
	public void setNombreProvincia(String nombreProvincia){
		this.nombreProvincia = nombreProvincia;
	}
	public String getNombreProvincia(){
		return nombreProvincia;
	}
	public void setIdRegion(int idRegion){
		this.idRegion = idRegion;
	}
	public int getIdRegion(){
		return idRegion;
	}
	@Override
	public String toString(){
		return(idProvincia + " " + nombreProvincia + " " + idRegion);
	}
}

