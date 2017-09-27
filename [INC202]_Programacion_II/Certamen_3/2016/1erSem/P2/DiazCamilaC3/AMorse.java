
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;


public class AMorse extends Thread {
    
    char[] letras ={'A','B','C','D','E','F','G','H','I',
        'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X',
        'Y','Z','0','1','2','3','4','5','6','7','8','9'};
    
    String[] morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",
        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
        "..-","...-",".--","-..-","-.--","--..","-----",".----","..---",
        "...--","....-",".....","-....","--...","---..","----."}; 
    
    String palabratraducida ="";
    String palabra;
    String nombre;
    RandomWord r =new RandomWord();    
    View v ;
    public AMorse(String nombre ,View a){
        this.nombre=nombre;
        this.v=a;
    }
    
    private String traducir(String palabra){
        
        int d=0;
        for(int j=0;j<palabra.length();j++){
            for(int i=0;i<letras.length;i++){
                try{
                    if(palabra.charAt(j)==letras[i]){                    
                    palabratraducida = palabratraducida + morse[i];   
                    }
                    d++;   
                }catch(Exception e){}
            }
        } 
    return palabratraducida;    
    }
    
    public String getpalabra(){
            return traducir(v.mayuscula(r.generate()));    
    }

    @Override
    public void run() {   
        this.palabra = traducir(v.mayuscula(r.generate()));

    }
}
