public class Funcionario extends Persona{
	private String horarioLaboral;

public Funcionario(String dni, String nombre, String apellidos, String edad, String horario){
		super(dni, nombre, apellidos, edad);
		this.horarioLaboral=horario;
	}

	public void setHorarioLaboral(String horario){
		this.horarioLaboral=horario;
	}
	public String getHorarioLaboral(){
		return horarioLaboral;
	}

@Override
public String toString(){
	return("Tipo: Funcionario // Nombre: "+getNombre()+" "+getApellidos()+" // Edad: "+getEdad()+" // DNI: "+getDni()+" // Horario Laboral: "+horarioLaboral+" // Direccion Personal: "+getDireccionPer()+" // Direccion laboral:"+getDireccionLab());
}

}