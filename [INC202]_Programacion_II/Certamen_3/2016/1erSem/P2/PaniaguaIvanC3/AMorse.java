

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public final class AMorse {

    private List<String> texto = null;
    private List<String> abcm = null;
    private List<Morse> listamorse = new ArrayList();
    private String nuevalinea = "";
    private FuenteDeDatos fdd;
    private String palabra;

    public AMorse(String palabra) {
        this.palabra = palabra;
        fdd = new FuenteDeDatos();
        abcm = fdd.leerArchivo("AlfabetoMorse.txt");    // Carga el alfabeto morse  desde el archivo
        cargarAlfabetoMorse();

    }

    public void cargarAlfabetoMorse() { //carga el alfabeto a memoria
        Morse mor;
        for (String abc : abcm) {
            StringTokenizer token = new StringTokenizer(abc, ";");
            if (token.hasMoreElements()) {
                mor = new Morse();
                mor.setLetra(token.nextToken());
                mor.setTraduccion(token.nextToken());
                listamorse.add(mor);
            }

        }
    }

    public String CargarTexto(String palabra) { //Recibe la palabra y la revisa caracter por caracter

        for (int i = 0; i < palabra.length(); i++) {

            nuevalinea = nuevalinea + String.valueOf(traducirTexto(String.valueOf(palabra.charAt(i))));

        }

        return nuevalinea;
    }

    private String traducirTexto(String palabra) {  //traduce cada caracter enviado desde CargarTexto
        String pars = "";

        for (Morse mor : listamorse) {
            if (mor.getLetra().equals(String.valueOf(palabra))) {
                pars = mor.getTraduccion() + " ";
                break;
            }

        }
        return pars;
    }
}
