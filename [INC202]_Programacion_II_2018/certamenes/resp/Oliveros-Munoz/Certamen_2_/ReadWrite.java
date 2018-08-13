//package hotelimpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadWrite {

    public static List<String> readFile(String nombreArchivo){
        List<String> lineas = new ArrayList();
        String linea;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(new File(nombreArchivo)));
            br.readLine();
            while((linea = br.readLine())!=null){
                lineas.add(linea);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
        finally{
            try {
                br.close();
            } catch (IOException e) {}
        }
        return lineas;
    }


    public static void writeFile(String nombreArchivo, String texto, boolean anadir){
        FileWriter fichero = null;
        PrintWriter pw;
        try{
            fichero = new FileWriter(nombreArchivo,anadir);
            pw = new PrintWriter(fichero);
            pw.print(texto);
        }catch (IOException e) {}
        finally {
            try {
                if(null != fichero)
                    fichero.close();
            }catch (IOException e) {}
        }
    }

}