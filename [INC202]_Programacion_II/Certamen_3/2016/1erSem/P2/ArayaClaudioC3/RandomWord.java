
import java.util.Random;

public class RandomWord {

    public static String generate(){
        String randomString; // Se deberia comentar esta linea.
        Random rnd = new Random();
        char[] word = new char[rnd.nextInt(8)+3];
        
        for(int j = 0; j < word.length; j++){
            word[j] = (char)('a' + rnd.nextInt(26));
        }        
        return new String(word);
    }
    
}
