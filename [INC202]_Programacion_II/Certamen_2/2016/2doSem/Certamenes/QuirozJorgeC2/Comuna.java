public class Comuna{
	private String idComuna;
	private String nombreComuna;
	private String idProvincia;


	public void setidProvincia(String id){
		this.idProvincia=id;
	}

	public String getidProvincia(){
		return idProvincia;
	}

	public void setidComuna(String id2){
		this.idComuna=id2;
	}

	public String getidComuna(){
		return idComuna;
	}

	public void setNombreComuna(String nombre){
		this.nombreComuna=nombre;
	}

	public String getNombreComuna(){
		return nombreComuna;
	}

}