import java.util.ArrayList;

public class Liga {

    ArrayList<Equipo> equipos = new ArrayList<>();
    private final int cantidad_equipos = 16;

    public void generarEquipos() {
        Equipo e;
        for (int i = 0; i < cantidad_equipos; i++) {
            e = new Equipo();
            e.setNombre(generarNombreSinRepeticion());
            equipos.add(e);
        }
    }

    private int generarNombreSinRepeticion() {
        int nombre;
        do {
            nombre = generarNombre();
        } while (nombre < 0);
        return nombre;
    }

    private int generarNombre() {
        int nombre = (int) (Math.random() * 16 + 1);
        for (Equipo equipo : equipos) {
            if (equipo.getNombre() == nombre) {
                nombre = -1;
                break;
            }
        }
        return nombre;
    }

    public void octavos() {
        System.out.println("Octavos de final");
        ArrayList<Equipo> e = new ArrayList<>();
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        equipos = e;
    }

    public void cuartos() {
        recalcularHabilidad();
        System.out.println("\nCuartos de final");
        ArrayList<Equipo> e = new ArrayList<>();
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        equipos = e;
    }
    
    public void semifinal(){
        recalcularHabilidad();
        System.out.println("\nSemifinal");
        ArrayList<Equipo> e = new ArrayList<>();
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        equipos = e;
    }
    
    public void finalLiga(){
        recalcularHabilidad();
        System.out.println("\nFinal");
        ArrayList<Equipo> e = new ArrayList<>();
        e.add(Encuentro.partido(equipos.remove((int) (Math.random() * equipos.size())), equipos.remove((int) (Math.random() * equipos.size()))));
        equipos = e;
    }

    private void recalcularHabilidad() {
        int k = 0;
        for (Equipo e : equipos) {
            int i = 0;
            for (Jugador j : e.jugadores) {
                j = e.asignarHabilidad(e.jugadores.get(i), e.jugadores.get(i).getTipo());
                e.jugadores.set(i, j);
                equipos.set(k, e);
                ++i;
            }
            e.setNivel_juego_colectivo(0);
            e.calcularNivel();
            ++k;
        }
    }
}
