import java.util.Random;
public class Alumno{
	public int id;
	public int fijarId (){
		return id;
	}
	public void pasarId(int id){
		this.id = id;
	}
	@Override
	public String toString() {
		return String.format("Alumno : " + id);
	}

}