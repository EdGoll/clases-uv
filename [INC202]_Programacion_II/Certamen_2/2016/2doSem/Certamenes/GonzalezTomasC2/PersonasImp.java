

import java.util.List;
import java.util.Scanner;

public class PersonasImp {
	private Alumno alumno;
	private Academico academico;
	private Funcionario funcionario;
	private List<Alumno> listAlumnos;
	private List<Academico> listAcademicos;
	private List<Funcionario> listFuncionarios;
	
	public PersonasImp(){
		cargarDatos();
	}
	public void cargarDatos() {
		
	}
	public void  agregar() {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		String paramString;
		int paramInt;
		alumno = new Alumno();
		academico = new Academico();
		funcionario = new Funcionario();
		
		
		
	}
}
