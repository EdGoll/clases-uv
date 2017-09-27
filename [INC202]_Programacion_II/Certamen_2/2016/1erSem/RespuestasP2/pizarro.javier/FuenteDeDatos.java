/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FuenteDeDatos {
	public static List<String> leer(String nombreArchivo) {
		File archivo = null; 
		FileReader fileReader = null;
		List<String> lineas = null;
		String linea;

		try {
			archivo = new File (nombreArchivo);
			fileReader = new FileReader (archivo);
			BufferedReader br = new BufferedReader (fileReader); 
			lineas = new ArrayList<String>();
			
			while((linea = br.readLine()) != null) {
				lineas.add(linea);
			}
		} catch (IOException e) { 
			System.out.println(e);
		}
		finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				} 
			} catch (IOException e) { 
				System.out.println(e);
			} 
		}
		return lineas;
	}
        public void escribirArchivo(String nombreArchivo, List<String> lineas) {
        FileWriter archivo = null;
        PrintWriter printWriter = null;
        try {
            archivo = new FileWriter(nombreArchivo, true);
            printWriter = new PrintWriter(archivo);
            for (String linea : lineas) {
                printWriter.println(linea);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            printWriter.close();
        }
    }
}


