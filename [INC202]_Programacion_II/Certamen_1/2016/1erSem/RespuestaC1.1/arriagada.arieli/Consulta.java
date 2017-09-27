import java.util.ArrayList;
import java.util.List;

public class Consulta {

    private List<partidosJugados> listaPartidos;
    List<String> lineas;
    FuenteDeDatos nw = new FuenteDeDatos();
    private partidosJugados pj;

    Consulta() {
        listaPartidos = new ArrayList<partidosJugados>();
        lineas = nw.leerArchivo("C:\\MundialResultados.txt");
        cargarPartidos();
    }

    private void cargarPartidos() {
        partidosJugados pj;
        String s = "";
        for (String linea : lineas) {
            pj = new partidosJugados();
            pj.setId(linea.substring(0, 5));
            pj.setFecha(linea.substring(5, 22));
            for (int i = 0; i < linea.substring(22, 55).length() - 1; i++) {
                if (!Character.isDigit(linea.substring(22, 55).charAt(i))) {
                    s = s + linea.substring(22, 55).charAt(i);
                } else {
                    pj.setPaisLocal(s);
                    s = "";
                    while (!Character.isWhitespace(linea.substring(22, 55).charAt(i))) {
                        s = s + linea.substring(22, 55).charAt(i);
                        i = i + 1;
                    }
                    pj.setResultado(s);
                    s = "";
                }
            }
            pj.setPaisVisita(s);
            s = "";
            pj.setLugar(linea.substring(55));
            listaPartidos.add(pj);
        }
    }

    public void partidosJugados() {
        System.out.println(listaPartidos.size());
    }

    public void partidosjugadosChina() {
        int contador = 0;
        for (partidosJugados listaPartido : listaPartidos) {
            if ("China".equalsIgnoreCase(listaPartido.getPaisLocal()) || "China".equalsIgnoreCase(listaPartido.getPaisVisita())) {
                contador = contador + 1;
            }
        }
        System.out.println(contador);
    }

    public void resultadosChile() {
        for (partidosJugados listaPartido : listaPartidos) {
            if ("Chile".equalsIgnoreCase(listaPartido.getPaisLocal()) || "Chile".equalsIgnoreCase(listaPartido.getPaisVisita())) {
                System.out.println(listaPartido.getResultado());
            }
        }
    }
    
 
    
    
    public void campeonMundial()
    {
        for (partidosJugados listaPartido : listaPartidos) 
        {
            if("(64)".equalsIgnoreCase(listaPartido.getId()))
                
            }
        }
    }
    
    public void tercerLugarYFinal()
    {
        for (partidosJugados listaPartido : listaPartidos) 
        {
            if("(64)".equalsIgnoreCase(listaPartido.getId()))
            {
                System.out.println(listaPartido.getLugar());
            }
        }
    }

}
