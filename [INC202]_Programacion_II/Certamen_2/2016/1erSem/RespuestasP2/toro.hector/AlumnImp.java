

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public abstract class AlumnImp {
	List<Alumno> listAlum;
	List<Asignatura> listAsig;
	List<Asignatura> listAsig2;
	List<String> lineas;
	
	public AlumnImp(String nomArchAlumn,String nomAsig1,String nomAsig2){
		cargarAlum(nomArchAlumn);
		cargarAsignatura("asignatura1.csv");
		cargarAsignatura2("asignatura2.csv");
	}
	private void cargarAlum(String nomArchAlumn){
		FuenteDeDatos f1 = new FuenteDeDatos();
		lineas = new ArrayList<String>();
		listAlum = new ArrayList<Alumno>();
		lineas = f1.leerArchivo(nomArchAlumn);
		for( String linea : (lineas)){
			StringTokenizer st = new StringTokenizer(linea,";");
			Alumno alum = new Alumno();
			alum.setId(Integer.parseInt(st.nextToken()));
			alum.setApellidoPater(st.nextToken());
			alum.setApellidoMater(st.nextToken());
			alum.setNombres(st.nextToken());
			listAlum.add(alum);
		}
	}
	
	private void cargarAsignatura(String nomAsig1){
		FuenteDeDatos f1 = new FuenteDeDatos();
		lineas = new ArrayList<String>();
		listAsig = new ArrayList<Asignatura>();
		lineas = f1.leerArchivo(nomAsig1);
		//StringTokenizer st;
		for( String linea : (lineas)){
			StringTokenizer st = new StringTokenizer(linea,";");
			Asignatura asig = new Asignatura();
			asig.setId(Integer.parseInt(st.nextToken()));
			asig.setQuiz1(Float.parseFloat(st.nextToken()));
			asig.setQuiz2(Float.parseFloat(st.nextToken()));
			asig.setQuiz3(Float.parseFloat(st.nextToken()));
			asig.setTarea1(Float.parseFloat(st.nextToken()));
			asig.setTarea2(Float.parseFloat(st.nextToken()));
			asig.setTarea3(Float.parseFloat(st.nextToken()));
			asig.setCertamen1(Float.parseFloat(st.nextToken()));
			asig.setCertamen2(Float.parseFloat(st.nextToken()));
			asig.setCertamen3(Float.parseFloat(st.nextToken()));
			listAsig.add(asig);
		}
	}
	private void cargarAsignatura2(String nomAsig2){
		FuenteDeDatos f1 = new FuenteDeDatos();
		lineas = new ArrayList<String>();
		listAsig = new ArrayList<Asignatura>();
		lineas = f1.leerArchivo(nomAsig2);
		//StringTokenizer st;
		for( String linea : (lineas)){
			StringTokenizer st = new StringTokenizer(linea,";");
			Asignatura asig = new Asignatura();
			asig.setId(Integer.parseInt(st.nextToken()));
			asig.setQuiz1(Float.parseFloat(st.nextToken()));
			asig.setQuiz2(Float.parseFloat(st.nextToken()));
			asig.setQuiz3(Float.parseFloat(st.nextToken()));
			asig.setTarea1(Float.parseFloat(st.nextToken()));
			asig.setTarea2(Float.parseFloat(st.nextToken()));
			asig.setTarea3(Float.parseFloat(st.nextToken()));
			asig.setCertamen1(Float.parseFloat(st.nextToken()));
			asig.setCertamen2(Float.parseFloat(st.nextToken()));
			asig.setCertamen3(Float.parseFloat(st.nextToken()));
			listAsig.add(asig);
		}
	}
	
	
	public float promedio(){
		float promquiz, promtarea, promcerta;
		for (Asignatura asig : listAsig){
			promquiz = (asig.getQuiz1() + asig.getQuiz2() + asig.getQuiz3())/3; 
			promtarea = (asig.getTarea1() + asig.getTarea2() + asig.getTarea3())/3;
			promcerta = (asig.getCertamen1() + asig.getCertamen2() + asig.getCertamen3())/3;
			
			if(promcerta>= 4){
				return (float) (promcerta * 0.7 + promquiz * 0.1 + promtarea * 0.05);
			} /*else if (){
			return 0;
			}else(){}*/
		}
			
	}
	public void consolidar(){
		for(Alumno pa : listAlum){
			for(Asignatura asig : listAsig){
				if(pa.getId() == asig.getId()){
					
				}
			}
		}
	}
	public void buscar(){
		
	}
}

