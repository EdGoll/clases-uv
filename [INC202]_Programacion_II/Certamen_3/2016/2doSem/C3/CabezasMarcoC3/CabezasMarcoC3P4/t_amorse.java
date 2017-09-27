
import java.util.StringTokenizer;

public class t_amorse {

    public String Amorse(String usarLinea) {
        String caracterMorse;
        String transformarS = "";

        StringTokenizer token = new StringTokenizer(usarLinea, " ");
        while (token.hasMoreElements()) {
            caracterMorse = convertir(token.nextToken());

            if (caracterMorse.equals(" ")) {
                transformarS = transformarS + "  /  ";
            } else {
                transformarS = transformarS + caracterMorse;

                if (!caracterMorse.equals(" ")) {
                    transformarS = transformarS + " ";
                }
            }
        }
        return transformarS;
    }

    public String convertir(String decodificar) {
        String morse = decodificar;

        if (decodificar.equalsIgnoreCase(".-")) {
            morse = "A";
        }
        if (decodificar.equalsIgnoreCase("-...")) {
            morse = "B";
        }
        if (decodificar.equalsIgnoreCase("-.-.")) {
            morse = "C";
        }
        if (decodificar.equalsIgnoreCase("-..")) {
            morse = "D";
        }
        if (decodificar.equalsIgnoreCase(".")) {
            morse = "E";
        }
        if (decodificar.equalsIgnoreCase("..-.")) {
            morse = "F";
        }
        if (decodificar.equalsIgnoreCase("--.")) {
            morse = "G";
        }
        if (decodificar.equalsIgnoreCase("....")) {
            morse = "H";
        }
        if (decodificar.equalsIgnoreCase("..")) {
            morse = "I";
        }
        if (decodificar.equalsIgnoreCase(".---")) {
            morse = "J";
        }
        if (decodificar.equalsIgnoreCase("-.-")) {
            morse = "K";
        }
        if (decodificar.equalsIgnoreCase(".-..")) {
            morse = "L";
        }
        if (decodificar.equalsIgnoreCase("--")) {
            morse = "M";
        }
        if (decodificar.equalsIgnoreCase("-.")) {
            morse = "N";
        }
        if (decodificar.equalsIgnoreCase("---")) {
            morse = "O";
        }
        if (decodificar.equalsIgnoreCase(".--.")) {
            morse = "P";
        }
        if (decodificar.equalsIgnoreCase("--.-")) {
            morse = "Q";
        }
        if (decodificar.equalsIgnoreCase(".-.")) {
            morse = "R";
        }
        if (decodificar.equalsIgnoreCase("...")) {
            morse = "S";
        }
        if (decodificar.equalsIgnoreCase("-")) {
            morse = "T";
        }
        if (decodificar.equalsIgnoreCase("..-")) {
            morse = "U";
        }
        if (decodificar.equalsIgnoreCase("...-")) {
            morse = "V";
        }
        if (decodificar.equalsIgnoreCase(".--")) {
            morse = "W";
        }
        if (decodificar.equalsIgnoreCase("-..-")) {
            morse = "X";
        }
        if (decodificar.equalsIgnoreCase("-.--")) {
            morse = "Y";
        }
        if (decodificar.equalsIgnoreCase("--..")) {
            morse = "Z";
        }
        if (decodificar.equalsIgnoreCase("-----")) {
            morse = "0";
        }
        if (decodificar.equalsIgnoreCase(".----")) {
            morse = "1";
        }
        if (decodificar.equalsIgnoreCase("..---")) {
            morse = "2";
        }
        if (decodificar.equalsIgnoreCase("...--")) {
            morse = "3";
        }
        if (decodificar.equalsIgnoreCase("....-")) {
            morse = "4";
        }
        if (decodificar.equalsIgnoreCase(".....")) {
            morse = "5";
        }
        if (decodificar.equalsIgnoreCase("-....")) {
            morse = "6";
        }
        if (decodificar.equalsIgnoreCase("--...")) {
            morse = "7";
        }
        if (decodificar.equalsIgnoreCase("---..")) {
            morse = "8";
        }
        if (decodificar.equalsIgnoreCase("----.")) {
            morse = "9";
        }
        if (decodificar.equalsIgnoreCase(".-.-")) {
            morse = ".";
        }
        if (decodificar.equalsIgnoreCase("--..--")) {
            morse = ",";
        }
        if (decodificar.equalsIgnoreCase("..--..")) {
            morse = "?";
        }
        System.out.println("morse: " + morse);
        return morse;
    }
}
