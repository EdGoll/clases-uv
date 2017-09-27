public class Juego {
	private String codigo;
	private String fechaHora;
	private String resultado;
	private String lugar;

    public Juego() {}
		
	public Juego(String codigo, String fechaHora, String resultado, String lugar) {
		this.codigo = codigo;
		this.fechaHora = fechaHora;
		this.resultado = resultado;
		this.lugar = lugar;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	
	public void setFechaHora(String fechaHora){
		this.fechaHora = fechaHora;
	}
	
	public void setResultado(String resultado){
		this.resultado = resultado;
	}
	
	public void setLugar(String lugar){
		this.lugar = lugar;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getFechaHora() {
		return fechaHora;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	@Override
	public String toString() {
		return String.format(
			"%s %s %s %s", 
				codigo, 
				fechaHora,
				resultado,
				lugar);
	}
}