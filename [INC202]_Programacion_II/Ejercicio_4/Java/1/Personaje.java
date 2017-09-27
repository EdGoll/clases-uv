public class Personaje {

    private String nombre;
    private int energia;
	
	public Personaje() { }
	
    public Personaje(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
    }

    public String getNombre() {
        return nombre;
    }
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

    public int getEnergia() {
        return energia;
    }
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}

    public void alimentarse(int nuevaEnergia) {
        energia = energia + nuevaEnergia;
    }

    public void consumirEnergia(int gastoEnergia) {
        energia = energia - gastoEnergia;
    }

    @Override
    public String toString() {
        return String.format("El nivel de energía de %s es %d", getNombre(), getEnergia());
    }
}
