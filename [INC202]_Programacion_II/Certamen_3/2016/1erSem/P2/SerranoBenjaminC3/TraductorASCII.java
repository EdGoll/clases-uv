public class TraductorASCII {

    public TraductorASCII(String palabra) {
        this.Palabra = palabra;
    }

    private String Palabra;

    public synchronized String Traductor(String Palabra) {
        String PalabraTraducida = "";
        this.Palabra = Palabra;
        Palabra = Palabra.toUpperCase();
        for (int j = 0; j < Palabra.length(); j++) {
            PalabraTraducida += "&#" + Palabra.codePointAt(j) + " ";
        }
        return PalabraTraducida;
    }
}