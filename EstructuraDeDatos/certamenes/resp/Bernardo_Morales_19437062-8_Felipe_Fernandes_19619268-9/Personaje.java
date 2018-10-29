

public abstract class Personaje {

	protected String nombre;
	protected int energia;
	
	public Personaje(String nombre, int energia) {
		this.nombre=nombre;
		this.energia=energia;
	}
	public String getNombre() {
		return nombre;
	}
	
	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public abstract int alimentarse(int nuevaEnergia);
	public abstract int consumirEnergia(int gastoEnergia);
	public abstract String toString();
	

}
