

public class Alumno {
	private int id;

	public Alumno() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void compareId (int id){
		
	}
	
	public boolean compareTo(Alumno otro) {
	   return this.id==otro.id;
	}

	@Override
	public String toString() {
		
		return ""+this.getId();
	}
	
	
	
}


