public class Alumno{

	private int al_ID;

	public void setID(int id){
		
		al_ID = id;
	}
	
	@Override
	public String toString(){
		return String.format("Identificador del alumno: %d", al_ID);
	}
}