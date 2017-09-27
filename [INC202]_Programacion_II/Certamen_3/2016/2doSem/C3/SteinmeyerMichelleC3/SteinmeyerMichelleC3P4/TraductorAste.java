
import java.util.HashMap;
import java.util.StringTokenizer;

public class TraductorAste {
    
    private final HashMap<String, Character> traducciones;
   
    
    public TraductorAste(){
    
        traducciones = new HashMap<>();
        traducciones.put("&#48;",'0');
        traducciones.put("&#49;",'1');
        traducciones.put("&#50;",'2');
        traducciones.put("&#51;",'3');
        traducciones.put("&#52;",'4');
        traducciones.put("&#53;",'5');
        traducciones.put("&#54;",'6');
        traducciones.put("&#55;",'7');
        traducciones.put("&#56;",'8');
        traducciones.put("&#57;",'9');
        traducciones.put("&#65;",'A');
        traducciones.put("&#66;",'B');
        traducciones.put("&#67;",'C');
        traducciones.put("&#68;",'D');
        traducciones.put("&#69;",'E');
        traducciones.put("&#70;",'F');
        traducciones.put("&#71;",'G');
        traducciones.put("&#72;",'H');
        traducciones.put("&#73;",'I');
        traducciones.put("&#74;",'J');
        traducciones.put("&#75;",'K');
        traducciones.put("&#76;",'L');
        traducciones.put("&#77;",'M');
        traducciones.put("&#78;",'N');
        traducciones.put("&#79;",'O');
        traducciones.put("&#80;",'P');
        traducciones.put("&#81;",'Q');
        traducciones.put("&#82;",'R');
        traducciones.put("&#83;",'S');
        traducciones.put("&#84;",'T');
        traducciones.put("&#85;",'U');
        traducciones.put("&#86;",'V');
        traducciones.put("&#87;",'W');
        traducciones.put("&#88;",'X');
        traducciones.put("&#89;",'Y');
        traducciones.put("&#90;",'Z');
        
    }
    
    public String Aste(String word){
    String palabra = word.toUpperCase();
    String aux = "";
    StringTokenizer stz = new StringTokenizer(palabra, " ");
    while(stz.hasMoreElements()){
	String character = stz.nextToken();
	aux+= traducciones.get(character);
    }
    return aux;
    }   
}
    

