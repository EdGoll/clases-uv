import java.util.HashMap;
import java.util.StringTokenizer;


public class morseToText {

    private HashMap<String, Character> traducciones;
    private StringTokenizer st;
    
    public morseToText(){
        
        traducciones = new HashMap<>();
        traducciones.put(".-",'A');
        traducciones.put("-...",'B');
        traducciones.put("-.-.",'C');
        traducciones.put("-..",'D');
        traducciones.put(".",'E');
        traducciones.put("..-.",'F');
        traducciones.put("--.",'G');
        traducciones.put("....",'H');
        traducciones.put("..",'I');
        traducciones.put(".---",'J');
        traducciones.put("-.-",'K');
        traducciones.put(".-..",'L');
        traducciones.put("--",'M');
        traducciones.put("-.",'N');
        traducciones.put("---",'O');
        traducciones.put(".--.",'P');
        traducciones.put("--.-",'Q');
        traducciones.put(".-.",'R');
        traducciones.put("...",'S');
        traducciones.put("-",'T');
        traducciones.put("..-",'U');
        traducciones.put("...-",'V');
        traducciones.put(".--",'W');
        traducciones.put("-..-",'X');
        traducciones.put("-.--",'Y');
        traducciones.put("--..",'Z');
        traducciones.put("-----",'0');
        traducciones.put(".----",'1');
        traducciones.put("..---",'2');
        traducciones.put("...--",'3');
        traducciones.put("....-",'4');
        traducciones.put(".....",'5');
        traducciones.put("-....",'6');
        traducciones.put("--...",'7');
        traducciones.put("---..",'8');
        traducciones.put("----.",'9');
    
    }
    
    public String MtoT(String word){
        String palabra = word.toUpperCase();
        String aux="";
        st = new StringTokenizer(palabra," ");
        while(st.hasMoreElements()){
            String character = st.nextToken();
            aux += traducciones.get(character);
        }
        return aux;
    }
}
