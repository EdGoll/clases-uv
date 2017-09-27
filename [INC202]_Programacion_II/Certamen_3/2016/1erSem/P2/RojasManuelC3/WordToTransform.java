import java.util.HashMap;

public class WordToTransform {
    
    private String word;
    private HashMap<Character, String> translations;
    private String trad;
    
    public WordToTransform(){
        translations = new HashMap<Character, String>();
	translations.put('A', "·-");
	translations.put('B', "-···");
	translations.put('C', "-·-·");
	translations.put('D', "-··");
	translations.put('E', "·");
	translations.put('F', "··-·");
        translations.put('G', "--·");
	translations.put('H', "····");
	translations.put('I', "··");
	translations.put('J', "·---");
	translations.put('K', "-·-");
	translations.put('L', "·-··");
	translations.put('M', "--");
	translations.put('N', "-·");
	translations.put('O', "---");
	translations.put('P', "·--·");
	translations.put('Q', "--·-");
	translations.put('R', "·-·");
	translations.put('S', "···");
	translations.put('T', "-");
	translations.put('U', "··-");
	translations.put('V', "···-");
	translations.put('W', "·--");
	translations.put('X', "-··-");
	translations.put('Y', "-·--");
	translations.put('Z', "--··");
	translations.put('1', "·----");
	translations.put('2', "··---");
	translations.put('3', "···--");
	translations.put('4', "····-");
	translations.put('5', "·····");
	translations.put('6', "-····");
	translations.put('7', "--···");
	translations.put('8', "---··");
	translations.put('9', "----·");
	translations.put('0', "-----");
        this.word = RandomWord.generate().toUpperCase();
    }
    
    public synchronized void toMorse(){
        
        String aux = "";
        for (int i = 0; i<this.word.length(); i++) {
            String code = translations.get(this.word.charAt(i));
            if (code!=null)
                aux += code;
        }
        System.out.println(this.word + " " + aux);
        this.trad= aux;
        notify();
        this.word = RandomWord.generate().toUpperCase();
      
    }
    
    public synchronized void toASCII(){
        
            String aux = "";
        
            for (int i = 0 ; i < this.word.length(); i++){
                String code = "&#" + (int)word.charAt(i) + ";";
                if (code!=null)
                    aux += code;
            }
            System.out.println(this.word + " " + aux);
            this.trad = aux;
            notify();
            this.word = RandomWord.generate().toUpperCase();
        
    }
    public String getTrad(){
        return trad;
    }
    
}
