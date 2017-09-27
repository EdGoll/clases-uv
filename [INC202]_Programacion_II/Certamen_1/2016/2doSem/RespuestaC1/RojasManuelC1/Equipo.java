import java.util.ArrayList;

public class Equipo {
    
    private int nombre;
    ArrayList<Jugador> jugadores = new ArrayList<>();
    private int nivel_juego_colectivo;
    
    public Equipo() {
        this.generarJugadores();
        this.calcularNivel();
    }
    
    private void generarJugador(String tipo, int numero) {
        Jugador j = new Jugador();
        if (!tipo.equals("portero")) {
            j = asignarHabilidad(j, tipo);
            j.setTipo(tipo);
            j.setNumero(numero);
            
        } else {
            j = asignarHabilidad(j, tipo);
            j.setTipo(tipo);
            j.setNumero(numero);
            
        }
        jugadores.add(j);
    }
    
    public Jugador asignarHabilidad(Jugador j, String tipo) {
        if (!tipo.equals("portero")) {
            j.setBR((int) (Math.random() * 99 + 1));
            j.setBG((int) (Math.random() * 99 + 1));
            j.setGC((int) (Math.random() * 99 + 1));
            j.setNivel_juego((int) (j.getBG() * 0.35 + j.getBR() * 0.2 + j.getGC() * 0.45));
        } else {
            j.setBR((int) (Math.random() * 99 + 1));
            j.setBG((int) (Math.random() * 99 + 1));
            j.setGC(0);
            j.setNivel_juego((int) (j.getBG() * 0.35 + j.getBR() * 0.2 + j.getGC() * 0.45));
        }
        return j;
    }
    
    private void generarJugadores() {
        int numero = 1;
        this.generarJugador("portero", numero);
        this.generarJugador("defensa", ++numero);
        this.generarJugador("defensa", ++numero);
        this.generarJugador("defensa", ++numero);
        this.generarJugador("lateral", ++numero);
        this.generarJugador("lateral", ++numero);
        this.generarJugador("centro campista", ++numero);
        this.generarJugador("centro campista", ++numero);
        this.generarJugador("delantero", ++numero);
        this.generarJugador("delantero", ++numero);
        this.generarJugador("delantero", ++numero);
    }
    
    public final void calcularNivel() {
        for (int i = 0; i < jugadores.size(); i++) {
            setNivel_juego_colectivo(getNivel_juego_colectivo() + jugadores.get(i).getNivel_juego());
        }
    }
    
    public int getNombre() {
        return nombre;
    }
    
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
    public int getNivel_juego_colectivo() {
        return nivel_juego_colectivo;
    }
    
    public void setNivel_juego_colectivo(int nivel_juego_colectivo) {
        this.nivel_juego_colectivo = nivel_juego_colectivo;
    }
    
}
