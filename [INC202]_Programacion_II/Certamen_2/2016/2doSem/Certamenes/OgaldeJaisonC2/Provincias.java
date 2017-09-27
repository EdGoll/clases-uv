public class Provincia{
	private int idProvincia;
	private int idRegion;
	private String nombreProvincia;

	 
	public void setIdProvincia(int idProvincia){
		this.idProvincia = idProvincia;
	}

	public int getIdProvincia(){
		return idProvincia;
	}

	public void setIdRegion(int idRegion){
		this.idRegion = idRegion;
	}

	public int getIdRegion(){
		return idRegion;
	}
	public void setNombreProvincia(String nombreProvincia){
		this.nombreProvincia = nombreProvincia;
	}

	public String getNombreProvincia(){
		return nombreProvincia;
	}


	@Override

	public String toString(){
		return(idProvincia + " " + nombreProvincia + " " + idRegion);
	}
}

