
import java.io.*;
import java.util.Scanner;

public class Comuna {
   static String xString;
  
    static String[][] ArrayComuna = null; 
    
    public void setCSVComuna(){
        Scanner scan = null;
        String Linea = ""; 
        System.out.println("set array Comuna");//Eliminar
        int x=0, y=0;
        
        try{
            scan = new Scanner(new BufferedReader(new FileReader("Comuna.csv")));
            while(scan.hasNextLine()){
                Linea = scan.nextLine(); 
                String[] InArrayR = Linea.split(","); 
                
                for(x=0; x<InArrayR.length; x++){
                    ArrayComuna[y][x] = InArrayR[x];
                
                }
                y++;                
            }
            
            
        }catch (Exception e){
            System.out.println(e);
        }        
        
        
    }
    
    public void PrintArrayComuna(){
        for(int a=0; a<4; a++){
            for(int b=0; b<15; b++){
                System.out.print(ArrayComuna[a][b]+"  ");
            }
            System.out.println();
        }
        System.out.println("\n"); 
    } 
}
