public class Comuna{
	private int idComuna;
	private String nombreComuna;
	private int idProvincia;

	 
	public void setIdComuna(int idComuna){
		this.idComuna = idComuna;
	}

	public int getIdComuna(){
		return idComuna;
	}

	public void setNombreComuna(String nombreComuna){
		this.nombreComuna = nombreComuna;
	}

	public String getNombreComuna(){
		return nombreComuna;
	}

	public void setIdProvincia(int idProvincia){
		this.idProvincia = idProvincia;
	}

	public int getIdProvincia(){
		return idProvincia;
	}

	@Override

	public String toString(){
		return(idComuna + " " + nombreComuna + " " + idProvincia);
	}
}

