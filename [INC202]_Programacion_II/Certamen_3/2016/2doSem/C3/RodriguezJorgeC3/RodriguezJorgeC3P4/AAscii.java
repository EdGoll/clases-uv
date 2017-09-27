


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AAscii {
    

    private List<String> texto;
    private List<String> listas;
    private List<Ascii> listaascii = new ArrayList();
    private String linea;
    private FuenteDeDatos fd;
    private String palabra;

    public AAscii(String palabra) {
        this.palabra = palabra;
        fd = new FuenteDeDatos();
        listas = fd.leerArchivo("AlfabetoASCII.txt");    
        cargarAlfabetoASCII();

    }

    private void cargarAlfabetoASCII() {
        Ascii asci;
        for (String abc : listas) {                     
            StringTokenizer token = new StringTokenizer(abc, "_");
            if (token.hasMoreElements()) {
                asci = new Ascii();
                asci.setLetra(token.nextToken());
                asci.setTraduccion(token.nextToken());
                listaascii.add(asci);
            }

        }
    }

    public String CargarTexto(String palabra) {         
        
        for (int i = 0; i < palabra.length(); i++) {

            linea = linea + String.valueOf(traducirTexto(String.valueOf(palabra.charAt(i))));

        }
        return linea;
    }

    private String traducirTexto(String palabra) {      
        String p = null;

        for (Ascii asci : listaascii) {
            if (asci.getLetra().equals(String.valueOf(palabra))) {
                p = asci.getTraduccion() + " ";
                break;
            }

        }
        return p;
    }
}
