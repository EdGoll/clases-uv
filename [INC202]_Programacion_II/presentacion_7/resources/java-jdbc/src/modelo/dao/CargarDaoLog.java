package modelo.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CargarDaoLog {

	public void cargarDatos() {
		File archivo = null;
		FileReader fileReader = null;
		BufferedReader br = null;
		String linea=null;
		String palabra=null;		
		try {
			archivo = new File("dataset-chilebank.csv");
			fileReader = new FileReader(archivo);
			br = new BufferedReader(fileReader);
			br.readLine();// elimino cabecera
			while ((linea = br.readLine()) != null) {
				// System.out.println(linea);
		        int numTokens = 0;
		        StringTokenizer st = new StringTokenizer (linea,";");	           
		        while (st.hasMoreTokens()) {
		        	palabra = st.nextToken();
		            numTokens++;
		            System.out.println ("    Palabra " + numTokens + " es: " + palabra);
		        }
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

	}

}
