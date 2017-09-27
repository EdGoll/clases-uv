
public class Alumno {
	public int identificador;
	int [] alumno = new int [75]

	public Alumno(int identificador) {
        this.identificador = identificador;
	}

	public void id(){
		for (int i = 0; i < 75; i++){
			alumno [i] = i + 1;
		}
	}
}
