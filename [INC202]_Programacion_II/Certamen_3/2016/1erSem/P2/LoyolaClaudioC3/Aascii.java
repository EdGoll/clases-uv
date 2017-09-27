
public class Aascii {
    public Aascii(){
       this.Palabra = Palabra; 
    }
    private String Palabra;
    public String ascii(String Palabra){
        String PalabraTraducida="";
        this.Palabra = Palabra;
        Palabra = Palabra.toUpperCase();
        for(int j = 0; j < Palabra.length(); j++){
            PalabraTraducida += "&#" + Palabra.codePointAt(j) + " ";
        }
        return PalabraTraducida;
    }
}
