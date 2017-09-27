import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NAlumnosImp{
	
	List<String> lineas = null;
	List<Alumnos> lA= new ArrayList<Alumnos>();
	List<Asignatura1> lAsig1 = new ArrayList<Asignatura1>();
	List<Asignatura1> lAsig2 = new ArrayList<Asignatura2>();
	
	public ListaImp(){
		cargarAlumnos();
		cargarAsignatura1();
		cargarAsignatura2();
		guardar(promedio());
	}

	public void cargarAlumnos(){
	 	Alumnos a;
	 	FuenteDeDatos f = new FuenteDeDatos();
	 	List<String> lineas = f.leerArchivo("Alumnos.csv");
	 	for(String lineas : linea){
	 		a = new Alumnos();
	 			StringTokenizer st = new StringTokenizer(linea,";");
	 			a = new Alumnos();
	 			a.setId(st.nextToken());
	 			a.setNombre(st.nextToken());
	 			a.setApellidoPaterno(st.nextToken());
	 			a.setApellidoMaterno(st.nextToken());
	 		lA.add(a);
	 	}

	}
	public void cargarAsignatura1(){
	 	Asignatura a1;
	 	lAsig1 = new ArrayList<>();
	 	FuenteDeDatos f = new FuenteDeDatos();
	 	List<String> lineas = f.leerArchivo("Asignatura1.csv");
	 	for(String lineas : linea){
	 			StringTokenizer st = new StringTokenizer(linea,";");
	 			a1 = new Asignatura();
	 			a1.setId(st.nextToken());// va linea por linea 
	 			a1.setNQ1(st.nextToken());
	 			a1.setNQ2(st.nextToken());
	 			a1.setNQ3(st.nextToken());
	 			a1.setNT1(st.nextToken());
	 			a1.setNT2(st.nextToken());
	 			a1.setNC1(st.nextToken());
	 			a1.setNC2(st.nextToken());
	 			a1.setNC3(st.nextToken());
	 		lAsig1.add(a1);
	 	}

	}
	public void cargarAsignatura2(){
	 	Asignatura a2;
	 	lAsig2 = new ArrayList<>();
	 	FuenteDeDatos f = new FuenteDeDatos();
	 	List<String> lineas = f.leerArchivo("Asignatura2.csv");
	 	for(String lineas : linea){
	 			StringTokenizer st = new StringTokenizer(linea,";");// se saca el delimitador
	 			a2 = new Asignatura();
	 			a2.setId(st.nextToken());
	 			a2.setNQ1(st.nextToken());
	 			a2.setNQ2(st.nextToken());
	 			a2.setNQ3(st.nextToken());
	 			a2.setNT1(st.nextToken());
	 			a2.setNT2(st.nextToken());
	 			a2.setNC1(st.nextToken());
	 			a2.setNC2(st.nextToken());
	 			a2.setNC3(st.nextToken());
	 		lAsig2.add(a2);
	 	}
	}


	public String promedio{
		String c = "";

		for(Alumnos a : lA){
			for(Asignatura1 b : lAsig1){
				for(Asignatura2 c : lAsig2){
					if () {
						
					}
			}
		}





	}
	public void guardar(String a1, String a2){

		List<String> final1;
		List<String> final2;

		FuenteDeDatos f = new FuenteDeDatos();

		final1 = new ArrayList<String>();
		final2 = new ArrayList<String>();
		final1.add(a1);
		final2.add(a2);
		f.escribirArchivo("consolidado.csv", final1,final2);
	}

}