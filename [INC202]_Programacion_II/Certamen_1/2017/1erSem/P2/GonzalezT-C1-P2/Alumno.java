

public class Alumno {

	private int identificador;
	private String grupo;
	public Alumno(){
		
		
		//System.out.println("creado "+ id);
		
	}
	
	public int getIdentificador(){
		return this.identificador;
	}
	public void setIdentificador(int value){
		this.identificador=value;
	}
	public String getGrupo(){
		return this.grupo;
	}
	public void setGrupo(String value){
		this.grupo=value;
	}
}
