

public class Jugador {
	
	public int id;
    public int recuperar;
    public int entregar;
    public int goleador;
    public int juego_individual;
    public int tipo; //1=arquero, 2=defensa, 3=lateral, 4=centrocampista, 5=delantero
    
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRecuperar() {
		return recuperar;
	}
	public void setRecuperar(int recuperar) {
		this.recuperar = recuperar;
	}
	public int getEntregar() {
		return entregar;
	}
	public void setEntregar(int entregar) {
		this.entregar = entregar;
	}
	public int getGoleador() {
		return goleador;
	}
	public void setGoleador(int goleador) {
		this.goleador = goleador;
	}
	public int getJuego_individual() {
		return juego_individual;
	}
	public void setJuego_individual(int l) {
		this.juego_individual = l;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
