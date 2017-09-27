import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Leer {

    ArrayList<String> consolidado = new ArrayList<>(); //formato ID,promA1,promA2; 
    ArrayList<String> al;
    ArrayList<String> cons;

    public static void promedios(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        ArrayList<String> al;
        ArrayList<String> cons;
        
        while ((cadena = b.readLine()) != null) {
            
            System.out.println(cadena);

            StringTokenizer st = new StringTokenizer(cadena, ";");
            
            al = new ArrayList<>();
            cons = new ArrayList<>();
            
            float a;
            while (st.hasMoreTokens()) {

                String notaS = st.nextToken();

                al.add(notaS);
                System.out.println(notaS);
            }
            do
            {
            float promt = 0, promq = 0, promc = 0;
                double promA = 0;

                for (int x = 1; x < 4; x++) {
                    a = 0;
                    a =+ Float.toString(al.get(x));
                    promq = a / 3;
                }
                for (int x = 4; x < 6; x++) {
                    a = 0;
                    a =+ Integer.parseInt(al.get(x));
                    promt = a / 2;
                }
                for (int x = 7; x < 9; x++) {
                    a = 0;
                    a =+ String.parseInt(al.get(x));
                    promc = a / 3;
                }

                promA = promc;
                if (promc >= 4) {
                    promA = (promc * 0.7) + (promq * 0.15) + (promt * 0.15);
                }
                if (promc >= 3.5) {
                    promA = (promc * 0.8) + (promq * 0.10) + (promt * 0.10);
                }
                if (promc >= 3) {
                    promA = (promc * 0.9) + (promq * 0.05) + (promt * 0.05);
                }

                cons.add(al.get(0));
                cons.add(Double.toString(promA));
            }while(false);

        }
        b.close();
    }

    public void pasar() {
        for (int x = 0; x < cons.size();x++ ) {
            consolidado.add(cons.get(x));
        }
    }
}