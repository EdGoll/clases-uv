import java.util.Scanner;
import java.util.List;
import java.util.StringTokenizer;
import java.util.NoSuchElementException;
import java.util.ArrayList;


public class Lista{
	private List<DatosPersonales> personal;
	private List<Region> regiones;
	private List<Provincia> provincias;
	private List<Comuna> comunas;
	private List<String> lineas;
	private StringTokenizer st;

	public Lista(){
		personal = new ArrayList();
		cargarRegiones();
		cargarProvincias();
		cargarComunas();
	}

	public void registrarPersona(){
		Scanner p = new Scanner(System.in);
		for(int i = 0; i<1; i++){
			int region = 0, provincia = 0, comuna = 0;                
            DatosPersonales dataPerson = new DatosPersonales("",0,"",0,"",0,"");    
            // Rut
            System.out.println("Ingrese DNI ["+(i+1)+"]");
            dataPerson.setIDNI(p.nextLine());
            p = new Scanner(System.in);
            // Nombre
            System.out.println("================================");
            System.out.println("Ingrese NOMBRE ["+(i+1)+"]");
            dataPerson.setNombre(p.nextLine());
            p = new Scanner(System.in);
            //Apellidos
            System.out.println("================================");
            System.out.println("Ingrese APELLIDOS ["+(i+1)+"]");
            dataPerson.setApellidos(p.nextLine());
            p = new Scanner(System.in);
            //Edad
            System.out.println("================================");
            System.out.println("Ingrese EDAD ["+(i+1)+"]");
            dataPerson.setEdad(Integer.valueOf(p.nextLine()));
            p = new Scanner(System.in);
            //Calle
            System.out.println("================================");
            System.out.println("Ingrese CALLE ["+(i+1)+"]");
            dataPerson.setCalle(p.nextLine());
            p = new Scanner(System.in);
            //N° Calle
            System.out.println("================================");
            System.out.println("Ingrese N CALLE ["+(i+1)+"]");
            dataPerson.setNumCalle(Integer.valueOf(p.nextLine()));
            p = new Scanner(System.in);

            //seleccion de Comuna
            System.out.println("================================");
            System.out.println("Seleccione region ["+(i+1)+"]");
			for(Region re: regiones){
				System.out.println("["+re.getIdRegion()+"] : "+re.getRomano()+": "+re.getNombreRegion());
			} 
			region = Integer.valueOf(p.nextLine());
			p = new Scanner(System.in);
			System.out.println("===============================");
			System.out.println("Seleccione provincia ["+(i+1)+"]");
			for(Provincia pro: provincias){
				if(pro.getIdRegion() == (region)){
					System.out.println("["+pro.getIdProvincia()+"] : "+pro.getNombreProvincia());
				}
			}
			provincia = Integer.valueOf(p.nextLine());
			p = new Scanner(System.in);
			System.out.println("===============================");
			System.out.println("Seleccione comuna ["+(i+1)+"]");
			for(Comuna co: comunas){
				if(co.getIdProvincia() == (provincia)){
					System.out.println("["+co.getIdComuna()+"] : "+co.getNombreComuna());
				}
			}
			comuna = Integer.valueOf(p.nextLine());
			p = new Scanner(System.in);
			for(Comuna co: comunas){
				if(co.getIdComuna() == (comuna)){
					dataPerson.setComuna(co.getNombreComuna());
					break;
				}
			}
	    //Tipo de usuario
	    System.out.println("================================");
	    System.out.println("Ingrese Tipo de Persona:");
	    System.out.println("(1) Academico");
	    System.out.println("(2) Alumno");
	    System.out.println("(3) Funcionario");
	    p = new Scanner(System.in);

	    switch (p) {


		case 1: dataPerson.setTipoPersona(Academico);
			System.out.println("Ingrese Horario de atencion (desde - hasta) ["+(i+1)+"]");
			dataPerson.setHorarioAtencion(p.nextLine());
			p = new Scanner(System.in);

		break;

		case 2: dataPerson.setTipoPersona(Alumno);
			System.out.println("Ingrese ramos que esta cursando (ramo - ramo - ramo)["+(i+1)+"]");
			dataPerson.setRamos(p.nextLine());
			p = new Scanner(System.in);

		break;
 
 		case 3: dataPerson.setTipoPersona(Funcionario);
			System.out.println("Ingrese Horario de trabajo (Hora entrada - Hora salida) ["+(i+1)+"]");
			dataPerson.setHorarioTrabajo(p.nextLine());
			p = new Scanner(System.in);

		break;

		default: System.out.println ("Error ingresa bien el numero pollo");
		
		break;


	    }		
			personal.add(dataPerson);
	 }//Fin for

	private void cargarRegiones(){
		lineas=FuenteDatos.leerArchivo("Region.csv");
		regiones = new ArrayList<Region>();		
		Region r = null;

		for (String linea:lineas){
			sttk = new StringTokenizer(linea,";");
  			if (sttk.hasMoreElements()){
				r = new Region();
				r.setIdRegion(Integer.valueOf(st.nextToken()));
				r.setNombreRegion(st.nextToken());
				r.setRomano(st.nextToken());
				r.setOrdenGeo(st.nextToken());
				regiones.add(r);
			}
		}
	}


	private void cargarProvincias(){
		lineas=FuenteDatos.leerArchivo("Provincia.csv"); 
		provincias = new ArrayList<Provincia>();		
		Provincia p = null;

		for (String linea:lineas){
			sttk = new StringTokenizer(linea,";");
  			if (sttk.hasMoreElements()){
				p = new Provincia();
				p.setIdProvincia(Integer.valueOf(st.nextToken()));
				p.setNombreProvincia(st.nextToken());
				p.setIdRegion(Integer.valueOf(st.nextToken()));
				provincias.add(p);
			}
		}
	}

	private void cargarComunas(){
		lineas=FuenteDatos.leerArchivo("Comuna.csv"); 
		comunas = new ArrayList<Comuna>();		
		Comuna c = null;

		for (String linea:lineas){
			sttk = new StringTokenizer(linea,";");
  			if (sttk.hasMoreElements()){
				c = new Comuna();
				c.setIdComuna(Integer.valueOf(st.nextToken()));
				c.setNombreComuna(st.nextToken());
				c.setIdProvincia(Integer.valueOf(st.nextToken()));
				comunas.add(c);
			}
		}
	}
}
