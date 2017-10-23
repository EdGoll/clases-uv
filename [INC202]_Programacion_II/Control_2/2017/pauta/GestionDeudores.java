import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GestionDeudores {

	private List<Persona> listaPersona = new ArrayList<Persona>();

	public List<Persona> getListaPersona() {
		return listaPersona;
	}

	public void setListaPersona(List<Persona> listaPersona) {
		this.listaPersona = listaPersona;
	}

	public GestionDeudores() {

	}

	public void getDeudores() {
		int cont = 0;
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
				String[] registro = linea.split(";");
				if (!registro[12].equalsIgnoreCase("SIN DEUDA")) {
					cont++;
				}
			}
		} catch (IOException ex) {
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(cont);
	}

	public void escribirDeudores() {
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
			fichero = new FileWriter("deudores.csv", true);
			pw = new PrintWriter(fichero);
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {
				String[] registro = linea.split(";");
				if (!registro[12].equalsIgnoreCase("SIN DEUDA")) {
					pw.println(linea);
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

	public void getPersonaSinDeuda() {
		int cont = 0;
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
				String[] registro = linea.split(";");
				if (Integer.valueOf(registro[1]) > 30
						&& registro[3].equalsIgnoreCase("DEPENDIENTE")
						&& registro[2].equalsIgnoreCase("EDUC. UNIVERSITARIA")) {
					cont++;
				}
			}
		} catch (IOException ex) {
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out
				.println("Existen "
						+ cont
						+ "Personas Mayores de 30, Dependientes y con Educ Universitaria");

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
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {
				String[] registro = linea.split(";");
				if (Integer.valueOf(registro[1]) > 30
						&& registro[3].equalsIgnoreCase("DEPENDIENTE")
						&& registro[2].equalsIgnoreCase("EDUC. UNIVERSITARIA")) {
					pw.println(linea);
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

}
