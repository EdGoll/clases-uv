public class Alumno {
	public int ident;
	
	public int getID(){
		return ident;
	}

	public void setID(int ident){
		this.ident = ident;
	}

	@Override
	public String toString() {
		return String.format("ID Alumno: %d", ident);
	}
}