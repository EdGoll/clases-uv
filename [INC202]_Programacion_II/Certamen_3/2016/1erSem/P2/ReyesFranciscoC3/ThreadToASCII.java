


import java.util.ArrayList;
import java.util.List;

public class ThreadToASCII extends Thread{
    
    private final char[] alfabeto = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private final String[] codigoASCII = {"&#48;", "&#49;", "&#50;", "&#51;", "&#52;", "&#53;", "&#54;", "&#55;","&#56;", "&#57;", "&#65;","&#66;", "&#67;", "&#68;", "&#69;", "&#70;", "&#71;", "&#72;", "&#73;","&#74;","&#75;","&#76;","&#77;","&#78;","&#79;","&#80;","&#81;","&#82;","&#83;","&#84;","&#85;","&#86;","&#87;","&#88;","&#89;","&#90;"};    
    public List<String> convertido = new ArrayList();
    private  String linea;
    public View v;
    
    public ThreadToASCII(View v){
        this.v = v;
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
                                palabra = palabra + codigoASCII[k] + " ";
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
        
