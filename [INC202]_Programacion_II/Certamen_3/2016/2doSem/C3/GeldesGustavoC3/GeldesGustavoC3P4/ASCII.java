
import java.util.ArrayList;


public class ASCII {
    public static String trad (String b){
       
        b=b.toUpperCase();
        int largo=b.length();
        char [] letter= new char [b.length()];
        b.getChars(0, largo, letter, 0);
        ArrayList<String> ascii = new ArrayList<>();
        String linea;
        for(int l=0;l<=letter.length-1;l++){
            switch (letter[l]) {
                case 'A':
                    ascii.add(" &#65");
                    break;
                case 'B':
                    ascii.add(" &#66");
                    break;
                case 'C':
                    ascii.add(" &#67");
                    break;
                case 'D':
                    ascii.add(" &#68");
                    break;
                case 'E':
                    ascii.add(" &#69");
                    break;
                case 'F':
                    ascii.add(" &#70");
                    break;
                case 'G':
                    ascii.add(" &#71");
                    break;
                case 'H':
                    ascii.add(" &#72");
                    break;
                case 'I':
                    ascii.add(" &#73");
                    break;
                case 'J':
                    ascii.add(" &#74");
                    break;
                case 'K':
                    ascii.add(" &#75");
                    break;
                case 'L':
                    ascii.add(" &#76");
                    break;
                case 'M':
                    ascii.add(" &#77");
                    break;
                case 'N':
                    ascii.add(" &#78");
                    break;
                case 'O':
                    ascii.add(" &#79");
                    break;
                case 'P':
                    ascii.add(" &#80");
                    break;
                case 'Q':
                    ascii.add(" &#81");
                    break;
                case 'R':
                    ascii.add(" &#82");
                    break;
                case 'S':
                    ascii.add(" &#83");
                    break;
                case 'T':
                    ascii.add(" &#84");
                    break;
                case 'U':
                    ascii.add(" &#85");
                    break;
                case 'V':
                    ascii.add(" &#86");
                    break;
                case 'W':
                    ascii.add(" &#87");
                    break;
                case 'X':
                    ascii.add(" &#88");
                    break;
                case 'Y':  
                    ascii.add(" &#89");
                    break;
                case 'Z':
                    ascii.add(" &#90");
                    break;
                case '0':
                    ascii.add(" &#48");
                    break;
                case '1':
                    ascii.add(" &#49");
                    break;
                case '2':
                    ascii.add(" &#50");
                    break;
                case '3':
                    ascii.add(" &#51");
                    break;
                case '4':
                    ascii.add(" &#52");
                    break;
                case '5':
                    ascii.add(" &#53");
                    break;
                case '6':
                    ascii.add(" &#54");
                    break;
                case '7':
                    ascii.add(" &#55");
                    break;
                case '8':
                    ascii.add(" &#56");
                    break;
                case '9':
                    ascii.add(" &#57");
                    break;
                default:
                    break;
                }
            }
            return linea= ascii.toString();
        }

  
}




    
