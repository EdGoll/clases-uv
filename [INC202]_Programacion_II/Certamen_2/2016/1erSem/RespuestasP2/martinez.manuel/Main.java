
public class Main {
	
	public static void main(String[] args) {

		FuenteDeDatos fd = null;
		List<String> listAlumnos =fd.leerArchivo("alumnos.csv");
		List<Float> listAsignatura1 = fd.leerArchivo("asignatura1.csv");
		List<Float> listAsignatura2 = fd.leerArchivo("asignatura2.csv");

		unirListas(listAlumnos, listAsignatura1, listAsignatura2);
		ordenar(listAlumnos, listAsignatura1,listAsignatura2);
		
	}



}