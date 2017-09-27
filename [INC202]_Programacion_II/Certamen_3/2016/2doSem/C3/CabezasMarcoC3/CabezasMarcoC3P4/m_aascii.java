

import java.util.StringTokenizer;

public class m_aascii { //Traduce de Morse a Ascii y viceversa

    public String M_aascii(String usarLinea) {
        String caracterAscii;
        String transformarS = "";

        StringTokenizer token = new StringTokenizer(usarLinea, " ");
        while (token.hasMoreElements()) {
            caracterAscii = Convertir(token.nextToken());

            if (caracterAscii.equals(" ")) {
                transformarS = transformarS + "  /  ";
            } else {
                transformarS = transformarS + caracterAscii;

                if (!caracterAscii.equals(" ")) {
                    transformarS = transformarS + " ";
                }
            }
        }
        return transformarS;
    }

    public String Convertir(String decodificar) {
        String ascii = decodificar;

        if (decodificar.equalsIgnoreCase(".-")) {
            ascii = "&#65;";
        } else if (decodificar.equalsIgnoreCase("&#65;")) {

            ascii = ".-";
        }

        if (decodificar.equalsIgnoreCase("-...")) {
            ascii = "&#66;";
        } else if (decodificar.equalsIgnoreCase("&#66;")) {

            ascii = "-...";
        }

        if (decodificar.equalsIgnoreCase("-.-.")) {
            ascii = "&#67;";
        } else if (decodificar.equalsIgnoreCase("&#67;")) {

            ascii = "-.-.";
        }

        if (decodificar.equalsIgnoreCase("-..")) {
            ascii = "&#68;";
        } else if (decodificar.equalsIgnoreCase("&#68;")) {

            ascii = "-..";
        }

        if (decodificar.equalsIgnoreCase(".")) {
            ascii = "&#69;";
        } else if (decodificar.equalsIgnoreCase("&#69;")) {

            ascii = ".";
        }

        if (decodificar.equalsIgnoreCase("..-.")) {
            ascii = "&#70;";
        } else if (decodificar.equalsIgnoreCase("&#70;")) {

            ascii = "..-.";
        }

        if (decodificar.equalsIgnoreCase("--.")) {
            ascii = "&#71;";
        } else if (decodificar.equalsIgnoreCase("&#71;")) {

            ascii = "--.";
        }

        if (decodificar.equalsIgnoreCase("....")) {
            ascii = "&#72;";
        } else if (decodificar.equalsIgnoreCase("&#72;")) {

            ascii = "....";
        }

        if (decodificar.equalsIgnoreCase("..")) {
            ascii = "&#73;";
        } else if (decodificar.equalsIgnoreCase("&#73;")) {

            ascii = "..";
        }

        if (decodificar.equalsIgnoreCase(".---")) {
            ascii = "&#74;";
        } else if (decodificar.equalsIgnoreCase("&#74;")) {

            ascii = ".---";
        }

        if (decodificar.equalsIgnoreCase("-.-")) {
            ascii = "&#75;";
        } else if (decodificar.equalsIgnoreCase("&#75;")) {

            ascii = "-.-";
        }

        if (decodificar.equalsIgnoreCase(".-..")) {
            ascii = "&#76;";
        } else if (decodificar.equalsIgnoreCase("&#76;")) {

            ascii = ".-..";
        }

        if (decodificar.equalsIgnoreCase("--")) {
            ascii = "&#77;";
        } else if (decodificar.equalsIgnoreCase("&#77;")) {

            ascii = "--";
        }

        if (decodificar.equalsIgnoreCase("-.")) {
            ascii = "&#78;";
        } else if (decodificar.equalsIgnoreCase("&#78;")) {

            ascii = "-.";
        }

        if (decodificar.equalsIgnoreCase("---")) {
            ascii = "&#79;";
        } else if (decodificar.equalsIgnoreCase("&#79;")) {

            ascii = "---";
        }

        if (decodificar.equalsIgnoreCase(".--.")) {
            ascii = "&#80;";
        } else if (decodificar.equalsIgnoreCase("&#80;")) {

            ascii = ".--.";
        }

        if (decodificar.equalsIgnoreCase("--.-")) {
            ascii = "&#81;";
        } else if (decodificar.equalsIgnoreCase("&#81;")) {

            ascii = "--.-";
        }

        if (decodificar.equalsIgnoreCase(".-.")) {
            ascii = "&#82;";
        } else if (decodificar.equalsIgnoreCase("&#82;")) {

            ascii = ".-.";
        }

        if (decodificar.equalsIgnoreCase("...")) {
            ascii = "&#83;";
        } else if (decodificar.equalsIgnoreCase("&#83;")) {

            ascii = "...";
        }

        if (decodificar.equalsIgnoreCase("-")) {
            ascii = "&#84;";
        } else if (decodificar.equalsIgnoreCase("&#84;")) {

            ascii = "-";
        }

        if (decodificar.equalsIgnoreCase("..-")) {
            ascii = "&#85;";
        } else if (decodificar.equalsIgnoreCase("&#85;")) {

            ascii = "..-";
        }

        if (decodificar.equalsIgnoreCase("...-")) {
            ascii = "&#86;";
        } else if (decodificar.equalsIgnoreCase("&#86;")) {

            ascii = "...-";
        }

        if (decodificar.equalsIgnoreCase(".--")) {
            ascii = "&#87;";
        } else if (decodificar.equalsIgnoreCase("&#87;")) {

            ascii = ".--";
        }

        if (decodificar.equalsIgnoreCase("-..-")) {
            ascii = "&#88;";
        } else if (decodificar.equalsIgnoreCase("&#88;")) {

            ascii = "-..-";
        }

        if (decodificar.equalsIgnoreCase("-.--")) {
            ascii = "&#89;";
        } else if (decodificar.equalsIgnoreCase("&#89;")) {

            ascii = "-.--";
        }

        if (decodificar.equalsIgnoreCase("--..")) {
            ascii = "&#90;";
        } else if (decodificar.equalsIgnoreCase("&#90;")) {

            ascii = "--..";
        }

        if (decodificar.equalsIgnoreCase("-----")) {
            ascii = "&#48;";
        } else if (decodificar.equalsIgnoreCase("&#48;")) {

            ascii = "-----";
        }

        if (decodificar.equalsIgnoreCase(".----")) {
            ascii = "&#49;";
        } else if (decodificar.equalsIgnoreCase("&#49;")) {

            ascii = ".----";
        }

        if (decodificar.equalsIgnoreCase("..---")) {
            ascii = "&#50;";
        } else if (decodificar.equalsIgnoreCase("&#50;")) {

            ascii = "..---";
        }

        if (decodificar.equalsIgnoreCase("...--")) {
            ascii = "&#51;";
        } else if (decodificar.equalsIgnoreCase("&#51;")) {

            ascii = "...--";
        }

        if (decodificar.equalsIgnoreCase("....-")) {
            ascii = "&#52;";
        } else if (decodificar.equalsIgnoreCase("&#52;")) {

            ascii = "....-";
        }

        if (decodificar.equalsIgnoreCase(".....")) {
            ascii = "&#53;";
        } else if (decodificar.equalsIgnoreCase("&#53;")) {

            ascii = ".....";
        }

        if (decodificar.equalsIgnoreCase("-....")) {
            ascii = "&#54;";
        } else if (decodificar.equalsIgnoreCase("&#54;")) {

            ascii = "-....";
        }

        if (decodificar.equalsIgnoreCase("--...")) {
            ascii = "&#55;";
        } else if (decodificar.equalsIgnoreCase("&#55;")) {

            ascii = "--...";
        }

        if (decodificar.equalsIgnoreCase("---..")) {
            ascii = "&#56;";
        } else if (decodificar.equalsIgnoreCase("&#56;")) {

            ascii = "---..";
        }

        if (decodificar.equalsIgnoreCase("----.")) {
            ascii = "&#57;";
        } else if (decodificar.equalsIgnoreCase("&#57;")) {

            ascii = "----.";
        }

        if (decodificar.equalsIgnoreCase(".-.-")) {
            ascii = "&#58;";
        } else if (decodificar.equalsIgnoreCase("&#58;")) {

            ascii = ".-.-";
        }

        if (decodificar.equalsIgnoreCase("--..--")) {
            ascii = "&#59;";
        } else if (decodificar.equalsIgnoreCase("&#59;")) {

            ascii = "--..--";
        }

        if (decodificar.equalsIgnoreCase("..--..")) {
            ascii = "&#60;";
        } else if (decodificar.equalsIgnoreCase("&#60;")) {

            ascii = "..--..";
        }

        System.out.println("ascii: " + ascii);
        return ascii;
    }
}
