public class Encuentro {

    public static Equipo partido(Equipo e, Equipo a) {
        Equipo ganador;
        if (e.getNivel_juego_colectivo() > a.getNivel_juego_colectivo()) {
            ganador = e;
            System.out.println("Equipo " + e.getNombre() + " (Nivel de juego " + e.getNivel_juego_colectivo() + ") v/s Equipo " + a.getNombre() + " (Nivel de juego " + a.getNivel_juego_colectivo() + "), Resultado: Ganador Equipo " + ganador.getNombre());
        } else if (e.getNivel_juego_colectivo() < a.getNivel_juego_colectivo()) {
            ganador = a;
            System.out.println("Equipo " + e.getNombre() + " (Nivel de juego " + e.getNivel_juego_colectivo() + ") v/s Equipo " + a.getNombre() + " (Nivel de juego " + a.getNivel_juego_colectivo() + "), Resultado: Ganador Equipo " + ganador.getNombre());
        } else {
            double g =(Math.random());
            if (g < 0.5) {
                ganador = e;
                System.out.println("Equipo " + e.getNombre() + " (Nivel de juego " + e.getNivel_juego_colectivo() + ") v/s Equipo " + a.getNombre() + " (Nivel de juego " + a.getNivel_juego_colectivo() + "), Resultado: Empate. Ganador por sorteo: Equipo " + ganador.getNombre());
            } else {
                ganador = a;
                System.out.println("Equipo " + e.getNombre() + " (Nivel de juego " + e.getNivel_juego_colectivo() + ") v/s Equipo " + a.getNombre() + " (Nivel de juego " + a.getNivel_juego_colectivo() + "), Resultado: Empate. Ganador por sorteo: Equipo " + ganador.getNombre());
            }
        }
        return ganador;
    }

}
