
//package view;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AAscii {
    

    private List<String> texto = null;
    private List<String> abcm = null;
    private List<Ascii> listamorse = new ArrayList();
    private String nuevalinea = "";
    private FuenteDeDatos fdd;
    private String palabra;

    public AAscii(String palabra) {
        this.palabra = palabra;
        fdd = new FuenteDeDatos();
        abcm = fdd.leerArchivo("AlfabetoASCII.txt");    // Carga el alfabeto Ascii  desde el archivo
        cargarAlfabetoASCII();

    }

    public void cargarAlfabetoASCII() {
        Ascii asci;
        for (String abc : abcm) {                       //carga el alfabeto a memoria
            StringTokenizer token = new StringTokenizer(abc, "_");
            if (token.hasMoreElements()) {
                asci = new Ascii();
                asci.setLetra(token.nextToken());
                asci.setTraduccion(token.nextToken());
                listamorse.add(asci);
            }

        }
    }

    public String CargarTexto(String palabra) {         //Recibe la palabra y la revisa caracter por caracter
        
        for (int i = 0; i < palabra.length(); i++) {

            nuevalinea = nuevalinea + String.valueOf(traducirTexto(String.valueOf(palabra.charAt(i))));

        }
        return nuevalinea;
    }

    private String traducirTexto(String palabra) {      //traduce cada caracter enviado desde CargarTexto
        String pars = "";

        for (Ascii asci : listamorse) {
            if (asci.getLetra().equals(String.valueOf(palabra))) {
                pars = asci.getTraduccion() + " ";
                break;
            }

        }
        return pars;
    }
}
