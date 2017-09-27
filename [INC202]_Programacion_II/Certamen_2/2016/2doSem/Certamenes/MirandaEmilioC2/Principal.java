public class Principal{
	public static void main(String [] args){
		Registro r=new Registro();
		r.cargarRegiones();
		r.cargarProvincias();
		r.cargarComunas();
		r.agregarDatosRegistro();
	}
}
