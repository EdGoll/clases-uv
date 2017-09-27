public class Funcionario extends Persona{
	private String horarioLaboral;

	public Funcionario(){
	}
	public Funcionario(String DNI, String nombre, String apellido, String edad,String direccion1, String horarioLaboral){
		super(DNI,nombre,apellido,edad,direccion1);
		this.horarioLaboral=horarioLaboral;
	}
	public Funcionario(String DNI, String nombre, String apellido, String edad,String direccion1, String direccion2, String horarioLaboral){
		super(DNI,nombre,apellido,edad,direccion1,direccion2);
		this.horarioLaboral=horarioLaboral;
	}
	public void setHorarioLaboral(String horarioLaboral){
		this.horarioLaboral=horarioLaboral;
	}
	public String getHorarioLaboral(){
		return horarioLaboral;
	}
	@Override
	public String toString(){
		return String.format("Funcionario Nombre: %s; Apellido: %s; DNI: %s; Edad: %s; Direccion Personal: %s; Direccion Laboral: %s; Hora de Laboral: %s",getNombre(),getApellido(),getDNI(),getEdad(),getDireccionPersonal(),getDireccionLaboral(),horarioLaboral);
	}
}
