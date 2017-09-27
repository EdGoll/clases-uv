public class Academico extends Persona{
	private String horarioAtencion;

public Academico(String dni, String nombre, String apellidos, String edad, String horario){
		super(dni, nombre, apellidos, edad);
		this.horarioAtencion=horario;
	}

	public void setHorarioAtencion(String horario){
		this.horarioAtencion=horario;
	}
	public String getHorarioAtencion(){
		return horarioAtencion;
	}

@Override
public String toString(){
	return("Tipo: Academico // Nombre: "+getNombre()+" "+getApellidos()+" // Edad: "+getEdad()+" // DNI: "+getDni()+" // Horario de atencion: "+horarioAtencion+"// Direccion Personal: "+getDireccionPer()+" // Direccion Laboral: "+getDireccionLab());
}

}