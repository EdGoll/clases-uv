public class Alumno extends Persona{
	private String asignaturas;

	public Alumno(){
	}
	public Alumno(String DNI, String nombre, String apellido, String edad,String direccion1, String asignaturas){
		super(DNI,nombre,apellido,edad,direccion1);
		this.asignaturas=asignaturas;
	}
	public Alumno(String DNI, String nombre, String apellido, String edad,String direccion1, String direccion2, String asignaturas){
		super(DNI,nombre,apellido,edad,direccion1,direccion2);
		this.asignaturas=asignaturas;
	}	
	public void setAsignaturas(String asignaturas){
		this.asignaturas=asignaturas;
	}
	public String getAsignaturas(){
		return asignaturas;
	}
	@Override
	public String toString(){
		return String.format("Alumno Nombre: %s; Apellido: %s; DNI: %s; Edad: %s; Direccion Personal: %s; Direccion Laboral: %s; Asignaturas: %s",getNombre(),getApellido(),getDNI(),getEdad(),getDireccionPersonal(),getDireccionLaboral(),asignaturas);
	}
}
