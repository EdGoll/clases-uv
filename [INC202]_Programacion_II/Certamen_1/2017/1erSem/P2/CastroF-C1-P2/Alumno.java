public class Alumno{
    private int id;

    public int getId(){
        return id;
    }
    public int setId(int id){
    	this.id = id;
    }
   @Override
	public String toString() {
		return ("La ID del alumno es" + id);
	}
}
