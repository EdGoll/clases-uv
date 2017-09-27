import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Registro{
	private List<String> lineas;
	private List<Region> regiones;
	private List<Provincia> provincias;
	private List<Comuna> comunas;
	private StringTokenizer st;

	private void cargarRegiones(){
		lineas=FuenteDatos.leerArchivo("Region.csv");
		regiones=new ArrayList<Region>();
		Region r=null;
		for(String l:lineas){
			st=new StringTokenizer(l,";");
			if(st.hasMoreElements()){
				r=new Region();
				r.setIdRegion(st.nextToken());
				r.setNomRegion(st.nextToken());
				r.setNumRomano(st.nextToken());
				r.setOrdenGeoReg(st.nextToken());
				regiones.add(r);
			}
		}
	}
	private void cargarProvincias(){
		lineas=FuenteDatos.leerArchivo("Provincia.csv");
		provincias=new ArrayList<Provincia>();
		Provincia p=null;
		for(String l:lineas){
			st=new StringTokenizer(l, ";");
			if(st.hasMoreElements()){
				p=new Provincia();
				p.setIdProvincia(st.nextToken());
				p.setNomProvincia(st.nextToken());
				p.setIdRegion(st.nextToken());
				provincias.add(p);
			}
		}
	}
	private void cargarComunas(){
		lineas=FunteDatos.leerArchivo("Comunas.csv");
		comunas=new ArrayList<Provincia>();
		Comuna c=null;
		for(String l:lineas){
			st=new StringTokenizer(l, ";");
			if(st.hasMoreElements()){
				c=new Comuna();
				c.setIdComuna(st.nextToken());
				c.setNomComuna(st.nextToken());
				c.setIdProvincia(st.nextToken());
				comunas.add(c);
			}
		}
	}
	private void agregarDatosRegistro(){
		Scanner sc=new Scanner(System.in);
		String respuesta="";
		do{
            		try{
				System.out.println("Ingrese tipo de persona; a: Académico, b: Alumno, c: Funcionario");
				String respuesta= sc.nextLine();
			}catch(Exception e){
				System.out.println("Error");
			}
		}
		while((!respuesta.equalsIgnoreCase("a"))&&(!respuesta.equalsIgnoreCase("b"))&&(!respuesta.equalsIgnoreCase("c")));
		if(respuesta.equalsIgnoreCase("a")){
			try{
				System.out.println("Ingrese DNI");			
				String dni=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese nombre");
				String nombre=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese apellidos");
				String apellidos=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese edad");
				String edad=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese horario de atención");
				String horarioat=sc.nextLine();
			}catch(Exception e){}
			Academico a=new Academico(dni, nombre, apellidos, edad, horarioat);
			lineas.add(a);
			FuenteDatos.escribirArchivo("ArchivoRegistro.txt", lineas);
		}
		if(respuesta.equalsIgnoreCase("b")){			
			try{
				System.out.println("Ingrese DNI");			
				String dni=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese nombre");
				String nombre=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese apellidos");
				String apellidos=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese edad");
				String edad=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese asignaturas cursando");
				String asignaturas=sc.nextLine();
			}catch(Exception e){}
			Alumno b=new Alumno(dni, nombre, apellidos, edad, asignaturas);
			lineas.add(b);
			FuenteDatos.escribirArchivo("ArchivoRegistro.txt", lineas);
		}
		if(respuesta.equalsIgnoreCase("c")){			
			try{
				System.out.println("Ingrese DNI");			
				String dni=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese nombre");
				String nombre=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese apellidos");
				String apellidos=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese edad");
				String edad=sc.nextLine();
			}catch(Exception e){}
			try{
				System.out.println("Ingrese su horario laboral");
				String horariolab=sc.nextLine();
			}catch(Exception e){}
			Funcionario c=new Alumno(dni, nombre, apellidos, edad, horariolab);
			lineas.add(c);
			FuenteDatos.escribirArchivo("ArchivoRegistro.txt", lineas);
		}
		
	}
}
