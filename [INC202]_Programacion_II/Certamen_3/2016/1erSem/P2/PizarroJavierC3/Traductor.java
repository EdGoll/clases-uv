
public class Traductor {

    private String letra = "", letras = "";

    public String morse(String letra) {

        this.letra = "";
        char l[] = letra.toCharArray();

        for (int i = 0; i < letra.length(); i++) {

            switch (l[i]) {

                case 'A':
                    this.letra = this.letra + ".-";
                    break;

                case 'B':
                    this.letra = this.letra + "-...";
                    break;

                case 'C':
                    this.letra = this.letra + "-.-.";
                    break;

                case 'D':
                    this.letra = this.letra + "-..";
                    break;

                case 'E':
                    this.letra = this.letra + ".";
                    break;

                case 'F':
                    this.letra = this.letra + "..-.";
                    break;

                case 'G':
                    this.letra = this.letra + "--.";
                    break;

                case 'H':
                    this.letra = this.letra + "....";
                    break;

                case 'I':
                    this.letra = this.letra + "..";
                    break;

                case 'J':
                    this.letra = this.letra + ".---";
                    break;

                case 'K':
                    this.letra = this.letra + "-.-";
                    break;

                case 'L':
                    this.letra = this.letra + ".-..";
                    break;

                case 'M':
                    this.letra = this.letra + "--";
                    break;

                case 'N':
                    this.letra = this.letra + "-.";
                    break;

                case 'O':
                    this.letra = this.letra + "---";
                    break;

                case 'P':
                    this.letra = this.letra + ".--.";
                    break;

                case 'Q':
                    this.letra = this.letra + "--.-";
                    break;

                case 'R':
                    this.letra = this.letra + ".-.";
                    break;

                case 'S':
                    this.letra = this.letra + "...";
                    break;

                case 'T':
                    this.letra = this.letra + "-";
                    break;

                case 'U':
                    this.letra = this.letra + "..-";
                    break;

                case 'V':
                    this.letra = this.letra + "...-";
                    break;

                case 'W':
                    this.letra = this.letra + ".--";
                    break;

                case 'X':
                    this.letra = this.letra + "-..-";
                    break;

                case 'Y':
                    this.letra = this.letra + "-.--";
                    break;

                case 'Z':
                    this.letra = this.letra + "--..";
                    break;

                case '1':
                    this.letra = this.letra + ".----";
                    break;

                case '2':
                    this.letra = this.letra + "..---";
                    break;

                case '3':
                    this.letra = this.letra + "...--";
                    break;

                case '4':
                    this.letra = this.letra + "....-";
                    break;

                case '5':
                    this.letra = this.letra + ".....";
                    break;

                case '6':
                    this.letra = this.letra + "-....";
                    break;

                case '7':
                    this.letra = this.letra + "--...";
                    break;

                case '8':
                    this.letra = this.letra + "---..";
                    break;

                case '9':
                    this.letra = this.letra + "----.";
                    break;

                case '0':
                    this.letra = this.letra + "-----";
                    break;

            }

        }
        return this.letra;
    }

    public String ascii(String letras) {
        this.letras = "";
        char la[] = letras.toCharArray();
        for (int i = 0; i < letras.length(); i++) {
            switch (la[i]) {

                case '0':
                    this.letras = this.letras + "&#48";
                    break;

                case '1':
                    this.letras = this.letras + "&#49";
                    break;

                case '2':
                    this.letras = this.letras + "&#50";
                    break;

                case '3':
                    this.letras = this.letras + "&#51";
                    break;

                case '4':
                    this.letras = this.letras + "&#52";
                    break;

                case '5':
                    this.letras = this.letras + "&#53";
                    break;

                case '6':
                    this.letras = this.letras + "&#54";
                    break;

                case '7':
                    this.letras = this.letras + "&#55";
                    break;

                case '8':
                    this.letras = this.letras + "&#56";
                    break;

                case '9':
                    this.letras = this.letras + "&#57";
                    break;

                case 'A':
                    this.letras = this.letras + "&#65";
                    break;

                case 'B':
                    this.letras = this.letras + "&#66";
                    break;

                case 'C':
                    this.letras = this.letras + "&#67";
                    break;

                case 'D':
                    this.letras = this.letras + "&#68";
                    break;

                case 'E':
                    this.letras = this.letras + "&#69";
                    break;

                case 'F':
                    this.letras = this.letras + "&#70";
                    break;

                case 'G':
                    this.letras = this.letras + "&#71";
                    break;

                case 'H':
                    this.letras = this.letras + "&#72";
                    break;

                case 'I':
                    this.letras = this.letras + "&#73";
                    break;

                case 'J':
                    this.letras = this.letras + "&#74";
                    break;

                case 'K':
                    this.letras = this.letras + "&#75";
                    break;

                case 'L':
                    this.letras = this.letras + "&#76";
                    break;

                case 'M':
                    this.letras = this.letras + "&#77";
                    break;

                case 'N':
                    this.letras = this.letras + "&#78";
                    break;

                case 'O':
                    this.letras = this.letras + "&#79";
                    break;

                case 'P':
                    this.letras = this.letras + "&#80";
                    break;

                case 'Q':
                    this.letras = this.letras + "&#81";
                    break;

                case 'R':
                    this.letras = this.letras + "&#82";
                    break;

                case 'S':
                    this.letras = this.letras + "&#83";
                    break;

                case 'T':
                    this.letras = this.letras + "&#84";
                    break;

                case 'U':
                    this.letras = this.letras + "&#85";
                    break;

                case 'V':
                    this.letras = this.letras + "&#86";
                    break;

                case 'W':
                    this.letras = this.letras + "&#87";
                    break;

                case 'X':
                    this.letras = this.letras + "&#88";
                    break;

                case 'Y':
                    this.letras = this.letras + "&#89";
                    break;

                case 'Z':
                    this.letras = this.letras + "&#90";
                    break;

            }
        }
        return this.letras;
    }
}
