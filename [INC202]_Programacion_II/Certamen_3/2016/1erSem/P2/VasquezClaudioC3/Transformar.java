

public class Transformar {
    private String control2;
    private String control1;

    public String morse(String control1) {
        this.control1="Codigo:";
        char morse1[] = control1.toCharArray();

        for (int i = 0; i < control1.length(); i++) {

            switch (morse1[i]) {

                case 'A':
                    this.control1 = this.control1 + ".-";
                    break;

                case 'B':
                    this.control1 = this.control1 + "-...";
                    break;

                case 'C':
                    this.control1 = this.control1 + "-.-.";
                    break;

                case 'D':
                    this.control1 = this.control1 + "-..";
                    break;

                case 'E':
                    this.control1 = this.control1 + ".";
                    break;

                case 'F':
                    this.control1 = this.control1 + "..-.";
                    break;

                case 'G':
                    this.control1 = this.control1 + "--.";
                    break;

                case 'H':
                    this.control1 = this.control1 + "....";
                    break;

                case 'I':
                    this.control1 = this.control1 + "..";
                    break;

                case 'J':
                    this.control1 = this.control1 + ".---";
                    break;

                case 'K':
                    this.control1 = this.control1 + "-.-";
                    break;

                case 'L':
                    this.control1 = this.control1 + ".-..";
                    break;

                case 'M':
                    this.control1 = this.control1 + "--";
                    break;

                case 'N':
                    this.control1 = this.control1 + "-.";
                    break;

                case 'O':
                    this.control1 = this.control1 + "---";
                    break;

                case 'P':
                    this.control1 = this.control1 + ".--.";
                    break;

                case 'Q':
                    this.control1 = this.control1 + "--.-";
                    break;

                case 'R':
                    this.control1 = this.control1 + ".-.";
                    break;

                case 'S':
                    this.control1 = this.control1 + "...";
                    break;

                case 'T':
                    this.control1 = this.control1 + "-";
                    break;

                case 'U':
                    this.control1 = this.control1 + "..-";
                    break;

                case 'V':
                    this.control1 = this.control1 + "...-";
                    break;

                case 'W':
                    this.control1 = this.control1 + ".--";
                    break;

                case 'X':
                    this.control1 = this.control1 + "-..-";
                    break;

                case 'Y':
                    this.control1 = this.control1 + "-.--";
                    break;

                case 'Z':
                    this.control1 = this.control1 + "--..";
                    break;

                case '1':
                    this.control1 = this.control1 + ".----";
                    break;

                case '2':
                    this.control1 = this.control1 + "..---";
                    break;

                case '3':
                    this.control1 = this.control1 + "...--";
                    break;

                case '4':
                    this.control1 = this.control1 + "....-";
                    break;

                case '5':
                    this.control1 = this.control1 + ".....";
                    break;

                case '6':
                    this.control1 = this.control1 + "-....";
                    break;

                case '7':
                    this.control1 = this.control1 + "--...";
                    break;

                case '8':
                    this.control1 = this.control1 + "---..";
                    break;

                case '9':
                    this.control1 = this.control1 + "----.";
                    break;

                case '0':
                    this.control1 = this.control1 + "-----";
                    break;

            }

        }
        return this.control1;
    }

    public String ascii(String control2) {
      this.control2="Codigo:";
        char asc[] = control2.toCharArray();
        for (int i = 0; i < control2.length(); i++) {
            System.out.println(asc[i]);
        
            switch (asc[i]) {

                case '0':
                    this.control2 = this.control2 + "&#48";
                    break;

                case '1':
                    this.control2 = this.control2 + "&#49";
                    break;

                case '2':
                    this.control2 = this.control2 + "&#50";
                    break;

                case '3':
                    this.control2 = this.control2 + "&#51";
                    break;

                case '4':
                    this.control2 = this.control2 + "&#52";
                    break;

                case '5':
                    this.control2 = this.control2 + "&#53";
                    break;

                case '6':
                    this.control2 = this.control2 + "&#54";
                    break;

                case '7':
                    this.control2 = this.control2 + "&#55";
                    break;

                case '8':
                    this.control2 = this.control2 + "&#56";
                    break;

                case '9':
                    this.control2 = this.control2 + "&#57";
                    break;

                case 'A':
                    this.control2 = this.control2 + "&#65";
                    break;

                case 'B':
                    this.control2 = this.control2 + "&#66";
                    break;

                case 'C':
                    this.control2 = this.control2 + "&#67";
                    break;

                case 'D':
                    this.control2 = this.control2 + "&#68";
                    break;

                case 'E':
                    this.control2 = this.control2 + "&#69";
                    break;

                case 'F':
                    this.control2 = this.control2 + "&#70";
                    break;

                case 'G':
                    this.control2 = this.control2 + "&#71";
                    break;

                case 'H':
                    this.control2 = this.control2 + "&#72";
                    break;

                case 'I':
                    this.control2 = this.control2 + "&#73";
                    break;

                case 'J':
                    this.control2 = this.control2 + "&#74";
                    break;

                case 'K':
                    this.control2 = this.control2 + "&#75";
                    break;

                case 'L':
                    this.control2 = this.control2 + "&#76";
                    break;

                case 'M':
                    this.control2 = this.control2 + "&#77";
                    break;

                case 'N':
                    this.control2 = this.control2 + "&#78";
                    break;

                case 'O':
                    this.control2 = this.control2 + "&#79";
                    break;

                case 'P':
                    this.control2 = this.control2 + "&#80";
                    break;

                case 'Q':
                    this.control2 = this.control2 + "&#81";
                    break;

                case 'R':
                    this.control2 = this.control2 + "&#82";
                    break;

                case 'S':
                    this.control2 = this.control2 + "&#83";
                    break;

                case 'T':
                    this.control2 = this.control2 + "&#84";
                    break;

                case 'U':
                    this.control2 = this.control2 + "&#85";
                    break;

                case 'V':
                    this.control2 = this.control2 + "&#86";
                    break;

                case 'W':
                    this.control2 = this.control2 + "&#87";
                    break;

                case 'X':
                    this.control2 = this.control2 + "&#88";
                    break;

                case 'Y':
                    this.control2 = this.control2 + "&#89";
                    break;

                case 'Z':
                    this.control2 = this.control2 + "&#90";
                    break;

            }
        }
        return this.control2;
    }
}
