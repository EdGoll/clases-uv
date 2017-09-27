

public class Funcionario extends Persona{
	public int tipo = 3;
	public String horarioLaboral;

	public String getHorarioLAboral() {
		return horarioLaboral;
	}

	public void setHorarioLaboral(String horarioLAboral) {
		this.horarioLaboral = horarioLAboral;
	}
	public int getTipo(){
		return tipo;
	}
	public void setTipo(int tipo){
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Funcionario [getHorarioLAboral()=" + getHorarioLAboral() + ", getTipo()=" + getTipo() + ", getDni()="
				+ getDni() + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()="
				+ getEdad() + ", getIdRegionPersonal()=" + getIdRegionPersonal() + ", getRegionPersonal()="
				+ getRegionPersonal() + ", getIdProvinciaPersonal()=" + getIdProvinciaPersonal()
				+ ", getProvinciaPersonal()=" + getProvinciaPersonal() + ", getIdComunaPersonal()="
				+ getIdComunaPersonal() + ", getComunaPersonal()=" + getComunaPersonal() + ", getCallePersonal()="
				+ getCallePersonal() + ", getNumeroPersonal()=" + getNumeroPersonal() + ", getIdRegionLaboral()="
				+ getIdRegionLaboral() + ", getRegionLaboral()=" + getRegionLaboral() + ", getIdProvinciaLAboral()="
				+ getIdProvinciaLAboral() + ", getProvinciaLaboral()=" + getProvinciaLaboral()
				+ ", getIdComunaLaboral()=" + getIdComunaLaboral() + ", getComunaLAboral()=" + getComunaLAboral()
				+ ", getCalleLaboral()=" + getCalleLaboral() + ", getNumeroLaboral()=" + getNumeroLaboral() + "]";
	}
	public String getAll() {
		return  getTipo() +";"+ getDni() +""+ getNombre() +";"+ getApellidos() +";"+ getEdad() +";"
				+ getHorarioLAboral() + ";"+ getIdRegionPersonal() +";"+ getRegionPersonal()+";"  
				+ getIdProvinciaPersonal()+";"+ getProvinciaPersonal() + ";"+ getIdComunaPersonal() + "" 
				+ getComunaPersonal() + ";"+ getCallePersonal() + ";" + getNumeroPersonal() + ";"
				+ getIdRegionLaboral() + ";" + getRegionLaboral() + ";"+ getIdProvinciaLAboral() + ";" 
				+ getProvinciaLaboral()+ ";" + getIdComunaLaboral() + ";" + getComunaLAboral()+ ";" 
				+ getCalleLaboral() + ";" + getNumeroLaboral();
	}
}
