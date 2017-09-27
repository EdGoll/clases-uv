import java.util.HashMap;


public class Convert {
    
    private HashMap<Character, String> translations;
    
    public Convert() {
		translations = new HashMap<>();
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
	}
	
    
        public synchronized String translateASCII(String word){
            String palabra = word.toUpperCase();
            String aux="";
            try{
                while(aux!=("")){
                    wait();
                }
                
                for(int i=0; i<palabra.length(); i++){
                    int ascii = (int) palabra.charAt(i);
                    aux += "&#"+ascii+";";
                }
                
                System.out.println(aux);/////////////////////////////////////////
                notifyAll();
            }
            catch(InterruptedException ex){
            }
            return aux;
        }
        
        
	public synchronized String translateWord(String word) {
            String palabra = word.toUpperCase();
            String aux="";
		try{
                    while(aux!=("")){
                        wait();
                    }
                    
                    for (int i = 0; i<palabra.length(); i++){
                            String code = translations.get(palabra.charAt(i));
                            if (code!=null){
                                    aux += " "+code;
                            }
                            else {
                                    System.err.println("El parametro a traducir no es una palabra o el caracter '" + palabra.charAt(i) + "' no existe en el alfabeto.");
                                    return null;
                            }
                    }
                    
                    System.out.println(aux);/////////////////////////////////////////
                    notifyAll();
                    
                }
                catch(InterruptedException ex){
                }  
            return aux;
	}
}
