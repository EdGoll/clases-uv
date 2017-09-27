// Héctor Toro Reinoso 19.268.713-6

public class Personas {
	private int id;
	private String apellido;
	private String nombre;
	private String rut;
	private String estCivil;
	private int numHijos;
	private String zona;
	private int telefono;
	private String facultad;
	private String cargo;
	private int sueldo;
	private String fechComien;
	private String fechNacim;

	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getRut(){
		return rut;
	}
	public void setRut(String rut){
		this.rut = rut;
	}
	public String getEstCivil(){
		return estCivil;
	}
	public void setEstadoCivil(String estCivil){
		this.estCivil = estCivil;
	}
	public int getNumHijos(){
		return numHijos;
	}
	public void setNumHijos(int numHijos){
		this.numHijos = numHijos;
	}
	public String getZona(){
		return zona;
	}
	public void setZona(String zona){
		this.zona = zona;
	}
	public int getTelefono(){
		return telefono;
	}
	public void setTelefono(int telefono){
		this.telefono = telefono;
	}
	public String getFacultad(){
		return facultad;
	}
	public void setFacultad(String facultad){
		this.facultad = facultad;
	}
	public String getCargo(){
		return cargo;
	}
	public void setCargo(String cargo){
		this.cargo = cargo;
	}
	public int getSueldo(){
		return sueldo;
	}
	public void setSueldo(int sueldo){
		this.sueldo = sueldo;
	}
	public String getFechComien(){
		return fechComien;
	}
	public void setFechComien(String fechComien){
		this.fechComien = fechComien;
	}
	public String getFechNacim(){
		return fechNacim;
	}
	public void setFechNacim(String fechNacim){
		this.fechNacim = fechNacim;
	}
	@Override
	public String toString(){
		return id + "   " + nombre + " " + apellido + "\t" +  rut + "    " + estCivil + "  " + numHijos + "   " + zona + "  " + telefono + "  " + facultad + "  " + cargo + "  " + sueldo + "  " + fechComien + "  " + fechNacim ;
		//return id + nombre + apellido + rut + estCivil + numHijos + zona + telefono + facultad + cargo + sueldo + fechComien + fechNacim ;
	}
}
