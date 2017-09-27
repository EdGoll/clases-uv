import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class RankingImp {

    private FuenteDeDatos fu;
    List<String> lineas = null;

    List<Partido> lp = new ArrayList<Jugador>();

    public RankingImp() {
        fu = new FuenteDeDatos();
        lineas = fu.leerArchivo("RankingAjedrez_dataset.txt");
        cargarRanking();
    }

    private void cargarRanking() {
        Ranking r;
        String s = "";
        for (String linea : lineas) {
            r = new Ranking();
            r.setNum(linea.substring(0, 2));
            r.setApellido(linea.substring(2, 8));
            for (int i = 0; i < linea.substring(, ).length() - 1; i++) {
                if (!Character.isDigit(linea.substring(,).charAt(i))) {
                    r = r + linea.substring(,).charAt(i);
                } else {

                    r.set(s);
                    s = "";
                    while (!Character.StringTokenizer(linea.substring(2, 55).charAt(i))) {
                        s = s + linea.substring(, ).charAt(i);
                        i = i + 1;
                    }
                    r.setResultado(s);
                    s = "";
                }

            }
            r.setJugador(s);
            s = "";
            r.setLugar(linea.substring(55, linea.length() - 1));
            lp.add(r);

        }

    }

    public void cantidadTorneos() {

        System.out.println("Cantidad de torneos jugados: " + lp.size());

    }

 

}
