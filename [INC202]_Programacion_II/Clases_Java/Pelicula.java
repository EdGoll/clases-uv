public class Pelicula {

	private String nombre;
	private String duracion;
	private String taquilla;
    
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nomb) {
		nombre = nomb;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String durac) {
		duracion = durac;
	}

	public String getTaquilla() {
		return taquilla;
	}
    
    public void setTaquilla(String taqui) {
        taquilla = taqui;
    }
    
    @Override
    public String toString() {
        return String.format("%s [%s] %s", nombre, duracion, taquilla);
    }
}