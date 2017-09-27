import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GestionPatentes {
	private List<Comercios> listComercios;
	private List<Patente> listPatentes;
	private List<String> lineas;
	
	public GestionPatentes(){
		cargarDatos();
	}
	
	private void cargarDatos(){
		FuenteDeDatos f1 = new FuenteDeDatos();
		lineas = new ArrayList<String>();
		listComercios= new ArrayList<Comercios>();
		listPatentes = new ArrayList<Patente>();
		

		lineas = f1.leerArchivo("maestro-enero-2016.csv");
		lineas.remove(0);
		for(String linea : lineas){
			Comercios negocio = new Comercios();
			Patente patente = new Patente();
			StringTokenizer st = new StringTokenizer(linea, ";");
			patente.setRolPat(st.nextToken(), st.nextToken());
			String tempRut = st.nextToken();
			String tempDv = st.nextToken();
			negocio.setRut(tempRut, tempDv);
			patente.setRutPropietario(tempRut + "-" + tempDv);
			negocio.setNombre(st.nextToken());
			negocio.setCalle(st.nextToken());
			negocio.setNumero(Integer.parseInt(st.nextToken()));
			patente.setaClara(st.nextToken());
			patente.setPatTipo(st.nextToken());
			negocio.setInicioAct(st.nextToken());
			negocio.setCasaMatriz(st.nextToken());
			negocio.setGiro(st.nextToken());
			patente.setProvisoria(st.nextToken());
			patente.setIngProvisorio(st.nextToken());
			patente.setVencimiento(st.nextToken());
			patente.setEstadoLic(st.nextToken());
			negocio.setCodSii(st.nextToken());
			negocio.setActSii(st.nextToken());
			patente.setMontoPat(Integer.parseInt(st.nextToken()));
			patente.setEstadoPago(st.nextToken());
			
			listComercios.add(negocio);
			listPatentes.add(patente);
		}
	}
	private String obtenerInfoPatentes(String rutBuscar,Boolean mostrarTodo){
		for(Patente pat : listPatentes){
			if(pat.getRutPropietario().equals(rutBuscar)){
				if(mostrarTodo){
					return pat.toString();
				}else{
					return pat.getEstadoLic();
				}
				
			}
		}
		return "";
	}
	private String obtenerInfoPersonas(String rutBuscar){
		for(Comercios com : listComercios){
			if(com.getRut().equals(rutBuscar)){
				return com.toString();
			}
		}
		return "";
	}
	
	public void BuscarRut(){
		Scanner sc = new Scanner(System.in);
		String rutBuscar;
		try{
			System.out.println("INGRESE UN RUT:");
			rutBuscar = sc.nextLine();
			for(Comercios com : listComercios){
				if(com.getRut().equals(rutBuscar)){
					System.out.println("DATOS USUARIO:");
					System.out.println(com.toString());
					System.out.println("ESTADO PATENTE: " + obtenerInfoPatentes(rutBuscar,false));
				}
			}
		}catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public void nroPatentes(){
		int numPatProv=0;
		int numPatDefi=0;
		for(Patente pat : listPatentes){
			if(pat.getProvisoria().equals("PROVISORIA")){
				numPatProv++;
			}
			if(pat.getProvisoria().equals("DEFINITIVA")){
				numPatDefi++;
			}
		}
		System.out.println("NRO PATENTES PROVISORIAS: " + numPatProv);
		System.out.println("NRO PATENTES DEFINITIVAS: " + numPatDefi);
	}
	
	public void listarPatentesBloq(){
		System.out.println("-LISTA PERSONAS CON PAGO BLOQUEADO-");
		for(Patente pat : listPatentes){
			if(pat.getEstadoPago().equals("BLOQUEADO")){
				System.out.println(obtenerInfoPersonas(pat.getRutPropietario()));
			}
		}
	}
	
	public void listar10PatMasCaras(){
		Collections.sort(listPatentes);	
		for(int i=0; i<10;i++){
			System.out.println(listPatentes.get(i).toString());
		}
	}
	
	public void GuardarListaPatente(String ubicacion, String año){
		ArrayList<String> patentes = new ArrayList<String>();
		FuenteDeDatos f1 = new FuenteDeDatos();
		for(Comercios pt : listComercios){
			String val = pt.getInicioAct().substring(6, pt.getInicioAct().length());
			if(val.equals(año)){
				patentes.add(obtenerInfoPatentes(pt.getRut(),true));
			}
		}
		f1.escribirArchivo(ubicacion, patentes);
		
		System.out.println("-ARCHIVO GUARDADO CORRECTAMENTE-");
	}
	
}
