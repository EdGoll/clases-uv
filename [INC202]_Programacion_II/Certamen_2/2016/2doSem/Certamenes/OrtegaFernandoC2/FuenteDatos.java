
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class FuenteDatos
{
    public static List<String> leerArchivo(String nombre)
    {
        List <String> lineas = new ArrayList<>();
        String linea;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try
        {
            archivo= new File(nombre);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            while((linea = br.readLine())!=null)
            {
                lineas.add(linea);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            try
            {
                if(fr != null)
                {
                    fr.close();
                }
            }
            catch(IOException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        return lineas;
    }
    
    public static void escribirArchivo(String nombre, List<String> lineas)
    {
        FileWriter fw = null;
        PrintWriter pw = null;
        try
        {
            fw = new FileWriter(nombre,true);
            pw = new PrintWriter(fw);
            for(String linea : lineas)
            {
                pw.println(linea);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            if(pw != null)
            {
                pw.close();
            }
        }
    }
}
