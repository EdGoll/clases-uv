
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AMorse {
	
	 //almacena diccionario
        //Scanner dicc = null; 

        //@SuppressWarnings("empty-statement")
	public String traducirPalabra(char[] palabra){
		
                //aca debo mandar caracter por caracter uhmmmm!
                /*try{
                    dicc = new Scanner( new File("diccionario.txt"));
                }catch(IOException ex){} */
                List<String> morse = new FuendeDatos().leerArchivo("amorse.txt");
                
		        String traducido = "";
                StringTokenizer token =null;
    
                        try{

                            for(int i=0;i<palabra.length;i++){
                                        for(String l2 : morse){
                                            token = new StringTokenizer(l2,":");
                                            while(token.hasMoreTokens()){
                                                    String c = token.nextToken();
                                                    char[] ch = c.toCharArray();
                                                if(palabra[i]==ch[0] ){//si la letra es igual al proximo elemento del diccionario                                            
                                                    
                                                    traducido+=token.nextToken(); //se guarda la letra traducida
                 
                                                }
                                            }  
                                        }                                           		
                            }
                   
                        }catch(RuntimeException ex){}
            return traducido;	
	}
        
}