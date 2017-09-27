
package paquete;

import java.io.*;
import java.util.Scanner;

public class Region {
    
    /*File f;  //No me Funciono este codigo eliminar despues
    FileReader lectorArchivo;

    try{
        f = new File(nombre);
        lectorArchivo = new FileReader(f);
        BufferedReader br = new BufferedReader(lectorArchivo);
        String l="", aux="";
        while(true){
            	aux=br.readLine();
                if(aux!=null){
                    l=l+aux+"n";
                }else{
                    break;
                }
        br.close();
        lectorArchivo.close();
        return l;
        }catch(IOException e){
                System.out.println("Error:"+e.getMessage());
        }
        return null;

    }
    */
    
    static String xString;
    //ArrayList<String> ArrayRegion = new ArrayList<String>();
    //array.add("auto"); //añadir valor 
    static String[][] ArrayRegion = null; 
    
    public void setCSVRegion(){
        Scanner scan = null;
        String Linea = ""; 
        System.out.println("set array region");//Eliminar
        int x=0, y=0;
        
        try{
            scan = new Scanner(new BufferedReader(new FileReader("Region.csv")));
            while(scan.hasNextLine()){
                Linea = scan.nextLine(); 
                String[] InArrayR = Linea.split(","); 
                
                for(x=0; x<InArrayR.length; x++){
                    ArrayRegion[y][x] = InArrayR[x];
                
                }
                y++;                
            }
            
            
        }catch (Exception e){
            System.out.println(e);
        }        
        
        
    }
    
    public void PrintArrayRegion(){
        for(int a=0; a<4; a++){
            for(int b=0; b<15; b++){
                System.out.print(ArrayRegion[a][b]+"  ");
            }
            System.out.println();
        }
        System.out.println("\n"); 
    }
    
}

