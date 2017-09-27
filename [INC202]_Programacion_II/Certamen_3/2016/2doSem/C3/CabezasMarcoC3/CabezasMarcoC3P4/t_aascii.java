

public class t_aascii {

    public String Aascii(String usarLinea) {
        String letra;
        String caracterAscii;
        String transformarS = "";

        for (int j = 0; j < usarLinea.length(); j++) {

            letra = usarLinea.charAt(j) + "";
            System.out.println(usarLinea.charAt(j));
            caracterAscii = Convertir(letra);

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

        if (decodificar.equalsIgnoreCase("A")) {
            ascii = "&#65;";
        }
        if (decodificar.equalsIgnoreCase("B")) {
            ascii = "&#66;";
        }
        if (decodificar.equalsIgnoreCase("C")) {
            ascii = "&#67;";
        }
        if (decodificar.equalsIgnoreCase("D")) {
            ascii = "&#68;";
        }
        if (decodificar.equalsIgnoreCase("E")) {
            ascii = "&#69;";
        }
        if (decodificar.equalsIgnoreCase("F")) {
            ascii = "&#70;";
        }
        if (decodificar.equalsIgnoreCase("G")) {
            ascii = "&#71;";
        }
        if (decodificar.equalsIgnoreCase("H")) {
            ascii = "&#72;";
        }
        if (decodificar.equalsIgnoreCase("I")) {
            ascii = "&#73;";
        }
        if (decodificar.equalsIgnoreCase("J")) {
            ascii = "&#74;";
        }
        if (decodificar.equalsIgnoreCase("K")) {
            ascii = "&#75;";
        }
        if (decodificar.equalsIgnoreCase("L")) {
            ascii = "&#76;";
        }
        if (decodificar.equalsIgnoreCase("M")) {
            ascii = "&#77;";
        }
        if (decodificar.equalsIgnoreCase("N")) {
            ascii = "&#78;";
        }
        if (decodificar.equalsIgnoreCase("O")) {
            ascii = "&#79;";
        }
        if (decodificar.equalsIgnoreCase("P")) {
            ascii = "&#80;";
        }
        if (decodificar.equalsIgnoreCase("Q")) {
            ascii = "&#81;";
        }
        if (decodificar.equalsIgnoreCase("R")) {
            ascii = "&#82;";
        }
        if (decodificar.equalsIgnoreCase("S")) {
            ascii = "&#83;";
        }
        if (decodificar.equalsIgnoreCase("T")) {
            ascii = "&#84;";
        }
        if (decodificar.equalsIgnoreCase("U")) {
            ascii = "&#85;";
        }
        if (decodificar.equalsIgnoreCase("V")) {
            ascii = "&#86;";
        }
        if (decodificar.equalsIgnoreCase("W")) {
            ascii = "&#87;";
        }
        if (decodificar.equalsIgnoreCase("X")) {
            ascii = "&#88;";
        }
        if (decodificar.equalsIgnoreCase("Y")) {
            ascii = "&#89;";
        }
        if (decodificar.equalsIgnoreCase("Z")) {
            ascii = "&#90;";
        }
        if (decodificar.equalsIgnoreCase("0")) {
            ascii = "&#48;";
        }
        if (decodificar.equalsIgnoreCase("1")) {
            ascii = "&#49;";
        }
        if (decodificar.equalsIgnoreCase("2")) {
            ascii = "&#50;";
        }
        if (decodificar.equalsIgnoreCase("3")) {
            ascii = "&#51;";
        }
        if (decodificar.equalsIgnoreCase("4")) {
            ascii = "&#52;";
        }
        if (decodificar.equalsIgnoreCase("5")) {
            ascii = "&#53;";
        }
        if (decodificar.equalsIgnoreCase("6")) {
            ascii = "&#54;";
        }
        if (decodificar.equalsIgnoreCase("7")) {
            ascii = "&#55;";
        }
        if (decodificar.equalsIgnoreCase("8")) {
            ascii = "&#56;";
        }
        if (decodificar.equalsIgnoreCase("9")) {
            ascii = "&#57;";
        }
        if (decodificar.equalsIgnoreCase(".")) {
            ascii = "&#58;";
        }
        if (decodificar.equalsIgnoreCase(",")) {
            ascii = "&#59;";
        }
        if (decodificar.equalsIgnoreCase("?")) {
            ascii = "&#60;";
        }
        System.out.println("ascii: " + ascii);
        return ascii;
    }
}
