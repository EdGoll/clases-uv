

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public  class AMorse {

    private List<String> texto;
    private List<String> listas;
    private List<Morse> listamorse = new ArrayList();
    private String nuevalinea;
    private FuenteDeDatos fd;
    private String palabra;

    public AMorse(String palabra) {
        this.palabra = palabra;
        fd = new FuenteDeDatos();
        listas = fd.leerArchivo("AlfabetoMorse.txt");    
        cargarAlfabetoMorse();
        

    }

    

   private void cargarAlfabetoMorse() { 
        Morse mor;
        for (String abc : listas) {
            StringTokenizer token = new StringTokenizer(abc, ";");
            if (token.hasMoreElements()) {
                mor = new Morse();
                mor.setLetra(token.nextToken());
                mor.setTraduccion(token.nextToken());
                listamorse.add(mor);
            }

        }
    }

    public String CargarTexto(String palabra) { 

        for (int i = 0; i < palabra.length(); i++) {

            nuevalinea = nuevalinea + String.valueOf(traducirTexto(String.valueOf(palabra.charAt(i))));

        }

        return nuevalinea;
    }

    public String traducirTexto(String palabra) {  
        String p = null;

        for (Morse mor : listamorse) {
            if (mor.getLetra().equals(String.valueOf(palabra))) {
                p = mor.getTraduccion() + " ";
                break;
            }

        }
        return p;
    }
}

