
public class Traduccion {
    
    public static String aMorse(String palabra){
        String codigo = "";
        palabra=palabra.toUpperCase();
        char [] caracter= new char [palabra.length()];
        palabra.getChars(0, palabra.length(), caracter, 0);
        for(int i=0;i<=caracter.length-1;i++){
            switch (caracter[i]) {
                case 'A':
                    codigo+=(" .-");
                    break;
                case 'B':
                    codigo+=(" -...");
                    break;
                case 'C':
                    codigo+=(" -.-.");
                    break;
                case 'D':
                    codigo+=(" -..");
                    break;
                case 'E':
                    codigo+=(" .");
                    break;
                case 'F':
                    codigo+=(" ..-.");
                    break;
                case 'G':
                    codigo+=(" --.");
                    break;
                case 'H':
                    codigo+=(" ....");
                    break;
                case 'I':
                    codigo+=(" ..");
                    break;
                case 'J':
                    codigo+=(" .---");
                    break;
                case 'K':
                    codigo+=(" -.-");
                    break;
                case 'L':
                    codigo+=(" .-..");
                    break;
                case 'M':
                    codigo+=(" --");
                    break;
                case 'N':
                    codigo+=(" -.");
                    break;
                case 'O':
                    codigo+=(" ---");
                    break;
                case 'P':
                    codigo+=(" .--.");
                    break;
                case 'Q':
                    codigo+=(" --.-");
                    break;
                case 'R':
                    codigo+=(" .-.");
                    break;
                case 'S':
                    codigo+=(" ...");
                    break;
                case 'T':
                    codigo+=(" -");
                    break;
                case 'U':
                    codigo+=(" ..-");
                    break;
                case 'V':
                    codigo+=(" ...-");
                    break;
                case 'W':
                    codigo+=(" .--");
                    break;
                case 'X':
                    codigo+=(" -..-");
                    break;
                case 'Y':  
                    codigo+=(" -.--");
                    break;
                case 'Z':
                    codigo+=(" --..");
                    break;
                case '1':
                    codigo+=(" .----");
                    break;
                case '2':
                    codigo+=(" ..---");
                    break;
                case '3':
                    codigo+=(" ...--");
                    break;
                case '4':
                    codigo+=(" ....-");
                    break;
                case '5':
                    codigo+=(" .....");
                    break;
                case '6':
                    codigo+=(" -....");
                    break;
                case '7':
                    codigo+=(" --...");
                    break;
                case '8':
                    codigo+=(" ---..");
                    break;
                case '9':
                    codigo+=(" ----.");
                    break;
                case '0':
                    codigo+=(" .....");
                    break;
                case ' ':
                    codigo+=(" /");
                default:
                    break;
            }
        }
        return codigo;
    }
    
    public static String aASCII(String palabra){
        String codigo = "";
        palabra=palabra.toUpperCase(); 
        char [] caracter= new char [palabra.length()];
        palabra.getChars(0, palabra.length(), caracter, 0);
        for(int i=0;i<=caracter.length-1;i++){
            switch (caracter[i]) {
                case 'A':
                    codigo+=("&#65;");
                    break;
                case 'B':
                    codigo+=("&#66;");
                    break;
                case 'C':
                    codigo+=("&#67;");
                    break;
                case 'D':
                    codigo+=("&#68;");
                    break;
                case 'E':
                    codigo+=("&#69;");
                    break;
                case 'F':
                    codigo+=("&#70;");
                    break;
                case 'G':
                    codigo+=("&#71;");
                    break;
                case 'H':
                    codigo+=("&#72;");
                    break;
                case 'I':
                    codigo+=("&#73;");
                    break;
                case 'J':
                    codigo+=("&#74;");
                    break;
                case 'K':
                    codigo+=("&#75;");
                    break;
                case 'L':
                    codigo+=("&#76;");
                    break;
                case 'M':
                    codigo+=("&#77;");
                    break;
                case 'N':
                    codigo+=("&#78;");
                    break;
                case 'O':
                    codigo+=("&#79;");
                    break;
                case 'P':
                    codigo+=("&#80;");
                    break;
                case 'Q':
                    codigo+=("&#81;");
                    break;
                case 'R':
                    codigo+=("&#82;");
                    break;
                case 'S':
                    codigo+=("&#83;");
                    break;
                case 'T':
                    codigo+=("&#84;");
                    break;
                case 'U':
                    codigo+=("&#85;");
                    break;
                case 'V':
                    codigo+=("&#86;");
                    break;
                case 'W':
                    codigo+=("&#87;");
                    break;
                case 'X':
                    codigo+=("&#88;");
                    break;
                case 'Y':  
                    codigo+=("&#89;");
                    break;
                case 'Z':
                    codigo+=("&#90;");
                    break;
                case '1':
                    codigo+=("&#49;");
                    break;
                case '2':
                    codigo+=("&#50;");
                    break;
                case '3':
                    codigo+=("&#51;");
                    break;
                case '4':
                    codigo+=("&#52;");
                    break;
                case '5':
                    codigo+=("&#53;");
                    break;
                case '6':
                    codigo+=("&#54;");
                    break;
                case '7':
                    codigo+=("&#55;");
                    break;
                case '8':
                    codigo+=("&#56;");
                    break;
                case '9':
                    codigo+=("&#57;");
                    break;
                case '0':
                    codigo+=("&#48;");
                    break;
                case ' ':
                    codigo+=("");
                default:
                    break;
            }
        }
        return codigo;
    }
}
