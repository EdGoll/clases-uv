

public class TIPO {
	
	private String academico;
	private String alumno;
	private String funcionario;
	
	public String getAcademico() {
		return academico;
	}
	public void setAcademico(String academico) {
		this.academico = academico;
	}
	public String getAlumno() {
		return alumno;
	}
	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}
	public String getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	
	public String toString(){
		return String.format("%s \n%s \n%s \n",academico,alumno,funcionario);
	}
}
