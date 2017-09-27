public class Alumno {
	private int id;
	
	public int getId(){
		return id;	
	}
	public void setId(int id){
	 this.id=id;
	}

	@Override
	public String toString(){
		return String.format("AlumnoID: %d", id);
	}
}
