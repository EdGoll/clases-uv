


import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.System.out;
import javax.swing.JList;


public class ThreadToMorse extends Thread {
    
    private String linea;
    private final char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
    private final String[] codigoMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....","..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};    
    public View v;
    
    public ThreadToMorse(View interfaz){
        this.v = interfaz;
    }
    
    @Override   
    public synchronized void run(){
        while(true){
            String palabra = " ";
            char letra,white = ' ' ;
                try{
                    Thread.sleep(1000);
                    this.linea = v.frase();
                        for(int j=0;j<linea.length();j++){
                            letra = linea.charAt(j);
                        for (int k=0;k<alfabeto.length-1;k++){
                            if (alfabeto[k]==letra){
                                palabra = palabra + codigoMorse[k] + " ";
                            }
                        }

                        }
                    v.out.append(palabra + System.getProperty("line.separator")); 
                    linea.wait();
                    linea.notifyAll(); 
                }catch(Exception ex){}
        }
    }
        
    
}
