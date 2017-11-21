package modelo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO implements PersonaDAOInterface {
	private static final String CABECERA_FILE = "id;EDAD;NIVEL EDUCACIONAL;ACTIVIDAD;RENTA FIJA;LIMITE MAXIMO CREDITO;DEUDA ACTUAL;PORCENTAJE DE USO DEL CREDITO;NUMERO DE COMPRAS EN MES ACTUAL (T);NUMERO DE COMPRAS EN MES T-1;NUMERO DE COMPRAS EN MES T-2;NUMERO DE COMPRAS EN MES T-3;ESTADO ACTUAL;CANTIDAD HISTORICA DE ATRASOS EN PAGO DE CUENTAS;COMPRA";
	List<Persona> listaPersona = new ArrayList<Persona>();

	public Persona crearPersona(Persona p) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		String linea;
		File archivo = null;
		BufferedReader br = null;
		FileReader fileReader = null;
		int id=0;
		try {
			archivo = new File("dataset-chilebank.csv");
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			fichero = new FileWriter("ds-aux.csv", true);
			pw = new PrintWriter(fichero);
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {
				String[] registro = linea.split(";");
				id = Integer.valueOf(registro[0]);
				pw.println(linea);
			}
			p.setId(++id);
			pw.println(p.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		this.grabar();
		return p;
	}
	
	public void eliminarPersona(Persona p) {
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
			fichero = new FileWriter("ds-aux.csv",true);
			pw = new PrintWriter(fichero);
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {				
					String[] registro = linea.split(";");
					int id = Integer.valueOf(registro[0]);
					if (id == p.getId()) {
						linea = "null";
					}
				if (!linea.equalsIgnoreCase("null")) {
					pw.write(linea+'\n');
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
				fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		this.grabar();
	}
	
	public void actualizarPersona(Persona p) {
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
			fichero = new FileWriter("ds-aux.csv",true);
			pw = new PrintWriter(fichero);
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {
				//if (linea != null && !linea.equalsIgnoreCase("")) {
					String[] registro = linea.split(";");
					int id = Integer.valueOf(registro[0]);
					if (id == p.getId()) {
						linea = p.toString();
					}
					pw.write(linea);
			//	}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				pw.close();
				fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		this.grabar();
	}
	
	public Persona buscarPersona(int idPersona) {
		String linea;
		File archivo = null;
		BufferedReader br = null;
		FileReader fileReader = null;
		Persona p=null;
		try {
			archivo = new File("dataset-chilebank.csv");
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {
				if (linea != null && !linea.equalsIgnoreCase("")) {
					String[] registro = linea.split(";");
					int id = Integer.valueOf(registro[0]);
					if(id==idPersona) {
						p = new Persona(Integer.parseInt(registro[0]), Integer.parseInt(registro[1]), registro[2], registro[3],
							Integer.parseInt(registro[4]), Integer.parseInt(registro[5]), Integer.parseInt(registro[6]),
							Double.parseDouble(registro[7]), Integer.parseInt(registro[8]), Integer.parseInt(registro[9]),
							Integer.parseInt(registro[10]), Integer.parseInt(registro[11]), registro[12],
							Integer.parseInt(registro[13]), registro[14]);
						break;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}		
		return p;
	}
	
	public List<Persona> personas(){
		//List<Persona> listaPersona = new ArrayList<Persona>();
		Persona p = null;
		File archivo = null;
		FileReader fileReader = null;
		BufferedReader br = null;
		try {
			archivo = new File("dataset-chilebank.csv");
			String linea;
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {
				// System.out.println(linea);
				String[] registro = linea.split(";");
				p = new Persona(Integer.parseInt(registro[0]), Integer.parseInt(registro[1]), registro[2], registro[3],
						Integer.parseInt(registro[4]), Integer.parseInt(registro[5]), Integer.parseInt(registro[6]),
						Double.parseDouble(registro[7]), Integer.parseInt(registro[8]), Integer.parseInt(registro[9]),
						Integer.parseInt(registro[10]), Integer.parseInt(registro[11]), registro[12],
						Integer.parseInt(registro[13]), registro[14]);
				listaPersona.add(p);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return listaPersona;
	}
	
	
	public boolean grabar() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		String linea;
		File archivo = null;
		BufferedReader br = null;
		FileReader fileReader = null;
		
		try {
			fichero = new FileWriter("dataset-chilebank.csv");
			pw = new PrintWriter(fichero);
			pw.write("");
			pw.close();
			fichero.close();
			
			archivo = new File("ds-aux.csv");
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			fichero = new FileWriter("dataset-chilebank.csv",true);
			pw = new PrintWriter(fichero);
			//br.readLine();// elimino cabecera
			pw.write(CABECERA_FILE+'\n');
			while ((linea = br.readLine()) != null) {
				//if (linea != null && !linea.equalsIgnoreCase("")) {
					pw.write(linea+'\n');
			//	}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				br.close();
				pw.close();
				fichero.close();
				fichero = new FileWriter("ds-aux.csv");
				pw = new PrintWriter(fichero);
				pw.write("");
				fichero.close();
				pw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
		return true;
	}
	
}
