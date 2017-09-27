public class Academico extends Persona{
	private String horarioat;
	public Academico(String dni, String nombre, String apellidos, String edad, String horarioat){
		super(dni, nombre, apellidos, edad);
		this.horarioat=horarioat;
	}
	public void setHorarioAt(String horarioat){
		this.horarioat=horarioat;
	}
	public String getHorarioAt(){
		return horarioat;
	}
}
