

public class TraductorTeas {
    
    public String Teas(String word){
        
        String palabra = word.toUpperCase();
        String aux="";
        for(int i=0; i<palabra.length(); i++){
            int ascii = (int) palabra.charAt(i);
            aux += "&#"+ascii+";" + " ";
        }
        return aux;
    }   
}
