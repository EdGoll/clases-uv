
import java.util.HashMap;
import java.util.Map;

public class Convertir {
    final static String[][] code = {
        {"A", ".-     "}, {"B", "-...   "}, {"C", "-.-.   "}, {"D", "-..    "},
        {"E", ".      "}, {"F", "..-.   "}, {"G", "--.    "}, {"H", "....   "},
        {"I", "..     "}, {"J", ".---   "}, {"K", "-.-    "}, {"L", ".-..   "},
        {"M", "--     "}, {"N", "-.     "}, {"O", "---    "}, {"P", ".--.   "},
        {"Q", "--.-   "}, {"R", ".-.    "}, {"S", "...    "}, {"T", "-      "},
        {"U", "..-    "}, {"V", "...-   "}, {"W", ".-   - "}, {"X", "-..-   "},
        {"Y", "-.--   "}, {"Z", "--..   "}, {"0", "-----  "}, {"1", ".----  "},
        {"2", "..---  "}, {"3", "...--  "}, {"4", "....-  "}, {"5", ".....  "},
        {"6", "-....  "}, {"7", "--...  "}, {"8", "---..  "}, {"9", "----.  "}};
      
    final static Map<Character, String> map = new HashMap<>();
 
    static {
        for (String[] pair : code)
            map.put(pair[0].charAt(0), pair[1].trim());
    }
      
    static String aMorse(String input) {   
        input = input.toUpperCase();
        String output = "";
        for (char c : input.toCharArray()) {
            output +=map.get(c);            
        }
        return output;
    }
    
    static String aASCII(String input){
        input = input.toUpperCase();
        String output ="";
        for(char ch : input.toCharArray()){
            output += "&#" + (int)ch + ";";             
        }
        return output;
    }

}
