import java.util.StringTokenizer;
import java.util.NoSuchElementException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Registro{
	
	private List<String> lineas;
	private List<Region> regiones;
	private List<Provincia> provincias;
	private List<Comuna> comunas;
	private StringTokenizer st; 

	public Registro(){
		cargarRegiones();
		cargarProvincias();
		cargarComunas();
		crearRegistro();
	}

	private void cargarRegiones(){
		lineas=FuenteDatos.leerArchivo("Region.csv");
		regiones = new ArrayList<Region>();
		Region r = null;

		for (String linea:lineas){
			st=new StringTokenizer(linea,";");
			if (st.hasMoreElements()){
				r = new Region();
				r.setidRegion(st.nextToken());
				r.setNombreRegion(st.nextToken());
				r.setNumeroRomano(st.nextToken());
				r.setOrdenGeograficoRegion(st.nextToken());
				regiones.add(r);
			} //fin if
		}//fin for-each
	}

	private void cargarProvincias(){
		lineas=FuenteDatos.leerArchivo("Provincia.csv");
		provincias = new ArrayList<Provincia>();
		Provincia pr = null;

		for (String linea:lineas){
			st = new StringTokenizer(linea,";");
			if (st.hasMoreElements()){
				pr = new Provincia();
				pr.setidProvincia(st.nextToken());
				pr.setNombreProvincia(st.nextToken());
				pr.setidRegion(st.nextToken());
				provincias.add(pr);
			}
		}
	}

	private void cargarComunas(){
		lineas=FuenteDatos.leerArchivo("Comuna.csv");
		comunas = new ArrayList<Comuna>();
		Comuna co = null;

		for (String linea:lineas){
			st = new StringTokenizer(linea,";");
			if (st.hasMoreElements()){
				co = new Comuna();
				co.setidComuna(st.nextToken());
				co.setNombreComuna(st.nextToken());
				co.setidProvincia(st.nextToken());
				
				comunas.add(co);
			}//fin if
		}// fin for
	} // fin metodo

	private void crearRegistro(){
		Scanner scan = new Scanner(System.in);
		String nombre = "";
		String apellidos = "";
		String dni = "";
		String edad = "";
		String calle = "";
		String numero = "";
		int region = 0;
		int provincia = 0;
		int comuna = 0;
		String nombrecomuna;
		String asignaturas = "";
		String horarioAtencion = "";
		String horarioLaboral = "";
		char answer='1';
		char tipo='0';
		int resp=0;

		lineas = new ArrayList <String>();

		System.out.println("***** Agregar registro *****");
		System.out.println("Presione Ctrl+C para salir sin guardar");
		System.out.println();
		System.out.println("Tipo Registro: ");
		System.out.println("1: Alumno ");
		System.out.println("2: Academico ");
		System.out.println("3: Funcionario ");
		System.out.printf("Respuesta: ");
		try{
		tipo=scan.next().charAt(0);}
		catch(Exception e){tipo='0';}
		while (tipo!='1' && tipo!='2' && tipo!='3'){ //validar entrada usuario
		System.out.println("Opcion invalida, reintente:");
		try{
		tipo=scan.next().charAt(0);}
		catch(Exception e){
		tipo='0';}
		}//fin while validar
		scan.nextLine();
		//Scaneo datos usuario
		System.out.println("Ingrese DNI");
		try{dni=scan.nextLine();		}
		catch(Exception e){}
		System.out.println("Ingrese Nombre");
		try{nombre=scan.nextLine();		}
		catch(Exception e){}
		System.out.println("Ingrese Apellidos");
		try{apellidos=scan.nextLine();		}
		catch(Exception e){}
		System.out.println("Ingrese Edad");
		try{edad=scan.nextLine();		}
		catch(Exception e){}

		//dir: Direccion personal, dir2: direccion laboral
		Direccion dir = new Direccion();
		Direccion dir2 = new Direccion();
		System.out.println("--Ingrese Direccion Personal:--");
		System.out.println("Calle");
		try{calle=scan.nextLine();		}
		catch(Exception e){}
		dir.setCalle(calle);
		System.out.println("Numero");
		try{numero=scan.nextLine();		}
		catch(Exception e){}
		dir.setNumero(numero);
		System.out.println("Region:");
        for (Region r : regiones) {
            System.out.println(r.getidRegion()+" - "+r.getNombreRegion());}        
        System.out.printf("Respuesta: ");
        try{region=scan.nextInt();}
		catch(Exception e){}
		scan.nextLine();
		System.out.println();
		System.out.println("Provincia:");
		for (Provincia pro : provincias) {
            if(region==Integer.valueOf(pro.getidRegion()))
            	System.out.println(pro.getidProvincia()+" - "+pro.getNombreProvincia()); }
        System.out.printf("Respuesta: ");
        try{provincia=scan.nextInt();}
		catch(Exception e){}
		scan.nextLine();
		System.out.println("Comuna:");
		for (Comuna comu : comunas){
			if (provincia==Integer.valueOf(comu.getidProvincia()))
				System.out.println(comu.getidComuna()+" - "+comu.getNombreComuna());}
		System.out.printf("Respuesta: ");
        try{comuna=scan.nextInt();}
		catch(Exception e){}
		scan.nextLine();
		for (Comuna comu : comunas){
			if (comuna==Integer.valueOf(comu.getidComuna()))
				dir.setComuna(comu.getNombreComuna());}

		System.out.println("Desea ingresar direccion laboral? Si:1 / No: Cualquier tecla");
		try{resp=scan.nextInt();}
		catch(Exception e){}
		scan.nextLine();
		if (resp==1){
		System.out.println("--Ingrese Direccion Laboral:--");
		System.out.println("Calle");
		try{calle=scan.nextLine();		}
		catch(Exception e){}
		dir2.setCalle(calle);
		System.out.println("Numero");
		try{numero=scan.nextLine();		}
		catch(Exception e){}
		dir2.setNumero(numero);
		System.out.println("Region:");
        for (Region r : regiones) {
            System.out.println(r.getidRegion()+" - "+r.getNombreRegion());}        
        System.out.printf("Respuesta: ");
        try{region=scan.nextInt();}
		catch(Exception e){}
		scan.nextLine();
		System.out.println();
		System.out.println("Provincia:");
		for (Provincia pro : provincias) {
            if(region==Integer.valueOf(pro.getidRegion()))
            	System.out.println(pro.getidProvincia()+" - "+pro.getNombreProvincia());
        }
        System.out.printf("Respuesta: ");
        try{provincia=scan.nextInt();}
		catch(Exception e){}
		scan.nextLine();

		System.out.println("Comuna:");
		for (Comuna comu : comunas){
			if (provincia==Integer.valueOf(comu.getidProvincia()))
				System.out.println(comu.getidComuna()+" - "+comu.getNombreComuna());
		}
		System.out.printf("Respuesta: ");
        try{comuna=scan.nextInt();}
		catch(Exception e){}
		scan.nextLine();

		for (Comuna comu : comunas){
			if (comuna==Integer.valueOf(comu.getidComuna()))
				dir2.setComuna(comu.getNombreComuna());}
		}//Fin if para ingresar direccion laboral
		// fin direccion 

		//ingreso atributos especificos a clases hijas de Persona:
		if(tipo=='1'){
		System.out.println("Ingrese Asignaturas (separadas por comas) :");
		try{asignaturas=scan.nextLine();		}
		catch(Exception e){}
		Alumno al = new Alumno(dni, nombre, apellidos, edad, asignaturas);	
		al.setDireccionPer(dir.toString());
		if (resp==1){
			al.setDireccionLab(dir2.toString());
		}else{al.setDireccionLab(" No disponible");}
		lineas.add(al.toString());
		}//fin agregar alumno

		if(tipo=='2'){
		System.out.println("Ingrese Horario de Atencion: ");
		try{horarioAtencion=scan.nextLine();		}
		catch(Exception e){}
		Academico ac = new Academico(dni, nombre, apellidos, edad, horarioAtencion);
		ac.setDireccionPer(dir.toString());
		if (resp==1){
			ac.setDireccionLab(dir2.toString());
		}else{ac.setDireccionLab(" No disponible");}
		lineas.add(ac.toString());
		}//fin agregar Academico

		if(tipo=='3'){
		System.out.println("Ingrese Horario Laboral");
		try{horarioLaboral=scan.nextLine();		}
		catch(Exception e){}
		Funcionario fn = new Funcionario(dni, nombre, apellidos, edad, horarioLaboral);	
		fn.setDireccionPer(dir.toString());
		if (resp==1){
			fn.setDireccionLab(dir2.toString());
		}else{fn.setDireccionLab(" No disponible");}
		lineas.add(fn.toString());
		}//fin agregar Funcionario

		FuenteDatos.escribirArchivo("RegistroEscuela.txt",lineas);

		System.out.println("Los datos se guardaron correctamente en 'RegistroEscuela.txt'");
		System.out.println("Vuelva a ejecutar el programa para agregar un nuevo registro");
		
	}// fin clase crear registro

}