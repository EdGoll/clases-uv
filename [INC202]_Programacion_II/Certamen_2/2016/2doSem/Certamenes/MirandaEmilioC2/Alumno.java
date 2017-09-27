public class Alumno extends Persona{
	private String asignaturas;
	public Alumno(String dni, String nombre, String apellidos, String edad, String asignaturas){
		super(dni, nombre, apellidos, edad);
		this.asignaturas=asignaturas;
	}
	public void setAsignaturas(String asignaturas){
		this.asignaturas=asignaturas;
	}
	public String getAsignaturas(){
		return asignaturas;
	}
}
