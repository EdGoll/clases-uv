public class Alumno {
	private int id;
	
	public Alumno(int identificador){
		
		this.id = identificador;
	}
	
	@Override
	public boolean equals(Object alumno2){
		if(alumno2 instanceof Alumno){
			Alumno estudiante = (Alumno)alumno2;
			if(estudiante.id == this.id){
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString(){
		return String.format("ID: %d", this.id);
	}
}
