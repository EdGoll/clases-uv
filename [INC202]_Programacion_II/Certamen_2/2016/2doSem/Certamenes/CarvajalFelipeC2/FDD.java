

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class FDD {


    public ArrayList<String[]> readFile(String nombreArchivo) {
        File archivo;
        FileReader fileReader = null;
        ArrayList<String[]> lineas = null;

        try {
            StringTokenizer tr;
            archivo = new File(nombreArchivo);
            fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            lineas = new ArrayList();
            String linea;
            int j=0;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] dom=new String[4];
                lineas.add(dom);
                tr=new StringTokenizer(linea,";");
                int i=0;
                while(tr.hasMoreTokens()){
                    lineas.get(j)[i]=tr.nextToken();
                    i++;   
                }
                j++;
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


    public void escribirArchivo(String nombreArchivo,ArrayList<Persona>listap) {
        FileWriter archivo = null;
        PrintWriter printWriter = null;
        try {
            archivo = new FileWriter(nombreArchivo, true);
            printWriter = new PrintWriter(archivo);
            for (int i=0;i<listap.size();i++) {
                printWriter.println(listap.get(i).toString());
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            printWriter.close();
        }
    }
}
