public class Jugador{
	private int id;
	private int br;
	private int bg;
	private int gc;
	private String tipo;
	private int niveljugador;

	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setBr(int br){
		this.br=br;
	}
	public int getBr(){
		return br;
	}
	public void setBg(int bg){
		this.bg=bg;
	}
	public int getBg(){
		return bg;
	}
	public void setGc(int gc){
		this.gc=gc;
	}
	public int getGc(){
		return gc;
	}
	public void setTipo(String tipo){
		this.tipo=tipo;
	}
	public String getTipo(){
		return tipo;
	}
	public void setNivelJugador(int niveljugador){
		this.niveljugador=niveljugador;
	}
	public int getNivelJugador(){
		return niveljugador;
	}
}
