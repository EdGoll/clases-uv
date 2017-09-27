import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ListaAlum {

	FuenteDeDatos f;
	List<String> lineas = null;
	List<Alumnos> lA = new ArrayList<Alumnos>();
	Lista<Asignatura1> lAsig1 = new ArrayList<Asignatura1>();
	Lista<Asignatura2> lAsig2 = new ArrayList<Asignatura2>();

	public ListaImp(){
		f = new FuenteDeDatos();
		lineas = new leerArhivo("Alumnos.csv");
		lineas = new leerArhivo("Asignatura1.csv");
		lineas = new leerArhivo("Asignatura2.csv");
		cargarAlumnos();
		cargarAsignatura1();
		cargarAsignatura2();
	}

	public void cargarAlumnos(){
	 	Alumnos a;
	 	for(String lineas : linea){
	 			StringTokenizer st = new StringTokenizer(linea,";");
	 			a = new Alumnos();
	 			a.setId(st.nextToken());
	 			a.setNombre(st.nextToken());
	 			a.setApellidoPaterno(st.nextToken());
	 			a.setApellidoMaterno(st.nextToken());
	 			a.setNotaAsig1(st.nextToken());
	 			a.setNotaAsig2(st.nextToken());
	 			lA.add(a);
	 	}

	}
	public void cargarAsignatura1(){
	 	Asignatura a1;
	 	for(String lineas : linea){
	 			StringTokenizer st = new StringTokenizer(linea,";");
	 			a1 = new Asignatura();
	 			a1.setId(st.nextToken());
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
	 	for(String lineas : linea){
	 			StringTokenizer st = new StringTokenizer(linea,";");
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

















}