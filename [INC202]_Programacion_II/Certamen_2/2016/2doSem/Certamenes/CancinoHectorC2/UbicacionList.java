import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class UbicacionList{
	private List<String> lineas;
	private List<Region> regiones;
	private List<Provincia> provincias;
	private List<Comuna> comunas;
	private StringTokenizer st;
	private List<DatosPersonales> personal;

	public UbicacionList(){
		personal = new ArrayList<>();
		cargarRegiones();
		cargarProvincias();
		cargarComunas();
	}

	private void cargarRegiones(){
		lineas=FuenteDatos.leerArchivo("Region.csv"); 
		regiones = new ArrayList<Region>();		
		Region r =null;

		for (String linea:lineas){
			st = new StringTokenizer(linea,";");
  			if (st.hasMoreElements()){
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
		Provincia p =null;

		for (String linea:lineas){
			st = new StringTokenizer(linea,";");
  			if (st.hasMoreElements()){
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
		Comuna c =null;

		for (String linea:lineas){
			st = new StringTokenizer(linea,";");
  			if (st.hasMoreElements()){
				c = new Comuna();
				c.setIdComuna(Integer.valueOf(st.nextToken()));
				c.setNombreComuna(st.nextToken());
				c.setIdProvincia(Integer.valueOf(st.nextToken()));
				comunas.add(c);
			}
		}
	}
		public void registrarUsuario(){
		Scanner s = new Scanner(System.in);
		lineas = new ArrayList <String>();
		for(int i = 0; i<1000; i++){
			int region = 0, provincia = 0, comuna = 0;                
            DatosPersonales dataPerson = new DatosPersonales();    
            // Rut
            System.out.println("Ingrese DNI ["+(i+1)+"]");
            dataPerson.setIDNI(s.nextLine());
            s = new Scanner(System.in);
            // Nombre
            System.out.println("----------------------------------");
            System.out.println("Ingrese NOMBRE ["+(i+1)+"]");
            dataPerson.setNombre(s.nextLine());
            s = new Scanner(System.in);
            //Apellidos
            System.out.println("----------------------------------");
            System.out.println("Ingrese APELLIDOS ["+(i+1)+"]");
            dataPerson.setApellidos(s.nextLine());
            s = new Scanner(System.in);
            //Edad
            System.out.println("----------------------------------");
            System.out.println("Ingrese EDAD ["+(i+1)+"]");
            dataPerson.setEdad(Integer.valueOf(s.nextLine()));
            s = new Scanner(System.in);

            System.out.println("----------------------------------");
            System.out.println("Ingrese TIPO DE PERSONA(alumno/academico/funcionario) ["+(i+1)+"]");
            switch (s.nextLine()) {
 
        		case "alumno":
        			System.out.println("Ingrese RAMOS INSCRITOS ESTE SEMESTRE(ej: calculo fisica programacion 2) ["+(i+1)+"] ");
        			dataPerson.setTipoPersona("alumno " + s.nextLine());
        			break;
        		case "academico":
        			System.out.println("Ingrese HORARIO DE ATENCION(ej: lunes a viernes 10:00-12:00) ["+(i+1)+"] ");
        			dataPerson.setTipoPersona("academico " + s.nextLine());
        			break;
        		case "funcionario":
        			System.out.println("Ingrese HORARIO LABORAL(ej: lunes a viernes 10:00-18:00) ["+(i+1)+"] ");
        			dataPerson.setTipoPersona("funcionario " + s.nextLine());
        			break;
 				
        	}
            
            s = new Scanner(System.in);

            System.out.println("----------------------------------");
            System.out.println("Ingrese TIPO DE DOMICILIO(laboral/personal) ["+(i+1)+"]");
            dataPerson.setTipoDomicilio(s.nextLine());
            s = new Scanner(System.in);
            //Calle
            System.out.println("----------------------------------");
            System.out.println("Ingrese CALLE ["+(i+1)+"]");
            dataPerson.setCalle(s.nextLine());
            s = new Scanner(System.in);
            //N° Calle
            System.out.println("----------------------------------");
            System.out.println("Ingrese N CALLE ["+(i+1)+"]");
            dataPerson.setNumCalle(Integer.valueOf(s.nextLine()));
            s = new Scanner(System.in);       

            //selecion de Comuna
            System.out.println("----------------------------------");
            System.out.println("Seleccione region ["+(i+1)+"]");
			for(Region reg: regiones){
				System.out.println("["+reg.getIdRegion()+"] : "+reg.getRomano()+": "+reg.getNombreRegion());
			} 
			region = Integer.valueOf(s.nextLine());
			s = new Scanner(System.in);
			System.out.println("----------------------------------");
			System.out.println("Seleccione provincia ["+(i+1)+"]");
			for(Provincia prov: provincias){
				if(prov.getIdRegion() == (region)){
					System.out.println("["+prov.getIdProvincia()+"] : "+prov.getNombreProvincia());
				}
			}
			provincia = Integer.valueOf(s.nextLine());
			s = new Scanner(System.in);
			System.out.println("----------------------------------");
			System.out.println("Seleccione comuna ["+(i+1)+"]");
			for(Comuna com: comunas){
				if(com.getIdProvincia() == (provincia)){
					System.out.println("["+com.getIdComuna()+"] : "+com.getNombreComuna());
				}
			}
			comuna = Integer.valueOf(s.nextLine());
			s = new Scanner(System.in);
			for(Comuna com: comunas){
				if(com.getIdComuna() == (comuna)){
					dataPerson.setComuna(com.getNombreComuna());
					break;
				}
			}
			s = new Scanner(System.in);
			personal.add(dataPerson);
			lineas.add(dataPerson.toString());
			FuenteDatos.escribirArchivo("registropersona.csv",lineas);
        }
        
	}

}
