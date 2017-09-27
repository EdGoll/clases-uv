
import java.io.*;
import java.util.Scanner;

public class Provincia {
    

static String xString;
  
    static String[][] ArrayProvincia = null; 
    
    public void setCSVProvincia(){
        Scanner scan = null;
        String Linea = ""; 
        System.out.println("set array Provincia");//Eliminar
        int x=0, y=0;
        
        try{
            scan = new Scanner(new BufferedReader(new FileReader("Provincia.csv")));
            while(scan.hasNextLine()){
                Linea = scan.nextLine(); 
                String[] InArrayR = Linea.split(","); 
                
                for(x=0; x<InArrayR.length; x++){
                    ArrayProvincia[y][x] = InArrayR[x];
                
                }
                y++;                
            }
            
            
        }catch (Exception e){
            System.out.println(e);
        }        
        
        
    }
    
    public void PrintArrayProvincia(){
        for(int a=0; a<4; a++){
            for(int b=0; b<15; b++){
                System.out.print(ArrayProvincia[a][b]+"  ");
            }
            System.out.println();
        }
        System.out.println("\n"); 
    }
    
}