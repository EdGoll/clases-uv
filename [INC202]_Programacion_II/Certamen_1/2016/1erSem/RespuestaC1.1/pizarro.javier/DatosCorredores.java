/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certamen1.pkg1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DatosCorredores {
  
 
    public List<String> LeerArchivo(String nombreArchivo){       //llenamos linea con los datos del archivo
        File archivo;
        FileReader fr = null;
        List<String>lineas = null;
        try {
            archivo = new File(nombreArchivo);
            lineas = new ArrayList<>();
            new ArrayList<>();        
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while( (linea = br.readLine() ) != null){
                lineas.add(linea);
        }
    }
        catch(IOException ex){
            System.out.println("Error al abrir el archivo");
        }
        finally {
            try {
                if(fr != null){
                    fr.close();
                }
            }
            catch(IOException e){                
            }
        }
        return lineas;
}
    
    
}
