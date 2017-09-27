public class Equipo {

    private int id;
    private Jugador[] equipo;
    private final int NUM_JUGADORES = 11;

    public Equipo(int id) {
        this.id = id;
        crearEquipo();
    }

    private void crearEquipo() {
        equipo = new Jugador[NUM_JUGADORES];
        char tipo = ' ';
        for (int i = 0; i < NUM_JUGADORES; i++) {
            if (i == 0) {
                tipo = 'P';
            } else if (i < 4) {
                tipo = 'D';
            } else if (i < 6) {
                tipo = 'L';
            } else if (i < 9) {
                tipo = 'C';
            } else if (i < 11) {
                tipo = 'G';
            }
            equipo[i] = new Jugador(i + 1, tipo);
        }
    }
    
    public int nivelJuegoColectivo() {
        int njc = 0;
        for (int i = 0; i < NUM_JUGADORES; i++) {
            njc += equipo[i].nivelJuegoIndividual();
        }
        return njc;
    }
    
    public void actualizarHabilidades() {
        for (int i = 0; i < NUM_JUGADORES; i++) {
            equipo[i].actualizarHabilidades();
        }
    }
    
    @Override
    public String toString() {
        return "Equipo " + id + " (nivel de juego " + nivelJuegoColectivo() + ")";
    }
}
