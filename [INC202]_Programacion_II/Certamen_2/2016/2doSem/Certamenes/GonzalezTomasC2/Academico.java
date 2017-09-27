

public class Academico extends Persona{
	public int tipo = 1;
	public String horaAtencion;

	public String getHoraAtencion() {
		return horaAtencion;
	}

	public void setHoraAtencion(String horaAtencion) {
		this.horaAtencion = horaAtencion;
	}
	public int getTipo(){
		return tipo;
	}
	public void setTipo(int tipo){
		this.tipo = tipo;
	}

	
	public String getAll() {
		return  getTipo() + ";" + getDni() +";"+getNombre() + ";" + getApellidos() + ";" + getEdad() +";"
				+ getHoraAtencion() + ";" + getIdRegionPersonal() + ";"+ getRegionPersonal() + ";" 
				+ getIdProvinciaPersonal() + ";" + getProvinciaPersonal() + ";"
				+ getIdComunaPersonal() + ";" + getComunaPersonal() + ";"+ getCallePersonal() + ";" 
				+ getNumeroPersonal() + "" + getIdRegionLaboral() + ";" + getRegionLaboral() + ";"
				+ getIdProvinciaLAboral() + ";" + getProvinciaLaboral()+ ";" + getIdComunaLaboral() + "" 
				+ getComunaLAboral() + ";" + getCalleLaboral() + ";" + getNumeroLaboral();
	}

	@Override
	public String toString() {
		return "Academico [getHoraAtencion()=" + getHoraAtencion() + ", getTipo()=" + getTipo() + ", getAll()="
				+ getAll() + ", getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getEdad()=" + getEdad() + ", getIdRegionPersonal()=" + getIdRegionPersonal()
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
