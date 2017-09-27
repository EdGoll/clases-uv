
public class Conversor {
    
    
    public static String palabra,palabra_uper;
    private final char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
    private final String[] alfa_morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....","..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..","-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
    private final String[] alfa_ASCII ={"&#65","&#66","&#67","&#68","&#69","&#70","&#71","&#72","&#73","&#74","&#75","&#76","&#77","&#78","&#79","&#80","&#81","&#82","&#83","&#84","&#85","&#86","&#87","&#88","&#89","&#90","&#48","&#49","&#50","&#51","&#52","&#53","&#54","&#55","&#56","&#57"};

    public synchronized static String mayuscula(String palabra){
//        this.palabra=palabra;
        palabra_uper = palabra.toUpperCase();
        return palabra_uper;
    }
    
    public String conv_morse(String palabra_uper){
       String palabra = "";
        char letra,white = ' ' ;
        for(int j=0;j<palabra_uper.length();j++){
            letra = palabra_uper.charAt(j);
                for (int k=0;k<alfabeto.length-1;k++){
                    if (alfabeto[k]==letra) {
                        palabra = palabra + alfa_morse[k] + " ";
                    }
                }
        }
        return palabra;
    }
    
    public String conv_ASCII(String palabra_uper){
        String palabra = "";
        char letra,white = ' ' ;
        for(int j=0;j<palabra_uper.length();j++){
            letra = palabra_uper.charAt(j);
                for (int k=0;k<alfabeto.length-1;k++){
                    if (alfabeto[k]==letra) {
                        palabra = palabra + alfa_ASCII[k] + " ";
                    }
                }
        }
        return palabra;
    }    
    

}
