
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FuenteDeDatos {

    public static List<String> leerArchivo(String nombreArchivo) {
        File archivo = null;
        FileReader fileReader = null;
        List<String> lineas = null;

        try {
            archivo = new File(nombreArchivo);
            lineas = new ArrayList<String>();
            String linea;
            fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((linea = bufferedReader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
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

    public static void escribirArchivo(String nombreArchivo, List<String> lineas) {
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
