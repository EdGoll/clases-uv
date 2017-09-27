// Héctor Toro Reinoso 19.268.713-6
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PersonasImp {
	private List<String> lineas;
	private List<Personas> listPersonas;
	private Personas persona;
	

	public PersonasImp(){
		cargarDatos();
	}

	private void cargarDatos(){
		BaseDatos f1 = new BaseDatos();
		listPersonas = new ArrayList<Personas>();
		lineas = new ArrayList<String>();
		lineas = f1.leerArchivo("data_set.csv");
		lineas.remove(0);
		
		StringTokenizer st;
		for (String linea : lineas){
			st = new StringTokenizer(linea,";");
			persona = new Personas();
			persona.setId(Integer.parseInt(st.nextToken()));
			persona.setApellido(st.nextToken());
			persona.setNombre(st.nextToken());
			persona.setFechNacim(st.nextToken());
			persona.setRut(st.nextToken());
			persona.setEstadoCivil(st.nextToken());
			persona.setNumHijos(Integer.parseInt(st.nextToken()));
			persona.setZona(st.nextToken());
			persona.setTelefono(Integer.parseInt(st.nextToken()));
			persona.setFacultad(st.nextToken());
			persona.setCargo(st.nextToken());
			persona.setSueldo(Integer.parseInt(st.nextToken()));
			persona.setFechComien(st.nextToken());
			
			listPersonas.add(persona);
			
		}
	}
	
	public void mostrarTodo() {
		try {
			for (Personas personas : listPersonas){
				System.out.println(personas.toString());
			}
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void buscarEntero(int parametro){	
			try {
				for (Personas personas : listPersonas){
					if(personas.getId()== parametro){
						System.out.println(personas.toString());
					}
					if(personas.getTelefono()== parametro){
						System.out.println(personas.toString());
					}
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}
	public void buscarString(String parametro){
		try {
			for (Personas personas : listPersonas){
				if(personas.getNombre().equals(parametro)){
					
					System.out.println(personas.toString());
				}
				if(personas.getApellido().equals(parametro)){
					System.out.println(personas.toString());
				}
				if(personas.getFechNacim().equals(parametro)){
					System.out.println(personas.toString());
				}
				if(personas.getRut().equals(parametro)){
					System.out.println(personas.toString());
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void contarEntero(int parametro){
		int cont=0;
		ArrayList<Integer> ids = new ArrayList<Integer>();
		for(Personas personas : listPersonas){
			if (personas.getNumHijos() == parametro){
				cont++;
				ids.add (personas.getId());
			}
			if (personas.getSueldo() == parametro){
				cont++;
				ids.add (personas.getId());
			}
		}
		System.out.println("Hay: "+cont);
		for(int i =0; i < ids.size();i++){
			buscarEntero(ids.get(i));
		}
	}
	public void contarString(String parametro){
		int cont=0;
		ArrayList<Integer> ids = new ArrayList<Integer>();
		for(Personas personas : listPersonas){
			if (personas.getEstCivil().equals(parametro)){
				cont++;
				ids.add (personas.getId());
			}
			if (personas.getZona().equals(parametro)){
				cont++;
				ids.add (personas.getId());
			}
			if (personas.getFacultad().equals(parametro)){
				cont++;
				ids.add (personas.getId());
			}
			if (personas.getCargo().equals(parametro)){
				cont++;
				ids.add (personas.getId());
			}
		}
		System.out.println("Hay: "+cont + "personas con este parametro");
		for(int i =0; i < ids.size();i++){
			buscarEntero(ids.get(i));
		}
	}
	public void eliminarEntero(int parametro){
		try {
			for (Personas personas : listPersonas){
				if(personas.getId()== parametro){
					listPersonas.remove(listPersonas.indexOf(personas));
				}
				if(personas.getTelefono()== parametro){
					listPersonas.remove(listPersonas.indexOf(personas));
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void eliminarString(String parametro){
		try {
			for (Personas personas : listPersonas){
				if(personas.getNombre().equals(parametro)){
					listPersonas.remove(listPersonas.indexOf(personas));
				}
				if(personas.getApellido().equals(parametro)){
					listPersonas.remove(listPersonas.indexOf(personas));
				}
				if(personas.getFechNacim().equals(parametro)){
					listPersonas.remove(listPersonas.indexOf(personas));
				}
				if(personas.getRut().equals(parametro)){
					listPersonas.remove(listPersonas.indexOf(personas));
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void agregar(){
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		String paramString;
		int paramInt;
		persona = new Personas();
		System.out.println("Ingrese ID");
		paramInt = scInt.nextInt();
		persona.setId(paramInt);
		
		System.out.println("Ingrese Apellido");
		paramString = scString.nextLine();
		persona.setApellido(paramString);
		
		System.out.println("Ingrese Nombre");
		paramString = scString.nextLine();
		persona.setNombre(paramString);
		
		System.out.println("Ingrese Fecha Nacimiento");
		paramString = scString.nextLine();
		persona.setFechNacim(paramString);
		
		System.out.println("Ingrese Rut");
		paramString = scString.nextLine();
		persona.setRut(paramString);
		
		System.out.println("Ingrese Estado Civil");
		paramString = scString.nextLine();
		persona.setEstadoCivil(paramString);
		
		System.out.println("Ingrese Numero de Hijos");
		paramInt = scInt.nextInt();
		persona.setNumHijos(paramInt);
		
		System.out.println("Ingrese Zona");
		paramString = scString.nextLine();
		persona.setZona(paramString);
		
		System.out.println("Ingrese Telefono");
		paramInt = scInt.nextInt();
		persona.setTelefono(paramInt);
		
		System.out.println("Ingrese Facultad");
		paramString = scString.nextLine();
		persona.setFacultad(paramString);
		
		System.out.println("Ingrese Cargo");
		paramString = scString.nextLine();
		persona.setCargo(paramString);
		
		System.out.println("Ingrese Sueldo");
		paramInt = scInt.nextInt();
		persona.setSueldo(paramInt);
		
		System.out.println("Ingrese Fecha comienzo");
		paramString = scString.nextLine();
		persona.setFechComien(paramString);
		
		listPersonas.add(persona);
		
	}
	public void escribir(String nombre){
		BaseDatos f2 = new BaseDatos();
		List<String> lineas = new ArrayList<String>();
		for (Personas personas : listPersonas){
			lineas.add(personas.getId() + ";" + personas.getApellido() + ";" + personas.getNombre() + ";"+ personas.getFechNacim() + ";" + personas.getRut() + ";" + personas.getEstCivil() + ";" + personas.getNumHijos() + ";" + personas.getZona() + ";" + personas.getTelefono() + ";" + personas.getFacultad() + ";" + personas.getCargo() + ";" + personas.getSueldo()+";"+personas.getFechComien());
		}
		f2.escribirArchivo(nombre, lineas);
		
	}
}
