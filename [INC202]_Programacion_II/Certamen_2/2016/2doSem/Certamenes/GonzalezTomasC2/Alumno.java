

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona{
	public int tipo ;
	public List<String> asignaturas= new ArrayList<>();
	
	
	public void setAsignatura(String asignatura){
		asignaturas.add( asignatura);
	}
	
	public List<String> getAsignaturas() {
		return asignaturas;
	}
	public int getTipo(){
		return tipo;
	}
	public void setTipo(int tipo){
		this.tipo = tipo;
	}

	public String getAll() {
		return  getTipo() + ";" +getDni()+";" +getNombre() + ";" + getApellidos() +";"  + getEdad()+";"+getAsignaturas() 
				+ ";" + getIdRegionPersonal() + ";" + getRegionPersonal() + ";" + getIdProvinciaPersonal() + ";"
				+ getProvinciaPersonal() + ";" + getIdComunaPersonal() + ";"+ getComunaPersonal() + ";" 
				+ getCallePersonal() + ";"+ getNumeroPersonal() + ";" + getIdRegionLaboral() + ";"
				+ getRegionLaboral() + ";" + getIdProvinciaLAboral()+ ";" + getProvinciaLaboral() + ";" 
				+ getIdComunaLaboral()+ ";" + getComunaLAboral() + ";" + getCalleLaboral()+ ";" 
				+ getNumeroLaboral() ;
	}

	@Override
	public String toString() {
		return "Alumno [getAsignaturas()=" + getAsignaturas() + ", getTipo()=" + getTipo() + ", getAll()=" + getAll()
				+ ", getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos()
				+ ", getEdad()=" + getEdad() + ", getIdRegionPersonal()=" + getIdRegionPersonal()
				+ ", getRegionPersonal()=" + getRegionPersonal() + ", getIdProvinciaPersonal()="
				+ getIdProvinciaPersonal() + ", getProvinciaPersonal()=" + getProvinciaPersonal()
				+ ", getIdComunaPersonal()=" + getIdComunaPersonal() + ", getComunaPersonal()=" + getComunaPersonal()
				+ ", getCallePersonal()=" + getCallePersonal() + ", getNumeroPersonal()=" + getNumeroPersonal()
				+ ", getIdRegionLaboral()=" + getIdRegionLaboral() + ", getRegionLaboral()=" + getRegionLaboral()
				+ ", getIdProvinciaLAboral()=" + getIdProvinciaLAboral() + ", getProvinciaLaboral()="
				+ getProvinciaLaboral() + ", getIdComunaLaboral()=" + getIdComunaLaboral() + ", getComunaLAboral()="
				+ getComunaLAboral() + ", getCalleLaboral()=" + getCalleLaboral() + ", getNumeroLaboral()="
				+ getNumeroLaboral() + "]";
	}
	
}
