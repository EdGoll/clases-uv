public class Transformar {

    private static final String[][] ALFABETOS = {
        {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
        {"-----", "·----", "··---", "···--", "····-", "·····", "-····", "--···", "---··", "----·", "·-", "-···", "-·-·", "-··", "·", "··-·", "--·", "····", "··", "·---", "-·-", "·-··", "--", "-·", "---", "·--·", "--·-", "·-·", "···", "-", "··-", "···-", "·--", "-··-", "-·--", "--··"},
        {"&#48;", "&#49;", "&#50;", "&#51;", "&#52;", "&#53;", "&#54;", "&#55;", "&#56;", "&#57;", "&#65;", "&#66;", "&#67;", "&#68;", "&#69;", "&#70;", "&#71;", "&#72;", "&#73;", "&#74;", "&#75;", "&#76;", "&#77;", "&#78;", "&#79;", "&#80;", "&#81;", "&#82;", "&#83;", "&#84;", "&#85;", "&#86;", "&#87;", "&#88;", "&#89;", "&#90;"}
    };

    public static String aTexto(String texto) {
        String textoReturn = "";
        String[] textoAux;
        if (texto != null && !texto.isEmpty()) {
            if (texto.contains("&#")) {
                textoAux = texto.split(";");
                for (String ta : textoAux) {
                    for (int i = 0; i < ALFABETOS[2].length; i++) {
                        if (ALFABETOS[2][i].equals(ta.trim() + ";")) {
                            textoReturn += ALFABETOS[0][i];
                            break;
                        }
                    }
                }
            } else if (texto.contains("-") || texto.contains("·")) {
                textoAux = texto.split(" ");
                for (String ta : textoAux) {
                    for (int i = 0; i < ALFABETOS[1].length; i++) {
                        if (ALFABETOS[1][i].equals(ta.trim())) {
                            textoReturn += ALFABETOS[0][i];
                            break;
                        }
                    }
                }
            } else {
                textoReturn = texto;
            }
        }
        return textoReturn;
    }

    public static String aMorse(String texto) {
        String textoReturn = "";
        String[] textoAux;
        if (texto != null && !texto.isEmpty()) {
            if (texto.contains("&#")) {
                textoAux = texto.split(";");
                for (String ta : textoAux) {
                    for (int i = 0; i < ALFABETOS[2].length; i++) {
                        if (ALFABETOS[2][i].equals(ta.trim() + ";")) {
                            textoReturn += ALFABETOS[1][i] + " ";
                            break;
                        }
                    }
                }
            } else if (!texto.contains("-") && !texto.contains("·")) {
                String caracter;
                for (int i = 0; i < texto.length(); i++) {
                    caracter = String.valueOf(texto.charAt(i));
                    for (int j = 0; j < ALFABETOS[0].length; j++) {
                        if (ALFABETOS[0][j].equals(caracter.trim())) {
                            textoReturn += ALFABETOS[1][j] + " ";
                            break;
                        }
                    }
                }
            } else {
                textoReturn = texto;
            }
        }
        return textoReturn;
    }

    public static String aASCII(String texto) {
        String textoReturn = "";
        String[] textoAux;
        if (texto != null && !texto.isEmpty()) {
            if (texto.contains("-") || texto.contains("·")) {
                textoAux = texto.split(" ");
                for (String ta : textoAux) {
                    for (int i = 0; i < ALFABETOS[1].length; i++) {
                        if (ALFABETOS[1][i].equals(ta.trim())) {
                            textoReturn += ALFABETOS[2][i];
                            break;
                        }
                    }
                }
            } else if (!texto.contains("&#")) {
                String caracter;
                for (int i = 0; i < texto.length(); i++) {
                    caracter = String.valueOf(texto.charAt(i));
                    for (int j = 0; j < ALFABETOS[0].length; j++) {
                        if (ALFABETOS[0][j].equals(caracter.trim())) {
                            textoReturn += ALFABETOS[2][j];
                            break;
                        }
                    }
                }
            } else {
                textoReturn = texto;
            }
        }
        return textoReturn;
    }
}
