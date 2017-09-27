public class Funcionario extends Persona{
	private String horariolab;
	public Funcionario(String dni, String nombre, String apellidos, String edad, String horariolab){
		super(dni, nombre, apellidos, edad);
		this.horariolab=horariolab;
	}
	public void setHorarioLab(String horariolab){
		this.horariolab=horariolab;
	}
	public String horariolab(){
		return horariolab;
	}
}
