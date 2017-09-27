public class Traducir {

    private static String alfabeto = " ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static String[] alfabetoMorse = {" ", ".-", "-...", ".-.-", "-..", ".", "--.-", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};
    private static String[] alfabetoASCII = {" ", "&#65", "&#66", "&#67", "&#68", "&#69", "&#70", "&#71", "&#72", "&#73", "&#74", "&#75", "&#76", "&#77", "&#78", "&#79", "&#80", "&#81", "&#82", "&#83", "&#84", "&#85", "&#86", "&#87", "&#88", "&#89", "&#90", "&#48", "&#49", "&#50", "&#51", "&#52", "&#53", "&#54", "&#55", "&#56", "&#57"};

    public static String aMorse(String palabra) {
        String morse = "";
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < alfabeto.length(); j++) {
                if(Character.toString(palabra.charAt(i)).equals(Character.toString(alfabeto.charAt(j)))){
                    
                    morse += alfabetoMorse[j] + " ";
                }
            }
        }
        return morse;
    }
    
    public static String aASCII(String palabra){
        String ascii = "";
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < alfabeto.length(); j++) {
                if(Character.toString(palabra.charAt(i)).equals(Character.toString(alfabeto.charAt(j)))){
                    ascii += alfabetoASCII[j] + " ";
                }
            }
        }
        return ascii;
    }

}
