import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FuenteDeDatos {

    public static List<String> leerArchivo(String nombreArchivo) {
        File file = null;
        FileReader fileReader = null;
        String linea = null;
        List<String> lineas = null;

        try {
            file = new File(nombreArchivo);
            fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            lineas = new ArrayList<>();
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException ex) {
            System.out.println(ex.getCause());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch(IOException ex) {
                    System.out.println(ex.getCause());
                }
            }
        }
        return lineas;
    }

    public static void escribirArchivo(String nombreArchivo, List<String> lineas, boolean opcion) {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        
        try {
            fileWriter = new FileWriter(nombreArchivo, opcion);
            printWriter = new PrintWriter(fileWriter);
            
            for (String linea : lineas) {
                printWriter.println(linea);
            }
        } catch(IOException ex) {
            System.out.println(ex.getCause());
        } finally {
            try {
                fileWriter.close();
            } catch(IOException ex) {
                System.out.println(ex.getCause());
            } 
        }
    }
}
