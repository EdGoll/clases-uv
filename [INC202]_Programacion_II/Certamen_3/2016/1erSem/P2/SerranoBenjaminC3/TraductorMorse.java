import java.util.HashMap;

public class TraductorMorse {

    private HashMap<Character, String> translations;
    private String palabra;

    public TraductorMorse(String palabra) {
        translations = new HashMap<Character, String>();
        translations.put('A', ".- ");
        translations.put('B', "-... ");
        translations.put('C', "-.-. ");
        translations.put('D', "-.. ");
        translations.put('E', ". ");
        translations.put('F', "..-. ");
        translations.put('G', "--. ");
        translations.put('H', ".... ");
        translations.put('I', ".. ");
        translations.put('J', ".--- ");
        translations.put('K', "-.- ");
        translations.put('L', ".-.. ");
        translations.put('M', "-- ");
        translations.put('N', "-. ");
        translations.put('Ñ', "--.-- ");
        translations.put('O', "--- ");
        translations.put('P', ".--. ");
        translations.put('Q', "--.- ");
        translations.put('R', ".-. ");
        translations.put('S', "... ");
        translations.put('T', "- ");
        translations.put('U', "..- ");
        translations.put('V', "...- ");
        translations.put('W', ".-- ");
        translations.put('X', "-..- ");
        translations.put('Y', "-.-- ");
        translations.put('Z', "--.. ");
        translations.put('1', ".---- ");
        translations.put('2', "..--- ");
        translations.put('3', "...-- ");
        translations.put('4', "....- ");
        translations.put('5', "..... ");
        translations.put('6', "-.... ");
        translations.put('7', "--... ");
        translations.put('8', "---.. ");
        translations.put('9', "----. ");
        translations.put('0', "----- ");
        translations.put('.', "·-·-·- ");
        translations.put(',', "--··-- ");
        translations.put('?', "··--·· ");
        translations.put('"', "·-··-· ");
        translations.put('!', "-·-·-- ");
        this.palabra = palabra;
    }

    public synchronized String traducirPalabra() {
        String aux = "";
        palabra = palabra.toUpperCase();
        for (int i = 0; i < palabra.length(); i++) {
            String code = translations.get(palabra.charAt(i));
            if (code != null) {
                aux += code;
            } else {
                System.err.println("El parametro a traducir no es una palabra o el caracter '" + palabra.charAt(i) + "' no existe en el alfabeto.");
                return null;
            }
        }
        return aux;
    }
}