//import java.util.random
public class Alumno {
	
	private int identificador;
	
	//tomar y setear la variable para luego trabajar con ella en la siguiente clase
	public int getIdent() {
		return identificador;
	}
	public void setIdent(int identificador){
		this.identificador = identificador;
	}

	@Override
	public String toString() {
		return ("alumno con identificador " + identificador);
	}
}
