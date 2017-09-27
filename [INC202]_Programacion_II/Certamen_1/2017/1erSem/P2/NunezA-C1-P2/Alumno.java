public class Alumno{
	private int id;

	public Alumno(int id) {
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId(){
		return this.id;
	}

	public void MostrarId(){
		System.out.println("Id: " + this.id);
	}

	public boolean comparateTo(Alumno alumno) {
		return this.id == alumno.id;
	}

	public boolean isIn(Lista lista) {
		for(int i = 0; i < lista.getPosicionUltimoAlumno(); i++) {
			if(lista.getAlumno(i).getId() == this.id) {
				return true;
			}
		}
		return false;
	}
}