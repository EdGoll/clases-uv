import java.util.Random;

public class Alumno{
	private Random identificador = new Random();

	public Random getIdentificador(){
		return identificador;
	}

	public void setIdentificador(Random id){
		identificador = id;
	}
}