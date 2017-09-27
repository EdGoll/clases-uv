public class Academico extends Persona{
	private String horaAtencion;

	public Academico(){
	}
	public Academico(String DNI, String nombre, String apellido, String edad,String direccion1, String horaAtencion){
		super(DNI,nombre,apellido,edad,direccion1);
		this.horaAtencion=horaAtencion;
	}
	public Academico(String DNI, String nombre, String apellido, String edad,String direccion1,String direccion2, String horaAtencion){
		super(DNI,nombre,apellido,edad,direccion1,direccion2);
		this.horaAtencion=horaAtencion;
	}	
	public void setHoraAtencion(String horaAtencion){
		this.horaAtencion=horaAtencion;
	}
	public String getHoraAtencion(){
		return horaAtencion;
	}
	@Override
	public String toString(){
		return String.format("Academico Nombre: %s; Apellido: %s; DNI: %s; Edad: %s; Direccion Personal: %s; Direccion Laboral: %s; Hora de Atencion: %s",getNombre(),getApellido(),getDNI(),getEdad(),getDireccionPersonal(),getDireccionLaboral(),horaAtencion);
	}
}
