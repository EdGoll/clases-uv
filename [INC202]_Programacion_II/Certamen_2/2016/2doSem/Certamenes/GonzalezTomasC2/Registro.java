

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Registro {
	private List<String> listConsolidado ;
	private List<Region> listRegiones;
	private List<Provincia> listProvincias;
	private List<Comuna> listComuna;
	private Alumno alumno;
	private Academico academico;
	private Funcionario funcionario;
	private List<Alumno> listAlumnos;
	private List<Academico> listAcademicos;
	private List<Funcionario> listFuncionarios;
	
	public Registro(){
		cargarDatos();
		cargarRegiones();
		cargarProvincias();
		cargarComunas();
	}
	public void cargarDatos() {
		listConsolidado = new ArrayList<>();
		listConsolidado = FuenteDeDatos.leerArchivo("Consolidado.csv");
	if(listConsolidado.size()!=0){
		StringTokenizer st;
		for(String linea : listConsolidado) {
			st = new StringTokenizer(linea, ";");
			int param = Integer.parseInt(st.nextToken());
			switch (param) {
			case 1:
				academico = new Academico();
				academico.setTipo(param);
				academico.setDni(st.nextToken());
				academico.setNombre(st.nextToken());
				academico.setApellidos(st.nextToken());
				academico.setEdad(Integer.parseInt(st.nextToken()));
				academico.setHoraAtencion(st.nextToken());
				param = Integer.parseInt(st.nextToken());
				academico.setIdRegionLaboral(param);
				academico.setRegionLaboral(buscarRegion(param));
				param = Integer.parseInt(st.nextToken());
				academico.setIdProvinciaLAboral(param);
				academico.setProvinciaLaboral(buscarProvincia(param));
				param = Integer.parseInt(st.nextToken());
				academico.setIdComunaLaboral(param);
				academico.setComunaLAboral(buscarComuna(param));
				
				academico.setCalleLaboral(st.nextToken());
				academico.setNumeroLaboral(Integer.parseInt(st.nextToken()));
				
				param = Integer.parseInt(st.nextToken());
				academico.setIdRegionPersonal(param);
				academico.setRegionPersonal(buscarRegion(param));
				param = Integer.parseInt(st.nextToken());
				academico.setIdProvinciaPersonal(param);
				academico.setProvinciaPersonal(buscarProvincia(param));
				param = Integer.parseInt(st.nextToken());
				academico.setIdComunaPersonal(param);
				academico.setComunaPersonal(buscarComuna(param));
				
				academico.setCallePersonal(st.nextToken());
				academico.setNumeroPersonal(Integer.parseInt(st.nextToken()));
				listAcademicos.add(academico);
				break;
			case 2:
				alumno = new Alumno();
				alumno.setTipo(param);
				alumno.setDni(st.nextToken());
				alumno.setNombre(st.nextToken());
				alumno.setApellidos(st.nextToken());
				alumno.setEdad(Integer.parseInt(st.nextToken()));
				
				alumno.setAsignatura(st.nextToken());
				param = Integer.parseInt(st.nextToken());
				alumno.setIdRegionLaboral(param);
				alumno.setRegionLaboral(buscarRegion(param));
				param = Integer.parseInt(st.nextToken());
				alumno.setIdProvinciaLAboral(param);
				alumno.setProvinciaLaboral(buscarProvincia(param));
				param = Integer.parseInt(st.nextToken());
				alumno.setIdComunaLaboral(param);
				alumno.setComunaLAboral(buscarComuna(param));
				
				alumno.setCalleLaboral(st.nextToken());
				alumno.setNumeroLaboral(Integer.parseInt(st.nextToken()));
				
				param = Integer.parseInt(st.nextToken());
				alumno.setIdRegionPersonal(param);
				alumno.setRegionPersonal(buscarRegion(param));
				param = Integer.parseInt(st.nextToken());
				alumno.setIdProvinciaPersonal(param);
				alumno.setProvinciaPersonal(buscarProvincia(param));
				param = Integer.parseInt(st.nextToken());
				alumno.setIdComunaPersonal(param);
				alumno.setComunaPersonal(buscarComuna(param));
				
				alumno.setCallePersonal(st.nextToken());
				alumno.setNumeroPersonal(Integer.parseInt(st.nextToken()));	
				listAlumnos.add(alumno);
				break;
			case 3:
				funcionario = new Funcionario();
				funcionario.setTipo(param);
				funcionario.setDni(st.nextToken());
				funcionario.setNombre(st.nextToken());
				funcionario.setApellidos(st.nextToken());
				funcionario.setEdad(Integer.parseInt(st.nextToken()));
				
				funcionario.setHorarioLaboral(st.nextToken());
				param = Integer.parseInt(st.nextToken());
				funcionario.setIdRegionLaboral(param);
				funcionario.setRegionLaboral(buscarRegion(param));
				param = Integer.parseInt(st.nextToken());
				funcionario.setIdProvinciaLAboral(param);
				funcionario.setProvinciaLaboral(buscarProvincia(param));
				param = Integer.parseInt(st.nextToken());
				funcionario.setIdComunaLaboral(param);
				funcionario.setComunaLAboral(buscarComuna(param));
				
				funcionario.setCalleLaboral(st.nextToken());
				funcionario.setNumeroLaboral(Integer.parseInt(st.nextToken()));
				
				param = Integer.parseInt(st.nextToken());
				funcionario.setIdRegionPersonal(param);
				funcionario.setRegionPersonal(buscarRegion(param));
				param = Integer.parseInt(st.nextToken());
				funcionario.setIdProvinciaPersonal(param);
				funcionario.setProvinciaPersonal(buscarProvincia(param));
				param = Integer.parseInt(st.nextToken());
				funcionario.setIdComunaPersonal(param);
				funcionario.setComunaPersonal(buscarComuna(param));
				
				funcionario.setCallePersonal(st.nextToken());
				funcionario.setNumeroPersonal(Integer.parseInt(st.nextToken()));	
				listFuncionarios.add(funcionario);
				break;

				
			default:
				break;
			}
		}
	}	
	}
	private void cargarRegiones(){
		 List<String> lineas;
		  
		 Region region;
		 listRegiones = new ArrayList<Region>();
		 lineas = FuenteDeDatos.leerArchivo("Region.csv");
		 StringTokenizer st ;
		 for (String linea : lineas) {
			st = new StringTokenizer(linea, ";");
			region = new Region();
			region.setIdRegion(Integer.parseInt(st.nextToken()));
			region.setNombreRegion(st.nextToken());
			region.setNumeroRomano(st.nextToken());
			region.setOrdenGeograﬁcoRegion(Integer.parseInt(st.nextToken()));
			listRegiones.add(region);
		 }	 
		 
	}
	
	public void deplegarRegiones() {
		for (Region region : listRegiones) {
			System.out.println(region.toString());;
		}
	}
	public String buscarRegion(int id) {
		for (Region region : listRegiones) {
			if(region.getIdRegion()==id){
				return region.getNombreRegion();
			}
		}
		return "-";	
	}
	
	public void cargarProvincias(){
		 List<String> lineas;
		 listProvincias = new ArrayList<Provincia>();
		 lineas = FuenteDeDatos.leerArchivo("Provincia.csv");
		 StringTokenizer st ;
		 for (String linea : lineas) {
			st = new StringTokenizer(linea, ";");
			Provincia provincia = new Provincia();
			provincia.setIdProvincia(Integer.parseInt(st.nextToken()));
			provincia.setNombreProvincia(st.nextToken());
			provincia.setIdRegion(Integer.parseInt(st.nextToken()));
			listProvincias.add(provincia);
		}
		 
		 
	}
	public void deplegarProvincias(int id) {
		for (Provincia provincia : listProvincias) {
			if (provincia.IdRegion==id) {
				provincia.toString();
			}
		}
	}
	public String buscarProvincia(int id) {
		for (Provincia provincia : listProvincias) {
			if (provincia.IdRegion==id) {
				return provincia.getNombreProvincia();
			}
			
		}
		return "-";
	}
	
	public void cargarComunas(){
		List<String> lineas;
		 listComuna = new ArrayList<Comuna>();
		 lineas = FuenteDeDatos.leerArchivo("Comuna.csv");
		 StringTokenizer st ;
		 for (String linea : lineas) {
			st = new StringTokenizer(linea, ";");
			Comuna comuna = new Comuna();
			comuna.setIdComuna(Integer.parseInt(st.nextToken()));
			comuna.setNombreComuna(st.nextToken());
			comuna.setIdProvincia(Integer.parseInt(st.nextToken()));
			listComuna.add(comuna);
			
		}
	}
	public void deplegarComunas(int id) {
		for (Comuna comuna : listComuna) {
			if (comuna.getIdProvincia()== id) {
				comuna.toString();
			}
		}
	}
	public String buscarComuna(int id) {
		for (Comuna comuna : listComuna) {
			if (comuna.getIdProvincia()== id) {
				return comuna.getNombreComuna();
			}
		}
		return "-";
	}
	
	public void  agregar() {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		String paramString;
		int paramInt = 0;
		alumno = new Alumno();
		academico = new Academico();
		funcionario = new Funcionario();
		
		System.out.println("Ingrese tipo de persona\n 1:Academico --\n 2:Alumno--\n 3:Funcionario");
		paramInt = scInt.nextInt();

		switch (paramInt) {
		case 1:
			academico.setTipo(paramInt);
			System.out.println("Ingrese Rut");
			paramString = scString.nextLine();
			if (buscarDNI(paramString)==false) {
				System.out.println("Se elimino registro anterior");
			}
			academico.setDni(paramString);
			System.out.println("Ingrese Nombres");
			paramString = scString.nextLine();
			academico.setNombre(paramString);
			System.out.println("Ingrese Apellidos");
			paramString = scString.nextLine();
			academico.setApellidos(paramString);
			System.out.println("Ingrese Edad");
			paramInt = scInt.nextInt();
			academico.setEdad(paramInt);
			System.out.println("Ingrese Hora Atencion");
			paramString = scString.nextLine();
			academico.setHoraAtencion(paramString);
			System.out.println("Desea Ingresar Direccion Laboral Si: 1 //  No: 0");
			paramInt = scInt.nextInt();
			if(paramInt == 1 ){
				deplegarRegiones();
				System.out.println("Ingrese id Region");
				paramInt = scInt.nextInt();
				academico.setIdRegionLaboral(paramInt);
				academico.setRegionLaboral(buscarRegion(paramInt));
				deplegarProvincias(paramInt);
				System.out.println("Ingrese id Provincia");
				paramInt = scInt.nextInt();
				academico.setIdProvinciaLAboral(paramInt);
				academico.setProvinciaLaboral(buscarProvincia(paramInt));
				deplegarComunas(paramInt);
				System.out.println("Ingrese id Comuna");
				paramInt = scInt.nextInt();
				academico.setIdComunaLaboral(paramInt);
				academico.setComunaLAboral(buscarComuna(paramInt));
				System.out.println("Ingrese Calle LAboral");
				paramString = scString.nextLine();
				academico.setCalleLaboral(paramString);
				System.out.println("Ingrese Numero casaLaboral");
				paramInt = scInt.nextInt();
				academico.setNumeroLaboral(paramInt);
			}
			System.out.println("Desea Ingresar Direccion Personal Si: 1 //  No: 0");
			paramInt = scInt.nextInt();
			if(paramInt == 1 ){
				deplegarRegiones();
				System.out.println("Ingrese id Region");
				paramInt = scInt.nextInt();
				academico.setIdRegionPersonal(paramInt);
				academico.setRegionPersonal(buscarRegion(paramInt));
				deplegarProvincias(paramInt);
				System.out.println("Ingrese id Provincia");
				paramInt = scInt.nextInt();
				academico.setIdProvinciaPersonal(paramInt);
				academico.setProvinciaPersonal(buscarProvincia(paramInt));
				deplegarComunas(paramInt);
				System.out.println("Ingrese id Comuna");
				paramInt = scInt.nextInt();
				academico.setIdComunaPersonal(paramInt);
				academico.setComunaPersonal(buscarComuna(paramInt));
				System.out.println("Ingrese Calle Personal");
				paramString = scString.nextLine();
				academico.setCallePersonal(paramString);
				System.out.println("Ingrese Numero casaPersonal");
				paramInt = scInt.nextInt();
				academico.setNumeroPersonal(paramInt);
			}
			listAcademicos.add(academico);
			break;
		case 2:
			alumno.setTipo(paramInt);
			System.out.println("Ingrese Rut");
			paramString = scString.nextLine();
			if (buscarDNI(paramString)==true) {
				System.out.println("Se elimino registro anterior");
			}
			alumno.setDni(paramString);
			System.out.println("Ingrese Nombres");
			paramString = scString.nextLine();
			alumno.setNombre(paramString);
			System.out.println("Ingrese Apellidos");
			paramString = scString.nextLine();
			alumno.setApellidos(paramString);
			System.out.println("Ingrese Edad");
			paramInt = scInt.nextInt();
			alumno.setEdad(paramInt);
			do {
				System.out.println("Desea Ingresar Asignatura Si: 1 //  No: 0");
				paramInt = scInt.nextInt();
				if (paramInt == 1) {
					System.out.println("Ingrese Asignatura");
					paramString = scString.nextLine();
					alumno.setAsignatura(paramString);
				}
			} while (paramInt==1);
			System.out.println("Desea Ingresar Direccion Laboral Si: 1 //  No: 0");
			paramInt = scInt.nextInt();
			if(paramInt == 1 ){
				deplegarRegiones();
				System.out.println("Ingrese id Region");
				paramInt = scInt.nextInt();
				alumno.setIdRegionLaboral(paramInt);
				alumno.setRegionLaboral(buscarRegion(paramInt));
				deplegarProvincias(paramInt);
				System.out.println("Ingrese id Provincia");
				paramInt = scInt.nextInt();
				alumno.setIdProvinciaLAboral(paramInt);
				alumno.setProvinciaLaboral(buscarProvincia(paramInt));
				deplegarComunas(paramInt);
				System.out.println("Ingrese id Comuna");
				paramInt = scInt.nextInt();
				alumno.setIdComunaLaboral(paramInt);
				alumno.setComunaLAboral(buscarComuna(paramInt));
				System.out.println("Ingrese Calle LAboral");
				paramString = scString.nextLine();
				alumno.setCalleLaboral(paramString);
				System.out.println("Ingrese Numero casaLaboral");
				paramInt = scInt.nextInt();
				alumno.setNumeroLaboral(paramInt);
			}
			System.out.println("Desea Ingresar Direccion Personal Si: 1 //  No: 0");
			paramInt = scInt.nextInt();
			if(paramInt == 1 ){
				deplegarRegiones();
				System.out.println("Ingrese id Region");
				paramInt = scInt.nextInt();
				alumno.setIdRegionPersonal(paramInt);
				alumno.setRegionPersonal(buscarRegion(paramInt));
				deplegarProvincias(paramInt);
				System.out.println("Ingrese id Provincia");
				paramInt = scInt.nextInt();
				alumno.setIdProvinciaPersonal(paramInt);
				alumno.setProvinciaPersonal(buscarProvincia(paramInt));
				deplegarComunas(paramInt);
				System.out.println("Ingrese id Comuna");
				paramInt = scInt.nextInt();
				alumno.setIdComunaPersonal(paramInt);
				alumno.setComunaPersonal(buscarComuna(paramInt));
				System.out.println("Ingrese Calle Personal");
				paramString = scString.nextLine();
				alumno.setCallePersonal(paramString);
				System.out.println("Ingrese Numero casaPersonal");
				paramInt = scInt.nextInt();
				alumno.setNumeroPersonal(paramInt);
			}
			listAlumnos.add(alumno);
			break;
			
		case 3:
			funcionario.setTipo(paramInt);
			System.out.println("Ingrese Rut");
			paramString = scString.nextLine();
			if (buscarDNI(paramString)==false) {
				System.out.println("Se elimino registro anterior");
			}
			funcionario.setDni(paramString);
			System.out.println("Ingrese Nombres");
			paramString = scString.nextLine();
			funcionario.setNombre(paramString);
			System.out.println("Ingrese Apellidos");
			paramString = scString.nextLine();
			funcionario.setApellidos(paramString);
			System.out.println("Ingrese Edad");
			paramInt = scInt.nextInt();
			funcionario.setEdad(paramInt);
			System.out.println("Ingrese Horario Laboral");
			paramString = scString.nextLine();
			funcionario.setHorarioLaboral(paramString);
			System.out.println("Desea Ingresar Direccion Laboral Si: 1 //  No: 0");
			paramInt = scInt.nextInt();
			if(paramInt == 1 ){
				deplegarRegiones();
				System.out.println("Ingrese id Region");
				paramInt = scInt.nextInt();
				funcionario.setIdRegionLaboral(paramInt);
				funcionario.setRegionLaboral(buscarRegion(paramInt));
				deplegarProvincias(paramInt);
				System.out.println("Ingrese id Provincia");
				paramInt = scInt.nextInt();
				funcionario.setIdProvinciaLAboral(paramInt);
				funcionario.setProvinciaLaboral(buscarProvincia(paramInt));
				deplegarComunas(paramInt);
				System.out.println("Ingrese id Comuna");
				paramInt = scInt.nextInt();
				funcionario.setIdComunaLaboral(paramInt);
				funcionario.setComunaLAboral(buscarComuna(paramInt));
				System.out.println("Ingrese Calle LAboral");
				paramString = scString.nextLine();
				funcionario.setCalleLaboral(paramString);
				System.out.println("Ingrese Numero casaLaboral");
				paramInt = scInt.nextInt();
				funcionario.setNumeroLaboral(paramInt);
			}
			System.out.println("Desea Ingresar Direccion Personal Si: 1 //  No: 0");
			paramInt = scInt.nextInt();
			if(paramInt == 1 ){
				deplegarRegiones();
				System.out.println("Ingrese id Region");
				paramInt = scInt.nextInt();
				funcionario.setIdRegionPersonal(paramInt);
				funcionario.setRegionPersonal(buscarRegion(paramInt));
				deplegarProvincias(paramInt);
				System.out.println("Ingrese id Provincia");
				paramInt = scInt.nextInt();
				funcionario.setIdProvinciaPersonal(paramInt);
				funcionario.setProvinciaPersonal(buscarProvincia(paramInt));
				deplegarComunas(paramInt);
				System.out.println("Ingrese id Comuna");
				paramInt = scInt.nextInt();
				funcionario.setIdComunaPersonal(paramInt);
				funcionario.setComunaPersonal(buscarComuna(paramInt));
				System.out.println("Ingrese Calle Personal");
				paramString = scString.nextLine();
				funcionario.setCallePersonal(paramString);
				System.out.println("Ingrese Numero casaPersonal");
				paramInt = scInt.nextInt();
				funcionario.setNumeroPersonal(paramInt);
			}
			listFuncionarios.add(funcionario);
			break;

		default:
			break;
		}
		
	}
	public boolean buscarDNI(String dni){	
			int cont =0;
			for (Academico academico : listAcademicos){
				if(academico.getDni().equals(dni)){
					listAcademicos.remove(cont);
					return true;
				}
			}
			cont=0;
			for (Alumno alumno : listAlumnos){
				if(alumno.getDni().equals(dni)){
					listAlumnos.remove(cont);
					return true;
				}
			}
			cont=0;
			for (Funcionario funcionario : listFuncionarios){
				if(funcionario.getDni().equals(dni)){
					listFuncionarios.remove(cont);
					return true;
				}
			}
			return false;
	}
	public void guardarConsolidado(){
		for (Academico academico : listAcademicos) {
			listConsolidado.add(academico.getAll());
		}
		for (Alumno alumno : listAlumnos) {
			listConsolidado.add(alumno.getAll());
		}
		for (Funcionario funcionario : listFuncionarios) {
			listConsolidado.add(funcionario.getAll());
		}
		FuenteDeDatos.escribirArchivo("Consolidado.csv", listConsolidado);
		
	}
	public void mostrar(){
		for (Academico academico : listAcademicos) {
			academico.toString();
		}
		for (Alumno alumno : listAlumnos) {
			alumno.toString();
		}
		for (Funcionario funcionario : listFuncionarios) {
			funcionario.toString();
		}
		FuenteDeDatos.escribirArchivo("Consolidado.csv", listConsolidado);
	}
	
}
