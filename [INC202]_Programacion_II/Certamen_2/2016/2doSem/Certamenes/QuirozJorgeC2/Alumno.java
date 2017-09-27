public class Alumno extends Persona{
	private String asignaturas;

	public Alumno(String dni, String nombre, String apellidos, String edad, String asignaturas){
		super(dni, nombre, apellidos, edad);
		this.asignaturas=asignaturas;
	}

	public void setAsignaturas(String asignatura){
		this.asignaturas=asignatura;
	}
	public String getAsignaturas(){
		return asignaturas;
	}

@Override
public String toString(){
	return("Tipo: Alumno // Nombre: "+getNombre()+" "+getApellidos()+" // Edad: "+getEdad()+" // DNI: "+getDni()+" // Asignaturas: "+asignaturas+" // Direccion Personal: "+getDireccionPer()+" // Direccion Laboral: "+getDireccionLab());
}

}