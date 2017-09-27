public class Alumno {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int a) {
		id = a;
	}

	
	public String mostrar() {
		return String.format("Id del Alumno: %d", id);
	}
}