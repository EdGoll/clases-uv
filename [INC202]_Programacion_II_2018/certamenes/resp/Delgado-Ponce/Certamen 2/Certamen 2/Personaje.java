

public class Personaje {

	
	private String nombre;
	protected Integer energia;
	
	
	public Personaje(String nombre, Integer energia) {
		
		this.nombre = nombre;
		this.energia = energia;
		
	}
	
	public Personaje() {
		
	}
	
	public String getNombre(){
		return nombre;
	}	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	

	public Integer getEnergia(){
		return energia;
	}	
	public void setEnergia(Integer energia){
		this.energia = energia;
	}
	
	//METODO ALIMENTARSE
	public void alimentarse(int nuevaEnergia) {
		
		energia += nuevaEnergia;
		
	}
	
	//METODO CONSUMIR ENERGIA
	public void consumirEnergia(int gastoEnergia) {
		
		energia -= gastoEnergia;
		
	}
	
	//METODO PARA DESCONTAR EL DAÑO
	public void daño(int energia) {
		
		this.energia -= energia;
		
	}
	

}
