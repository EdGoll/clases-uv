package controlador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import modelo.Persona;
import modelo.PersonaDAO;
import modelo.PersonaDAOInterface;
import modelo.PersonaDAOJdbc;

public class GestionDeudores {

	private List<Persona> listaPersona = new ArrayList<Persona>();
//	private PersonaDAO dao = new PersonaDAO();
//	private PersonaDAOJdbc daoJdbc = new PersonaDAOJdbc();

	private PersonaDAOInterface dao = new PersonaDAOJdbc();
	
	//private PersonaDAOInterface dao = new PersonaDAO();
	public List<Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}

	public GestionDeudores() {
		this.llenarListaPersona();
	}
	
	private void llenarListaPersona() {
		//listaPersona= dao.personas();
		listaPersona= dao.personas();
	}
	
	public Persona crear(Persona p) {
		p = dao.crearPersona(p);
		//dao.grabar();
		return p;
	}
	
	public boolean eliminar(int  id) {
		System.out.println(id);
		Persona p = this.buscar(id);
		boolean resp = false;
		if(p!=null) {
			dao.eliminarPersona(p);
			//resp = dao.grabar();
		}
		return resp;
	}
	
	public Persona actualizar(Persona p) {
		dao.actualizarPersona(p);
		//dao.grabar();
		return p;
	}
	
	public Persona buscar(int idPersona) {
		System.out.println("llego aqui");
		Persona p = dao.buscarPersona(idPersona);
		return p;
	}
	
	public void getDeudores() {
		int cont = 0;
		for (Persona p : listaPersona) {
			if (!p.getEstadoActual().equalsIgnoreCase("SIN DEUDA")) {
				cont++;
			}
		}
		System.out.println("Existen " + cont + "deudores");
	}

	public void escribirDeudores() {
		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("deudores.csv", true);
			pw = new PrintWriter(fichero);
			for (Persona p : listaPersona) {
				if (!p.getEstadoActual().equalsIgnoreCase("SIN DEUDA")) {
					pw.println(p.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (null != fichero)
					fichero.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void getPersonaSinDeuda() {
		int cont = 0;
		for (Persona p : listaPersona) {
			if (p.getEdad() > 30 && p.getActividad().equalsIgnoreCase("DEPENDIENTE")
					&& p.getNivelEduc().equalsIgnoreCase("EDUC. UNIVERSITARIA")) {
				cont++;
			}
		}
		System.out.println("Existen " + cont + " Personas Mayores de 30, Dependientes y con Educ Universitaria");
	}

	public void escribirPersonaSinDeuda() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		String linea;
		File archivo = null;
		BufferedReader br = null;
		FileReader fileReader = null;
		try {
			archivo = new File("dataset-chilebank.csv");
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			fichero = new FileWriter("sindeuda.csv", true);
			pw = new PrintWriter(fichero);
			for (Persona p : listaPersona) {
				if (p.getEdad() > 30 && p.getActividad().equalsIgnoreCase("DEPENDIENTE")
						&& p.getNivelEduc().equalsIgnoreCase("EDUC. UNIVERSITARIA")) {
					pw.println(p.toString());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				if (null != fichero)
					fichero.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	
//	
//	public void getDeudores() {
//		int cont=0;
//		File archivo = null;
//		FileReader fileReader = null;
//		BufferedReader br = null;
//		try{
//			archivo = new File("dataset-chilebank.csv");
//			String linea;
//			fileReader = new FileReader(archivo);
//			br = new BufferedReader(fileReader);
//			br.readLine();//elimino cabecera
//			while((linea = br.readLine())!=null){
//				String [] registro = linea.split(";");
//				if(!registro[12].equalsIgnoreCase("SIN DEUDA")) {
//					cont++;
//				}
//			}
//		}catch(IOException ex){
//		}
//		finally{
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	System.out.println(cont);
//}
//
//public void escribirDeudores() {
//        FileWriter fichero = null;
//        PrintWriter pw = null;
//		String linea;
//		File archivo = null;
//		BufferedReader br = null;
//		FileReader fileReader = null;
//        try
//        {
//			archivo = new File("dataset-chilebank.csv");
//			fileReader = new FileReader(archivo);
//			br = new BufferedReader(fileReader);
//            fichero = new FileWriter("deudores.csv",true);
//            pw = new PrintWriter(fichero);
//            br.readLine();//elimino cabecera
//			while((linea = br.readLine())!=null){
//				String [] registro = linea.split(";");
//				if(!registro[12].equalsIgnoreCase("SIN DEUDA")) {
//					pw.println(linea);
//				}
//			}
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//           try {
//        	   br.close();
//           if (null != fichero)
//              fichero.close();
//           
//           } catch (Exception e2) {
//              e2.printStackTrace();
//           }
//        }
//    		
//}
//
//public void getPersonaSinDeuda() {
//	int cont=0;
//	File archivo = null;
//	FileReader fileReader = null;
//	BufferedReader br = null;
//	try{
//		archivo = new File("dataset-chilebank.csv");
//		String linea;
//		fileReader = new FileReader(archivo);
//		br = new BufferedReader(fileReader);
//		br.readLine();//elimino cabecera
//		while((linea = br.readLine())!=null){
//			String [] registro = linea.split(";");
//			if(Integer.valueOf(registro[1])>30 &&
//			   registro[3].equalsIgnoreCase("DEPENDIENTE") &&
//			   registro[2].equalsIgnoreCase("EDUC. UNIVERSITARIA")) {
//				cont++;
//			}
//		}
//	}catch(IOException ex){
//	}
//	finally{
//		try {
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//System.out.println("Existen "+cont+"Personas Mayores de 30, Dependientes y con Educ Universitaria");
//	
//}
//
//public void escribirPersonaSinDeuda() {
//    FileWriter fichero = null;
//    PrintWriter pw = null;
//	String linea;
//	File archivo = null;
//	BufferedReader br = null;
//	FileReader fileReader = null;
//    try
//    {
//		archivo = new File("dataset-chilebank.csv");
//		fileReader = new FileReader(archivo);
//		br = new BufferedReader(fileReader);
//        fichero = new FileWriter("sindeuda.csv",true);
//        pw = new PrintWriter(fichero);
//        br.readLine();//elimino cabecera
//		while((linea = br.readLine())!=null){
//			String [] registro = linea.split(";");
//			if(Integer.valueOf(registro[1])>30 &&
//			   registro[3].equalsIgnoreCase("DEPENDIENTE") &&
//			   registro[2].equalsIgnoreCase("EDUC. UNIVERSITARIA")) {
//				pw.println(linea);
//			}
//		}
//		
//
//    } catch (Exception e) {
//        e.printStackTrace();
//    } finally {
//       try {
//    	   br.close();
//       if (null != fichero)
//          fichero.close();
//       
//       } catch (Exception e2) {
//          e2.printStackTrace();
//       }
//    }		
//}

}
