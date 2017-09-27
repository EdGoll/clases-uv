import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Registro{
	private List<String> lineas;
	private List<Academico> academicos= new ArrayList<>();
	private List<Alumno> alumnos= new ArrayList<>();
	private List<Funcionario> funcionarios= new ArrayList<>();
	private List<Region> regiones= new ArrayList<>();
	private List<Provincia> provincias= new ArrayList<>();
	private List<Comuna> comunas= new ArrayList<>();
	private StringTokenizer st;

	 public Registro(){
	 	cargarRegiones();
	 	cargarProvincias();
	 	cargarComunas();
	 	llenarListas();
	 }

	 private void cargarRegiones(){
	 	Region r= null;
	 	lineas= FuenteDatos.leerArchivo("Region.csv");
 		for(String linea:lineas){
	 		st= new StringTokenizer(linea,";");
	 		if(st.hasMoreElements()){
	 			r= new Region();
	 			r.setIdRegion(st.nextToken());
	 			r.setNombreRegion(st.nextToken());
	 			r.setNumeroRomano(st.nextToken());
	 			r.setOrdenGeograficoRegion(st.nextToken());
	 			regiones.add(r);
	 		}
	 	}
	 }
	 private void cargarProvincias(){
	 	Provincia p= null;
	 	lineas= FuenteDatos.leerArchivo("Provincia.csv");
	 	for(String linea:lineas){
	 		st= new StringTokenizer(linea,";");
	 		if(st.hasMoreElements()){
	 			p= new Provincia();
	 			p.setIdProvincia(st.nextToken());
	 			p.setNombreProvincia(st.nextToken());
	 			p.setIdRegion(st.nextToken());
	 			provincias.add(p);
	 		}
	 	}
	 }
	 private void cargarComunas(){
	 	Comuna c= null;
	 	lineas= FuenteDatos.leerArchivo("Comuna.csv");
	 	for(String linea:lineas){
	 		st= new StringTokenizer(linea,";");
	 		if(st.hasMoreElements()){
	 			c= new Comuna();
	 			c.setIdComuna(st.nextToken());
	 			c.setNombreComuna(st.nextToken());
	 			c.setIdProvincia(st.nextToken());
	 			comunas.add(c); 
	 		}
	 	}
	 }
	 private void llenarListas(){
		String dni="";
		String nombre="";
		String apellido="";
		String edad="";
		String horaAtencion="";
		String asignaturas="";
		String horaLaboral="";
		
		int ingresarMas=0;
	 	boolean contr=false;
	 	int tipo=0;
	 	Scanner s= new Scanner(System.in);
		do{
			try{
				System.out.println("");
				System.out.println("Ingrese DNI");
				dni= s.nextLine();
				System.out.println("Ingrese nombre");
				nombre= s.nextLine();
				System.out.println("Ingrese apellido");
				apellido= s.nextLine();
				System.out.println("Ingrese edad");
				edad= s.nextLine();
			}catch(Exception e){
				System.out.println("Ingrese valores validos");
			}

			String direccion2="";
			String direccion1=pedirDireccion();
			int resp=0;
			do{
				contr=false;
				System.out.println("Desea ingresar direccion labora, 1)Si/2)No");
				try{
					resp= s.nextInt();
				}catch(Exception e){
					System.out.println("Debe ingresar una opcion valida");
				}
				if(resp != 1 && resp != 2)
					System.out.println("Debe ingresar una opcion valida");
				else
					if(resp==1)
						direccion2=pedirDireccion();
					contr=true;
			}while(!contr);

			do{
				contr=false;
				System.out.println("Ingrese el tipo de persona:");
				System.out.println("1)Academico 2)Alumno 3)Funcionario");
				try{
					tipo=s.nextInt();
				}catch(Exception e){
	 			System.out.println("Error");
				}
				if(tipo<1 || tipo>3)
					System.out.println("Debe ingrese un valor entre 1 y 3");
				else
					contr=true;
				}while(!contr);
			Scanner sc=new Scanner(System.in);
			if(tipo==1){
				Academico a=null;
				try{
					System.out.println("Ingrese hora de atencion");
					horaAtencion= sc.nextLine();
				}catch(Exception e){
					System.out.println("Ingrese un valor valido");
				}
				if(resp==2){
					a= new Academico(dni,nombre,apellido,edad,direccion1,horaAtencion);
				}
				else if(resp==1){
					a= new Academico(dni,nombre,apellido,edad,direccion1,direccion2,horaAtencion);
				}
				academicos.add(a);
			}
			else if(tipo==2){
				Alumno al=null;
				try{
					System.out.println("Ingrese asignatura(s)");
					asignaturas= sc.nextLine();
				}catch(Exception e){
	 			System.out.println("Ingrese un valor valido");
				}
				if(resp==2){
					al=new Alumno(dni,nombre,apellido,edad,direccion1,asignaturas);
				}
				else if(resp==1){
					al=new Alumno(dni,nombre,apellido,edad,direccion1,direccion2,asignaturas);
				}
				alumnos.add(al);
			}
			else if(tipo==3){
				Funcionario f=null;
				try{
					System.out.println("Ingrese hhorario laboral");
					horaLaboral= sc.nextLine();
				}catch(Exception e){
	 			System.out.println("Ingrese un valor valido");
				}
				if(resp==2){
					f= new Funcionario(dni,nombre,apellido,edad,direccion1,horaLaboral);
				}
				else if(resp==1){
					f= new Funcionario(dni,nombre,apellido,edad,direccion1,direccion2,horaLaboral);
				}
				funcionarios.add(f);
	 	}
			do{
				contr=false;
				System.out.println("Desea ingresar otra persna 1)Si/2)No");
				try{
						ingresarMas=s.nextInt();
				}catch(Exception e){}
				if(ingresarMas!=1 && ingresarMas!=2)
					System.out.println("Debe ingresar una opcion valida");
				else
					contr=true;
			}while(!contr);
		}while(ingresarMas==1);
	
	 	lineas= new ArrayList<>();
	 	for(Academico a:academicos){
	 		lineas.add(a.toString());
	 	}
	 	for(Alumno al:alumnos){
	 		lineas.add(al.toString());
	 	}
	 	for(Funcionario f:funcionarios){
	 		lineas.add(f.toString());
	 	}
	 	FuenteDatos.escribirArchivo("Registro.txt", lineas);
	 }
	
	 private String pedirDireccion(){
	 		Scanner s= new Scanner(System.in);
	 		String id="";
	 		String calle="";
			String numero="";
	 		try{
	 			System.out.println("Ingrese nombre de la calle:");
	 			calle= s.nextLine();
	 			System.out.println("Ingrese numero");
	 			numero= s.nextLine();
	 		}catch(Exception e){
	 			System.out.println("Error al ingresar direccion");
	 		}
	 		System.out.println("Regiones");
	 		for(Region r:regiones){
	 			System.out.println(r);
	 		}
	 		System.out.println("Ingrese id de region");
	 		try{
	 			id= s.nextLine();
	 		}catch(Exception e){
	 			System.out.println("ERROR");
	 		}
	 		System.out.println("");
	 		System.out.println("provincias");
	 		for(Provincia p:provincias){
	 			if(id.equals(p.getIdRegion())){
	 				System.out.println(p);
				}
	 		}
	 		System.out.println("Ingrese id comuna");
	 		try{
	 			id= s.nextLine();
	 		}catch(Exception e){}
	 		System.out.println("");
	 		System.out.println("comunas");
	 		for(Comuna c:comunas){
	 			if(id.equals(c.getIdProvincia())){
	 				System.out.println(c);
				}
	 		}
	 		System.out.println("Ingrese id de comuna");
	 		id= s.nextLine();
	 		String comuna= (comunas.get(Integer.valueOf(id))).getNombreComuna();
	 		Direccion d=null;
	 		d= new Direccion(calle,numero,comuna);
	 		return d.toString();
	 }
 }

