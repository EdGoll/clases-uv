

import static main.RandomWord.generate;


public class Traductor {
   String caracter,linea;
   char[]palabra;
   int tamaño;

    public String Morse(){
        caracter = generate();
        tamaño = caracter.length();
        palabra = caracter.toCharArray();
System.out.println(caracter);
        for(int i=0;i<tamaño;i++){
        	switch (palabra[i]) {
                case 'A':
                    linea+=(" .-");
                    break;
                case 'B':
                    linea+=(" -...");
                    break;
                case 'C':
                    linea+=(" -.-.");
                    break;
                case 'D':
                    linea+=(" -..");
                    break;
                case 'E':
                    linea+=(" .");
                    break;
                case 'F':
                    linea+=(" ..-.");
                    break;
                case 'G':
                    linea+=(" --.");
                    break;
                case 'H':
                    linea+=(" ....");
                    break;
                case 'I':
                    linea+=(" ..");
                    break;
                case 'J':
                    linea+=(" .---");
                    break;
                case 'K':
                    linea+=(" -.-");
                    break;
                case 'L':
                    linea+=(" .-..");
                    break;
                case 'M':
                    linea+=(" --");
                    break;
                case 'N':
                    linea+=(" -.");
                    break;
                case 'O':
                    linea+=(" ---");
                    break;
                case 'P':
                    linea+=(" .--.");
                    break;
                case 'Q':
                    linea+=(" --.-");
                    break;
                case 'R':
                    linea+=(" .-.");
                    break;
                case 'S':
                    linea+=(" ...");
                    break;
                case 'T':
                    linea+=(" -");
                    break;
                case 'U':
                    linea+=(" ..-");
                    break;
                case 'V':
                    linea+=(" ...-");
                    break;
                case 'W':
                    linea+=(" .--");
                    break;
                case 'X':
                    linea+=(" -..-");
                    break;
                case 'Y':
                    linea+=(" -.--");
                    break;
                case 'Z':
                    linea+=(" --..");
                    break;
                case '1':
                    linea+=(" .----");
                    break;
                case '2':
                    linea+=(" ..---");
                    break;
                case '3':
                    linea+=(" ...--");
                    break;
                case '4':
                    linea+=(" ....-");
                    break;
                case '5':
                    linea+=(" .....");
                    break;
                case '6':
                    linea+=(" -....");
                    break;
                case '7':
                    linea+=(" --...");
                    break;
                case '8':
                    linea+=(" ---..");
                    break;
                case '9':
                    linea+=(" ----.");
                    break;
                case '0':
                    linea+=(" .....");
                    break;
                case ' ':
                    linea+=(" /");
                default:
                    break;
            }

            }
        return linea;
    }


        public String  ASCII(){
        caracter = generate();
        tamaño = caracter.length();
        palabra = caracter.toCharArray();

        for(int i=0;i<tamaño;i++){
                switch (palabra[i]) {
                case 'A':
                    linea+=(" &#65;");
                    break;
                case 'B':
                    linea+=(" &#66;");
                    break;
                case 'C':
                    linea+=(" &#67;");
                    break;
                case 'D':
                    linea+=(" &#68;");
                    break;
                case 'E':
                    linea+=(" &#69;");
                    break;
                case 'F':
                    linea+=(" &#;70");
                    break;
                case 'G':
                    linea+=(" &#71;");
                    break;
                case 'H':
                    linea+=(" &#72;");
                    break;
                case 'I':
                    linea+=(" &#73;");
                    break;
                case 'J':
                    linea+=(" &#74;");
                    break;
                case 'K':
                    linea+=(" &#75;");
                    break;
                case 'L':
                    linea+=(" &#76;");
                    break;
                case 'M':
                    linea+=(" &#77;");
                    break;
                case 'N':
                    linea+=(" &#78;");
                    break;
                case 'O':
                    linea+=(" &#79;");
                    break;
                case 'P':
                    linea+=(" &#80;");
                    break;
                case 'Q':
                    linea+=(" &#81;");
                    break;
                case 'R':
                    linea+=(" &#82;");
                    break;
                case 'S':
                    linea+=(" &#83;");
                    break;
                case 'T':
                    linea+=(" &#84;");
                    break;
                case 'U':
                    linea+=(" &#85;");
                    break;
                case 'V':
                    linea+=(" &#86;");
                    break;
                case 'W':
                    linea+=(" &#87;");
                    break;
                case 'X':
                    linea+=(" &#88;");
                    break;
                case 'Y':
                    linea+=(" &#89;");
                    break;
                case 'Z':
                    linea+=(" &#90;");
                    break;
                case '1':
                    linea+=(" &#49;");
                    break;
                case '2':
                    linea+=(" &#50;");
                    break;
                case '3':
                    linea+=(" &#51;");
                    break;
                case '4':
                    linea+=(" .&#52;");
                    break;
                case '5':
                    linea+=(" &#53;");
                    break;
                case '6':
                    linea+=(" &#54;");
                    break;
                case '7':
                    linea+=(" &#55;");
                    break;
                case '8':
                    linea+=(" &#56;");
                    break;
                case '9':
                    linea+=(" &#57;");
                    break;
                case '0':
                    linea+=(" &#48;");
                    break;
                case ' ':
                    linea+=(" /");
                default:
                    break;
            }
           }
            return linea;
        }

      }



