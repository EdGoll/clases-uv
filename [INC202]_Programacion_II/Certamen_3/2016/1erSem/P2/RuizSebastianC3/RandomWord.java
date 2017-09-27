
import java.util.Random;

public class RandomWord {
    
    public static String generate(){
        String randomStrings;
        Random random = new Random();
        char[] word = new char[random.nextInt(8)+3];
        
        for(int J=0 ;J<word.length;J++){
            word[J] =(char)('a' +random.nextInt(26));
        }
        
        return new String(word);
    }
}
